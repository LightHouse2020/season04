<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

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

<title>登录</title>
<script type="text/javascript">
function register(){
	
}

</script>
</head>
<body>
	<h2 align="center">登录</h2>
	<form action="<%=request.getContextPath()%>/login" method="post">
		<table align="center">
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td><a href="register.jsp" color=blue>创建账户</a></td>
				<td><input type="submit" value="登录" name="login"></td>
			</tr>
		</table>
	</form>

</body>
</html>
