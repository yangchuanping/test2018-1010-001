<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>园区概况</title>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/FrontPage/img/index/logo.png"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/bootstrap.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/garden_points.css"/>
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
		    	<li class="active1"><a href="garden_points.jsp">园区概况</a></li>
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
		<div class="content">
			<img class="aimg" src="${pageContext.request.contextPath}/FrontPage/img/garden_points/01.png"/>
			<div class="imgbox1">
				<div class="imgbox1-l">
					<img src="${pageContext.request.contextPath}/FrontPage/img/garden_points/img1.png"/>
				</div>
				<div class="imgbox1-r">
					<h2>桂林电商谷</h2>
					<p>桂林电商谷是在桂林国家高新区管委会指导下，由桂林民华科技发展有限公司出资创建，旨在以桂林国家高新区为依托，吸引社会资源的参与，打造产学研融合的平台，建设成为环境优美、配套齐全、服务优良的电商产业集群基地。</p>
					<p>桂林电商谷建成后，与民华公司投资的民华科技企业孵化器、加速器一起，作为桂林高新国家信息产业园内唯一的一个集企业孵化、产业加速、电商集群的多功能孵化基地，是信息产业园的重要组成部分，作为与桂林电商谷配套的民华科技企业孵化器目前已通过了自治区级科技企业孵化器的资质认定，国家级科技企业孵化器的资质认定在即。</p>
					<p>“桂林电商谷”在桂林国家高新区的政策、载体、资源等支持下，将围绕“三个一”，即打造一批知名电商企业，培育一批电商人才队伍，建设一个成熟的电子商务平台，大力推进桂林乃至整个广西电子商务产业的发展，大力发展以广西特色单品为主导的产业集群电子商务，培育广西本土的第三方综合性服务龙头企业和一批行业专业性服务企业，并将通过引进并支付、金融、物流、信息技术等第三方服务机构，优化桂林电子商务生态环境。</p>
				</div>
			</div>
			<div class="imgbox2">
				<span class="imgbox2-span">
					<img src="${pageContext.request.contextPath}/FrontPage/img/garden_points/img3.png"/>
					<p>桂林电商谷</p>
				</span>
				<span class="imgbox2-span">
					<img src="${pageContext.request.contextPath}/FrontPage/img/garden_points/img2.png"/>
					<p>桂林国家大学科技园</p>
				</span>
				<span class="imgbox2-span">
					<img src="${pageContext.request.contextPath}/FrontPage/img/garden_points/img4.png"/>
					<p>舒适整洁的园区环境</p>
				</span>
			</div>
			<img class="aimg" src="${pageContext.request.contextPath}/FrontPage/img/garden_points/02.png"/>
			<div class="address-box">
				<span>
					<h3>信息产业园</h3>
					<p>
						<img src="${pageContext.request.contextPath}/FrontPage/img/garden_points/location.png"/>
						<i>园区地址：桂林市七星区普陀路40号</i>
					</p>
					<p>
						<img src="${pageContext.request.contextPath}/FrontPage/img/garden_points/phone.png"/>
						<i>联系电话：0773-88888888</i>
					</p>
					<p>
						<img src="${pageContext.request.contextPath}/FrontPage/img/garden_points/email.png"/>
						<i>邮政编码：541004</i>
					</p>
				</span>
				<span>
					<h3>创意产业园</h3>
					<p>
						<img src="${pageContext.request.contextPath}/FrontPage/img/garden_points/location.png"/>
						<i>园区地址：桂林市七星区普陀路40号</i>
					</p>
					<p>
						<img src="${pageContext.request.contextPath}/FrontPage/img/garden_points/phone.png"/>
						<i>联系电话：0773-88888888</i>
					</p>
					<p>
						<img src="${pageContext.request.contextPath}/FrontPage/img/garden_points/email.png"/>
						<i>邮政编码：541004</i>
					</p>
				</span>
				<span>
					<h3>大学科技园</h3>
					<p>
						<img src="${pageContext.request.contextPath}/FrontPage/img/garden_points/location.png"/>
						<i>园区地址：桂林市七星区普陀路40号</i>
					</p>
					<p>
						<img src="${pageContext.request.contextPath}/FrontPage/img/garden_points/phone.png"/>
						<i>联系电话：0773-88888888</i>
					</p>
					<p>
						<img src="${pageContext.request.contextPath}/FrontPage/img/garden_points/email.png"/>
						<i>邮政编码：541004</i>
					</p>
				</span>
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
	</body>
</html>
