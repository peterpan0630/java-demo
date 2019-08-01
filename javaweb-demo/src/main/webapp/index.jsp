<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%
String _page = request.getParameter("page");
%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<style>
body{
	margin:0;
	padding:0;
}
.header{
	width: 100%;
	height: 100px;
	padding-top: 20px;
	border-bottom: 1px solid black;
}
.header{
	width: 100%;
	height: 100px;
	border-bottom: 1px solid black;
}
.container>div{
	float: left;
}
.container .menu{
	width: 200px;
}
.container .menu ul li{
	margin: 20px;
}
.container .content{
	height: 1000px;
	padding: 20px;
	border-left: 1px solid black;
}
.container .content iframe{
	width: 1000px;
	height: 1000px;
}
</style>
</head>
<body>

	<div class="header">
		<center>
			我是顶部banner...
		</center>
	</div>

	<div class="container">
		<div class="menu">
			<ul>
				<li><a href="index.jsp?page=page1">内页1</a></li>
				<li><a href="index.jsp?page=page2">内页2</a></li>
				<li><a href="index.jsp?page=page3">内页3</a></li>
			</ul>
		</div>
		<div class="content">
			<iframe frameborder="0" src="/page/<%=_page%>.html"></iframe>
		</div>
	</div>

</body>
</html>