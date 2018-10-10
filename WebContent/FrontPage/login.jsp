<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>登录</title>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/FrontPage/img/index/logo.png"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/login.css"/>
	</head>
	<body>
		<div class="all_box">
			<div class="outsiade_div">
				<div class="inside_div">
					<div class="input_div">
						<label class="lab">用户名2</label>
						<input type="text" id="username" placeholder="请输入手机号码" />
					</div>
					<div class="input_div">
						<label class="lab">密码2</label>
						<input type="password" id="password" placeholder="请输入密码" />
					</div>
					<div class="input_div">
						<label class="lab">验证码2</label>
						<input type="text" id="code" placeholder="请输入验证码" />
						<div class="sec">
							<canvas id="canvas" width="100" height="43" style="background-color: #CCCCCC;"></canvas>
						</div>
					</div>
					<div class="input_div" style="margin-top: 30px;">						
						<button id="btn">登      录</button>
					</div>
				</div>
			</div>
		</div>
		
		<script src="${pageContext.request.contextPath}/FrontPage/js/jquery-3.3.1.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/FrontPage/js/verification .js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/operatcookie.js"></script>
	</body>
</html>
