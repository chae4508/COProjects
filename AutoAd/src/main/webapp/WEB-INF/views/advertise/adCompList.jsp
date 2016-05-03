<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>広告会社</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="/app/css/bootstrap.min.css" rel="stylesheet">
<link href="/app/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="/app/css/common.css" rel="stylesheet">
<script type="text/javascript" src="/app/js/jquery-1.12.3.js"></script>
<script type="text/javascript" src="/app/js/bootstrap.min.js"></script>

</head>
<!-- Body_Start -->
<body>
	<h3>AdCorps</h3>
	
	<table class="table table-striped"
		style="width: 1024px; margin-left: 0.67em;">
		<tr>
			<td style="width: 100px;">ID</td>
			<td style="width: 700px;">Name</td>
			<td>Actions</td>
		</tr>
		
		<c:forEach items="${adCompList}" var="adComp">
		   <tr>
		   	 <td>${adComp.id}</td>
			<td>${adComp.adNm}</td>
			<td><button type="button" class="btn btn-default ad_corp_list_button ">編集</button>
			    <button type="button" class="btn btn-default ad_corp_list_button">削除</button></td>
		   </tr>
		</c:forEach>
	</table>
</body>
<!-- Body_Start -->
</html>