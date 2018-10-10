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
								<h2>文件收发</h2>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<div class="form-group form-inline unmarT">	
									<div class="a-div">
										<a href="#file1" class="active1" data-toggle="tab"><i class="fa fa-envelope-o">&nbsp;</i>收件箱</a>
										<a href="#file2" data-toggle="tab"><i class="fa fa-envelope-open-o">&nbsp;</i>已发送</a>
										<a href="#file3" data-toggle="tab"><i class="fa fa-edit">&nbsp;</i>发公文</a>
									</div>									
								</div>
							</div>
						</div>
					</div>					
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel opad">
							<div class="tab-content">
								<div class="tab-pane fade in active" id="file1">
									<div class="pull-left">
										<h4>收件箱：</h4>
										<p>您当前页还有&nbsp;<span v-if="reUnread!=0"><i class="ai">{{ reUnread }}</i></span><span style="font-weight: bold;" v-else>{{ reUnread }}</span>&nbsp;份邮件未读</p>
									</div>
									<div class="pull-right">
										<button type="button" class="btn del_btn" @click="del(1)">删除</button>
									</div>
									<table id="datatable-checkbox" class="table table-striped table-hover table-bordered bulk_action">
										<thead>
											<tr>
												<th><input type="checkbox" id="all1" @click="setAll(1)"></th>
												<th>发件人</th>
												<th>标题</th>
												<th>发布时间</th>
												<th>状态</th>
											</tr>
										</thead>
										<tbody>
											<tr v-for="re in receives.rows">
												<td><input type="checkbox" name="product1" :value="re.receiveId"></td>
												<td>{{re.userDisplayname}}[{{re.depTitle}}]</td>
												<td>{{re.artTitle}}</td>
												<td>{{formatDate(re.created)}}</td>
												<td>
													<span v-if="re.status==1">未读</span>
													<span v-else-if="re.status==2">已读</span>
													<span v-else>已读</span>
												</td>
											</tr>
										</tbody>
									</table>
									<!-- 分页页码开始 -->
								<div class="page-foter">
									<span class="page-span">有{{ receives.totalCounnt }}项结果，共{{ receives.totalPage }}页</span>
									<ul class="pull-right" id="refy">
										<li v-if="receives.page != 1 && rePages.length>1">
											<a @click="receiveFanye(receives.prevPage)">&lt;</a>
										</li>
										<li v-if="rePages[0]!=1">
											<a @click="receiveFanye(1)">1</a>
										</li>
										<li v-if="rePages[0] > 2">
											<a>...</a>
										</li>
										<li v-if="rePages.length>1" v-for="pli in rePages" >
											<a :id="pli" @click="receiveFanye(pli)">{{ pli }}</a>
										</li>
										<template v-if="receives.totalPage>9 && receives.totalPage!=rePages[rePages.length-1]">
											<li v-if="receives.totalPage!=rePages[rePages.length-1]+1">
												<a>...</a>
											</li>
											<li >
												<a @click="receiveFanye(receives.totalPage)">{{receives.totalPage}}</a>
											</li>
										</template>
										<li v-if="receives.page != receives.totalPage && rePages.length>1">
											<a @click="receiveFanye(receives.nextPage)">&gt;</a>
										</li>
									</ul>
								</div>	
								</div>
							    <div class="tab-pane fade" id="file2">
							   		<div class="pull-left">
								    	<h4>已发送：</h4>
								    	<p>您当前页有&nbsp;<span v-if="seUnread!=0"><i class="ai">{{ seUnread }}</i></span><span style="font-weight: bold;" v-else>{{ seUnread }}</span>&nbsp;发送失败</p>
								    </div>
								    <div class="pull-right">
										<button type="button" class="btn del_btn" @click="del(2)">删除</button>
									</div>
									<table id="datatable-checkbox" class="table table-striped table-hover table-bordered bulk_action">
										<thead>
											<tr>
												<th><input type="checkbox" id="all2" @click="setAll(2)"></th>
												<th>发件人</th>
												<th>标题</th>
												<th>发布时间</th>
												<th>状态</th>
											</tr>
										</thead>
										<tbody>
											<tr v-for="se in sends.rows">
												<td><input type="checkbox" name="product2" :value="se.artId"></td>
												<td>
													<span v-for="name in split(se.userDisplayname)" >{{name}}<br></span>
												</td>
												<td>{{se.artTitle}}</td>
												<td>{{formatDate(se.created)}}</td>
												<td>
													<span v-if="se.status==1">已发送</span>
													<span v-else>失败</span>
												</td>
											</tr>
										</tbody>	
									</table>
									<!-- 分页页码开始 -->
								<div class="page-foter">
									<span class="page-span">有{{ sends.totalCounnt }}项结果，共{{ sends.totalPage }}页</span>
									<ul class="pull-right" id="sefy">
										<li v-if="sends.page != 1 && rePages.length>1">
											<a @click="sendFanye(sends.prevPage)">&lt;</a>
										</li>
										<li v-if="rePages[0]!=1">
											<a @click="sendFanye(1)">1</a>
										</li>
										<li v-if="rePages[0] > 2">
											<a>...</a>
										</li>
										<li v-if="rePages.length>1" v-for="pli in rePages" >
											<a :id="'se'+pli" @click="sendFanye(pli)">{{ pli }}</a>
										</li>
										<template v-if="sends.totalPage>9 && sends.totalPage!=rePages[rePages.length-1]">
											<li v-if="sends.totalPage!=rePages[rePages.length-1]+1">
												<a>...</a>
											</li>
											<li >
												<a @click="sendFanye(sends.totalPage)">{{sends.totalPage}}</a>
											</li>
										</template>
										<li v-if="sends.page != sends.totalPage && rePages.length>1">
											<a @click="sendFanye(sends.nextPage)">&gt;</a>
										</li>
									</ul>
								</div>	
							    </div>
							    <div class="tab-pane fade" id="file3">
							    	<div class="send_all">
							    		<div class="send_left">
							    			<div class="form-inline">
							    				<lable class="send_lable">标题：</lable>
							    				<input class="form-control send_input" type="text" />
							    			</div>
							    			<div class="form-inline">
							    				<lable class="send_lable">正文：</lable>
							    				<textarea class="form-control send_text"></textarea>
							    			</div>
							    			<div class="form-inline">
							    				<lable class="send_lable">附件：</lable>
							    				<input type="file" style="display: inline-block;" />
							    			</div>
							    			<div class="d-other">							
												<div class="d-subm">
													<button class="btn btn-primary">发送公文</button>
												</div>
											</div>	
							    		</div>
							    		<div id="send_right" class="send_right">
							    			<div class="panel panel-default">
											    <div class="panel-heading">
											        <h3 class="panel-title">收件人 [ <span id="send_all_user" class="send_all_user">选择全部</span> ]</h3>
											    </div>
											    <div class="panel-body">
											        <ul>
											        	<li class="send_li" v-for="u in userInfos" v-if="u.userId!=userId">
											        		<input type="checkbox" :value="u.userId" />
											        		<span>{{u.userDisplayname}}[ <i>{{u.depTitle}}</i> ]</span>
											        	</li>
											        </ul>
											    </div>
											</div>
							    		</div>
							    	</div>
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
				receives:[],
				rePages:[],
				reUnread:{},
				sends:[],
				sePages:[],
				seUnread:{},
				userInfos:[],
				userId:{},
				
				sendNames:[],
				arr:{},
			},
			 methods:{
				 setAll:function(value){
					var dom = document.getElementById('all'+value);
					var doms = document.getElementsByName("product"+value);
					for(var i = 0 ; i < doms.length ; i++){
						doms[i].checked = dom.checked;
					}
				},
		    	formatDate:function(value){
		    		value=value*1000
		    		var t = new Date(value);
		    		var format = "yyyy-MM-dd HH:mm";
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
		    	receiveFanye:function(pli){
		    		var userId = decodeURI(cookie.get("userId"));
		    		//alert(1)
		    		$.ajax({
						//几个参数需要注意一下
						type: "get",//方法类型
				        dataType: "json",//预期服务器返回的数据类型
				        url: "/EntrepreneurialCenter/Articles/getReceiveInfoById" ,//url
				        data: {page:pli,id:userId},
				        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
				        success: function (result) {
				        	console.log(result);//打印服务端返回的数据(调试用)
				        	//alert(result);
				        	that_.receives = result;
				        	that_.rePages = result.digitalPage;
				        	that_.reUnread = 0;
				        	for (var i = 0; i < result.rows.length; i++) {
								if (result.rows[i].status==1) {
									that_.reUnread=that_.reUnread+1;
								}
							}
				        	setTimeout(function() {
								$('#refy li a').removeClass('a-active');
								$("#"+result.page).addClass('a-active');
							}, 100)
				        },
				        error : function() {
				        	alert("异常！");
				        }
					}); 
		    	},
		    	sendFanye:function(pli){
		    		var userId = decodeURI(cookie.get("userId"));
		    		//alert(1)
		    		$.ajax({
						//几个参数需要注意一下
						type: "get",//方法类型
				        dataType: "json",//预期服务器返回的数据类型
				        url: "/EntrepreneurialCenter/Articles/getSendInfoById" ,//url
				        data: {page:pli,id:userId},
				        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
				        success: function (result) {
				        	console.log(result);//打印服务端返回的数据(调试用)
				        	//alert(result);
				        	that_.sends = result;
				        	that_.sePages = result.digitalPage;
				        	that_.seUnread = 0;
				        	for (var i = 0; i < result.rows.length; i++) {
								if (result.rows[i].status==2) {
									that_.seUnread=that_.seUnread+1;
								}
							}
				        	setTimeout(function() {
								$('#sefy li a').removeClass('a-active');
								$("#se"+result.page).addClass('a-active');
							}, 100) 
				        },
				        error : function() {
				        	alert("异常！");
				        }
					}); 
		    	},
		    	split:function(value){
		    		var list = value.split(",");
		    		return list;
		    		// console.log(arr);
		    	},
		    	del:function(value){
		    		//alert(value);
		    		var checkedNum = $("input[name='product"+value+"']:checked").length; 
					if(checkedNum == 0) { 
						alert("请选择至少一项！"); 
						return; 
					}else if(confirm("确定要删除所选项目？")) { 
						var checkedList = new Array(); 
						$("input[name='product"+value+"']:checked").each(function() { 
						checkedList.push($(this).val()); 
						});
						//alert(checkedList.toString());
						var u;
						if (value==1) {
							u = "/EntrepreneurialCenter/ArtReceive/delArtReceive";
						}else if (value==2) {
							u = "/EntrepreneurialCenter/Articles/delArticles";
						}else{
							alert("删除失败。");
							return;
						}
						$.ajax({
							//几个参数需要注意一下
							type: "POST",//方法类型
							dataType: "json",//预期服务器返回的数据类型
							url: u ,//url
							data: {"id":checkedList.toString()},
							contentType : "application/x-www-form-urlencoded; charset=UTF-8",
							success: function (result) {
								//alert(result.data);//打印服务端返回的数据(调试用)
							    if (result.status == 200) {
							        alert("删除成功。");
							        location.reload();
							    }else{
							       	alert(result.msg);
							    };
							},
							error : function() {
							    alert("异常！");
							}
						}); 
					}
		    	},
			 }
			
		})
		
		var that_ = this.info;
			$(function(){
				$('.a-div>a').click(function(){
					$(this).addClass('active1').siblings().removeClass('active1');
				})
				
				//点击全选联系人
				var that = true;
				$('#send_all_user').click(function(){						
					if (that) {
						$('#send_right input[type=checkbox]').prop('checked',true);
						that = false;
					} else{
						$('#send_right input[type=checkbox]').prop('checked',false);
						that = true;
					}
					
				})
				
				var userId = decodeURI(cookie.get("userId"));
				that_.userId = userId;
				//alert(userId);
				$.ajax({
					//几个参数需要注意一下
					type: "get",//方法类型
			        dataType: "json",//预期服务器返回的数据类型
			        url: "/EntrepreneurialCenter/Articles/getReceiveInfoById" ,//url
			        data: {id:userId},
			        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			        success: function (result) {
			        	console.log(result);//打印服务端返回的数据(调试用)
			        	//alert(result);
			        	that_.receives = result;
			        	that_.rePages = result.digitalPage;
			        	that_.reUnread = 0;
			        	for (var i = 0; i < result.rows.length; i++) {
							if (result.rows[i].status==1) {
								that_.reUnread=that_.reUnread+1;
							}
						}
			        	setTimeout(function() {
							$('#refy li a').removeClass('a-active');
							$("#"+result.page).addClass('a-active');
						}, 100) 
			        }
			       	});
				
				$.ajax({
					//几个参数需要注意一下
					type: "get",//方法类型
			        dataType: "json",//预期服务器返回的数据类型
			        url: "/EntrepreneurialCenter/User/getAllUserGpDepInfo" ,//url
			        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			        success: function (result) {
			        	console.log(result);//打印服务端返回的数据(调试用)
			        	//alert(result);
			        	that_.userInfos = result;
			        }
			       	});
				
				$.ajax({
					//几个参数需要注意一下
					type: "get",//方法类型
			        dataType: "json",//预期服务器返回的数据类型
			        url: "/EntrepreneurialCenter/Articles/getSendInfoById" ,//url
			        data: {id:userId},
			        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			        success: function (result) {
			        	console.log(result);//打印服务端返回的数据(调试用)
			        	//alert(result);
			        	that_.sends = result;
			        	that_.sePages = result.digitalPage;
			        	
			        	//var t = arr(result.rows.depTitle);
			        	//var n = arr(result.rows.userDisplayname);
 			        	
			        	
			        	that_.seUnread = 0;
			        	for (var i = 0; i < result.rows.length; i++) {
							if (result.rows[i].status==2) {
								that_.seUnread=that_.seUnread+1;
							}
						}
			        	/* for (var i = 0; i < result.rows.length; i++) {
								var t=result.rows[i].depTitle;
								var n = result.rows[i].userDisplayname;
								var t1 = t.split(",");
								var n1 = n.split(",");
								arr(t1,n1);
						} */
			        	
			        	
			        	setTimeout(function() {
							$('#sefy li a').removeClass('a-active');
							$("#se"+result.page).addClass('a-active');
						}, 100) 
			        }
			       	});
				
				
			})
			
			/* function arr(t,n){
					var a =new Array();
					 a.push({
						 t,n
					 });
					 that_.arr = a;
					//console.log(,JSON.stringify(n));
					console.log(a);
					
				} */
			
			
		</script>
	</body>

</html>