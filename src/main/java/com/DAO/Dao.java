package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Vo.UserVo;

public class Dao {

	public Boolean authenticateUsers(String user, String pass) throws Exception {
		Boolean result;
		System.out.println("inside authenticateUSers Method in DAO");
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/springdb","root","root");
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("SELECT * from login where username='"+user+"' and password='"+pass+"'");
			if(rs.next()) {
				System.out.println("result is true");
				result = true;
			}
			else {
				System.out.println("result is false");

				result = false;
			}
		
		
			
			System.out.println("End of Dao method...Now returning back to RestController");

		return result;
	}

	public Boolean registerUser(String user, String pass) {
		System.out.println("inside registerUSers Method in DAO");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/springdb","root","root");
			Statement s = c.createStatement();
			s.executeUpdate("INSERT into login values('"+user+"','"+pass+"')");
			System.out.println("Registered the user successfully");
			return true;
		}
		
		catch(Exception e) {
			System.out.println("Registered unsuccessfull for User:"+user+"\tPassword: "+pass);
			return false;
		}
	}

	public List<UserVo> listUsers() {
		System.out.println("inside ListUsers Method in Dao");
		UserVo userVo;
		List<UserVo> usersList = new ArrayList<UserVo>();
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/springdb","root","root");
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("SELECT * from login");
			while(rs.next()) {
				userVo = new UserVo();
				userVo.setUsername(rs.getString("username"));
				userVo.setPassword(rs.getString("password"));
				usersList.add(userVo);
			}
			System.out.println("Got all users succssfully!");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return usersList;
	}
}
