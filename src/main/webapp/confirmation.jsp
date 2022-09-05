<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirm Email and Subscribe Topics</title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
      <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="container">
    <div class="wrapper">
      
      <form class="form-wrapper" action="login.jsp" method="POST">
        <fieldset class="section is-active">
          <h3>Confirm registration by subscribing to topics!</h3>
          <p>A subscription link has been sent to your registered email: ${param.email} </p>
          <p>Please click on the subscription link to subscribe to the SNS Topic</p>
          
          <input type="submit" value="Proceed To Login!" class="submit"/>
          <div align="center"><h3>- Made By : <a href="http://www.about.me/sagar_parikh"><h2>Sagar Parikh</h2></a></h3></div>
        </fieldset>
      </form>
    </div>
  </div>
</body>
</html>