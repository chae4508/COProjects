<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  String menuId = request.getParameter("menuId");
  System.out.println("menuId : " + menuId);
  String menu1 = (menuId!=null && "A".equals(menuId))?"class='active'":"";
  String menu2 = menuId!=null && "B".equals(menuId)?"class='active'":"";
  String menu3 = menuId!=null && "C".equals(menuId)?"class='active'":"";
  String menu4 = menuId!=null && "D".equals(menuId)?"class='active'":"";
  String menu5 = menuId!=null && "E".equals(menuId)?"class='active'":"";
  String menu6 = menuId!=null && "F".equals(menuId)?"class='active'":"";
  String menu7 = menuId!=null && "G".equals(menuId)?"class='active'":"";
  System.out.println(request.getRequestURI());
%>
<ul class="nav nav-tabs">
  <li role="presentation" <%= menu1%>><a href="#">URL管理</a></li>
  <li role="presentation" <%= menu2%>><a href="#">user-agent</a></li>
  <li role="presentation" <%= menu3%>><a href="#">PV履歴</a></li>
  <li role="presentation" <%= menu4%>><a href="#">IP履歴</a></li>
  <li role="presentation" <%= menu5%>><a href="#">生存確認</a></li>
  <li role="presentation" <%= menu6%>><a href="#">広告タグ一覧</a></li>
  <li role="presentation" <%= menu7%>><a href="#">広告会社</a></li>
</ul>