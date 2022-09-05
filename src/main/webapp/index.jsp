<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SNS Notification Manager</title>
<style>
<%@include file="css/style.css"%>
</style>
<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
     <!--  <link href="style.css" rel="stylesheet">-->
</head>

<body> 
    <div class="container">
    <div class="wrapper">
      <form class="form-wrapper" action="rest/registerUsers" method="POST">
        <fieldset class="section is-active">
          <h3>Enter your details to register!</h3>
          <input type="text" name="user" id="name" placeholder="Username">
          <input type="password" name="pass" placeholder="Password">
          <input type="text" name="contact" placeholder="Contact">
          <input type="text" name="email" id="email" placeholder="Email">
          <a href="login.jsp" class="submit-left button-left">Login</a>
          <a href="rest/listUsers" class="button-center">List Users</a>
          <input type="submit" value="Register" class="submit button"/>
          <div align="center"><h3>- Made By : <a href="http://www.about.me/sagar_parikh"><h2>Sagar Parikh</h2></a></h3></div>
        </fieldset>
      </form>
    </div>
  </div>
 
</body>
</html>