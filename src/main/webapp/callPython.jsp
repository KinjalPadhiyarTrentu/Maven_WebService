<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
<style>
<%@include file="css/style.css"%>
</style>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<c:set var="attempt" value="${param.attempt}"></c:set>

 
<div class="container">
    <div class="wrapper">
      <form class="form-wrapper" action="localhost:90/authenticateUsers" method="GET">
        <fieldset class="section is-active">
       
          <h3>Login to the System!</h3>
          <input type="text" name="user" id="name" placeholder="Username">
          <input type="password" name="pass" placeholder="Password">
          <input type="submit" value="Login" class="submit"/>
          <a href="localhost:90/authenticateUsers?user=aaa&pass=aaa" class="button-center">List Users</a>
          <a href="index.jsp" class="submit-left button-left">Register</a>
          <div align="center"><h3>- Made By : <a href="http://www.about.me/sagar_parikh"><h2>Sagar Parikh</h2></a></h3></div>
        </fieldset>
      </form>
    </div>
  </div>
 
</body>
</html>