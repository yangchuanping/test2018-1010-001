<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>首页</title>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/FrontPage/img/index/logo.png"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/swiper.min.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/index.css"/>
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
		    	<li class="active1"><a href="${pageContext.request.contextPath}/FrontPage/index.jsp">首页</a></li>
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
			<!--轮播图-->
			<div class="swiper-container">
			    <div class="swiper-wrapper">
			        <div class="swiper-slide">
			        	<a href="">
			        		<img src="${pageContext.request.contextPath}/FrontPage/img/index/banner1.png"/>
			        	</a>
			        </div>
			        <div class="swiper-slide">
			        	<a href="">
			        		<img src="${pageContext.request.contextPath}/FrontPage/img/index/banner1.png"/>
			        	</a>
			        </div>
			        <div class="swiper-slide">
			        	<a href="">
			        		<img src="${pageContext.request.contextPath}/FrontPage/img/index/banner1.png"/>
			        	</a>
			        </div>
			    </div>
			    <!-- 分页器 -->
			    <div class="swiper-pagination"></div>	  
			    <!-- 导航按钮 -->
			    <div class="swiper-button-prev swiper-button-white hide-xs"></div>
			    <div class="swiper-button-next swiper-button-white hide-xs"></div>
			</div>
			<!--/轮播图-->
			<div>
				<div class="d-title">
					<h2>企业服务</h2>
					<p>ENTERPRISE&nbsp;&nbsp;SERVICE</p>
					<div></div>
				</div>
				<div class="d-firm">
					<a href="${pageContext.request.contextPath}/FrontPage/garden_apply.jsp"><img src="${pageContext.request.contextPath}/FrontPage/img/index/1.png"/></a>
					<a href="${pageContext.request.contextPath}/FrontPage/site_changes.jsp" v-if="loginname!=1"><img src="${pageContext.request.contextPath}/FrontPage/img/index/2.png"/></a>
					<a href="${pageContext.request.contextPath}/FrontPage/quit_apply.jsp" v-if="loginname!=1"><img src="${pageContext.request.contextPath}/FrontPage/img/index/3.png"/></a>
					<a href="${pageContext.request.contextPath}/FrontPage/maintain_apply.jsp" v-if="loginname!=1"><img src="${pageContext.request.contextPath}/FrontPage/img/index/4.png"/></a>
					<a href=""><img src="${pageContext.request.contextPath}/FrontPage/img/index/5.png"/></a>
					<a href="${pageContext.request.contextPath}/FrontPage/attract_list.jsp"><img src="${pageContext.request.contextPath}/FrontPage/img/index/6.png"/></a>
					<a href="${pageContext.request.contextPath}/FrontPage/Settled_company.jsp"><img src="${pageContext.request.contextPath}/FrontPage/img/index/7.png"/></a>
					<a href="${pageContext.request.contextPath}/FrontPage/contact_us.jsp" v-if="loginname!=1"><img src="${pageContext.request.contextPath}/FrontPage/img/index/8.png"/></a>
				</div>
			</div>			
			<div class="d-about">
				<div class="d-title">
					<h2>园区概况</h2>
					<p>ABOUT&nbsp;&nbsp;US</p>
					<div></div>
				</div>
				<div class="ab-content" @click="rept(1)">
					<div class="ab-left-img">
						<img src="${pageContext.request.contextPath}/FrontPage/img/index/a1.png"/>
						<div class="ab-left-text">
							<span>园区介绍</span>
							<i>COMPANY&nbsp;&nbsp;INTRODUCTION</i>
							<p>桂林电商谷是在桂林国家高新区管委会指导下，由桂林民华科技发展有限公司出资创建，旨在以桂林国家高新区为依托，吸引社会资源的参与，打造产学研融合的平台，建设成为环境优美、配套齐全、服务优良的电商产业集群基地。</p>
						</div>
					</div>
					<div class="ab-right">
						<div class="ab-right-div">
							<img src="${pageContext.request.contextPath}/FrontPage/img/index/img2.png"/>
						</div>
						<div class="ab-right-div ab-padding">
							<span>园区介绍</span>
							<i>PRODUCT&nbsp;INTRODUCTION</i>
							<p>桂林电商谷是在桂林国家高新区管委会指导下，由桂林民华科技发展有限公司出资创建，旨在以桂林国家高新区为依托，吸引社会资源的参与，打造产学研融合的平台，建设成为环境优美、配套齐全、服务优良的电商产业集群基地。</p>
						</div>
						<div class="ab-right-div ab-padding">
							<span>园区精神</span>
							<i>MARKETING&nbsp;CONCEPT</i>
							<p>我们的营销理念: "好产品，好模式，好服务！"，希望广大企业和商户联系精诚合作，通过我们的产品和服务为您创造百万价值！</p>
						</div>
						<div class="ab-right-div">
							<img src="${pageContext.request.contextPath}/FrontPage/img/index/img1.png"/>
						</div>
					</div>
				</div>
			</div>
			<div class="d-product">
				<div class="d-title">
					<h2>招商信息</h2>
					<p>PRODUCT&nbsp;&nbsp;INTRODUCTION</p>
					<div></div>
				</div>
				<div class="d-attrac" @click="rept(2)">
					<div class="d-attrac-div attrac-1">
						<img src="${pageContext.request.contextPath}/FrontPage/img/index/b3.png"/>
					</div>
					<div class="d-attrac-div attrac-1 ab-padding">
						<p class="d-attrac-p1">
							由桂林民华科技发展有限公司出资创建的桂林电商谷位于桂林东部的国家高新区信息产业园D-12号，毗邻广西师范大学、桂林理工大学与桂林电子科技大学，与奇峰小筑住宅小区近在咫尺，桂林电商谷建成后，与民华公司投资的民华科技企业孵化器、加速器一起，作为桂林高新国家信息产业园内唯一的一个集企业孵化、产业加速、电商集群的多功能孵化基地，是信息产业园的重要组成部分。
						</p>
					</div>
					<div class="d-attrac-div ab-padding">
						<p class="d-attrac-p1">桂林电商谷服务平台有以下优势</p>
						<p class="d-attrac-p2">1、人才服务平台：电商谷内设有中高级人才中心，电商企业以及中小企业急需的中高级科技和管理人才提供猎头服务。</p>
						<p class="d-attrac-p2">2、专业服务平台：整合各种信息源，建立信息管理系统，构建信息服务体系，为企业提供一个信息服务平台。</p>
						<p class="d-attrac-p2">3、人才集聚智谷：建设广西电子商务培训基地，为企业培育电子商务应用人才。</p>
						<p class="d-attrac-p2">4、政策支持：协助企业落实各级政府对电商企业和项目扶持的各种优惠政策。</p>
						<p class="d-attrac-p2">5、场地和物业服务：提供科研、开发、生产、办公和生活等场地，组织企业间的联谊活动，交流企业发展经验，开展业务合作。</p>
					</div>
					<div class="d-attrac-div">
						<img src="${pageContext.request.contextPath}/FrontPage/img/index/b2.png"/>
					</div>
				</div>
			</div>
			<div class="d-about">
				<div class="d-title">
					<h2>园区资讯</h2>
					<p>NEWS&nbsp;&nbsp;CENTER</p>
					<div></div>
				</div>
				<div class="d-news">
					<div class="news-left" v-for="(m,i) in msg" v-if="i==0">
						<img src="${pageContext.request.contextPath}/FrontPage/img/index/b1.png"/>
						<i class="news-i mar">{{ formatDate(m.msgCreated*1000) }}</i>
						<span class="news-span nsp">{{ m.msgTitle }}</span>
						<p class="news-p">{{ m.msgContent }}</p>
					</div>
					<div class="news-right">
						<div class="news-div" v-for="(m,i) in msg" v-if="i!=0&&i<=4">
							<i class="news-i news-i2">{{ formatDate(m.msgCreated*1000) }}</i>
							<span class="news-span">{{ m.msgTitle }}</span>
							<p class="news-p2">{{ m.msgContent }}</p>
						</div>
					</div>
				</div>	
				<div class="more-news">
					<a href="${pageContext.request.contextPath}/FrontPage/garden_message.jsp">更多资讯</a>
				</div>
		</div>
		<div>
			<div class="d-title">
				<h2>入驻企业</h2>
				<p>COOPERATIVE&nbsp;&nbsp;PARTNER</p>
				<div></div>
			</div>
			<div class="d-table">
				<table class="table1">
				    <thead>
				        <tr>
				            <th>企业名称</th>
				            <th>行业类别</th>
				            <th>入园时间</th>
				            <th style="border-right: none;">地址</th>
				        </tr>
				    </thead>
				    <tbody>
				        <tr v-for="info in partnerInfo">
				            <td>{{info.comName}}</td>
				            <td>{{info.indTitle}}</td>
				            <td>{{formatDate(info.joinDmt)}}</td>
				            <td>{{ eval(info.comDetail)[17] }}</td>
				        </tr>
				        <tr>
				        	<td v-if="partnerInfo.length==0" style="width: 1280px;" >暂无数据。</td>
				        </tr>
				    </tbody>
				</table>
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
		<script src="${pageContext.request.contextPath}/FrontPage/js/swiper.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/FrontPage/js/common.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/vue.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/moment.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/general.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/operatcookie.js"></script>	
		<script type="text/javascript">
		var info = new Vue({
			el:"#record",
			data:{
					partnerInfo:[],
					loginname:{},
					msg:[],
				},
				 methods: {
					 rept:function(value){
						 if (value==1) {
							 location.href = "${pageContext.request.contextPath}/FrontPage/garden_points.jsp";
						}else{
							location.href = "${pageContext.request.contextPath}/FrontPage/attract_list.jsp";
						}
					 },
					 formatDate:function(value){
						 if (value==null || value=="" || value=="undefined") {
								return;
							}
				    		var t = new Date(value);
				    		var format = "yyyy-MM-dd";
				            var tf = function(i) {
				                return (i < 10 ? '0': '') + i;
				            };
				            return format.replace(/yyyy|MM|dd|HH|mm|ss/g,
				            function(a) {
				                switch (a) {
				                case 'yyyy':
				                    return tf(t.getFullYear());
				                    break;
				                case 'MM':
				                    return tf(t.getMonth() + 1);
				                    break;
				                case 'mm':
				                    return tf(t.getMinutes());
				                    break;
				                case 'dd':
				                    return tf(t.getDate());
				                    break;
				                case 'HH':
				                    return tf(t.getHours());
				                    break;
				                case 'ss':
				                    return tf(t.getSeconds());
				                    break;
				                }
				            });
				    	},
				    	eval:function(value){
				    		return eval('('+value+')');	
				    	} 
				 }
				 
		});
		
			var that = this.info;
			window.onload = function(){
				//轮播图
				var mySwiper = new Swiper ('.swiper-container', {
				    direction: 'horizontal',
				    loop: true,
				    autoplay: {
				        delay: 3500,
				        disableOnInteraction: false,
				    },
				   
				    //分页器
				     pagination: {
				      el: '.swiper-pagination',
				      clickable: true,
				    },				    
				    //后退按钮
				    navigation: {
				      nextEl: '.swiper-button-next',
				      prevEl: '.swiper-button-prev',
				    }				   
				}) 

				
				var frontName = decodeURI(cookie.get("frontName"));
				if (frontName=="undefined") {
					that.loginname=1;
				}else{
					that.loginname=null;
				}
				//alert(that.loginname);
			
				$.ajax({
					//几个参数需要注意一下
					type: "get",//方法类型
			        dataType: "json",//预期服务器返回的数据类型
			        url: "/EntrepreneurialCenter/Companies/RandSelectCompanies" ,//url
			        //data: {},
			        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			        success: function (result) {
			        	console.log(result);//打印服务端返回的数据(调试用)
			        	//alert(result);
			        	that.partnerInfo = result;
			        }
			       	}); 
				
				$.ajax({
					//几个参数需要注意一下
					type: "get",//方法类型
			        dataType: "json",//预期服务器返回的数据类型
			        url: "/EntrepreneurialCenter/Message/getMessageInfo" ,//url
			        //data: {},
			        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			        success: function (result) {
			        	console.log(result);//打印服务端返回的数据(调试用)
			        	//alert(result);
			        	that.msg = result.rows;
			        	/* that.pages2 = result.digitalPage;
			        	setTimeout(function() {
							$('#fy2 li a').removeClass('a-active');
							$("#f"+result.page).addClass('a-active');
						}, 100) */
			        }
			       	}); 
			}
		</script>
	</body>
</html>
