<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%--meta标签区域--%>
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="author" content="">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache, must-revalidate">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="imagetoolbar" content="no">
<meta name="robots" content="all">

<title>账号注册成功</title>
<head>
</head>
<body>
	<h2 align="center">账号注册成功</h2>
	<form action="<%=request.getContextPath()%>/confirm" method="post">

		<table align="center">
			<tr>
				<td>用户名：</td>
				<td><%=request.getAttribute("username")%></td>
			</tr>
			<tr>
				<td>用户ID：</td>
				<td><%=session.getAttribute("userId")%></td>
			</tr>
			<tr>
				<td></td>
				<td><a href="login.jsp">前往登录</a></td>
			</tr>
		</table>
	</form>
</body>
</html>
