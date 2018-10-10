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
							<a href="${pageContext.request.contextPath}/BackPage/index.jsp" class="site_title"><img class="img" src="${pageContext.request.contextPath}/BackPage/img/logo1.png" /><span>科技园后台系统</span></a>
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
				<div class="right_col" role="main">
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel">
							<div class="x_title">
								<h2>退园申请处理</h2>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<div class="form-group form-inline unmarT">									
									<label class="spanmar">搜索内容:
			            			    <input type="text" class="form-control" id="quitCompany" placeholder="公司名称" />
			            			</label>
									<label class="spanmar">申请时间:
			            			    <input type="date" class="form-control" id="startTime" />
			            			</label>
									<label class="spanmar">-&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			            			    <input type="date" class="form-control" id="endTime" />
			            			</label>
									<label class="spanmar">审核状态:
			            			    <select class="form-control" id="quitCheck">
									        <option value="-1" selected="selected">不限</option>
									        <option value="0">审核中</option>
									        <option value="1">通过审核</option>
									        <option value="2">审核未通过</option>
									    </select>
			            		</label>
									<button type="button" class="btn btn-primary" @click="likeSelect()"> 搜索 </button>
									<button type="button" class="btn btn-default" @click="reset()">重置 </button>
								</div>
							</div>
						</div>
					</div>
					<div class="list_menu">
						<ul>
							<a href="javascript:;"><li>导出所选项</li></a>
							<li>|</li>
							<a href="javascript:;"><li>导出全部</li></a>
							<li>|</li>
							<a href="javascript:;" @click="del()"><li>删除</li></a>
						</ul>
					</div>
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel opad">
							<table id="datatable-checkbox" class="table table-striped table-hover table-bordered bulk_action">
									<thead>
										<tr>
											<th><input type="checkbox" id="all" @click="setAll()"></th>
											<th>公司名称</th>
											<th>申请填写时间</th>
											<th>发起人</th>
											<th>审核状态</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<tr v-for="info in infoList.rows">
											<td><input type="checkbox" name="product" :value="info.quitId"></td>
											<td>{{ info.quitCompany }}</td>
											<td>{{ formatDate(info.quitCreate) }}</td>
											<td>{{ info.quitName }}</td>
											<td>
												<span v-if="info.quitCheck==0">审核中</span>
												<span v-if="info.quitCheck==1">审核通过</span>
												<span v-if="info.quitCheck==2">审核未通过</span>
											</td>
											<td>
												<button type="button" class="btn btn-info btn-xs" @click="getUpdate(info.quitId)">编辑</button>
											</td>
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
											<li>
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
				<!--弹窗-->
				<div id="CP_quit_add" class="all-mark">
					<div class="mark-house-op acc_op" style="height: 530px">
						<div class="mark-heading">
							<p id="pop_upname"></p>
							<img id="Cqa_quit" class="del-img" title="关闭" src="img/del.png"/>
						</div>
						<div  style="height:480px; overflow-y: auto;">
						<div class="dpm_op_content form-inline">
						<form id="formDate" method="post">
							<span>企业名称：</span>
							<input hidden name="quitId" id="quitId" :value="quitInfo.quitId" />
							<input class="form-control owidth" type="text" name="quitCompany" id="quitCompany" :value="quitInfo.quitCompany" /><br /><br />
							<span>所在园区：</span>
							<select class="form-control owidth" name="quitRegion" id="quitRegion">
								<option v-for="reg in proregions" :value="reg.regionTitle">{{ reg.regionTitle }}</option>
							</select><br /><br />
							<span>园区房号：</span>
							<input class="form-control owidth" type="text" name="quitNumber" id="quitNumber" :value="quitInfo.quitNumber" /><br /><br />
							<span>联系人姓名：</span>
							<input class="form-control owidth" type="text" name="quitName" id="quitName" :value="quitInfo.quitName" /><br /><br />
							<span>联系电话：</span>
							<input class="form-control owidth" type="text" name="quitPhone" id="quitPhone" :value="quitInfo.quitPhone" /><br /><br />
							<span>退租日期：</span>
							<input class="form-control owidth" type="date" name="quitDate" id="quitDate" :value="formatDate(quitInfo.quitDate)" /><br /><br />
							<span>退租状态：</span>
							<input type="radio" name="quitState" id="quitState" value="1" />&nbsp;保持已装修状态&nbsp;&nbsp;&nbsp;
							<input type="radio" name="quitState" id="quitState" value="2" />&nbsp;拆除装修恢复原状<br /><br />
							<span>退租类型：</span>
							<input type="radio" name="quitType" id="quitType" value="1" />&nbsp;合同到期&nbsp;&nbsp;&nbsp;
							<input type="radio" name="quitType" id="quitType" value="2" />&nbsp;提前退租<br /><br />
							<span>综合部意见：</span>
							<textarea class="form-control Capply_add_textarea"></textarea><br /><br />
							<span>中心领导审批意见：</span>
							<textarea class="form-control Capply_add_textarea"></textarea><br />
						</form>
						</div>					
						<div class="d-other">							
							<div class="d-subm">
								<button class="btn btn-primary" id="submit" @click="submit()">提交保存</button>
							</div>
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
		<script type="text/javascript">
		var info = new Vue({
			el:"#record",
			data:{
					infoList:[],
					pages:[],
					quitInfo:[],
					proregions:[],
				},
				 methods: {
					 setAll:function(){
							var dom = document.getElementById('all');
							var doms = document.getElementsByName("product");
							for(var i = 0 ; i < doms.length ; i++){
								doms[i].checked = dom.checked;
							}
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
									url: "/EntrepreneurialCenter/QuitApply/delQuitApply" ,//url
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
						fanye:function(pli){
							var quitCompany = $("#quitCompany").val();
				    		var startTime = $("#startTime").val();
				    		var endTime = $("#endTime").val();
				    		var quitCheck = $("#quitCheck").val();
				    		//alert(1)
				    		$.ajax({
								//几个参数需要注意一下
								type: "get",//方法类型
						        dataType: "json",//预期服务器返回的数据类型
						        url: "/EntrepreneurialCenter/QuitApply/likeQuitApplyInfo" ,//url
						        data: {page:pli,quitCompany:quitCompany,startTime:startTime,endTime:endTime,quitCheck:quitCheck},
						        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
						        success: function (result) {
						        	console.log(result);//打印服务端返回的数据(调试用)
						        	//alert(result);
						        	info.infoList=result;
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
				    	formatDate:function(value){
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
				    	getDetail:function(value){
				    		$('#CP_quit_add').show();
				    		$("#pop_upname").html("退园申请详情");
				    		$("#submit").hide();
				    		$.ajax({
								//几个参数需要注意一下
								type: "POST",//方法类型
								dataType: "json",//预期服务器返回的数据类型
								url: "/EntrepreneurialCenter/QuitApply/getQuitApplyById" ,//url
							    data: {"id":value},
							    contentType : "application/x-www-form-urlencoded; charset=UTF-8",
							    success: function (result) {
							        //alert(result.data);//打印服务端返回的数据(调试用)
							        info.quitInfo = result;
							        $(":radio[name='quitState'][value='" + result.quitState + "']").prop("checked", "checked");
							        $(":radio[name='quitType'][value='" + result.quitType + "']").prop("checked", "checked");
							        $("#quitRegion").val(result.quitRegion);
							    },
							    error : function() {
							        alert("异常！");
							    }
							}); 
				    	},
				    	getUpdate:function(value){
				    		$('#CP_quit_add').show();
				    		$("#pop_upname").html("退园申请修改");
				    		$.ajax({
								//几个参数需要注意一下
								type: "POST",//方法类型
								dataType: "json",//预期服务器返回的数据类型
								url: "/EntrepreneurialCenter/QuitApply/getQuitApplyById" ,//url
							    data: {"id":value},
							    contentType : "application/x-www-form-urlencoded; charset=UTF-8",
							    success: function (result) {
							        //alert(result.data);//打印服务端返回的数据(调试用)
							        info.quitInfo = result;
							        $(":radio[name='quitState'][value='" + result.quitState + "']").prop("checked", "checked");
							        $(":radio[name='quitType'][value='" + result.quitType + "']").prop("checked", "checked");
							        $("#quitRegion").val(result.quitRegion);
							    },
							    error : function() {
							        alert("异常！");
							    }
							}); 
				    	},
				    	submit:function(){
				    		if (confirm("确认要修改信息吗？")) {
				    			//alert($("#quitRegion").val());
								$.ajax({
									//几个参数需要注意一下
									type: "POST",//方法类型
									dataType: "json",//预期服务器返回的数据类型
									url: "/EntrepreneurialCenter/QuitApply/updateQuitApply" ,//url
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
				    	},
				    	formatDate:function(value){
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
				    	reset:function(){
				    		$("#quitCompany").val('');
				    		$("#startTime").val('');
				    		$("#endTime").val('');
				    		$("#quitCheck").find("option").eq(0).prop("selected",true);
				    	},
				    	likeSelect:function(){
				    		var quitCompany = $("#quitCompany").val();
				    		var startTime = $("#startTime").val();
				    		var endTime = $("#endTime").val();
				    		var quitCheck = $("#quitCheck").val();
				    		//alert(quitCheck);
				    		$.ajax({
								//几个参数需要注意一下
								type: "get",//方法类型
						        dataType: "json",//预期服务器返回的数据类型
						        url: "/EntrepreneurialCenter/QuitApply/likeQuitApplyInfo" ,//url
						        data: {quitCompany:quitCompany,startTime:startTime,endTime:endTime,quitCheck:quitCheck},
						        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
						        success: function (result) {
						        	console.log(result);//打印服务端返回的数据(调试用)
						        	//alert(result);
						        	info.infoList=result;
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
				    	
				 }
		});
		
		var that = this.info;
		$(function(){
			$('#Cqa_quit').click(function(){  //新增窗口关闭
				$('#CP_quit_add').hide();
				$("#submit").show();
			})
			//alert(111);
			$.ajax({
				//几个参数需要注意一下
				type: "get",//方法类型
		        dataType: "json",//预期服务器返回的数据类型
		        url: "/EntrepreneurialCenter/QuitApply/getQuitApplyInfo" ,//url
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
		})
		</script>
	</body>

</html>