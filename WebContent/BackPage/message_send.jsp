<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>广西桂林创业科技园</title>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/BackPage/img/logo2.png" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/BackPage/css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/BackPage/css/font-awesome.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/BackPage/css/custom.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/BackPage/css/item/company_information.css" />
	</head>
	<body class="nav-md">
		<div class="container body">
			<div class="main_container">
				<div class="col-md-3 left_col">
					<div class="left_col scroll-view">
						<div class="navbar nav_title" style="border: 0;">
							<a href="${pageContext.request.contextPath}/BackPage/index.jsp" class="site_title"><img class="img" src="${pageContext.request.contextPath}/BackPage/img/logo1.png"/><span>科技园后台系统</span></a>
						</div>

						<div class="clearfix"></div>

						<!-- 侧边菜单顶部信息-->
						<div class="profile" style="margin-bottom: 70px;">
							<div class="profile_pic">
								<img src="${pageContext.request.contextPath}/BackPage/img/img.jpg" alt="..." class="img-circle profile_img">
							</div>
							<div class="profile_info">
								<span>欢迎!</span>
								<h2 id="log_h2">用户管理员</h2>
							</div>
						</div>
						<!-- 侧边菜单顶部信息结束-->

						<br />

						<!--侧边栏菜单开始 -->
						<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
							<div class="menu_section">
								<!--<h3>菜单</h3>-->
								<ul class="nav side-menu">
									<li>
										<a><i class="fa fa-home"></i> 首页 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/index.jsp">系统首页</a>
											</li>
										</ul>
									</li>
									<li>
										<a><i class="fa fa-edit"></i> 企业管理 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/company_information.jsp">企业信息</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/company_house_information.jsp">企业租房信息</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/company_apply_expand.jsp">企业扩展申请处理</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/company_quit_apply.jsp">退园申请处理</a>
											</li>
											<li>
												<a href="javascript:;">企业报送</a>
											</li>
										</ul>
									</li>
									<li>
										<a><i class="fa fa-institution"></i> 物业管理 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/house_msg_edit.jsp">房屋信息编辑</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/house_details.jsp">房屋出租情况</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/house_service.jsp">房屋维修申请</a>
											</li>
										</ul>
									</li>
									<li>
										<a><i class="fa fa-handshake-o"></i>  招商引资 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/garden_in_apply_mag.jsp">入园申请处理</a>
											</li>
										</ul>
									</li>
									<li>
										<a><i class="fa fa-folder-open-o"></i> 文件收发 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/file_send-receive.jsp">文件收发</a>
											</li>
										</ul>
									</li>
									<li>
										<a><i class="fa fa-envelope-open-o"></i> 短信发送 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/message_send.jsp">短信收发</a>
											</li>
										</ul>
									</li>
									<li>
										<a><i class="fa fa-bolt"></i> 水电管理 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/wp_water_mag.jsp">水费管理</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/wp_power_mag.jsp">电费管理</a>
											</li>
										</ul>
									</li>
									<li>
										<a><i class="fa fa-file-code-o"></i> 前台信息功能编辑 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/front_swiper_mag.jsp">轮播图设置</a>
											</li>
											<li>
												<a href="javascript:;">园区概况</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/front_news_mag.jsp">园区资讯</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/front_InCompany_mag.jsp">入驻企业</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/front_LeaveWords_mag.jsp">留言管理</a>
											</li>
											<!-- <li>
												<a href="javascript:;">联系我们</a>
											</li> -->
										</ul>
									</li>
									<li>
										<a><i class="fa fa-cog"></i> 系统设置 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/system_account_options.jsp">账户管理</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/system_department_options.jsp">部门管理</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/system_house_options.jsp">园区楼宇设置</a>
											</li>
											<li>
												<a href="${pageContext.request.contextPath}/BackPage/system_flow_options.jsp">审批流程设置</a>
											</li>
										</ul>
									</li>
									<li>
										<a><i class="fa fa-bar-chart"></i> 数据统计 <span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<li>
												<a href="javascript:;">数据统计</a>
											</li>
											<li>
												<a href="javascript:;">日志查询</a>
											</li>
										</ul>
									</li>
								</ul>
							</div>
						</div>
						<!-- 侧边菜单结束 -->
					</div>
				</div>

				<!--顶部导航开始 -->
				<div class="top_nav">
					<div class="nav_menu">
						<nav>
							<div class="nav toggle">
								<a id="menu_toggle"><i class="fa fa-bars"></i></a>
							</div>

							<ul class="nav navbar-nav navbar-right">
								<li class="">
									<a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
										<img src="${pageContext.request.contextPath}/BackPage/img/img.jpg" alt=""><span id="log_span"></span>
										<span class=" fa fa-angle-down"></span>
									</a>
									<ul class="dropdown-menu dropdown-usermenu pull-right">
										<!-- <li>
											<a href="javascript:;">简介</a>
										</li>
										<li>
											<a href="javascript:;">
												<span class="badge bg-red pull-right">50%</span>
												<span>设置</span>
											</a>
										</li>
										<li>
											<a href="javascript:;">帮助</a>
										</li> -->
										<li>
											<a href="#" onclick="Logout()"><i class="fa fa-sign-out pull-right"></i>退出</a>
										</li>
									</ul>
								</li>

								<%-- <li role="presentation" class="dropdown">
									<a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
										<i class="fa fa-envelope-o"></i>
										<span class="badge bg-green">6</span>
									</a>
									<ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
										<li>
											<a>
												<span class="image"><img src="${pageContext.request.contextPath}/BackPage/img/img.jpg" alt="Profile Image" /></span>
												<span>
                          <span>John Smith</span>
												<span class="time">3 mins ago</span>
												</span>
												<span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
											</a>
										</li>
										<li>
											<div class="text-center">
												<a>
													<strong>查看全部</strong>
													<i class="fa fa-angle-right"></i>
												</a>
											</div>
										</li>
									</ul>
								</li> --%>
							</ul>
						</nav>
					</div>
				</div>
				<!-- 顶部导航结束 -->
				<div id="record">
				<!-- 页面内容开始 -->
				<div class="right_col" role="main">
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel">
							<div class="x_title">
								<h2>短信发送</h2>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<div class="form-group form-inline unmarT">	
									<div class="a-div">
										<a href="#msg1" class="active1" data-toggle="tab">内部联系人</a>
										<a href="#msg2" data-toggle="tab">企业联系人</a>
										<a href="#msg3" data-toggle="tab">企业法人</a>
									</div>
									
									<div class="pull-right">
										<button type="button" class="btn active1">发送短信</button>
									</div>	
								</div>
							</div>
						</div>
					</div>					
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel opad">
							<div class="tab-content">
								<div class="tab-pane fade in active" id="msg1">
									<table id="datatable-checkbox" class="table table-striped table-hover table-bordered bulk_action">
										<thead>
											<tr>
												<th><input type="checkbox" id="all1" @click="setAll(1)"></th>
												<th>姓名</th>
												<th>办公电话</th>
												<th>移动电话</th>
											</tr>
										</thead>
										<tbody>
											<tr v-for="info in userInfos.rows">
												<td><input type="checkbox" name="product1" :value="info.userId"></td>
												<td>{{ info.userDisplayname }}[{{ info.depTitle }}]</td>
												<td>{{ info.userTelephone }}</td>
												<td>{{ info.userCellphone }}</td>
											</tr>
										</tbody>	
									</table>
									<!-- 分页页码开始 -->
								<div class="page-foter">
									<span class="page-span">有{{ userInfos.totalCounnt }}项结果，共{{ userInfos.totalPage }}页</span>
									<ul class="pull-right" id="fy">
										<li v-if="userInfos.page != 1 && userPages.length>1">
											<a @click="userFanye(userInfos.prevPage)">&lt;</a>
										</li>
										<li v-if="userPages[0]!=1">
											<a @click="userFanye(1)">1</a>
										</li>
										<li v-if="userPages[0] > 2">
											<a>...</a>
										</li>
										<li v-if="userPages.length>1" v-for="pli in userPages" >
											<a :id="pli" @click="userFanye(pli)">{{ pli }}</a>
										</li>
										<template v-if="userInfos.totalPage>9 && userInfos.totalPage!=userPages[userPages.length-1]">
											<li v-if="userInfos.totalPage!=userPages[userPages.length-1]+1">
												<a>...</a>
											</li>
											<li >
												<a @click="userFanye(userInfos.totalPage)">{{userInfos.totalPage}}</a>
											</li>
										</template>
										<li v-if="userInfos.page != userInfos.totalPage && userPages.length>1">
											<a @click="userFanye(userInfos.nextPage)">&gt;</a>
										</li>
									</ul>
								</div>		
								</div>
							    <div class="tab-pane fade" id="msg2">
							    <div class="form-inline" style="margin-bottom: 15px;">
									<select class="form-control">
								        <option>--所有园区--</option>
								        <option v-for="reg in proregions" :value="reg.regionId">{{ reg.regionTitle }}</option>
								 </select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		            			    <select class="form-control">
								        <option>公司名称：</option>
								        <option>详细地址：</option>
								    </select>&nbsp;&nbsp;&nbsp;
			            			<input type="text" class="form-control" placeholder="关键字" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<button type="button" class="btn btn-primary"> 搜索 </button>
								</div>
							    	<table id="datatable-checkbox" class="table table-striped table-hover table-bordered bulk_action">
										<thead>
											<tr>
												<th><input type="checkbox" id="all2" @click="setAll(2)"></th>
												<th>企业名称</th>
												<th>详细地址</th>
												<th>企业联系人</th>
												<th>电话号码</th>
											</tr>
										</thead>
										<tbody>
											<tr v-for="i in infoList">
												<td><input type="checkbox" name="product2" :value="i.comId"></td>
												<td>{{ i.comName }}</td>
												<td>{{ eval(i.comDetail)[17] }}</td>
												<td>{{ eval(i.comDetail)[10] }}</td>
												<td>{{ eval(i.comDetail)[12] }}</td>
											</tr>
										</tbody>
									</table>
							    </div>
							    <div class="tab-pane fade" id="msg3">
							    <div class="form-inline" style="margin-bottom: 15px;">
									<select class="form-control">
								        <option>--所有园区--</option>
								        <option v-for="reg in proregions" :value="reg.regionId">{{ reg.regionTitle }}</option>
								 </select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		            			    <select class="form-control">
								        <option>公司名称：</option>
								        <option>详细地址：</option>
								    </select>&nbsp;&nbsp;&nbsp;
			            			<input type="text" class="form-control" placeholder="关键字" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<button type="button" class="btn btn-primary"> 搜索 </button>
								</div>
							    	<table id="datatable-checkbox" class="table table-striped table-hover table-bordered bulk_action">
										<thead>
											<tr>
												<th><input type="checkbox" id="all3" @click="setAll(3)"></th>
												<th>企业名称</th>
												<th>详细地址</th>
												<th>企业法人</th>
												<th>电话号码</th>
											</tr>
										</thead>
										<tbody>
											<tr v-for="info in infoList">
												<td><input type="checkbox" name="product3" :value="info.comId"></td>
												<td>{{ info.comName }}</td>
												<td>{{ eval(info.comDetail)[17] }}</td>
												<td>{{ eval(info.comDetail)[7] }}</td>
												<td>{{ eval(info.comDetail)[8] }}</td>
											</tr>																										
									</table>
							    </div>
							</div>							
						</div>
					</div>
				</div>
				<!-- 内容结束结束 -->
				</div>
				<!-- 页脚内容开始-->
				<footer>
					<div class="pull-right">
						中国桂林留学人员创业园，桂林科技企业发展中心
						<!--  <a href="https://colorlib.com">官网链接</a>-->
					</div>
					<div class="clearfix"></div>
				</footer>
				<!-- 页脚内容结束 -->

			</div>
		</div>
		<script src="${pageContext.request.contextPath}/BackPage/js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/BackPage/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/BackPage/js/custom.min.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/BackPage/js/operatcookie.js"></script>
		<script src="${pageContext.request.contextPath}/BackPage/js/item/general.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/BackPage/js/vue.js"></script>
		<script type="text/javascript">
		var info = new Vue({
			el:"#record",
			data:{
				userInfos:[],
				userPages:[],
				proregions:[],
				infoList:[],
			},
			 methods: {
				 setAll:function(value){
					var dom = document.getElementById('all'+value);
					var doms = document.getElementsByName("product"+value);
					for(var i = 0 ; i < doms.length ; i++){
						doms[i].checked = dom.checked;
					}
				},
		    	eval:function(value){
		    		if (value=="undefined") {
						return;
					}
		    		return eval('('+value+')');	
		    	},
				userFanye:function(pli){
		    		//alert(1)
		    		$.ajax({
						//几个参数需要注意一下
						type: "get",//方法类型
				        dataType: "json",//预期服务器返回的数据类型
				        url: "/EntrepreneurialCenter/User/getUserInfo" ,//url
				        data: {page:pli,rows:20},
				        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
				        success: function (result) {
				        	console.log(result);//打印服务端返回的数据(调试用)
				        	//alert(result);
				        	info.userInfos=result;
				        	info.userPages = result.digitalPage;
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
				qyfanye:function(pli){
		    		//alert(1)
		    		$.ajax({
						//几个参数需要注意一下
						type: "get",//方法类型
				        dataType: "json",//预期服务器返回的数据类型
				        url: "/EntrepreneurialCenter/Companies/getCompaniesInfo" ,//url
				        data: {page:pli},
				        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
				        success: function (result) {
				        	console.log(result);//打印服务端返回的数据(调试用)
				        	//alert(result);
				        	info.infoList=result;
				        	info.pages = result.digitalPage;
				        	setTimeout(function() {
								$('#qy li a').removeClass('a-active');
								$("#"+result.page).addClass('a-active');
							}, 100)
				        },
				        error : function() {
				        	alert("异常！");
				        }
					}); 
		    	},
			 }
		})
		
		var that = this.info;
			$(function(){
				$('.a-div>a').click(function(){
					$(this).addClass('active1').siblings().removeClass('active1');
				})
				
				$.ajax({
					//几个参数需要注意一下
					type: "get",//方法类型
			        dataType: "json",//预期服务器返回的数据类型
			        url: "/EntrepreneurialCenter/User/getUserInfo" ,//url
			        data: {rows:20},
			        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			        success: function (result) {
			        	console.log(result);//打印服务端返回的数据(调试用)
			        	//alert(result);
			        	that.userInfos = result;
			        	that.userPages = result.digitalPage;
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
			        url: "/EntrepreneurialCenter/Companies/getAllCompaniesInfo" ,//url
			        //data: ,
			        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			        success: function (result) {
			        	console.log(result);//打印服务端返回的数据(调试用)
			        	//alert(result);
			        	that.infoList = result;
			        }
			       	}); 
			})
		</script>
	</body>

</html>