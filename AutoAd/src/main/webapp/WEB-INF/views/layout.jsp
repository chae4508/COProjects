<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mybatis Test</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="/app/css/bootstrap.min.css" rel="stylesheet">
<link href="/app/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="/app/css/common.css" rel="stylesheet">
<script type="text/javascript" src="/app/js/jquery-1.12.3.js"></script>
<script type="text/javascript" src="/app/js/bootstrap.min.js"></script>

</head>
<body role="document">
<div class="container">
<div class="panel panel-success">
  <div class="panel-heading">
    <div style="float:left;vertical-align:middle"><h3>Auto Adclick 管理画面</h3></div>
    <div style="text-align:right">
    <button class="btn btn-danger">Logout</button>
    </div>
  </div>
  <div class="panel-body">
<jsp:include page="/WEB-INF/views/menu.jsp">
<jsp:param value="${param.menuId}" name="menuId"/>
</jsp:include>
<table class="table">
  <tr>
    <th>USER CNT</th>
  </tr>
  <tr><td>${userCnt}</td></tr>
</table>
  </div>
</div>

</div>
</body>
</html>