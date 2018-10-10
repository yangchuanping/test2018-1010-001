<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>招商信息</title>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/FrontPage/img/index/logo.png"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/swiper.min.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/attract_list.css"/>
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
		    	<li class="active1"><a href="${pageContext.request.contextPath}/FrontPage/attract_list.jsp">招商信息</a></li>
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
			<div class="top-img">
				<img src="${pageContext.request.contextPath}/FrontPage/img/attract_list/banner.png"/>
			</div>
			<div class="d-search">
				<img src="${pageContext.request.contextPath}/FrontPage/img/attract_list/sousuo.png"/>
				<input type="text" name="value" id="value" placeholder="请输入关键字" />
				<span @click="likeSelect()">搜索</span>
			</div>
			<div class="d-list">
				<i>首页>招商信息</i>
				<div class="d-area n-bor">
					<!--<i>区域&nbsp;:</i>-->
					<ul>
						<li class="uli">区域&nbsp;:</li>
						<li class="wid"><a class="cor wid" href="javascript:;" @click="selectByG()">不限</a></li>
						<li v-for="reg in proregions"><a href="javascript:;"  @click="selectByG()">{{ reg.regionTitle }}</a></li>
					</ul>
				</div>
				<div class="d-area n-pad">
					<!--<i>面积&nbsp;:</i>-->
					<ul>
						<li class="uli">面积&nbsp;:</li>
						<li class="wid"><a class="cor wid" href="javascript:;">不限</a></li>
						<li><a id="a1" href="javascript:;">100㎡以下</a></li>
						<li><a id="a2" href="javascript:;">100-200㎡</a></li>
						<li><a id="a3" href="javascript:;">200-300㎡</a></li>
						<li><a id="a4" href="javascript:;">300-400㎡</a></li>
						<li><a id="a5" href="javascript:;">400-500㎡</a></li>
						<li><a id="a6" href="javascript:;">500㎡以上</a></li>
					</ul>
				</div>
			</div>
			<div class="list-content">
				<div class="item" v-for="info in attractList.rows">
					<a href="javascript:;" @click="rept(info.attractId)">
						<h2>{{info.attractName}}</h2>
						<p>{{info.attractContent}}</p>		
					</a>
				</div>
				<div class="item" v-if="attractList.rows==0">
					<p align="center">暂无数据。</p>	
				</div>
				<!-- 分页页码开始 -->
			<div class="page-foter" v-if="attractList.rows!=0">
				<span class="page-span">有{{ attractList.totalCounnt }}项结果，共{{ attractList.totalPage }}页</span>
				<ul class="pull-right" id="fy">
					<li v-if="attractList.page != 1 && pages.length>1">
						<a @click="fanye(attractList.prevPage)">&lt;</a>
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
					<template v-if="attractList.totalPage>9 && attractList.totalPage!=pages[pages.length-1]">
					<li v-if="attractList.totalPage!=pages[pages.length-1]+1">
						<a>...</a>
					</li>
					<li >
						<a @click="fanye(attractList.totalPage)">{{attractList.totalPage}}</a>
					</li>
					</template>
					<li v-if="attractList.page != attractList.totalPage && pages.length>1">
						<a @click="fanye(attractList.nextPage)">&gt;</a>
					</li>
				</ul>
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
				proregions:[],
				attractList:[],
				pages:[],
				garden:"",
				area:"",
			},
			 methods: {
				 fanye:function(pli){
					 	var value = $("#value").val();
			    		//alert(info.garden);
			    		$.ajax({
							//几个参数需要注意一下
							type: "get",//方法类型
					        dataType: "json",//预期服务器返回的数据类型
					        url: "/EntrepreneurialCenter/Attract/likeAttractInfo" ,//url
					        data: {page:pli,value:value,garden:info.garden,area:info.area},
					        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
					        success: function (result) {
					        	console.log(result);//打印服务端返回的数据(调试用)
					        	//alert(result);
					        	info.attractList=result;
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
			    	likeSelect:function(){
			    		var value = $("#value").val();
			    		//alert(info.garden);
			    		$.ajax({
							//几个参数需要注意一下
							type: "get",//方法类型
					        dataType: "json",//预期服务器返回的数据类型
					        url: "/EntrepreneurialCenter/Attract/likeAttractInfo" ,//url
					        data: {value:value,garden:info.garden},
					        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
					        success: function (result) {
					        	console.log(result);//打印服务端返回的数据(调试用)
					        	//alert(result);
					        	info.attractList=result;
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
			    	rept:function(value){
			    		cookie.set("attractId",encodeURI(value),1);
			    		location.href="${pageContext.request.contextPath}/FrontPage/house_details.jsp";
			    	}
			 }
		});
		
		var that = this.info;
			$(function(){
				
				$("#a1").attr("value","0-100");
				$("#a2").attr("value","100-200");
				$("#a3").attr("value","200-300");
				$("#a4").attr("value","300-400");
				$("#a5").attr("value","400-500");
				$("#a6").attr("value","500");
				
				//单击列表添加颜色
				//$('.d-area').children().find('a').click(function(){
					//$(this).addClass('cor').parent('li').siblings().children('a').removeClass('cor');
			    //});	
				
				$('.n-bor ul').on('click','a',function(){
					$(this).addClass('cor').parent('li').siblings().children('a').removeClass('cor');
					//alert($(this).text());
					if ($(this).text()=="不限") {
						that.garden = "";
					}else{
						that.garden = $(this).text();
					}
					$.ajax({
						//几个参数需要注意一下
						type: "get",//方法类型
				        dataType: "json",//预期服务器返回的数据类型
				        url: "/EntrepreneurialCenter/Attract/likeAttractInfo" ,//url
				        data: {garden:info.garden,area:info.area},
				        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
				        success: function (result) {
				        	console.log(result);//打印服务端返回的数据(调试用)
				        	//alert(result);
				        	info.attractList=result;
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
				})
				$('.n-pad ul').on('click','a',function(){
					$(this).addClass('cor').parent('li').siblings().children('a').removeClass('cor');
					//alert($(this).attr("value"));
					if ($(this).text()=="不限") {
						that.area = "";
					}else{
						that.area = $(this).attr("value");
					}
					//alert(info.area);
					$.ajax({
						//几个参数需要注意一下
						type: "get",//方法类型
				        dataType: "json",//预期服务器返回的数据类型
				        url: "/EntrepreneurialCenter/Attract/likeAttractInfo" ,//url
				        data: {area:info.area,garden:info.garden},
				        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
				        success: function (result) {
				        	console.log(result);//打印服务端返回的数据(调试用)
				        	//alert(result);
				        	info.attractList=result;
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
				})
					
				$.ajax({
					//几个参数需要注意一下
					type: "get",//方法类型
				    dataType: "json",//预期服务器返回的数据类型
				    url: "/EntrepreneurialCenter/ProRegions/getAllProRegionsInfo" ,//url
				    //data: ,
				    contentType : "application/x-www-form-urlencoded; charset=UTF-8",
				    success: function (result) {
					    console.log(result);//打印服务端返回的数据(调试用)
					    //alert(result);
					    that.proregions = result;
				    }
				}); 
				
				$.ajax({
					//几个参数需要注意一下
					type: "get",//方法类型
				    dataType: "json",//预期服务器返回的数据类型
				    url: "/EntrepreneurialCenter/Attract/likeAttractInfo" ,//url
				    //data: ,
				    contentType : "application/x-www-form-urlencoded; charset=UTF-8",
				    success: function (result) {
					    console.log(result);//打印服务端返回的数据(调试用)
					    //alert(result);
					    that.attractList = result;
			        	that.pages = result.digitalPage;
			        	setTimeout(function() {
							$('#fy li a').removeClass('a-active');
							$("#"+result.page).addClass('a-active');
						}, 100)
				    }
				}); 
				
			})	
		</script>
	</body>
</html>
