<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>入驻企业</title>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/FrontPage/img/index/logo.png"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/swiper.min.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/index.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/Settled_company.css"/>
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
		    	<li class="active1"><a href="${pageContext.request.contextPath}/FrontPage/Settled_company.jsp">入驻企业</a></li>
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
			        		<img src="${pageContext.request.contextPath}/FrontPage/img/Settled_company/banner.png"/>
			        	</a>
			        </div>
			        <div class="swiper-slide">
			        	<a href="">
			        		<img src="${pageContext.request.contextPath}/FrontPage/img/Settled_company/banner.png"/>
			        	</a>
			        </div>
			        <div class="swiper-slide">
			        	<a href="">
			        		<img src="${pageContext.request.contextPath}/FrontPage/img/Settled_company/banner.png"/>
			        	</a>
			        </div>
			    </div>
			    <!-- 分页器 -->
			    <div class="swiper-pagination"></div>		    
			</div>
			<!--/轮播图-->
			<div class="cm-box">
				<i>首页&nbsp;>&nbsp;入驻企业</i>
				<div class="d-search">
					<img src="${pageContext.request.contextPath}/FrontPage/img/attract_list/sousuo.png"/>
					<input type="text" name="likeInfo" id="likeInfo" value="" placeholder="请输入公司名称" />
					<span @click="likePartner">搜索</span>
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
		<script src="${pageContext.request.contextPath}/FrontPage/js/swiper.min.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/vue.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/general.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/operatcookie.js"></script>
		<script type="text/javascript">
		var info = new Vue({
			el:"#record",
			data:{
					partnerInfo:[]
				},
				 methods: {
					 likePartner:function(){
						 var likeInfo = $("#likeInfo").val();
						 if (likeInfo!="") {
							 $.ajax({
									//几个参数需要注意一下
									type: "POST",//方法类型
							        dataType: "json",//预期服务器返回的数据类型
							        url: "/EntrepreneurialCenter/Companies/likeSelectCompanies" ,//url
							        data: {"value":likeInfo},
							        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
							        success: function (result) {
							        	console.log(result);//打印服务端返回的数据(调试用)
							        	//alert(result);
							        	that.partnerInfo = result;
							        },
							        error : function() {
							        	alert("异常！");
							        	}
							       	}); 
						}else{
							$.ajax({
								//几个参数需要注意一下
								type: "get",//方法类型
						        dataType: "json",//预期服务器返回的数据类型
						        url: "/EntrepreneurialCenter/Companies/RandSelectCompanies" ,//url
						        //data: ,
						        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
						        success: function (result) {
						        	console.log(result);//打印服务端返回的数据(调试用)
						        	//alert(result);
						        	that.partnerInfo = result;
						        }
						       	}); 
						}
							
					 },
				    	eval:function(value){
				    		return eval('('+value+')');	
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
				    }
				}) 	
				
				$.ajax({
					//几个参数需要注意一下
					type: "get",//方法类型
			        dataType: "json",//预期服务器返回的数据类型
			        url: "/EntrepreneurialCenter/Companies/RandSelectCompanies" ,//url
			        //data: {rows:50} ,
			        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			        success: function (result) {
			        	console.log(result);//打印服务端返回的数据(调试用)
			        	//alert(result);
			        	that.partnerInfo = result;
			        }
			       	}); 
				
			}
		</script>
	</body>
</html>
