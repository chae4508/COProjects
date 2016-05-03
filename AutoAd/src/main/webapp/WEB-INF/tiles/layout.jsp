<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List,com.autoad.app.vo.common.Menu" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<c:set var="titleName"><tiles:getAsString name='titleName' /></c:set>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${titleName}</title>
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
        <ul class="nav nav-tabs">
        <c:forEach items="${menuList}" var="menu">
          <li role="presentation" ${menu.menuActive}><a href="${menu.menuUrl}">${menu.menuTxt}</a></li>
        </c:forEach>  
        </ul>
        <tiles:insertAttribute name="body" />
      </div>
    </div>
  </div>
</body>
</html>