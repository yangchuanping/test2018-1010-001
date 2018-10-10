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
				<div class="right_col" role="main">

					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel">
							<div class="x_title">
								<h2>企业信息</h2>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<div class="form-group form-inline">
									<label class="lablemar">所属园区:
			            			    <select class="form-control" name="regionId" id="regionId">
			            			    	<option selected>不限</option>
									        <option v-for="reg in proregions" :value="reg.regionId">{{ reg.regionTitle }}</option>
									    </select>
			            			</label>
									<label class="lablemar">时间:
			            			    <select class="form-control">
									        <option selected>不限</option>
									        <option>小于一年</option>
									        <option>一到两年</option>
									        <option>两年以上</option>
									    </select>
			            			</label>
									<label class="lablemar">行业:
			            			    <select class="form-control" name="indId" id="indId">
			            			    	<option selected>不限</option>
									        <option v-for="ind in comind" :value="ind.indId">{{ ind.indTitle }}</option>
									    </select>
			            			</label>
									<label class="lablemar">企业类型:
			            			    <select class="form-control" name="typeId" id="typeId">
									        <option selected>不限</option>
									        <option v-for="type in comtypes" :value="type.typeId">{{ type.typeTitle }}</option>
									    </select>
			            			</label>
									<label class="lablemar">关键词:
			            			    <input type="text" class="form-control" />
			            			</label>
									<input type="button" class="btn btn-primary" value="查询" />
									<div class="pull-right">
										<button type="button" class="btn btn-default" @click="getUpdate(1)">
										    <i class="fa fa-eye"></i> 查看
										</button>
										<button type="button" class="btn btn-default" @click="getUpdate(2)">
										    <i class="fa fa-pencil-square-o"></i> 修改
										</button>
										<button type="button" class="btn btn-default" @click="add()">
										    <i class="fa fa-plus-circle"></i> 新增
										</button>
										<button type="button" class="btn btn-default">
										    <i class="fa fa-share-square-o"></i> 导出
										</button>
										<button type="button" class="btn btn-default" @click="del()">
										    <i class="fa fa-trash-o"></i> 删除
										</button>									
									</div>
								</div>
								<table id="datatable-checkbox" class="table table-striped table-hover table-bordered bulk_action">
									<thead>
										<tr>
											<th><input type="checkbox" id="check-all" class="flat" @click="setAll()"></th>
											<th>公司名称</th>
											<th>所属行业</th>
											<th>企业类型</th>
											<th>企业状态</th>
											<th>入园时间</th>
											<th>续租时间</th>
											<th>注册资金</th>
											<th>联系人</th>
											<th>固定电话</th>
											<th>移动电话</th>
											<th>详细地址</th>
										</tr>
									</thead>
									<tbody>
										<tr v-for="info in infoList">
											<td><input type="checkbox" class="flat" name="table_records" :value="info.comId"></td>
											<td>{{ info.comName }}</td>
											<td>{{ info.indTitle }}</td>
											<td>{{ info.typeTitle }}</td>
											<td>{{ info.modeTitle }}</td>
											<td>{{ formatDate(info.joinDmt) }}</td>
											<td>{{ formatDate(info.retakeDmt) }}</td>
											<td>
												{{ eval(info.comDetail)[2] }}
												<!-- <span v-if="eval(info.comDetail)[2]!='万'"></span>
												<span v-else></span> -->
											</td>
											<td>{{ eval(info.comDetail)[7] }}</td>
											<td>{{ eval(info.comDetail)[11] }}</td>
											<td>{{ eval(info.comDetail)[12] }}</td>
											<td>{{ eval(info.comDetail)[17] }}</td>
										</tr>
									</tbody>
								</table>
								<!-- 分页页码开始 -->
								<!-- <div class="page-foter">
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
								</div> -->
							</div>
						</div>
					</div>
				</div>
				<!-- 内容结束结束 -->
				<!--弹窗-->
				<div id="C_info_mark" class="all-mark">
					<div class="mark-house-op Cinfo_mk">
						<form id="formdate" method="post">
						<div class="mark-heading">
							<p id="pop_upname">录入企业信息</p>
							<img id="info_quit" class="del-img" title="关闭" src="img/del.png"/>
						</div>
						<div class="input_all form-inline">
							<span>
								<lable>企业名称:</lable>
								<input class="form-control" type="text" id="comName" name="comName" :value="cominfo.comName" />
							</span>
							<span>
								<lable>企业类型:</lable>
								<select class="form-control" id="typeId" name="typeId" v-model="cominfo.typeId" >
									<option v-for="type in comtypes" :value="type.typeId">{{ type.typeTitle }}</option>
								</select>
							</span>
							<span>
								<lable>所属行业:</lable>
								<select class="form-control" id="indId" name="indId" v-model="cominfo.indId" >
									<option v-for="ind in comind" :value="ind.indId">{{ ind.indTitle }}</option>
								</select>
							</span>
						</div>
						<div class="input_all form-inline">
							<span>
								<lable>所在园区:</lable>
								<select class="form-control" id="regionId" name="regionId" v-model="cominfo.regionId" >
									<option v-for="reg in proregions" :value="reg.regionId">{{ reg.regionTitle }}</option>
								</select>
							</span>
							<span>
								<lable>企业状态:</lable>
								<select class="form-control" id="modeId" name="modeId" v-model="cominfo.modeId" >
									<option v-for="mode in commode" :value="mode.modeId">{{ mode.modeTitle }}</option>
								</select>
							</span>
							<span>
								<lable>企业认定:</lable>
								<select class="form-control" id="ideId" name="ideId" v-model="cominfo.ideId" >
									<option v-for="ide in comide" :value="ide.ideId">{{ ide.ideTitle }}</option>
								</select>
							</span>							
						</div>
						<div class="input_all form-inline">
							<span>
								<lable>入园时间:</lable>
								<input class="form-control" type="date" id="joinDmt" name="joinDmt" :value="formatDate(cominfo.joinDmt)" />
							</span>
							<span>
								<lable>续租时间:</lable>
								<input class="form-control" type="date" id="retakeDmt" name="retakeDmt" :value="formatDate(cominfo.retakeDmt)" />
							</span>
							<span>
								<lable>毕业时间:</lable>
								<input class="form-control" type="text" id="d0" name="d0" />
							</span>							
						</div>
						<div class="input_all form-inline">
							<span>
								<lable>成立时间:</lable>
								<input class="form-control" type="text" id="d1" name="d1" />
							</span>
							<span>
								<lable>注册资金:</lable>
								<input class="form-control" type="text" placeholder="万元" id="d2" name="d2" />
							</span>
							<span>
								<lable>营业执照:</lable>
								<input class="form-control" type="text" id="d3" name="d3" />
							</span>						
						</div>
						<div class="input_all form-inline">
							<span>
								<lable>地税证号:</lable>
								<input class="form-control" type="text" id="d4" name="d4" />
							</span>
							<span>
								<lable>国税证号:</lable>
								<input class="form-control" type="text" id="d5" name="d5" />
							</span>
							<span>
								<lable>证号代码:</lable>
								<input class="form-control" type="text" id="d6" name="d6" />
							</span>							
						</div>
						<div class="input_all form-inline">
							<span>
								<lable>法人代表:</lable>
								<input class="form-control" type="text" id="d7" name="d7" />
							</span>
							<span>
								<lable>法人电话:</lable>
								<input class="form-control" type="text" id="d8" name="d8" />
							</span>
							<span>
								<lable>职工人数:</lable>
								<input class="form-control" type="text" id="d9" name="d9" />
							</span>							
						</div>
						<div class="input_all form-inline">
							<span>
								<lable>联   系   人:&nbsp</lable>
								<input class="form-control" type="text" id="d10" name="d10" />
							</span>
							<span>
								<lable>固定电话:</lable>
								<input class="form-control" type="text" id="d11" name="d11" />
							</span>
							<span>
								<lable>移动电话:</lable>
								<input class="form-control" type="text" id="d12" name="d12" />
							</span>							
						</div>
						<div class="input_all form-inline">
							<span>
								<lable>公司传真:</lable>
								<input class="form-control" type="text" id="d13" name="d13" />
							</span>
							<span>
								<lable>电子邮箱:</lable>
								<input class="form-control" type="text" id="d14" name="d14" />
							</span>
							<span>
								<lable>公司网址:</lable>
								<input class="form-control" type="text" placeholder="http://" id="d15" name="d15" />
							</span>							
						</div>
						<div class="input_all form-inline">
							<span>
								<lable>邮政编码:</lable>
								<input class="form-control" type="text" id="d16" name="d16" />
							</span>
							<span>
								<lable>详细地址:</lable>
								<input class="form-control" type="text" id="d17" name="d17" />
							</span>							
						</div>
						<div class="input_all form-inline" style="padding-left: 15px;">
							<lable>专利情况:</lable>
							<textarea class="form-control" id="comPatent" name="comPatent" rows="" cols="" style="width: 90%; height: 60px;" :value="cominfo.comPatent" ></textarea>
						</div>
						<div class="input_all form-inline" style="padding-left: 15px;">
							<lable>企业简介:</lable>
							<textarea class="form-control" id="comAbout" name="comAbout" rows="" cols="" style="width: 90%; height: 100px;" :value="cominfo.comAbout"></textarea>
						</div>
						<input class="form-control" type="hidden" id="comId" name="comId" :value="cominfo.comId" />
						<input class="form-control" type="hidden" id="comDetail" name="comDetail" />
						</form>
						<div class="d-other">							
							<div class="d-subm">
								<button class="btn btn-primary" id="submit" @click="submit()">提交保存</button>
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
					comind:[],
					comtypes:[],
					comide:[],
					commode:[],
					proregions:[],
					cominfo:[],
				},
				methods: {
					setAll:function(){
						var dom = document.getElementById('check-all');
						var doms = document.getElementsByName("table_records");
						for(var i = 0 ; i < doms.length ; i++){
							doms[i].checked = dom.checked;
						}
					},
					fanye:function(pli){
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
						var checkedNum = $("input[name='table_records']:checked").length; 
						if(checkedNum == 0) { 
							alert("请选择至少一项！"); 
							return; 
						}else if(confirm("确定要删除所选项目？删除后不可找回。")) { 
							var checkedList = new Array(); 
							$("input[name='table_records']:checked").each(function() { 
							checkedList.push($(this).val()); 
							});
							alert(checkedList.toString());
							$.ajax({
								//几个参数需要注意一下
								type: "POST",//方法类型
								dataType: "json",//预期服务器返回的数据类型
								url: "/EntrepreneurialCenter/Companies/delCompanies" ,//url
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
					 add:function(){
						 $('#C_info_mark').show();  //显示弹窗
						 $("#pop_upname").html("录入企业信息");
						 $("#submit").show();
						 this.cominfo=[];
						 $("#d0,#d1,#d2,#d3,#d4,#d5,#d6,#d7,#d8,#d9,#d10,#d11,#d12,#d13,#d14,#d15,#d16,#d17").val("");
						 
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
				    	getUpdate:function(value){
				    		var checkedNum = $("input[name='table_records']:checked").length; 
							if(checkedNum == 0) { 
								alert("请选择至少一项！"); 
								return; 
							}else if(checkedNum > 1){
								alert("只能选择一项！");
							}else if(checkedNum == 1){
								if (value==1) {
									$('#C_info_mark').show();
						    		$("#pop_upname").html("企业信息详情");
						    		$("#submit").hide();
					    		}else{
					    			$('#C_info_mark').show();
						    		$("#pop_upname").html("企业信息修改");
						    		$("#submit").show();
					    		}
					    		
					    		$.ajax({
									//几个参数需要注意一下
									type: "get",//方法类型
							        dataType: "json",//预期服务器返回的数据类型
							        url: "/EntrepreneurialCenter/Companies/getCompaniesById" ,//url
							        data: {id:$("input[name='table_records']:checked").val()},
							        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
							        success: function (result) {
							        	console.log(result);//打印服务端返回的数据(调试用)
							        	//alert(result);
							        	that.cominfo = result;
							        	var dd = eval('('+result.comDetail+')');
							        	//alert(dd)
							        	$("#d0").val(dd[0]);
							        	$("#d1").val(dd[1]);
							        	$("#d2").val(dd[2]);
							        	$("#d3").val(dd[3]);
							        	$("#d4").val(dd[4]);
							        	$("#d5").val(dd[5]);
							        	$("#d6").val(dd[6]);
							        	$("#d7").val(dd[7]);
							        	$("#d8").val(dd[8]);
							        	$("#d9").val(dd[9]);
							        	$("#d10").val(dd[10]);
							        	$("#d11").val(dd[11]);
							        	$("#d12").val(dd[12]);
							        	$("#d13").val(dd[13]);
							        	$("#d14").val(dd[14]);
							        	$("#d15").val(dd[15]);
							        	$("#d16").val(dd[16]);
							        	$("#d17").val(dd[17]);
							        }
							       	}); 
							}
							
				    	},
				    	eval:function(value){
				    		if (value=="undefined") {
								return;
							}
				    		return eval('('+value+')');	
				    	},
				    	submit:function(){
				    		var arrList = new Array();
				    		for (var i = 0; i < 18; i++) {
				    			arrList.push($("#d"+i).val());
							}
				    		$("#comDetail").val(JSON.stringify(arrList));
				    		//alert($("#comDetail").val());
				    		
				    		$.ajax({
								//几个参数需要注意一下
								type: "POST",//方法类型
								dataType: "json",//预期服务器返回的数据类型
								url: "/EntrepreneurialCenter/Companies/updateCompanies" ,//url
							    data: $('#formdate').serialize(),
							    contentType : "application/x-www-form-urlencoded; charset=UTF-8",
							    success: function (result) {
							        //alert(result);//打印服务端返回的数据(调试用)
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
		});
		
		var that = this.info;
		$(function(){
			$('#info_quit').click(function(){
				$('#C_info_mark').hide();  //隐藏弹窗
			})

			
			//alert(111);
			/* $.ajax({
				//几个参数需要注意一下
				type: "get",//方法类型
		        dataType: "json",//预期服务器返回的数据类型
		        url: "/EntrepreneurialCenter/Companies/getCompaniesInfo" ,//url
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
		       	});  */
		       	
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
		        	that.comind = result;
		        }
		       	}); 
			
			$.ajax({
				//几个参数需要注意一下
				type: "get",//方法类型
		        dataType: "json",//预期服务器返回的数据类型
		        url: "/EntrepreneurialCenter/ComTypes/getAllComTypesInfo" ,//url
		        //data: ,
		        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
		        success: function (result) {
		        	console.log(result);//打印服务端返回的数据(调试用)
		        	//alert(result);
		        	that.comtypes = result;
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
		        url: "/EntrepreneurialCenter/ComIdentify/getAllComIdentify" ,//url
		        //data: ,
		        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
		        success: function (result) {
		        	console.log(result);//打印服务端返回的数据(调试用)
		        	//alert(result);
		        	that.comide = result;
		        }
		       	}); 
			
			$.ajax({
				//几个参数需要注意一下
				type: "get",//方法类型
		        dataType: "json",//预期服务器返回的数据类型
		        url: "/EntrepreneurialCenter/ComModes/getAllComModesInfo" ,//url
		        //data: ,
		        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
		        success: function (result) {
		        	console.log(result);//打印服务端返回的数据(调试用)
		        	//alert(result);
		        	that.commode = result;
		        }
		       	}); 
			
		})
		</script>
	</body>

</html>