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
				<div class="right_col">
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel">
							<div class="x_title">
								<h2>房屋出租情况</h2>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<div class="form-group form-inline">
									<label class="lablemar">所属园区:
			            			    <select class="form-control">
			            			    	<option>不限</option>
									        <option>信息产业园</option>
									        <option>创意产业园</option>
									        <option>大学科技园</option>
									    </select>
			            			</label>
									<label class="lablemar">楼宇:
			            			    <select class="form-control">
									        <option>不限</option>
									        <option>A座</option>
									        <option>B座</option>
									        <option>C座</option>
									    </select>
			            			</label>
									<label class="lablemar">状态:
			            			    <select class="form-control">
									        <option>不限</option>
									        <option>使用中</option>
									        <option>空闲中</option>
									        <option>其他</option>
									    </select>
			            			</label>
									<label class="lablemar">公司名:
			            			    <select class="form-control">
									        <option>不限</option>
									        <option>这个可以不要吧</option>
									    </select>
			            			</label>
									<label class="lablemar">关键词:
			            			    <input type="text" class="form-control" />
			            			</label>
									<input type="button" class="btn btn-primary" value="查询" />
									<div class="pull-right">
										<button type="button" class="btn btn-default">
									    	<i class="fa fa-eye"></i> 查看
										</button>
										<button type="button" class="btn btn-default">
										    <i class="fa fa-pencil-square-o"></i> 修改
										</button>
										<button type="button" class="btn btn-default">
										    <i class="fa fa-plus-circle"></i> 新增
										</button>
										<button type="button" class="btn btn-default">
										    <i class="fa fa-share-square-o"></i> 导出
										</button>
										<button type="button" class="btn btn-default">
										    <i class="fa fa-trash-o"></i> 删除
										</button>
									</div>									
								</div>
								<table id="datatable-checkbox" class="table table-striped table-hover table-bordered bulk_action">
									<thead>
										<tr>
											<th><input type="checkbox"></th>
											<th>所属园区</th>
											<th>企业名称</th>
											<th>楼宇</th>
											<th>房间号</th>
											<th>面积/㎡</th>
											<th>单价/万元</th>
											<th>房间状态</th>
											<th>承租时间</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td><input type="checkbox"></td>
											<td>创意产业园</td>
											<td>信息产业园</td>
											<td>C座</td>
											<td>1-1*101</td>
											<td>192</td>
											<td>30</td>
											<td>使用中</td>
											<td>2013-1-1至2018-1-1</td>
										</tr>
										<tr>
											<td><input type="checkbox"></td>
											<td>创意产业园</td>
											<td>信息产业园</td>
											<td>C座</td>
											<td>1-1*101</td>
											<td>192</td>
											<td>30</td>
											<td>使用中</td>
											<td>2013-1-1至2018-1-1</td>
										</tr>
										<tr>
											<td><input type="checkbox"></td>
											<td>创意产业园</td>
											<td>信息产业园</td>
											<td>C座</td>
											<td>1-1*101</td>
											<td>192</td>
											<td>30</td>
											<td>使用中</td>
											<td>2013-1-1至2018-1-1</td>
										</tr>
										<tr>
											<td><input type="checkbox"></td>
											<td>创意产业园</td>
											<td>信息产业园</td>
											<td>C座</td>
											<td>1-1*101</td>
											<td>192</td>
											<td>30</td>
											<td>使用中</td>
											<td>2013-1-1至2018-1-1</td>
										</tr>
										<tr>
											<td><input type="checkbox"></td>
											<td>创意产业园</td>
											<td>信息产业园</td>
											<td>C座</td>
											<td>1-1*101</td>
											<td>192</td>
											<td>30</td>
											<td>使用中</td>
											<td>2013-1-1至2018-1-1</td>
										</tr>
										<tr>
											<td><input type="checkbox"></td>
											<td>创意产业园</td>
											<td>信息产业园</td>
											<td>C座</td>
											<td>1-1*101</td>
											<td>192</td>
											<td>30</td>
											<td>使用中</td>
											<td>2013-1-1至2018-1-1</td>
										</tr>
										<tr>
											<td><input type="checkbox"></td>
											<td>创意产业园</td>
											<td>信息产业园</td>
											<td>C座</td>
											<td>1-1*101</td>
											<td>192</td>
											<td>30</td>
											<td>使用中</td>
											<td>2013-1-1至2018-1-1</td>
										</tr>										
										<tr>
											<td><input type="checkbox"></td>
											<td>创意产业园</td>
											<td>信息产业园</td>
											<td>C座</td>
											<td>1-1*101</td>
											<td>192</td>
											<td>30</td>
											<td>使用中</td>
											<td>2013-1-1至2018-1-1</td>
										</tr>						
										<tr>
											<td><input type="checkbox"></td>
											<td>创意产业园</td>
											<td>信息产业园</td>
											<td>C座</td>
											<td>1-1*101</td>
											<td>192</td>
											<td>30</td>
											<td>使用中</td>
											<td>2013-1-1至2018-1-1</td>
										</tr>
										<tr>
											<td><input type="checkbox"></td>
											<td>创意产业园</td>
											<td>信息产业园</td>
											<td>C座</td>
											<td>1-1*101</td>
											<td>192</td>
											<td>30</td>
											<td>使用中</td>
											<td>2013-1-1至2018-1-1</td>
										</tr>
										<tr>
											<td><input type="checkbox"></td>
											<td>创意产业园</td>
											<td>信息产业园</td>
											<td>C座</td>
											<td>1-1*101</td>
											<td>192</td>
											<td>30</td>
											<td>使用中</td>
											<td>2013-1-1至2018-1-1</td>
										</tr>
										<tr>
											<td><input type="checkbox"></td>
											<td>创意产业园</td>
											<td>信息产业园</td>
											<td>C座</td>
											<td>1-1*101</td>
											<td>192</td>
											<td>30</td>
											<td>使用中</td>
											<td>2013-1-1至2018-1-1</td>
										</tr>
										<tr>
											<td><input type="checkbox"></td>
											<td>创意产业园</td>
											<td>信息产业园</td>
											<td>C座</td>
											<td>1-1*101</td>
											<td>192</td>
											<td>30</td>
											<td>使用中</td>
											<td>2013-1-1至2018-1-1</td>
										</tr>
										<tr>
											<td><input type="checkbox"></td>
											<td>创意产业园</td>
											<td>信息产业园</td>
											<td>C座</td>
											<td>1-1*101</td>
											<td>192</td>
											<td>30</td>
											<td>使用中</td>
											<td>2013-1-1至2018-1-1</td>
										</tr>
										<tr>
											<td><input type="checkbox"></td>
											<td>创意产业园</td>
											<td>信息产业园</td>
											<td>C座</td>
											<td>1-1*101</td>
											<td>192</td>
											<td>30</td>
											<td>使用中</td>
											<td>2013-1-1至2018-1-1</td>
										</tr>
										<tr>
											<td><input type="checkbox"></td>
											<td>创意产业园</td>
											<td>信息产业园</td>
											<td>C座</td>
											<td>1-1*101</td>
											<td>192</td>
											<td>30</td>
											<td>使用中</td>
											<td>2013-1-1至2018-1-1</td>
										</tr>
										<tr>
											<td><input type="checkbox"></td>
											<td>创意产业园</td>
											<td>信息产业园</td>
											<td>C座</td>
											<td>1-1*101</td>
											<td>192</td>
											<td>30</td>
											<td>使用中</td>
											<td>2013-1-1至2018-1-1</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
				<!-- 内容结束结束 -->
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
	</body>

</html>