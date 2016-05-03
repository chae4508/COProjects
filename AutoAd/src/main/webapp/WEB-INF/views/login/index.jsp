<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="login">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Auto AdClick</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="/app/css/bootstrap.min.css" rel="stylesheet">
<link href="/app/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="/app/css/common.css" rel="stylesheet">
<script type="text/javascript" src="/app/js/jquery-1.12.3.js"></script>
<script type="text/javascript" src="/app/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/app/js/bootbox.js"></script>
<script type="text/javascript" src="/app/js/login.js"></script>
</head>
<body role="document" class="login">
  <div class="container">
	<div class="card card-container">
            <!-- <div  style="text-align:center"><img id="profile-img" class="profile-img-card img-circle" src="/app/images/avatar_2x.png" /></div> -->
            <h2 id="profile-name" class="profile-name-card">Login to AutoAdclick</h2>
            <form class="form-signin" name="loginForm">
                <input type="text" id="loginId" class="form-control" placeholder="Login ID" required autofocus>
                <input type="password" id="loginPwd" class="form-control" placeholder="Password" required>
                <div id="remember" class="checkbox">
                    <!-- <label>
                        <input type="checkbox" value="remember-me"> Remember me
                    </label> -->
                </div>
                <input type="hidden" id="returnUrl" value="${returnUrl}"/>
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="button" id="btnLogin">Sign in</button>
            </form><!-- /form -->
        </div><!-- /card-container -->
  </div>
</body>
</html>