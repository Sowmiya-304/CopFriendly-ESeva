<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1">
  <title>Log-In</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
 <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
<style type="text/css">
 
  .container{
 
  width: 30%;
  background: rgba(0,0,0,0.5);
  box-sizing: border-box;
  box-shadow: 0 15px 25px rgba(0,0,0,0.5);
  margin-top: 55px;
  padding: 20px;
  border-radius: 20px;
  }
  .loginlogo{
  width: 70px;
  height: 70px;
  border-radius: 50%;
  position: relative;
  top:84px;
  left: calc(50% - 35px);
}
.container h2
{
  margin: 0 0 10px;
  color: #fff;
  font-family: sans-serif;
  text-align: center;
}

</style>
<!--<link rel="stylesheet" href="login.css">-->

</head>
<body>



<nav class="navbar navbar-expand-lg navbar-light bg-dark navbar navbar-dark bg-primary">
  <a class="navbar-brand" href="#">CopFriendly - ESeva</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home </a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="#">About </a>
      </li>
    </ul>
  </div>
</nav>
<img src="login-logo.png" class="loginlogo">
  <div class="container"> 
    <br>
<h2>Login</h2>
  <form action="LoginController" method="post">
  
  <label >User Name</label>
    <div class="input-group mb-3 form group">
     <div class="input-group-prepend">
        <span class="input-group-text" id="basic-addon1">@</span>
      </div>
      <input type="text" class="form-control" placeholder="UserName" name="username" required="">
    </div>
    
  <label >Password</label>
    <div class="input-group mb-3 form group">
     <div class="input-group-prepend">
        <span class="input-group-text" id="basic-addon1">Password</span>
     </div>
      <input type="password" class="form-control" placeholder="********"  name="password" required="">
    </div>
   <div style="color:red"> <%
if(request.getAttribute("output")!=null)
	out.println(request.getAttribute("output"));
%> </div>
<a href="forgotpassword.html">Forgot Password?</a>
<!-- <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#staticBackdrop">
  Forgot Password?/Reset Password
</button>
<div class="modal fade" id="staticBackdrop" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="staticBackdropLabel">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>																					
     <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable">
	 <form class=fp_box action="ForgotPasswordController" method="post">
		
		<div id="mail"><strong>You can reset your Password  here</strong></div>
		<input type="email" placeholder="Your e-mail Address" name="mail_id"><br>
		<input type="submit" value="SEND MY PASSWORD">
</form>
</div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Understood</button>
      </div>
    </div>
  </div>
</div> -->



  <center>
  <input type="submit" class="btn btn-success" value="Submit">
 </center>

  
 
 </form>
 </div>

</body>
</html>


