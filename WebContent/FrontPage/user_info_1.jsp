<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<!--<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />-->
		<title>基础资料</title>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/FrontPage/img/index/logo.png"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/bootstrap.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/user_info.css"/>
	</head>
	<body>
		<!--顶部菜单栏-->
		<nav class="nav">
		    <span class="s-logo">
		    	<img src="${pageContext.request.contextPath}/FrontPage/img/index/logo.png"/>
		    </span>
		    <div class="caidan show-xs">
		    	<img src="${pageContext.request.contextPath}/FrontPage/img/caidan.png"/>
		    </div>
	    	<ul>
		    	<li><a href="${pageContext.request.contextPath}/FrontPage/index.jsp">首页</a></li>
		    	<li><a href="${pageContext.request.contextPath}/FrontPage/attract_list.jsp">招商信息</a></li>
		    	<li><a href="${pageContext.request.contextPath}/FrontPage/garden_points.jsp">园区概况</a></li>
		    	<li><a href="${pageContext.request.contextPath}/FrontPage/garden_message.jsp">园区资讯</a></li>
		    	<li><a href="${pageContext.request.contextPath}/FrontPage/Settled_company.jsp">入驻企业</a></li>
		    	<%-- <li><a href="${pageContext.request.contextPath}/FrontPage/contact_us.jsp">联系我们</a></li> --%>
		    	<li class="login_li" style="display: none;">
		    		<a id="login_l1" href="${pageContext.request.contextPath}/FrontPage/login.jsp">登录</a>
		    		<a id="login_l2" href="${pageContext.request.contextPath}/FrontPage/user_info_1.jsp">企业中心</a>
		    	</li>
	    	</ul>
		   <span class="r-span r-s1 hide-xs">
		   		<a href="">		   			
			    	<img src="${pageContext.request.contextPath}/FrontPage/img/index/footer-smallphone.png"/>
			    	<i>全国热线电话</i><br />
			    	<i>400-0000-0000</i>
		   		</a>
		    </span>
		    <span class="r-span hide-xs">
		    	<a href="">		    		
			    	<img src="${pageContext.request.contextPath}/FrontPage/img/index/222222.png"/>
			    	<i>24小时客户</i><br />
			    	<i>立即咨询</i>
		    	</a>
		    </span>
		    <span class="login_in">
		    	<img src="${pageContext.request.contextPath}/FrontPage/img/index/zhanghao_icon.png"/>
		    	<a class="login_before" id="login_a1" href="${pageContext.request.contextPath}/FrontPage/login.jsp">登录</a>
		    	<a class="login_after" style="display: none;" id="login_a2" href="${pageContext.request.contextPath}/FrontPage/user_info_1.jsp">企业中心</a>
		    </span>
		</nav>
		<!--内容区-->
		<div class="content" id="record">
			<div class="news-obox">				
			<p class="navig">首页&nbsp;>&nbsp;个人信息</p>
				<div class="left-box">
					<ul>
						<li><a class="active2" href="${pageContext.request.contextPath}/FrontPage/user_info_1.jsp">基本资料</a></li>
						<li><a href="${pageContext.request.contextPath}/FrontPage/user_info_2.jsp">入园申请</a></li>
						<li><a href="${pageContext.request.contextPath}/FrontPage/user_info_3.jsp">退园申请</a></li>
						<li><a href="${pageContext.request.contextPath}/FrontPage/user_info_4.jsp">变更申请</a></li>
						<li><a href="${pageContext.request.contextPath}/FrontPage/user_info_5.jsp">维修申请</a></li>
						<li><a href="${pageContext.request.contextPath}/FrontPage/user_info_6.jsp">联系我们</a></li>
					</ul>
				</div>
				<div class="right-box">
					<div class="div1">
						<div class="div1_ipt">
							<label>
								真实姓名：
								<input type="text" name="frontName" id="frontName" />
							</label>
						</div>
						<div class="div1_ipt">
							<label>
								手机号码：
								<input type="text" name="frontPhone" id="frontPhone" />
							</label>
						</div>
						<div class="div1_ipt">
							<label>
								<input type="button" value="修改" @click="submitInfo()" />
							</label>
						</div>
						<h2>修改密码</h2>
						<hr style="margin-bottom:30px;" />
						<div class="div1_ipt">
							<label>
								输入旧密码：
								<input type="password" name="oldPass" id="oldPass" />
							</label>
						</div>
						<div class="div1_ipt">
							<label>
								输入新密码：
								<input type="password" name="newPass" id="newPass" />
							</label>
						</div>
						<div class="div1_ipt">
							<label>
								确认新密码：
								<input type="password" name="repPass" id="repPass" />
							</label>
						</div>
						<div class="div1_ipt">
							<label>
								<input type="button" value="提交" @click="submitPass()" />
							</label>
						</div>
						<h2>退出登录</h2>
						<hr style="margin-bottom:30px;" />
						<div class="div1_ipt">
							<label>
								<input type="button" value="退出登录" @click="Logout()" />
							</label>
						</div>
					</div>					
				</div>
			</div>
		</div>		
		<!--返回头部按钮-->
		<div class="backTop">
			<img src="${pageContext.request.contextPath}/FrontPage/img/index/backTop.png"/>
		</div>
		<!--底部-->
		<div class="footer">
			<div class="f-left">
				<p>xxxxxxxx公众号</p>
				<div class="d-img">
					<img src=""/>
				</div>
			</div>
			<div class="f-right">
				<img class="hide-xs" src="${pageContext.request.contextPath}/FrontPage/img/index/footer-smallphone.png"/>
				<h2>客服电话: 400-0000-0000</h2>
				<p>公司邮编: 0000-0000-0000</p>
				<p>服务时间: 9:00-17:00 ( 周一至周五 )</p>
				<p>公司邮箱: xxxx@193.com</p>
				<p>公司地址: 广西桂林市七星区******</p>
			</div>
		</div>
		
		
		<script src="${pageContext.request.contextPath}/FrontPage/js/jquery-3.3.1.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/FrontPage/js/common.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/vue.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/general.js"></script>		
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/operatcookie.js"></script>				
		<script type="text/javascript">
		var info = new Vue({
			el:"#record",
			data:{
				infoList:[],
				},
				 methods: {
					 submitInfo:function(){
						var frontName = $("#frontName").val();
						var frontPhone = $("#frontPhone").val();
						var Name = decodeURI(cookie.get("frontName"));
						var Phone = decodeURI(cookie.get("frontPhone"));
						var frontId = decodeURI(cookie.get("frontId"));
						if ($.trim(frontName&&frontPhone).length == 0) {
							alert("表单不能为空。");
						}else{
							if (frontName==Name&&frontPhone==Phone) {
								alert("请修改信息后提交。")
								return;
							}
							if (frontPhone==Phone) {
								//alert(1);
								$.ajax({
									//几个参数需要注意一下
									type: "POST",//方法类型
							        dataType: "json",//预期服务器返回的数据类型
							        url: "/EntrepreneurialCenter/UserFront/updateUserFront" ,//url
							        data: {frontId:frontId,frontTelephone:frontPhone,frontName:frontName},
							        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
							        success: function (result) {
							        	if (result.status == 500) {
							        		alert(result.msg);
							        	}else{
							        		alert("修改成功。");
							        		//alert(frontName+frontPhone);
							        		cookie.set("frontName",encodeURI(frontName),2);
								        	cookie.set("frontPhone",encodeURI(frontPhone),2);
								        	location.reload();
							        	}
							        }
								})
							}else{
								$.ajax({
									//几个参数需要注意一下
									type: "POST",//方法类型
							        dataType: "json",//预期服务器返回的数据类型
							        url: "/EntrepreneurialCenter/UserFront/getPhoneIsRepet" ,//url
							        data: {value:frontPhone},
							        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
							        success: function (result) {
							        	if (result.status == 500) {
							        		alert(result.msg);
							        	}else{
							        		$.ajax({
												//几个参数需要注意一下
												type: "POST",//方法类型
										        dataType: "json",//预期服务器返回的数据类型
										        url: "/EntrepreneurialCenter/UserFront/updateUserFront" ,//url
										        data: {frontId:frontId,frontTelephone:frontPhone,frontName:frontName},
										        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
										        success: function (result) {
										        	if (result.status == 500) {
										        		alert(result.msg);
										        	}else{
										        		alert("修改成功。");
										        		//alert(frontName+frontPhone);
										        		cookie.set("frontName",encodeURI(frontName),2);
											        	cookie.set("frontPhone",encodeURI(frontPhone),2);
											        	location.reload();
										        	}
										        }
											})
							        	}
							        }
								})
							}
						}
					 },
					 submitPass:function(){
						 //alert(111)
						 var oldPass = $("#oldPass").val();
						 var newPass = $("#newPass").val();
						 var repPass = $("#repPass").val();
						 var frontId = decodeURI(cookie.get("frontId"));
						 if ($.trim(oldPass&&newPass&&repPass).length == 0) {
							 alert("表单不能为空。");
							 return;
						}
						 if (newPass!=repPass) {
							 alert("两次新密码不一致。");
							 return;
						}
						 if (oldPass==newPass) {
							alert("新密码不能和旧密码一样。");
							return;
						}
						 $.ajax({
								//几个参数需要注意一下
								type: "POST",//方法类型
						        dataType: "json",//预期服务器返回的数据类型
						        url: "/EntrepreneurialCenter/UserFront/updateUserFrontPass" ,//url
						        data: {id:frontId,oldPass:oldPass,newPass:newPass},
						        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
						        success: function (result) {
						        	if (result.status == 500 || result.status == 400) {
						        		alert(result.msg);
						        	}else{
						        		alert("修改成功。");
							        	location.reload();
						        	}
						        }
							})
					 },
					 Logout:function(){
							cookie.del("frontName");	
							cookie.del("frontPhone");
							cookie.del("frontId");
							//alert("退出成功。")
							//location.reload();
							location.href = "index.jsp";
					},
				 }
		});
		
		var that = this.info;
		$(function(){
			var frontName = decodeURI(cookie.get("frontName"));
			var frontPhone = decodeURI(cookie.get("frontPhone"));
			var frontId = decodeURI(cookie.get("frontId"));
			if(frontName=="undefined"&&frontPhone=="undefined"&&frontId=="undefined"){
				location.href = "index.jsp";
				$("#login_a1").show();
				$("#login_l1").show();
				$("#login_a2").hide();
				$("#login_l2").hide();
			}
			
			var frontName = decodeURI(cookie.get("frontName"));
			var frontPhone = decodeURI(cookie.get("frontPhone"));
			$("#frontName").val(frontName);
			$("#frontPhone").val(frontPhone);
			
			/* $.ajax({
				//几个参数需要注意一下
				type: "get",//方法类型
		        dataType: "json",//预期服务器返回的数据类型
		        url: "/EntrepreneurialCenter/UserFront/getUserFrontById" ,//url
		        data: {id:1},
		        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
		        success: function (result) {
		        	console.log(result);//打印服务端返回的数据(调试用)
		        	that.infoList = result;
		        }
		       	});  */
		});
		</script>	
	</body>
</html>
