<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>房屋详情</title>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/FrontPage/img/index/logo.png"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/house_details.css"/>
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
			<div class="house-title">
				<span><a href="${pageContext.request.contextPath}/FrontPage/index.jsp"><span>首页</span></a>&nbsp;>&nbsp;
				<a href="${pageContext.request.contextPath}/FrontPage/attract_list.jsp"><span>招商信息</span></a>&nbsp;>&nbsp;
				<i>{{info.attractName}}</i></span>
			</div>
			<div class="house-left">
				<div class="z-obox">
					<div class="z-left">
						<img src="${pageContext.request.contextPath}/FrontPage/img/house_details/YDUI-left.png"/>
					</div>
					<div class="z-right">
						<img src="${pageContext.request.contextPath}/FrontPage/img/house_details/YDUI-right.png"/>
					</div>
					<div class="z-title">
						图片（<i></i>/5）
					</div>
					<div class="z-box1">
						<div class="z-box2">
							<ul>
								<li><img src="${pageContext.request.contextPath}/FrontPage/img/house_details/1.jpg"/></li>
								<li><img src="${pageContext.request.contextPath}/FrontPage/img/house_details/2.jpg"/></li>
								<li><img src="${pageContext.request.contextPath}/FrontPage/img/house_details/3.jpg"/></li>
								<li><img src="${pageContext.request.contextPath}/FrontPage/img/house_details/4.jpg"/></li>
								<li><img src="${pageContext.request.contextPath}/FrontPage/img/house_details/5.jpg"/></li>
							</ul>
						</div>				
					</div>
					<div class="z-small-box">
						<div class="z-s-left">
							<img src="${pageContext.request.contextPath}/FrontPage/img/house_details/YDUI-left.png"/>
						</div>
						<div class="z-s-right">
							<img src="${pageContext.request.contextPath}/FrontPage/img/house_details/YDUI-right.png"/>
						</div>
						<div class="z-div1">
							<div class="z-div2">
								<ul>
									<li class="z-bor-col"><img src="${pageContext.request.contextPath}/FrontPage/img/house_details/1.jpg"/></li>
									<li><img src="${pageContext.request.contextPath}/FrontPage/img/house_details/2.jpg"/></li>
									<li><img src="${pageContext.request.contextPath}/FrontPage/img/house_details/3.jpg"/></li>
									<li><img src="${pageContext.request.contextPath}/FrontPage/img/house_details/4.jpg"/></li>
									<li><img src="${pageContext.request.contextPath}/FrontPage/img/house_details/5.jpg"/></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="house-right">
				<h3>{{info.attractName}}</h3>
				<p>地址：<i>{{info.attractAddress}}</i></p>
				<p>交通：<i>{{info.attractTraffic}}</i></p>
				<hr />
				<p>所属园区：<i>{{info.attractGarden}}</i></p>
				<p>建筑面积：<i>{{info.attractArea}}</i><i>㎡</i></p>
				<p>可容纳工位：<i>{{info.attractStation}}</p>
				<p>装修：<i>{{info.attractDecoration}}</i></p>
				<p>使用率：<i>{{info.attractRate}}</i></p>
				<p>免租期：<i>{{info.attractRentfree}}</i></p>
				<!-- <p>楼层：<i>中层(共六层)</i></p>
				<p>可注册：<i>是</i></p>
				<span class="span1">户型方正</span>
				<span class="span2">南北通透</span> -->
				<div class="d-contact">
					<img src="${pageContext.request.contextPath}/FrontPage/img/house_details/phone.png"/>
					{{info.attractPhone}}
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
		<script src="${pageContext.request.contextPath}/FrontPage/js/slideshow.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/vue.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/general.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/operatcookie.js"></script>
		<script type="text/javascript">
		var info = new Vue({
			el:"#record",
			data:{
				info:[],
			},
			 methods: {
				 
			 }
		})
		
		var that = this.info;
		$(function(){
			var attractId = decodeURI(cookie.get("attractId"));
			//alert(attractId);
			$.ajax({
				//几个参数需要注意一下
				type: "get",//方法类型
			    dataType: "json",//预期服务器返回的数据类型
			    url: "/EntrepreneurialCenter/Attract/getAttractById" ,//url
			    data: {id:attractId},
			    contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			    success: function (result) {
				    console.log(result);//打印服务端返回的数据(调试用)
				    //alert(result);
				    that.info = result;
			    }
			}); 
			
		});
		</script>
	</body>
</html>
