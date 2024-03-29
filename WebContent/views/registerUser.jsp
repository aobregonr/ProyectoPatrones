<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Cenfo RH | New User</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Font Awesome -->
<link rel="stylesheet"
	href="<%=request.getContextPath() %>/framework/plugins/fontawesome-free/css/all.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- icheck bootstrap -->
<link rel="stylesheet"
	href="<%=request.getContextPath() %>/framework/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/framework/dist/css/adminlte.min.css">
<!-- Google Font: Source Sans Pro -->
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700"
	rel="stylesheet">
</head>
<body class="hold-transition login-page">
	<!-- Login Wrapper	 -->
	<div class="login-box">
		<div class="login-logo">
			<p><b>Cenfo RH </b>| New user</p>
		</div>
		<!-- /.login-logo -->
		<div class="card">
			<div class="card-body login-card-body">

				<form action="RegisterUser" method="post" class="form-horizontal">
							<p class="login-box-msg"><b>General information</b></p>						
                          <div class="form-group row">
                            <label for="inputId" class="col-md-3 control-label">Id</label>
    
                            <div class="col-md-9">
                              <input type="text" class="form-control" id="inputId" name="inputId" placeholder="Identification">
                            </div>
                          </div>
                          <div class="form-group row">
                            <label for="inputName" class="col-md-3 control-label">Name</label>
    
                            <div class="col-md-9">
                              <input type="text" class="form-control" id="inputName" name="inputName" placeholder="Name">
                            </div>
                          </div>
                          <div class="form-group row">
                            <label for="inputLastName" class="col-md-3 control-label">Last name</label>
    
                            <div class="col-md-9">
                              <input type="text" class="form-control" id="inputLastName" name="inputLastName" placeholder="Last name">
                            </div>
                          </div>
                          <div class="form-group row">
                            <label for="selectGender" class="col-md-3 control-label">Gender</label>
    
                            <div class="col-md-9">
                                <select id="selectGender"  class="form-control" name="selectGender">
                                	<option value="default">Select gender</option>
                                    <option value="m">Male</option>
                                    <option value="f">Female</option>
                                  </select>
                            </div>
                          </div>
                          <div class="form-group row">
                            <label for="inputAddress" class="col-md-3 control-label">Address</label>
    
                            <div class="col-md-9">
                              	<input type="text" class="form-control" id="inputAddress" name="inputAddress" placeholder="Exact address">
                              </div>
                          </div>
                          <p class="login-box-msg"><b>User information</b></p>
                          <div class="form-group row">
                            <label for="inputUsername" class="col-md-3 control-label">User name</label>
    
                            <div class="col-md-9">
                              <input type="text" class="form-control" id="inputUsername" name="inputUsername" placeholder="User name">
                            </div>
                          </div>
                          <div class="form-group row">
                            <label for="inputPin" class="col-md-3 control-label">Password</label>
    
                            <div class="col-md-9">
                              <input type="text" class="form-control" id="inputPin" name="inputPin" placeholder="Password">
                            </div>
                          </div>
                          <div class="form-group row">
                            <label for="inputPassword2" class="col-md-3 control-label">Password check</label>
    
                            <div class="col-md-9">
                              <input type="text" class="form-control" id="inputPassword2" placeholder="Password">
                            </div>
                          </div>
                          <div class="form-group">
                            <div class="col-md-12 text-right">
                              <button id="btnSubmit" type="submit" class="btn btn-danger">Submit</button>
                            </div>
                          </div>
                        </form>
			</div>
			<!-- /.login-card-body -->
		</div>
	</div>
	<!-- /.login-box -->

	<!-- jQuery -->
	<script src="<%=request.getContextPath() %>/framework/plugins/jquery/jquery.min.js"></script>
	<!-- Bootstrap 4 -->
	<script src="<%=request.getContextPath() %>/framework/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
</html>