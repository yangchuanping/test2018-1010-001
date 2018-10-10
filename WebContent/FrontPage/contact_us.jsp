<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>联系我们</title>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/FrontPage/img/index/logo.png"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/contact_us.css"/>
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
		    	<%-- <li class="active1"><a href="${pageContext.request.contextPath}/FrontPage/contact_us.jsp">联系我们</a></li> --%>
		    	<li class="login_li" id="login_l1" style="display: none;">
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
		<div class="content">
			<div class="cont-img">
				<img src="${pageContext.request.contextPath}/FrontPage/img/contact_us/bannerl.png"/>
			</div>
			<div class="cont-box">
				<div class="cont-title">
					<i class="c-l"></i>&nbsp;
					<h2>我们想听到您的声音</h2>
					&nbsp;<i class="c-r"></i>
					<p>WE WANT TO HEAR YOUR VOICE</p>
				</div>
				<div class="d-box">
					<div class="d-box-left">
						<input type="text" name="contactAddress" id="contactAddress" value="" placeholder="地址："/>
					</div>
					<div class="d-box-right">
						<input type="text" name="contactEmail" id="contactEmail" value="" placeholder="邮箱："/>
					</div>
				</div>
				<div class="d-box">
					<textarea id="contactContent" name="contactContent" rows="5" cols="" placeholder="您想对我们说的话..."></textarea>
				</div>
				<div class="d-box">
					<button onclick="submit()">提交您的信息</button>
				</div>
			</div>
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
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/general.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/operatcookie.js"></script>
		<script type="text/javascript">
		
		function submit(){
			var contactEmail = $("#contactEmail").val();
			var contactAddress = $("#contactAddress").val();
			var contactContent = $("#contactContent").val();
			
			var frontName = decodeURI(cookie.get("frontName"));
			var frontPhone = decodeURI(cookie.get("frontPhone"));
			var frontId = decodeURI(cookie.get("frontId"));
			
			//邮箱验证的正则表达式
			var regEmail = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
			
			if ($.trim(contactEmail&&contactAddress&&contactContent).length == 0) {
				alert('请填写完整表单.');
				return false;
			}else if (!regEmail.test(contactEmail)) {
				alert('请填写正确的邮箱地址。');
				return false;
			}else{
				//alert(contactName+contactEmail+contactPhone+contactAddress+contactContent);
				if(confirm("是否新增信息？新增后不可修改。")) {
					$.ajax({
						type:"post",
						url:"/EntrepreneurialCenter/ContactUs/addContactUs",
						dataType : "json",
						async: false,
						data : {frontId:frontId,"contactName":frontName,"contactEmail":contactEmail,"contactPhone":frontPhone,"contactAddress":contactAddress,"contactContent":contactContent},
						success:function(data)
						{
							//alert(data)
							if (data.status == 200) {
								alert("新增成功！");
								location.reload();
							} else {
								alert("登录失败，原因是：" + data.msg);
							}  
						}
					});  
				}
			}
		}
		</script>
	</body>
</html>
