package com.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Dao.Dao;
import com.Vo.UserVo;
import com.google.gson.Gson;

@RestController
@RequestMapping(value="/rest",method={RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT})
public class Controller {
	private Dao dao = new Dao();
//--------------------------------------------------------------------------------------------------------------------------------------
	@RequestMapping(value="/login", method=RequestMethod.GET)
	@ResponseBody
	public String login(@RequestParam String user, String pass) {
		Boolean authenticateResult = false;
		String u= user;
		String p = pass;
		System.out.println("-----Username is:"+u+"\t\t-----Pass is :"+p);
		System.out.println("Helloo.,.....Inside authenticateUser method");
		Map<Object, Object> resultMap = new HashMap<Object, Object>();
		try {
			System.out.println("Before going to authenticate Dao method-----------------------------------------");

			authenticateResult = dao.authenticateUsers(u,p);
			System.out.println("Coming back fromauthenticate Dao method----------------------------------------");

		}
		catch(Exception e) {
			System.out.println("---------------------Ooops..Got Error somehow!--------------------------");
			e.printStackTrace();
		}
		if(authenticateResult) {
			resultMap.put("Authentication", "OK");
			resultMap.put("Code", 200);
		}
		else {
			resultMap.put("Authentication", "Could not be done!");
			resultMap.put("Code", 400);
		}
		return new Gson().toJson(resultMap);		
	}
//--------------------------------------------------------------------------------------------------------------------------------------	
	@RequestMapping(value="/registerUsers", method=RequestMethod.POST)
	@ResponseBody
	String registerUsers(@RequestParam String user, String pass, String contact, String email) {
		
		Boolean registerResult = dao.registerUser(user,pass);
		Map<Object,Object> registerMap = new HashMap<Object,Object>();
		
		if(registerResult) {
			registerMap.put("Registration", "Successful!");
			registerMap.put("Code", 200);

		}
		else {
			registerMap.put("Registration", "Unsuccessful!");
			registerMap.put("Code", 400);
			
		}
		return new Gson().toJson(registerMap);
		
	}
	
//--------------------------------------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/listUsers", method=RequestMethod.GET)
	@ResponseBody
	public String listAllUsers() {
		Map<Object,Object> listUsersMap = new HashMap<Object,Object>();
		List<UserVo> usersList = new ArrayList<UserVo>();
		try {
		usersList = dao.listUsers();
		listUsersMap.put("Code", 200);
		listUsersMap.put("Users", usersList);
		}
		catch(Exception e) {
			listUsersMap.put("Code", 400);
			listUsersMap.put("Users", null);
		}
		
		return new Gson().toJson(listUsersMap);
		
	}
//--------------------------------------------------------------------------------------------------------------------------------------

}
