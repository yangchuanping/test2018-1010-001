<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>登录</title>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/BackPage/img/logo2.png" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/BackPage/css/item/login.css" />
	</head>

	<body>
		<div class="box">
			<div class="imgdiv">
				<img src="${pageContext.request.contextPath}/BackPage/img/login/logo.png" />
			</div>
			<form id="formdate" method="get">
			<div class="inputdiv">
				<img src="${pageContext.request.contextPath}/BackPage/img/login/png1.png" />
				<input type="text" name="username" id="username" value="jgm" placeholder="请输入用户名" required="required" />
			</div>
			<div class="inputdiv border1">
				<img src="${pageContext.request.contextPath}/BackPage/img/login/form1.png" />
				<input type="password" name="password" id="password" value="2670903" placeholder="请输入密码" required="required" />
			</div>
			<div class="inputdiv border2">
				<img src="${pageContext.request.contextPath}/BackPage/img/login/form2.png" />
				<input type="text" name="code" id="code" value="" placeholder="请输入验证码" required="required" />
				<div class="dauth">
					<canvas id="canvas" width="100" height="43" style="background-color: white;"></canvas>
				</div>
			</div>
			</form>
			<div class="inputdiv border3">
				<button id="btn">登录</button>
			</div>
		</div>
				
		<script src="${pageContext.request.contextPath}/BackPage/js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/BackPage/js/item/verification.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/BackPage/js/operatcookie.js"></script>
	</body>

</html>