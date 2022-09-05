<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
      <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
    <div class="wrapper">
      <form class="form-wrapper" action="logout_and_publish" method="POST">
        <fieldset class="section is-active">
          <h3>Welcome User : ${sessionScope.uname}</h3>
          <div align="center"><input type="submit" value="Logout" class="submit"/></div>
          <div align="center"><h3>- Made By : <a href="http://www.about.me/sagar_parikh"><h2>Sagar Parikh</h2></a></h3></div>
        </fieldset>
      </form>
    </div>
  </div>
</body>
</html>