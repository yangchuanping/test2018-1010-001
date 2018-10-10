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
				<div id="record">
				<!-- 页面内容开始 -->
				<div class="right_col" role="main" >
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel">
							<div class="x_title">
								<h2>入园申请管理</h2>								
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<div class="form-group form-inline unmarT">									
									<label class="lablemar">搜索内容:
			            			    <input type="text" class="form-control" id="gardenCompany" placeholder="公司名称" />
			            			</label>
									<label class="lablemar">申请时间:
			            			    <input type="date" class="form-control" id="startTime" />
			            			</label>
									<label class="lablemar">-&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			            			    <input type="date" class="form-control" id="endTime" />
			            			</label>
									<label class="lablemar">审核状态:
			            			    <select class="form-control" id="gardenCheck">
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
											<th>申请时间</th>
											<th>发起人</th>
											<th>审核状态</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<tr v-for="info in infoList.rows">
											<td><input type="checkbox" name="product" :value="info.gardenId"></td>
											<td>{{ info.gardenCompany }}</td>
											<td>{{ formatDate(info.gardenCreate) }}</td>
											<td>{{ info.gardenLinkname }}</td>
											<td>
												<span v-if="info.gardenCheck==0">审核中</span>
												<span v-if="info.gardenCheck==1">审核通过</span>
												<span v-if="info.gardenCheck==2">审核未通过</span>
											</td>
											<td>
												<button type="button" class="btn btn-info btn-xs" @click="getUpdate(info.gardenId)">编辑</button>
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
				<!--弹窗-->
				<div id="in_garden_add" class="all-mark">
					<div class="mark-house-op Capply_add_mk">					
						<div class="mark-heading">
							<p id="pop_upname"></p>
							<img id="ing_quit" class="del-img" title="关闭" src="img/del.png"/>
						</div>
						<div style="height: 810px; overflow-y: auto;">
						<form id="formDate" method="post">
						<div class="input_all form-inline">
							<span>
								<lable>企业名称:</lable>
								<input hidden name="gardenId" id="gardenId" :value="gardenInfo.gardenId" />
								<input class="form-control" type="text" name="gardenCompany" id="gardenCompany" :value="gardenInfo.gardenCompany" />
							</span>
							<span>
								<lable>注册情况:</lable>
								<input class="form-control" type="text" name="gardenRegistration" id="gardenRegistration" :value="gardenInfo.gardenRegistration" />
							</span>
							<span>
								<lable>申请时间:</lable>
								<input class="form-control" type="date" name="gardenDate" id="gardenDate" :value="formatDate(gardenInfo.gardenDate)" />
							</span>
						</div>
						<div class="input_all form-inline">
							<span>
								<lable>申办面积:</lable>
								<input class="form-control" type="text" placeholder="㎡" name="gardenArea" id="gardenArea" :value="gardenInfo.gardenArea" />
							</span>
							<span>
								<lable>技术领域:</lable>
								<select class="form-control" id="indId" name="indId">
							       <option v-for="ind in comInd" v-bind:value="ind.indId">{{ind.indTitle}}</option>
							    </select>
							</span>
							<span>
								<lable>公司法人:</lable>
								<input class="form-control" type="text" name="gardenLawperson" id="gardenLawperson" :value="gardenInfo.gardenLawperson" />								
							</span>							
						</div>
						<div class="input_all form-inline">
							<span>
								<lable>法人电话:</lable>
								<input class="form-control" type="text" name="gardenLawphone" id="gardenLawphone" :value="gardenInfo.gardenLawphone" />	
							</span>
							<span>
								<lable>注册资本:</lable>
								<input class="form-control" type="text" name="gardenCapital" id="gardenCapital" :value="gardenInfo.gardenCapital" />
							</span>
							<span>
								<lable>注册地址:</lable>
								<input class="form-control" type="text" name="gardenAddress" id="gardenAddress" :value="gardenInfo.gardenAddress" />
							</span>							
						</div>
						<div class="input_all form-inline" style="padding-left: 15px;">
						    &nbsp;&nbsp;&nbsp;<lable>知识产权:</lable>&nbsp;&nbsp;
							<input type="checkbox" name="gardenIp" id="gardenIp" value="发明专利">&nbsp;发明专利&nbsp;&nbsp;
							<input type="checkbox" name="gardenIp" id="gardenIp" value="实用新型专利">&nbsp;实用新型专利&nbsp;&nbsp;
							<input type="checkbox" name="gardenIp" id="gardenIp" value="外观设计专利">&nbsp;外观设计专利&nbsp;&nbsp;
							<input type="checkbox" name="gardenIp" id="gardenIp" value="软件著作权">&nbsp;软件著作权&nbsp;&nbsp;
							<input type="checkbox" name="gardenIp" id="gardenIp" value="其他">&nbsp;其他
						</div>
						<div class="input_all form-inline">
							<span>
								<lable>工商注册:</lable>
								<select class="form-control" name="gardenIacr" id="gardenIacr">
									<option value="2">已注册</option>
									<option value="1">未注册</option>
								</select>
							</span>
							<span>
								<lable>公司成立时间:</lable>
								<input class="form-control" type="date" name="gardenRegtime" id="gardenRegtime" :value="formatDate(gardenInfo.gardenRegtime)" />
							</span>
							<span>
								<lable>年销售额:  </lable>
								<input class="form-control" type="text" name="gardenSale" id="gardenSale" :value="gardenInfo.gardenSale" />
							</span>						
						</div>
						<div class="input_all form-inline">
							<span>
								<lable>年纳税额:</lable>
								<input class="form-control" type="text" name="gardenRatal" id="gardenRatal" :value="gardenInfo.gardenRatal" />
							</span>
							<span>
								<lable>联系人姓名:</lable>
								<input class="form-control" type="text" name="gardenLinkname" id="gardenLinkname" :value="gardenInfo.gardenLinkname" />
							</span>
							<span>
								<lable>联系人手机:</lable>
								<input class="form-control" type="text" name="gardenLinkphone" id="gardenLinkphone" :value="gardenInfo.gardenLinkphone" />
							</span>						
						</div>
						<div class="input_all form-inline">
							<span>
								<lable>传真/电话:</lable>
								<input class="form-control" type="text" name="gardenLinkfax" id="gardenLinkfax" :value="gardenInfo.gardenLinkfax" />
							</span>
							<span>
								<lable>QQ/电子邮箱:</lable>
								<input class="form-control" type="text" name="gardenLinkemail" id="gardenLinkemail" :value="gardenInfo.gardenLinkemail" />
							</span>
							<span>
								<lable>现有总人数:</lable>
								<input class="form-control" type="text" name="gardenHeadcount" id="gardenHeadcount" :value="gardenInfo.gardenHeadcount" />
							</span>						
						</div>
						<div class="input_all form-inline">
							<span>
								<lable>博士/硕士:</lable>
								<input class="form-control" type="text" name="gardenDrma" id="gardenDrma" :value="gardenInfo.gardenDrma" />
							</span>
							<span>
								<lable>本科/留学人员:</lable>
								<input class="form-control" type="text" name="gardenUndergraduate" id="gardenUndergraduate" :value="gardenInfo.gardenUndergraduate" />
							</span>												
						</div>						
						<div class="input_all form-inline" style="padding-left: 15px;">
							<lable>公司的主要产品:</lable>
							<textarea class="form-control Capply_add_textarea" name="gardenProducts" id="gardenProducts" :value="gardenInfo.gardenProducts"  rows="" cols="" ></textarea>
						</div>
						<div class="input_all form-inline" style="padding-left: 15px;">
							<lable>代表人主要经历:</lable>
							<textarea class="form-control Capply_add_textarea" name="gardenLawcareer" id="gardenLawcareer" :value="gardenInfo.gardenLawcareer"  rows="" cols="" ></textarea>
						</div>
						<p style="margin-left: 35px;margin-bottom: 0;">股东名单:</p>
						<div class="tab_div">
							<table class="table table-striped table-bordered table-hover table-condensed">
								<thead>
								    <tr>
								       <th>姓名</th>
								       <th>性别</th>
								       <th>年龄</th>
								       <th>专业</th>
								       <th>学历</th>
								       <th>占股比例</th>
								       <th>职务</th>
								       <th>备注</th>
								    </tr>
								</thead>
								<tbody>
								    <tr>
								       <td>Tanmay</td>
								       <td>Bangalore</td>
								       <td>Tanmay</td>
								       <td>Bangalore</td>
								       <td>Tanmay</td>
								       <td>Bangalore</td>
								       <td>Tanmay</td>
								       <td>Bangalore</td>
								    </tr>
								</tbody>
							</table>
						</div>
						<div class="input_all form-inline" style="padding-left: 15px;">
							<lable>招商部意见:</lable>
							<textarea class="form-control Capply_add_textarea" name="gardenLawcareer" id="gardenLawcareer" :value="gardenInfo.gardenLawcareer"  rows="" cols="" ></textarea>
						</div>
						<div class="input_all form-inline" style="padding-left: 15px;">
							<lable>副主任意见:</lable>
							<textarea class="form-control Capply_add_textarea" name="gardenLawcareer" id="gardenLawcareer" :value="gardenInfo.gardenLawcareer"  rows="" cols="" ></textarea>
						</div>
						<div class="input_all form-inline" style="padding-left: 15px;">
							<lable> 主 任 意 见 :</lable>
							<textarea class="form-control Capply_add_textarea" name="gardenLawcareer" id="gardenLawcareer" :value="gardenInfo.gardenLawcareer"  rows="" cols="" ></textarea>
						</div>
						<div class="input_all form-inline" style="padding-left: 15px;">
							<lable>管委领导意见:</lable>
							<textarea class="form-control Capply_add_textarea" name="gardenLawcareer" id="gardenLawcareer" :value="gardenInfo.gardenLawcareer"  rows="" cols="" ></textarea>
						</div>
						<div class="input_all form-inline" style="padding-left: 15px;">
							<lable>综合部受理:</lable>
							<textarea class="form-control Capply_add_textarea" name="gardenLawcareer" id="gardenLawcareer" :value="gardenInfo.gardenLawcareer"  rows="" cols="" ></textarea>
						</div>
						</form>
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
					gardenInfo:[],
					comInd:[],
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
			    		var gardenCompany = $.trim($("#gardenCompany").val());
			    		var startTime = $.trim($("#startTime").val());
			    		var endTime = $.trim($("#endTime").val());
			    		var gardenCheck = $("#gardenCheck").val();
			    		//alert(1)
			    		$.ajax({
							//几个参数需要注意一下
							type: "get",//方法类型
					        dataType: "json",//预期服务器返回的数据类型
					        url: "/EntrepreneurialCenter/GardenApply/LikeGardenApplyInfo" ,//url
					        data: {page:pli,"gardenCheck":gardenCheck,"gardenCompany":gardenCompany,"startTime":startTime,"endTime":endTime},
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
			    	likeSelect:function(){
			    		var gardenCompany = $.trim($("#gardenCompany").val());
			    		var startTime = $.trim($("#startTime").val());
			    		var endTime = $.trim($("#endTime").val());
			    		var gardenCheck = $("#gardenCheck").val();
			    		$.ajax({
								//几个参数需要注意一下
								type: "get",//方法类型
						        dataType: "json",//预期服务器返回的数据类型
						        url: "/EntrepreneurialCenter/GardenApply/LikeGardenApplyInfo" ,//url
						        data: {"gardenCheck":gardenCheck,"gardenCompany":gardenCompany,"startTime":startTime,"endTime":endTime},
						        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
						        success: function (result) {
						        	console.log(result);//打印服务端返回的数据(调试用)
						        	//alert(result);
						        	info.infoList = result;
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
			    	reset:function(){
			    		$("#gardenCompany").val('');
			    		$("#startTime").val('');
			    		$("#endTime").val('');
			    		$("#gardenCheck").find("option").eq(0).prop("selected",true);
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
								url: "/EntrepreneurialCenter/GardenApply/delGardenApply" ,//url
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
			    		$('#in_garden_add').show();
			    		$("#pop_upname").html("入园申请详情");
			    		$("#submit").hide();
			    		$.ajax({
							//几个参数需要注意一下
							type: "POST",//方法类型
							dataType: "json",//预期服务器返回的数据类型
							url: "/EntrepreneurialCenter/GardenApply/getGardenApplyById" ,//url
						    data: {"id":value},
						    contentType : "application/x-www-form-urlencoded; charset=UTF-8",
						    success: function (result) {
						        //alert(result.data);//打印服务端返回的数据(调试用)
						        info.gardenInfo = result;
						        $("#indId").val(result.indId);
						        
						        $("input[name='gardenIp']").prop("checked", false);
						         var arr = result.gardenIp.split(",");
						        for (var i = 0; i < arr.length; i++) {
						        	$("input[name='gardenIp'][value='" + arr[i] + "']").prop("checked", "checked");
								}
						        
						        $("#gardenIacr").val(result.gardenIacr);
						    },
						    error : function() {
						        alert("异常！");
						    }
						}); 
			    	},
			    	getUpdate:function(value){
			    		$('#in_garden_add').show();
			    		$("#pop_upname").html("入园申请编辑");
			    		$.ajax({
							//几个参数需要注意一下
							type: "POST",//方法类型
							dataType: "json",//预期服务器返回的数据类型
							url: "/EntrepreneurialCenter/GardenApply/getGardenApplyById" ,//url
						    data: {"id":value},
						    contentType : "application/x-www-form-urlencoded; charset=UTF-8",
						    success: function (result) {
						        //alert(result.data);//打印服务端返回的数据(调试用)
						        info.gardenInfo = result;
						        $("#indId").val(result.indId);
						        
						        $("input[name='gardenIp']").prop("checked", false);
						         var arr = result.gardenIp.split(",");
						        for (var i = 0; i < arr.length; i++) {
						        	$("input[name='gardenIp'][value='" + arr[i] + "']").prop("checked", "checked");
								}
						        
						        $("#gardenIacr").val(result.gardenIacr);
						    },
						    error : function() {
						        alert("异常！");
						    }
						}); 
			    	},
			    	submit:function(){
			    		if (confirm("确认要修改信息吗？")) {
			    			//alert($('#formDate').serialize());
			    			$.ajax({
								//几个参数需要注意一下
								type: "POST",//方法类型
								dataType: "json",//预期服务器返回的数据类型
								url: "/EntrepreneurialCenter/GardenApply/updateGardenApply" ,//url
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
			    }
		    	
		});
		
		
		var that = this.info;
		$(function(){
			$('#ing_quit').click(function(){  //入园添加弹窗关闭
				$('#in_garden_add').hide();
				$("#submit").show();
			})
			//alert(111);
			$.ajax({
				//几个参数需要注意一下
				type: "get",//方法类型
		        dataType: "json",//预期服务器返回的数据类型
		        url: "/EntrepreneurialCenter/GardenApply/getGardenApplyInfo" ,//url
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
		        url: "/EntrepreneurialCenter/ComIndustries/getAllComIndustriesInfo" ,//url
		        //data: ,
		        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
		        success: function (result) {
		        	console.log(result);//打印服务端返回的数据(调试用)
		        	//alert(result);
		        	that.comInd = result;
		        }
		       	}); 
		})
		</script>
	</body>

</html>