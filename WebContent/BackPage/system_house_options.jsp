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
								<h2>园区楼宇设置</h2>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<div class="form-group form-inline">
									<label class="lablemar">所属园区:
			            			    <select class="form-control" name="regionId" id="regionId" @change="getBui()">
			            			    	<option value="0" selected>不限</option>
									        <option v-for="prs in proRegByStatus" :value="prs.regionId">{{ prs.regionTitle }}</option>
									    </select>
			            			</label>
									<label class="lablemar">楼宇:
			            			    <select class="form-control">
									        <option>不限</option>
									        <option v-for="pb in proBuiList" :value="pb.buildingId">{{ pb.buildingTitle }}</option>
									    </select>
			            			</label>
									<label class="lablemar">状态:
			            			    <select class="form-control">
									        <option>不限</option>
									        <option>使用中</option>
									        <option>空闲</option>
									        <option>预定</option>
									    </select>
			            			</label>
									<label class="lablemar">类型:
			            			    <select class="form-control">
									        <option>不限</option>
									        <option>类型一</option>
									        <option>类型二</option>
									        <option>类型三</option>
									    </select>
			            			</label>
									<label class="lablemar">关键词:
			            			    <input type="text" class="form-control" />
			            			</label>
									<input type="button" class="btn btn-primary" value="查询" />
									<div class="pull-right">
										<button id="in_house_btn" type="button" class="btn btn-default">
										    <i class="fa fa-plus-circle"></i> 录入房屋信息
										</button>
										<button id="garden_op_btn" type="button" class="btn btn-default">
										    <i class="fa fa-plus-circle"></i> 园区设置
										</button>
										<button id="house_op_btn" type="button" class="btn btn-default">
										    <i class="fa fa-plus-circle"></i> 楼宇设置
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
											<th><input type="checkbox" id="check-all" class="flat"></th>
											<th>承租方</th>
											<th>所在园区</th>
											<th>楼宇</th>
											<th>房间号</th>
											<th>面积（㎡）</th>
											<th>房间状态</th>
											<th>承租时间</th>											
										</tr>
									</thead>
									<tbody>
										<tr>
											<td><input type="checkbox" class="flat" name="table_records"></td>
											<td>广西****有限公司</td>
											<td>信息产业园</td>
											<td>一号楼</td>
											<td>1-1#101</td>
											<td>150</td>
											<td>使用中</td>
											<td>2018-01-01至2019-01-01</td>										
										</tr>
										<tr>
											<td><input type="checkbox" class="flat" name="table_records"></td>
											<td>广西****有限公司</td>
											<td>信息产业园</td>
											<td>一号楼</td>
											<td>1-1#101</td>
											<td>150</td>
											<td>使用中</td>
											<td>2018-01-01至2019-01-01</td>										
										</tr>
										<tr>
											<td><input type="checkbox" class="flat" name="table_records"></td>
											<td>广西****有限公司</td>
											<td>信息产业园</td>
											<td>一号楼</td>
											<td>1-1#101</td>
											<td>150</td>
											<td>使用中</td>
											<td>2018-01-01至2019-01-01</td>										
										</tr>
										<tr>
											<td><input type="checkbox" class="flat" name="table_records"></td>
											<td>广西****有限公司</td>
											<td>信息产业园</td>
											<td>一号楼</td>
											<td>1-1#101</td>
											<td>150</td>
											<td>使用中</td>
											<td>2018-01-01至2019-01-01</td>										
										</tr>
										<tr>
											<td><input type="checkbox" class="flat" name="table_records"></td>
											<td>广西****有限公司</td>
											<td>信息产业园</td>
											<td>一号楼</td>
											<td>1-1#101</td>
											<td>150</td>
											<td>使用中</td>
											<td>2018-01-01至2019-01-01</td>										
										</tr>
										<tr>
											<td><input type="checkbox" class="flat" name="table_records"></td>
											<td>广西****有限公司</td>
											<td>信息产业园</td>
											<td>一号楼</td>
											<td>1-1#101</td>
											<td>150</td>
											<td>使用中</td>
											<td>2018-01-01至2019-01-01</td>										
										</tr>
										<tr>
											<td><input type="checkbox" class="flat" name="table_records"></td>
											<td>广西****有限公司</td>
											<td>信息产业园</td>
											<td>一号楼</td>
											<td>1-1#101</td>
											<td>150</td>
											<td>使用中</td>
											<td>2018-01-01至2019-01-01</td>										
										</tr>
										<tr>
											<td><input type="checkbox" class="flat" name="table_records"></td>
											<td>广西****有限公司</td>
											<td>信息产业园</td>
											<td>一号楼</td>
											<td>1-1#101</td>
											<td>150</td>
											<td>使用中</td>
											<td>2018-01-01至2019-01-01</td>										
										</tr>
										<tr>
											<td><input type="checkbox" class="flat" name="table_records"></td>
											<td>广西****有限公司</td>
											<td>信息产业园</td>
											<td>一号楼</td>
											<td>1-1#101</td>
											<td>150</td>
											<td>使用中</td>
											<td>2018-01-01至2019-01-01</td>										
										</tr>
										<tr>
											<td><input type="checkbox" class="flat" name="table_records"></td>
											<td>广西****有限公司</td>
											<td>信息产业园</td>
											<td>一号楼</td>
											<td>1-1#101</td>
											<td>150</td>
											<td>使用中</td>
											<td>2018-01-01至2019-01-01</td>										
										</tr>
										<tr>
											<td><input type="checkbox" class="flat" name="table_records"></td>
											<td>广西****有限公司</td>
											<td>信息产业园</td>
											<td>一号楼</td>
											<td>1-1#101</td>
											<td>150</td>
											<td>使用中</td>
											<td>2018-01-01至2019-01-01</td>										
										</tr>
										<tr>
											<td><input type="checkbox" class="flat" name="table_records"></td>
											<td>广西****有限公司</td>
											<td>信息产业园</td>
											<td>一号楼</td>
											<td>1-1#101</td>
											<td>150</td>
											<td>使用中</td>
											<td>2018-01-01至2019-01-01</td>										
										</tr>
										<tr>
											<td><input type="checkbox" class="flat" name="table_records"></td>
											<td>广西****有限公司</td>
											<td>信息产业园</td>
											<td>一号楼</td>
											<td>1-1#101</td>
											<td>150</td>
											<td>使用中</td>
											<td>2018-01-01至2019-01-01</td>										
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
				<!-- 内容结束结束 -->
				<!--弹窗设置-->
				<div id="mark_1" class="all-mark">
					<!--楼宇设置-->
					<div class="mark-house-op">
						<div class="mark-heading">
							<p>楼宇设置</p>
							<img class="del-img" title="关闭" src="img/del.png"/>
						</div>
						<div class="list-content">
							<ul>
								<li v-for="pbr in proBuiRegList">
									<div class="pull-left">
										<span>{{ pbr.buildingTitle }}</span>
										<i>-</i>
										<span>{{ pbr.regionTitle }}</span>
									</div>
									<div class="pull-right">
										<span @click="updateBui(pbr.buildingId,pbr.buildingTitle,pbr.regionId)">修改</span>
										<i>&#8901;</i>
										<span @click="delBui(pbr.buildingId)">删除</span>
									</div>
								</li>
							</ul>
						</div>
						<div class="d-other">
							<h5>添加楼宇</h5>
							<div class="d-thebtn form-inline">
								<lable>选择园区：</lable>
								<select class="form-control" name="buiRegionId" id="buiRegionId">
									<option selected value="0">--请选择--</option>
									<option v-for="prs in proRegByStatus" :value="prs.regionId">{{ prs.regionTitle }}</option>
								</select>&nbsp;&nbsp;&nbsp;
								<lable>楼宇名称：</lable>
								<input type="text" name="buildingTitle" id="buildingTitle" />
							</div>
							<div class="d-subm">
								<button class="btn btn-primary" @click="submitBui">提交保存</button>
							</div>
						</div>						
					</div>
					<!--园区设置-->
					<div class="mark-garden-op">
						<div class="mark-heading">
							<p>园区设置</p>
							<img class="del-img" title="关闭" src="img/del.png"/>
						</div>
						<div class="list-content">
							<ul>
								<li v-for="pr in proReg">
									<div class="pull-left">
										<span>{{ pr.regionTitle }}</span>
									</div>
									<div class="pull-right">
										<span @click="updateReg(pr.regionId,pr.regionTitle)">修改</span>
										<i>&#8901;</i>
										<span @click="delReg(pr.regionId)">删除</span>
									</div>
								</li>
							</ul>
						</div>
						<div class="d-other">
							<h5>添加园区</h5>
							<div class="d-thebtn form-inline">
								<lable>园区名称：</lable>
								<input type="text" name="regTitle" id="regTitle" />
							</div>
							<div class="d-subm">
								<button class="btn btn-primary" @click="submitReg">提交保存</button>
							</div>
						</div>						
					</div>
					<!--录入房屋信息-->
					<div class="mark-inhouse-op">
						<div class="mark-heading">
							<p>录入房屋信息</p>
							<img class="del-img" title="关闭" src="img/del.png"/>
						</div>
						<div class="list-content form-inline">
							<lable>所在园区：
								<select class="form-control" name="buil" id="buil" @change="submitGetBui">
									<option value="0">--请选择--</option>
									<option v-for="prs in proRegByStatus" :value="prs.regionId">{{ prs.regionTitle }}</option>
								</select>
							</lable>
							<lable>所在楼宇：
								<select class="form-control">
									<option>--请选择--</option>
									<option v-for="pbl in proBuilList" :value="pbl.buildingId">{{ pbl.buildingTitle }}</option>
								</select>
							</lable><br /><br />
							<lable>房间编号：
								<input type="text" class="form-control" />
							</lable>
							<lable>面积（㎡）：
								<input type="text" class="form-control" />
							</lable><br /><br />
							<lable>水表电表：
								<input type="text" class="form-control" />
							</lable>
							<lable>房屋状态：
								<select class="form-control">
									<option>--请选择--</option>
									<option>空闲</option>
									<option>已租</option>
									<option>已预约</option>
								</select>
							</lable>
							<h5>租赁信息（未出租房屋则留空）</h5>
							<lable>承租单位：
								<input type="text" class="form-control" />
							</lable>
							<lable>联系人：
								<input type="text" class="form-control" />
							</lable><br /><br />
							<lable>固定电话：
								<input type="text" class="form-control" />
							</lable>
							<lable>移动电话：
								<input type="text" class="form-control" />
							</lable><br /><br />
							<lable>传真号码：
								<input type="text" class="form-control" />
							</lable>
							<lable>电子邮箱：
								<input type="text" class="form-control" />
							</lable><br /><br />
							<lable>租用时间：
								<input type="date" class="form-control" />
							</lable>
							<lable>结束时间：
								<input type="date" class="form-control" />
							</lable><br /><br />
							<lable>信息备注：
								<textarea class="form-control" rows="3" style="width: 400px;"></textarea>
							</lable>
						</div>
						<div class="d-other">							
							<div class="d-subm">
								<button class="btn btn-primary">提交保存</button>
							</div>
						</div>						
					</div>
				</div>
				<!--楼宇设置修改-->
				<div id="mark_2" class="all-mark">					
					<div class="mark-LeaveWords-mag depm_op">
						<div class="mark-heading">
							<p>楼宇设置修改</p>
						</div>
						<div class="dpm_op_content form-inline">
							<lable>楼宇名称:</lable>
							<input id="bId" hidden="" />
							<input class="form-control" id="btitle" type="text" /><br /><br />
							<lable>隶属园区:</lable>
							<select class="form-control" id="reId" v-model="selectRegOption">
								<option selected value="0">--请选择--</option>
								<option v-for="prs in proRegByStatus" :value="prs.regionId">{{ prs.regionTitle }}</option>
							</select>
						</div>
						<div class="d-other">							
							<div class="d-subm">
								<button class="btn btn-primary" @click="updateBuiInfo">提交保存</button>
								<button id="quit_btn1" class="btn btn-primary">取消</button>
							</div>
						</div>	
					</div>
				</div>
				<!--园区设置修改-->
				<div id="mark_3" class="all-mark">					
					<div class="mark-LeaveWords-mag depm_op">
						<div class="mark-heading">
							<p>园区设置修改</p>
						</div>
						<div class="dpm_op_content form-inline">
							<lable>园区名称:</lable>
							<input name="regId" id="regId" hidden="" />
							<input class="form-control" name="rtitle" id="rtitle"  type="text" />
						</div>
						<div class="d-other">							
							<div class="d-subm">
								<button class="btn btn-primary" @click="updateRegInfo">提交保存</button>								
								<button id="quit_btn2" class="btn btn-primary">取消</button>
							</div>
						</div>	
					</div>
				</div>
				</div>
				<!--弹窗结束-->
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
					proReg:[],
					proRegByStatus:[],
					proBuiRegList:[],
					proBuiList:[],
					proBuilList:[],
					selectRegOption:{},
				},
				 methods: {
					 submitBui:function(){
						 var buiRegionId = $("#buiRegionId").val();
						 var buildingTitle = $("#buildingTitle").val();
						 if (buiRegionId==0) {
							alert("请选择园区。");
						}else if ($.trim(buildingTitle).length==0) {
							alert("请填写楼宇名称。");
						}else{
						 	//alert(buiRegionId+buildingTitle);
							$.ajax({
								//几个参数需要注意一下
								type: "POST",//方法类型
						        dataType: "json",//预期服务器返回的数据类型
						        url: "/EntrepreneurialCenter/ProBuildings/addProBuildings" ,//url
						        data: {"regionId":buiRegionId,"buildingTitle":buildingTitle},
						        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
						        success: function (result) {
						        	console.log(result);//打印服务端返回的数据(调试用)
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
					 delBui:function(id){
						 if(confirm("确定要删除所选项目？删除后不可恢复。")) { 
							 $.ajax({
								//几个参数需要注意一下
								type: "POST",//方法类型
								dataType: "json",//预期服务器返回的数据类型
								url: "/EntrepreneurialCenter/ProBuildings/delProBuildings" ,//url
								data: {"id":id},
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
					 submitReg:function(){
						 var regTitle = $("#regTitle").val();
						 if ($.trim(regTitle).length==0) {
							alert("请填写园区名称。");
						}else{
							if(confirm("确定要新增园区？")) { 
								//alert(regTitle);
								$.ajax({
									//几个参数需要注意一下
									type: "POST",//方法类型
							        dataType: "json",//预期服务器返回的数据类型
							        url: "/EntrepreneurialCenter/ProRegions/addProRegions" ,//url
							        data: {"regionTitle":regTitle},
							        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
							        success: function (result) {
							        	console.log(result);//打印服务端返回的数据(调试用)
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
						}
					 },
					 delReg:function(id){
						 if(confirm("确定要删除所选项目？删除后不可恢复。")) { 
							 //alert(id);
							 $.ajax({
									//几个参数需要注意一下
									type: "POST",//方法类型
									dataType: "json",//预期服务器返回的数据类型
									url: "/EntrepreneurialCenter/ProRegions/delProRegions" ,//url
									data: {"id":id},
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
					 getBui:function(){
						 var id = $('#regionId  option:selected').val();
						 //alert(id);
						 if (id!=0) {
							 $.ajax({
									//几个参数需要注意一下
									type: "get",//方法类型
							        dataType: "json",//预期服务器返回的数据类型
							        url: "/EntrepreneurialCenter/ProBuildings/getBuiByReg" ,//url
							        data: {"id":id},
							        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
							        success: function (result) {
							        	console.log(result);//打印服务端返回的数据(调试用)
							        	//alert(result);
							        	that.proBuiList = result;
							        },
							        error : function() {
							        	alert("异常！");
							        	}
							       	}); 
						}else{
							that.proBuiList = "";
						}
					 },
					 submitGetBui:function(){
						 var id = $('#buil  option:selected').val();
						 //alert(id);
						 if (id!=0) {
							 $.ajax({
									//几个参数需要注意一下
									type: "get",//方法类型
							        dataType: "json",//预期服务器返回的数据类型
							        url: "/EntrepreneurialCenter/ProBuildings/getBuiByReg" ,//url
							        data: {"id":id},
							        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
							        success: function (result) {
							        	console.log(result);//打印服务端返回的数据(调试用)
							        	//alert(result);
							        	that.proBuilList = result;
							        },
							        error : function() {
							        	alert("异常！");
							        	}
							       	}); 
						}else{
							that.proBuilList = "";
						}
					 },
					 updateBui:function(bid,btitle,rid){
						 $('#mark_2').show();
						 $('#bId').val(bid);
						 $('#btitle').val(btitle);
						 info.selectRegOption = rid;
					 },
					 updateReg:function(id,title){
						 $('#mark_3').show();
						 $('#regId').val(id);
						 $('#rtitle').val(title);
					 },
					 updateRegInfo:function(){
						 //alert(1)
						 var regId = $('#regId').val();
						 var rtitle = $('#rtitle').val();
						 //alert(regId+rtitle);
						 if (confirm("是否更新信息？")) {
							 $.ajax({
								//几个参数需要注意一下
								type: "POST",//方法类型
								dataType: "json",//预期服务器返回的数据类型
								url: "/EntrepreneurialCenter/ProRegions/updateProRegions" ,//url
								data: {"regionId":regId,"regionTitle":rtitle},
								contentType : "application/x-www-form-urlencoded; charset=UTF-8",
								success: function (result) {
									//alert(result.data);//打印服务端返回的数据(调试用)
									if (result.status == 200) {
										alert("更新成功。");
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
					 updateBuiInfo:function(){
						 //alert(2)
						 var bId = $('#bId').val();
						 var btitle = $('#btitle').val();
						 var reId = $('#reId').val();
						 //alert(bId+btitle+reId);
						 if ($.trim(btitle).length==0) {
							alert("楼宇名称不能为空。");
						}else if (confirm("是否更新信息？")) {
							$.ajax({
								//几个参数需要注意一下
								type: "POST",//方法类型
								dataType: "json",//预期服务器返回的数据类型
								url: "/EntrepreneurialCenter/ProBuildings/updateProBuildings" ,//url
								data: {"buildingId":bId,"buildingTitle":btitle,"regionId":reId},
								contentType : "application/x-www-form-urlencoded; charset=UTF-8",
								success: function (result) {
									//alert(result.data);//打印服务端返回的数据(调试用)
									if (result.status == 200) {
										alert("更新成功。");
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
				//楼宇设置弹窗
				$('#house_op_btn').click(function(){ //楼宇设置按钮
					$('#mark_1').show();
					$('.mark-house-op').show();
				});
				$('#garden_op_btn').click(function(){ //园区设置按钮
					$('#mark_1').show();
					$('.mark-garden-op').show();
				});				
				$('#in_house_btn').click(function(){ //录入房屋信息按钮
					$('#mark_1').show();
					$('.mark-inhouse-op').show();
				});
				$('.del-img').click(function(){  //窗口关闭图标按钮
					$('#mark_1').hide();
					$('.mark-house-op').hide();
					$('.mark-garden-op').hide();
					$('.mark-inhouse-op').hide();
				});	
				$('#quit_btn1').click(function(){  //关闭窗口
					$('#mark_2').hide();
				})
				$('#quit_btn2').click(function(){   //关闭窗口
					$('#mark_3').hide();
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
			        	that.proReg = result;
			        }
			       	}); 
				$.ajax({
					//几个参数需要注意一下
					type: "get",//方法类型
			        dataType: "json",//预期服务器返回的数据类型
			        url: "/EntrepreneurialCenter/ProRegions/getProRegionsInfoByStatus" ,//url
			        //data: ,
			        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			        success: function (result) {
			        	console.log(result);//打印服务端返回的数据(调试用)
			        	//alert(result);
			        	that.proRegByStatus = result;
			        }
			       	}); 
				$.ajax({
					//几个参数需要注意一下
					type: "get",//方法类型
			        dataType: "json",//预期服务器返回的数据类型
			        url: "/EntrepreneurialCenter/ProBuildings/getProBuiReg" ,//url
			        //data: ,
			        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			        success: function (result) {
			        	console.log(result);//打印服务端返回的数据(调试用)
			        	//alert(result);
			        	that.proBuiRegList = result;
			        }
			       	}); 
			})
		</script>
	</body>

</html>