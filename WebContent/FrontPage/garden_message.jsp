<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>招商信息</title>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/FrontPage/img/index/logo.png"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/garden_message.css"/>
		<!--分页-->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/pageNav.css"/>
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
		    	<li class="active1"><a href="${pageContext.request.contextPath}/FrontPage/garden_message.jsp">园区资讯</a></li>
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
			<div class="top-img hide-xs">
				<img src="${pageContext.request.contextPath}/FrontPage/img/garden_message/banner.png"/>
			</div>
			<div class="news-obox">				
			<p class="navig">首页&nbsp;>&nbsp;新闻资讯</p>
				<div class="left-box">
					<ul>
						<li><a class="active2" href="javascript:;">新闻资讯</a></li>
						<li><a href="javascript:;">园区动态</a></li>
						<li><a href="javascript:;">行业资讯</a></li>
					</ul>
				</div>
				<div class="right-box">
					<div class="div1">
						<div class="r-Top-name">
							<span>新闻资讯</span>
						</div>
						<%-- <div class="top-msg">
							<div class="left-img">
								<img src="${pageContext.request.contextPath}/FrontPage/img/garden_message/img123.png"/>							
							</div>
							<div class="right-txt">
								<a href="javascript:;">
									<span>中国专利局：2018年专利申请趋势中国专利局：2018年专利申请趋势中国专利局：2018年专利申请趋势</span>
									<p>2018年6月28日，中国专利局发布了2017年专利申请趋势调查报告。中国专利局发布了2017年专利申请趋势调查报告。中国专利局发布了2017年专利申请趋势调查报告。2018年6月28日，中国专利局发布了2017年专利申请趋势调查报告。中国专利局发布了2017年专利申请趋势调查报告。中国专利局发布了2017年专利申请趋势调查报告。2018年6月28日，中国专利局发布了2017年专利申请趋势调查报告。中国专利局发布了2017年专利申请趋势调查报告。中国专利局发布了2017年专利申请趋势调查报告。</p>
									<div class="d-clock">
										<img src="${pageContext.request.contextPath}/FrontPage/img/garden_message/clock.png"/>
										<i>2018-06-28</i>
									</div>
								</a>
							</div>
						</div> --%>
						<div class="list-msg">
							<ul>
								<li v-for="info in msg1.rows">
									<a href="javascript:;">									
										<p>{{ info.msgTitle }}</p>
										<i>{{ info.msgCreated | moment }}</i>
									</a>
								</li>	
							</ul>
						</div>
						<!-- 分页页码开始 -->
						<div class="page-foter">
							<span class="page-span">有{{ msg1.totalCounnt }}项结果，共{{ msg1.totalPage }}页</span>
							<ul class="pull-right" id="fy">
							<li v-if="msg1.page != 1 && pages.length>1">
								<a @click="fanye(msg1.prevPage)">&lt;</a>
							</li>
							<li v-if="pages[0]!=1">
								<a @click="fanye(1)">1</a>
							</li>
							<li v-if="pages[0] > 2">
								<a>...</a>
							</li>
							<li v-if="pages.length>1" v-for="pli in pages" >
								<a :id="pli" @click="fanye(pli)">{{ pli }}</a>
							</li>
							<template v-if="msg1.totalPage>9 && msg1.totalPage!=pages[pages.length-1]">
								<li v-if="msg1.totalPage!=pages[pages.length-1]+1">
									<a>...</a>
								</li>
								<li >
									<a @click="fanye(msg1.totalPage)">{{msg1.totalPage}}</a>
								</li>
							</template>
								<li v-if="msg1.page != msg1.totalPage && pages.length>1">
									<a @click="fanye(msg1.nextPage)">&gt;</a>
								</li>
							</ul>
						</div>
					</div>
					<div class="div2">
						<div class="r-Top-name">
							<span>园区动态</span>
						</div>
						<div class="list-msg">
							<ul>
								<li v-for="info in msg2.rows">
									<a href="javascript:;">									
										<p>{{ info.msgTitle }}</p>
										<i>{{ info.msgCreated | moment }}</i>
									</a>
								</li>	
							</ul>
						</div>
						<!-- 分页页码开始 -->
						<div class="page-foter">
							<span class="page-span">有{{ msg2.totalCounnt }}项结果，共{{ msg2.totalPage }}页</span>
							<ul class="pull-right" id="fy2">
								<li v-if="msg2.page != 1 && pages2.length>1">
									<a @click="fanye2(msg2.prevPage)">&lt;</a>
								</li>
								<li v-if="pages2[0]!=1">
									<a @click="fanye2(1)">1</a>
								</li>
								<li v-if="pages2[0] > 2">
									<a>...</a>
								</li>
								<li v-if="pages2.length>1" v-for="pli in pages2" >
									<a :id="'f'+pli" @click="fanye2(pli)">{{ pli }}</a>
								</li>
							<template v-if="msg2.totalPage>9 && msg2.totalPage!=pages2[pages2.length-1]">
								<li v-if="msg2.totalPage!=pages2[pages2.length-1]+1">
									<a>...</a>
								</li>
								<li >
									<a @click="fanye2(msg2.totalPage)">{{msg2.totalPage}}</a>
								</li>
							</template>
								<li v-if="msg2.page != msg2.totalPage && pages2.length>1">
									<a @click="fanye2(msg2.nextPage)">&gt;</a>
								</li>
							</ul>
						</div>
					</div>
					<div class="div3">
						<div class="r-Top-name">
							<span>行业资讯</span>
						</div>
						<div class="list-msg">
							<ul>
								<li v-for="info in msg3.rows">
									<a href="javascript:;">									
										<p>{{ info.msgTitle }}</p>
										<i>{{ info.msgCreated | moment }}</i>
									</a>
								</li>	
							</ul>
						</div>
						<!-- 分页页码开始 -->
						<div class="page-foter">
							<span class="page-span">有{{ msg3.totalCounnt }}项结果，共{{ msg3.totalPage }}页</span>
							<ul class="pull-right" id="fy3">
								<li v-if="msg3.page != 1 && pages3.length>1">
									<a @click="fanye3(msg3.prevPage)">&lt;</a>
								</li>
								<li v-if="pages3[0]!=1">
									<a @click="fanye3(1)">1</a>
								</li>
								<li v-if="pages3[0] > 2">
									<a>...</a>
								</li>
								<li v-if="pages3.length>1" v-for="pli in pages3" >
									<a :id="'f3'+pli" @click="fanye3(pli)">{{ pli }}</a>
								</li>
							<template v-if="msg3.totalPage>9 && msg3.totalPage!=pages3[pages3.length-1]">
								<li v-if="msg3.totalPage!=pages3[pages3.length-1]+1">
									<a>...</a>
								</li>
								<li >
									<a @click="fanye3(msg3.totalPage)">{{msg3.totalPage}}</a>
								</li>
							</template>
								<li v-if="msg3.page != msg3.totalPage && pages3.length>1">
									<a @click="fanye3(msg3.nextPage)">&gt;</a>
								</li>
							</ul>
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
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/moment.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/general.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/operatcookie.js"></script>
		<script type="text/javascript">			
		var info = new Vue({
			el:"#record",
			data:{
				msg1:[],//新闻资讯
				msg2:[],//园区动态
				msg3:[],//行业资讯
				pages:[],//新闻资讯
				pages2:[],//园区动态
				pages3:[],//行业资讯
			},
			 methods: {
				 fanye:function(pli){
			    		//alert(1)
			    		$.ajax({
							//几个参数需要注意一下
							type: "get",//方法类型
					        dataType: "json",//预期服务器返回的数据类型
					        url: "/EntrepreneurialCenter/Message/getMessageInfoByType" ,//url
					        data: {page:pli,"type":1},
					        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
					        success: function (result) {
					        	console.log(result);//打印服务端返回的数据(调试用)
					        	//alert(result);
					        	info.msg1=result;
					        	info.pages = result.digitalPage;
					        	setTimeout(function() {
									$('#fy li a').removeClass('a-active');
									$("#"+result.page).addClass('a-active');
								}, 100)
					        },
					        error : function() {
					        	alert("异常！");
					        }
						}); 
			    	},
			    	fanye2:function(pli){
			    		//alert(2)
			    		$.ajax({
							//几个参数需要注意一下
							type: "get",//方法类型
					        dataType: "json",//预期服务器返回的数据类型
					        url: "/EntrepreneurialCenter/Message/getMessageInfoByType" ,//url
					        data: {page:pli,"type":2},
					        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
					        success: function (result) {
					        	console.log(result);//打印服务端返回的数据(调试用)
					        	//alert(result);
					        	info.msg2=result;
					        	info.pages2 = result.digitalPage;
					        	setTimeout(function() {
									$('#fy2 li a').removeClass('a-active');
									$("#f"+result.page).addClass('a-active');
								}, 100)
					        },
					        error : function() {
					        	alert("异常！");
					        }
						}); 
			    	},
			    	fanye3:function(pli){
			    		//alert(2)
			    		$.ajax({
							//几个参数需要注意一下
							type: "get",//方法类型
					        dataType: "json",//预期服务器返回的数据类型
					        url: "/EntrepreneurialCenter/Message/getMessageInfoByType" ,//url
					        data: {page:pli,"type":3},
					        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
					        success: function (result) {
					        	console.log(result);//打印服务端返回的数据(调试用)
					        	//alert(result);
					        	info.msg3=result;
					        	info.pages3 = result.digitalPage;
					        	setTimeout(function() {
									$('#fy3 li a').removeClass('a-active');
									$("#f3"+result.page).addClass('a-active');
								}, 100)
					        },
					        error : function() {
					        	alert("异常！");
					        }
						}); 
			    	},
			 }
		})
		
		Vue.filter('moment', function (value, formatString) {
			value = value*1000;
		    formatString = formatString || 'YYYY-MM-DD';
		    return moment(value).format(formatString);
		});
		
		var that = this.info;
			$(function(){
				
				/*点击返回顶部*/ 
				// 自定义滚轮事件
				window.onscroll = function(){ //绑定scroll事件
				    var t = document.documentElement.scrollTop || document.body.scrollTop;  //获取滚动距离
				    if( t >= 300 ) {              //判断
						$('.backTop').show(200);
				    } else { 
						$('.backTop').hide(200);
				    } 
				}				
				//返回顶部
				$(".backTop").click(function() {
					$("html,body").animate({scrollTop:0},300);
				});
				
				/*新闻菜单*/
				$('.left-box li a').click(function(){	
					var index = $(this).parent('li').index();
					$('.right-box>div').eq(index).show().siblings().hide();
					$(this).addClass('active2').parent('li').siblings().children('a').removeClass('active2');					
				});
				
				$.ajax({
					//几个参数需要注意一下
					type: "get",//方法类型
			        dataType: "json",//预期服务器返回的数据类型
			        url: "/EntrepreneurialCenter/Message/getMessageInfoByType" ,//url
			        data: {"type":1},
			        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			        success: function (result) {
			        	console.log(result);//打印服务端返回的数据(调试用)
			        	//alert(result);
			        	that.msg1 = result;
			        	that.pages = result.digitalPage;
			        	setTimeout(function() {
							$('#fy li a').removeClass('a-active');
							$("#"+result.page).addClass('a-active');
						}, 100)
			        }
			       	}); 
				
				$.ajax({
					//几个参数需要注意一下
					type: "get",//方法类型
			        dataType: "json",//预期服务器返回的数据类型
			        url: "/EntrepreneurialCenter/Message/getMessageInfoByType" ,//url
			        data: {"type":2},
			        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			        success: function (result) {
			        	console.log(result);//打印服务端返回的数据(调试用)
			        	//alert(result);
			        	that.msg2 = result;
			        	that.pages2 = result.digitalPage;
			        	setTimeout(function() {
							$('#fy2 li a').removeClass('a-active');
							$("#f"+result.page).addClass('a-active');
						}, 100)
			        }
			       	}); 
				
				$.ajax({
					//几个参数需要注意一下
					type: "get",//方法类型
			        dataType: "json",//预期服务器返回的数据类型
			        url: "/EntrepreneurialCenter/Message/getMessageInfoByType" ,//url
			        data: {"type":3},
			        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			        success: function (result) {
			        	console.log(result);//打印服务端返回的数据(调试用)
			        	//alert(result);
			        	that.msg3 = result;
			        	that.pages3 = result.digitalPage;
			        	setTimeout(function() {
							$('#fy3 li a').removeClass('a-active');
							$("#f3"+result.page).addClass('a-active');
						}, 100)
			        }
				}); 
			});
			
		</script>
		
	</body>
</html>
