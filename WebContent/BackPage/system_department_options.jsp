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
				<div class="right_col" role="main" >
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel">
							<div class="x_title">
								<h2>部门设置</h2>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<div class="pull-left" style="margin: 20px 0;">
									<button type="button" class="btn btn-default" id="amend" @click="update()">
									    <i class="fa fa-pencil-square-o"></i> 修改
									</button>
									<button type="button" class="btn btn-default" @click="del()">
									    <i class="fa fa-trash-o"></i> 删除
									</button>
								</div>
								<div class="table-div">
									<table id="datatable-checkbox" class="table table-striped table-hover table-bordered">
										<thead>
											<tr>
												<th><input type="checkbox" id="all" @click="setAll()"></th>
												<th>序号</th>
												<th>部门名称</th>											
											</tr>
										</thead>
										<tbody class="abody">
											<tr v-for="info in infoList">
												<td><input type="checkbox" name="product" :value="info.depId"></td>
												<td>{{info.depId}}</td>
												<td>{{info.depTitle}}</td>
											</tr>															
										</tbody>
									</table>
								</div>	
								<div class="add-dpm">
									<h3>添加部门</h3>
									<hr />
									<div class="sys-radio-box form-inline">
							    		<lable>部门名称：</lable>
							    		<input class="form-control" type="text" id="depTitle" />
							    	</div>
							    	<!-- <div class="sys-check-box">
							    		<p>权限:</p>
						    			<span>
							    			<input type="checkbox" name="" id="" value="" />企业管理
							    			<div class="chk-div">
							    				<input type="checkbox" name="" id="" value="" />数据查询<br />
							    				<input type="checkbox" name="" id="" value="" />数据批量导入<br />
							    				<input type="checkbox" name="" id="" value="" />数据手工导入
							    			</div>
						    			</span>
						    			<span>
						    				<input type="checkbox" name="" id="" value="" />物业管理
							    			<div class="chk-div">
							    				<input type="checkbox" name="" id="" value="" />结算管理<br />
							    			</div>
						    			</span>
						    			<span>
						    				<input type="checkbox" name="" id="" value="" />招商引资
							    			<div class="chk-div">
							    				<input type="checkbox" name="" id="" value="" />类型操作<br />
							    			</div>
						    			</span>
						    			<span>
						    				<input type="checkbox" name="" id="" value="" />文件收发
							    			<div class="chk-div">
							    				<input type="checkbox" name="" id="" value="" />渠道列表<br />
							    				<input type="checkbox" name="" id="" value="" />新增/编辑渠道
							    			</div>
						    			</span>
						    			<span>
						    				<input type="checkbox" name="" id="" value="" />水电管理
							    			<div class="chk-div">
							    				<input type="checkbox" name="" id="" value="" />登录日志查询<br />
							    				<input type="checkbox" name="" id="" value="" />系统日志查询
							    			</div>
						    			</span>
						    			<span>
						    				<input type="checkbox" name="" id="" value="" />短信发送
							    			<div class="chk-div">
							    				<input type="checkbox" name="" id="" value="" />公告列表<br />
							    				<input type="checkbox" name="" id="" value="" />公告管理
							    			</div>
						    			</span>
						    			<span>
						    				<input type="checkbox" name="" id="" value="" />系统设置
							    			<div class="chk-div">
							    				<input type="checkbox" name="" id="" value="" />财务审核<br />
							    			</div>
						    			</span>
						    			<span>
						    				<input type="checkbox" name="" id="" value="" />数据统计
							    			<div class="chk-div">
							    				<input type="checkbox" name="" id="" value="" />用户管理<br />
							    				<input type="checkbox" name="" id="" value="" />用户列表
							    			</div>
						    			</span>	    		
							    	</div> -->
							    	<div class="d-subm">
							    		<button class="btn btn-primary btn-lg" @click="submit()"><i class="fa fa-check"></i>&nbsp;&nbsp;提交</button>
							    	</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- 内容结束结束 -->
				<!--弹窗-->
				<div id="dpm_am" class="all-mark">
					<div class="mark-house-op depm_op">
						<div class="mark-heading">
							<p>部门修改</p>
							<img id="dpm_quit" class="del-img" title="关闭" src="img/del.png"/>
						</div>
						<div class="dpm_op_content">
							<lable class="olable">部门设置：</lable>
							<form id="updateDep"  method="post">
							<input name="depId" id="depId" :value="title.depId" hidden="hidden" />
							<input class="form-control" type="text" name="depTitle" id="depTitle" :value="title.depTitle" />
							</form>
						</div>
						<div class="d-other">							
							<div class="d-subm">
								<button class="btn btn-primary" @click="updateDep()">提交保存<tton>
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
					title:[]
				},
				 methods: {
					 setAll:function(){
							var dom = document.getElementById('all');
							var doms = document.getElementsByName("product");
							for(var i = 0 ; i < doms.length ; i++){
								doms[i].checked = dom.checked;
							}
						},
					 submit:function(){
						 var depTitle = $("#depTitle").val();
						 if ($.trim(depTitle).length==0) {
							alert("请填写部门名称。");
						}else if (confirm("确认要新增部门吗？")) {
							 $.ajax({
								//几个参数需要注意一下
								type: "POST",//方法类型
								dataType: "json",//预期服务器返回的数据类型
								url: "/EntrepreneurialCenter/Departments/addDepartments" ,//url
								data: {"depTitle":depTitle},
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
					 },
					 update:function(){
						// 判断是否至少选择一项 
						var checkedNum = $("input[name='product']:checked").length; 
						if(checkedNum == 0) { 
							alert("请选择至少一项！"); 
							return; 
						}else if(checkedNum > 1){
							alert("只能选择一项！");
						}else if(checkedNum==1){
							$('#dpm_am').show();  //显示弹窗	
							//alert($("input[name='product']:checked").val())
							$.ajax({
								//几个参数需要注意一下
								type: "POST",//方法类型
								dataType: "json",//预期服务器返回的数据类型
								url: "/EntrepreneurialCenter/Departments/getDepartmentsById" ,//url
								data: {"id":$("input[name='product']:checked").val()},
								contentType : "application/x-www-form-urlencoded; charset=UTF-8",
								success: function (result) {
									//alert(result);
								    info.title=result;
								},
								error : function() {
								    alert("异常！");
								}
							}); 
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
								url: "/EntrepreneurialCenter/Departments/delDepartments" ,//url
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
					 updateDep:function(){
						 if (confirm("是否更新部门信息？")) {
							 $.ajax({
									//几个参数需要注意一下
									type: "POST",//方法类型
									dataType: "json",//预期服务器返回的数据类型
									url: "/EntrepreneurialCenter/Departments/updateDepartments" ,//url
									data: $('#updateDep').serialize(),
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
				 }
		});
		
		var that = this.info;
		$(function(){
			$('#dpm_quit').click(function(){
				$('#dpm_am').hide();  //隐藏弹窗
			})

			
			$.ajax({
				//几个参数需要注意一下
				type: "get",//方法类型
		        dataType: "json",//预期服务器返回的数据类型
		        url: "/EntrepreneurialCenter/Departments/getAllDepartmentsInfo" ,//url
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