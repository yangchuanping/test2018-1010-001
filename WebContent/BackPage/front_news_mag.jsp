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
				<!-- 页面内容开始 -->
				<div id="record">
				<div class="right_col" role="main" >
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel">
							<div class="x_title">
								<h2>资讯管理</h2>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<div class="form-group form-inline unmarT">
								 	<lable>标题名称：</lable>
			            			<input type="text" class="form-control" id="textInfo" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			            			<select class="form-control" id="type">
								        <option value="0">--资讯类型--</option>
								       	<option value="1">新闻资讯</option>
								       	<option value="2">园区动态</option>
								       	<option value="3">行业资讯</option>
									</select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<button type="button" class="btn btn-primary" @click="likeInfo()"> 查找 </button>
									<button type="button" class="btn btn-default" @click="reset()">重置 </button>
									<div class="pull-right">
										<button type="button" class="btn active1" @click="getAdd()">新增</button>
										<button type="button" class="btn active1" @click="getUpdate()">编辑</button>
										<button type="button" class="btn active1" @click="del()">删除</button>
									</div>	
								</div>
							</div>
						</div>
					</div>					
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel opad">
							<table id="datatable-checkbox" class="table table-striped table-hover table-bordered bulk_action">
								<thead>
									<tr>
										<th><input type="checkbox" id="all" @click="setAll()"></th>
										<th>文章标题</th>
										<th>文章内容</th>
										<th>资讯类型</th>
										<th>发布时间</th>
										<th>最后编辑时间</th>																
									</tr>
								</thead>
								<tbody>
									<tr v-for="info in infoList.rows"> 
										<td><input type="checkbox" name="product" :value="info.msgId"></td>
										<td><div class="owi owi2">{{ info.msgTitle }}</div></td>
										<td><div class="owi">{{ info.msgContent }}</div></td>
										<td v-if="info.msgType==1">新闻资讯</td>
										<td v-else-if="info.msgType==2">园区动态</td>
										<td v-else-if="info.msgType==3">行业资讯</td>
										<td v-else>其他</td>
										<td>{{ info.msgCreated | moment }}</td>
										<td>{{ info.msgUpdate | moment }}</td>																	
									</tr>
								</tbody>
							</table>	
							<!-- 分页页码开始 -->
								<div class="page-foter">
									<span class="page-span">有{{ infoList.totalCounnt }}项结果，共{{ infoList.totalPage }}页</span>
									<ul class="pull-right" id="fy">
										<li v-if="infoList.page != 1 && pages.length>1">
											<a @click="fanye(infoList.prevPage)">&lt;</a>
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
										<template v-if="infoList.totalPage>9 && infoList.totalPage!=pages[pages.length-1]">
											<li v-if="infoList.totalPage!=pages[pages.length-1]+1">
												<a>...</a>
											</li>
											<li >
												<a @click="fanye(infoList.totalPage)">{{infoList.totalPage}}</a>
											</li>
										</template>
										<li v-if="infoList.page != infoList.totalPage && pages.length>1">
											<a @click="fanye(infoList.nextPage)">&gt;</a>
										</li>
									</ul>
								</div>								
						</div>
					</div>
				</div>
				<!-- 内容结束结束 -->
				<!--弹窗开始-->
				<div id="news_mk" class="all-mark">
					<div class="mark-house-op acc_op" style="height: 600px;width: 900px;">
						<div class="mark-heading">
							<p id="pop_upname"></p>
							<img id="news_quit" class="del-img" title="关闭" src="img/del.png"/>
						</div>
						<div class="dpm_op_content form-inline">
						<form id="formDate" method="post">
							<lable>文章标题：</lable>
							<input hidden name="msgId" id="msgId" :value="msgInfo.msgId" />
							<input class="form-control owidth" type="text" name="msgTitle" id="msgTitle" :value="msgInfo.msgTitle" /><br /><br />
							<lable>资讯类型：</lable>
							<select class="form-control owidth" name="msgType" id="msgType" >
								<option value="0">--请选择--</option>
								<option value="1">新闻资讯</option>
								<option value="2">园区动态</option>
								<option value="3">行业资讯</option>
							</select><br /><br />	
							<lable>文章内容：</lable>
							<textarea class="form-control owidth" name="msgContent" id="msgContent" rows="5" cols="" :value="msgInfo.msgContent"></textarea>
										
						</form>
						</div>
						<div class="d-other">							
							<div class="d-subm">
								<button class="btn btn-primary" @click="submit()">提交保存</button>
							</div>
						</div>	
					</div>
				</div>
				<!--弹窗结束-->
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
		<script type="text/javascript" src="${pageContext.request.contextPath}/BackPage/js/moment.js"></script>
		<script type="text/javascript">
		var info = new Vue({
			el:"#record",
			data:{
					infoList:[],
					pages:[],
					msgInfo:[],
			},
			 methods: {
				 setAll:function(){
					var dom = document.getElementById('all');
					var doms = document.getElementsByName("product");
					for(var i = 0 ; i < doms.length ; i++){
						doms[i].checked = dom.checked;
					}
				},
				fanye:function(pli){
					var type=$("#type").val();
					var text=$("#text").val();
					//alert(indString+text);
					$.ajax({
						//几个参数需要注意一下
						type: "get",//方法类型
				        dataType: "json",//预期服务器返回的数据类型
				        url: "/EntrepreneurialCenter/Message/likeMessageInfo" ,//url
				        data: {page:pli,"type":type,"value":text},
				        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
				        success: function (result) {
				        	console.log(result);//打印服务端返回的数据(调试用)
				        	//alert(result);
				        	that.infoList = result;
				        	that.pages = result.digitalPage;
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
		    	del:function(){
					// 判断是否至少选择一项 
					var checkedNum = $("input[name='product']:checked").length; 
					if(checkedNum == 0) { 
						alert("请选择至少一项！"); 
						return; 
					}else if(confirm("确定要删除所选项目？")) { 
						var checkedList = new Array(); 
						$("input[name='product']:checked").each(function() { 
						checkedList.push($(this).val()); 
						});
						//alert(checkedList.toString());
						$.ajax({
							//几个参数需要注意一下
							type: "POST",//方法类型
							dataType: "json",//预期服务器返回的数据类型
							url: "/EntrepreneurialCenter/Message/delMessage" ,//url
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
					getAdd:function(){
						$('#news_mk').show();
						$("#pop_upname").html("资讯新增");
						 info.msgInfo="";
						 $("#msgType").val(0);
					},
					getUpdate:function(){
						// 判断是否至少选择一项 
						var checkedNum = $("input[name='product']:checked").length; 
						if(checkedNum == 0) { 
							alert("请选择至少一项！"); 
							return; 
						}else if(checkedNum > 1){
							alert("只能选择一项！");
						}else if(checkedNum == 1){
							$('#news_mk').show();
							$("#pop_upname").html("资讯修改");
							$.ajax({
								//几个参数需要注意一下
								type: "POST",//方法类型
								dataType: "json",//预期服务器返回的数据类型
								url: "/EntrepreneurialCenter/Message/getMessageById" ,//url
							    data: {"id":$("input[name='product']:checked").val()},
							    contentType : "application/x-www-form-urlencoded; charset=UTF-8",
							    success: function (result) {
							        //alert(result.data);//打印服务端返回的数据(调试用)
							        info.msgInfo = result;
							        $("#msgType").val(result.msgType);
							    },
							    error : function() {
							        alert("异常！");
							    }
							}); 
						}
					},
					submit:function(){
						if ($.trim($('#msgId').val()).length==0) {
							var msgTitle = $('#msgTitle').val();
							var msgType = $('#msgType').val();
							var msgContent = $('#msgContent').val();
							if ($.trim(msgTitle&&msgContent).length==0) {
								alert("请填写完整表单。");
							}else if (msgType==0) {
								alert("请选择资讯类型。");
							}else if (confirm("确认要新增信息吗？")) {
								$.ajax({
									//几个参数需要注意一下
									type: "POST",//方法类型
									dataType: "json",//预期服务器返回的数据类型
									url: "/EntrepreneurialCenter/Message/addMessage" ,//url
								    data: $('#formDate').serialize(),
								    contentType : "application/x-www-form-urlencoded; charset=UTF-8",
								    success: function (result) {
								        //alert(result.data);//打印服务端返回的数据(调试用)
								        if (result.status == 200) {
								        	alert("新增成功。");
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
							
						}else{
							if (confirm("确认要修改信息吗？")) {
								$.ajax({
									//几个参数需要注意一下
									type: "POST",//方法类型
									dataType: "json",//预期服务器返回的数据类型
									url: "/EntrepreneurialCenter/Message/updateMessage" ,//url
								    data: $('#formDate').serialize(),
								    contentType : "application/x-www-form-urlencoded; charset=UTF-8",
								    success: function (result) {
								        //alert(result.data);//打印服务端返回的数据(调试用)
								        if (result.status == 200) {
								        	alert("修改成功。");
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
						}
					},
					likeInfo:function(){
						var type=$("#type").val();
						var textInfo=$("#textInfo").val();
						//alert(indString+text);
						$.ajax({
							//几个参数需要注意一下
							type: "get",//方法类型
					        dataType: "json",//预期服务器返回的数据类型
					        url: "/EntrepreneurialCenter/Message/likeMessageInfo" ,//url
					        data: {"type":type,"value":textInfo},
					        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
					        success: function (result) {
					        	console.log(result);//打印服务端返回的数据(调试用)
					        	//alert(result);
					        	that.infoList = result;
					        	that.pages = result.digitalPage;
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
					reset:function(){
						$("#type").val(0);
						$("#textInfo").val("");
					}
			 }
		});
		
		Vue.filter('moment', function (value, formatString) {
			if (value==null) {
				return;
			}
			value = value*1000;
		    formatString = formatString || 'YYYY-MM-DD';
		    return moment(value).format(formatString);
		});
		
		var that = this.info;
			$(function(){
				 
				$('.a-div>a').click(function(){
					$(this).addClass('active1').siblings().removeClass('active1');
				})
				$('#news_quit').click(function(){  //资讯详情弹窗关闭
					$('#news_mk').hide();
				})
				
				$.ajax({
					//几个参数需要注意一下
					type: "get",//方法类型
			        dataType: "json",//预期服务器返回的数据类型
			        url: "/EntrepreneurialCenter/Message/getMessageInfo" ,//url
			        //data: ,
			        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			        success: function (result) {
			        	console.log(result);//打印服务端返回的数据(调试用)
			        	//alert(result);
			        	that.infoList = result;
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