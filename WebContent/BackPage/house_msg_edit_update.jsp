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
				<div class="right_col" role="main" id="record">

					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel">
							<div class="x_title">
								<h2><span>物房屋信息编辑  ></span> <span id="upName">信息修改</span></h2>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<div class="oBox">
								<form id="formdate" method="post">
									<div class="o-input-box">
										<div class="input-left">关键字：</div>
										<div class="input-right">
											<input type="hidden" id="attractId" name="attractId" v-model="info.attractId" />
											<input class="form-control" type="text" id="attractName" name="attractName" v-model="info.attractName" />
											<span class="s-hint">（20字符以内） </span>
										</div>
									</div>									
									<div class="o-input-box">
										<div class="input-left">状况描述：</div>
										<div class="input-right text-hight">
											<textarea class="form-control" rows="5" id="attractContent" name="attractContent" v-model="info.attractContent"></textarea>
											<span class="s-hint">（30字符以内） </span>
										</div>
									</div>
									<div class="o-input-box">
										<div class="input-left">地址：</div>
										<div class="input-right">
											<input class="form-control" type="text" id="attractAddress" name="attractAddress" v-model="info.attractAddress" />
										</div>
									</div>
									<div class="o-input-box">
										<div class="input-left">交通：</div>
										<div class="input-right">
											<input class="form-control" type="text" id="attractTraffic" name="attractTraffic" v-model="info.attractTraffic" />
										</div>
									</div>
									<div class="o-input-box">
										<div class="input-left">所属园区：</div>
										<div class="input-right">
											<select class="form-control" id="attractGarden" name="attractGarden" v-model="info.attractGarden">
												<option value="undefined">---请选择---</option>
												<option v-for="reg in proregions" :value="reg.regionTitle">{{ reg.regionTitle }}</option>								        
										    </select>
										</div>
									</div>
									<div class="o-input-box">
										<div class="input-left">建筑面积：</div>
										<div class="input-right">
											<input class="form-control" type="text" id="attractArea" name="attractArea" v-model="info.attractArea" />
											<span class="s-hint">㎡</span>
										</div>
									</div>
									<div class="o-input-box">
										<div class="input-left">可容纳工位：</div>
										<div class="input-right">
											<input class="form-control" type="text" id="attractStation" name="attractStation" v-model="info.attractStation" />
										</div>
									</div>
									<div class="o-input-box">
										<div class="input-left">装修：</div>
										<div class="input-right">
											<input class="form-control" type="text" id="attractDecoration" name="attractDecoration" v-model="info.attractDecoration" />
										</div>
									</div>
									<div class="o-input-box">
										<div class="input-left">使用率：</div>
										<div class="input-right">
											<input class="form-control" type="text" id="attractRate" name="attractRate" v-model="info.attractRate" />
										</div>
									</div>
									<div class="o-input-box">
										<div class="input-left">免租期：</div>
										<div class="input-right">
											<input class="form-control" type="text" id="attractRentfree" name="attractRentfree" v-model="info.attractRentfree" />
										</div>
									</div>
									<!-- <div class="o-input-box">
										<div class="input-left">楼层：</div>
										<div class="input-right">
											<input class="form-control" type="text" />
										</div>
									</div>
									<div class="o-input-box">
										<div class="input-left">户型介绍：</div>
										<div class="input-right text-hight">
											<textarea class="form-control" rows="5"></textarea>
										</div>
									</div>
									<div class="o-input-box">
										<div class="input-left">免租期：</div>
										<div class="input-right">
											<input class="form-control" type="text" />
										</div>
									</div>
									<div class="o-input-box">
										<div class="input-left">电梯：</div>
										<div class="input-right">
											<select class="form-control">
												<option>---请选择---</option>
										        <option>有</option>
										        <option>无</option>										        
										    </select>
										</div>
									</div> -->
									<div class="o-input-box">
										<div class="input-left">状态：</div>
										<div class="input-right">
											<select class="form-control" id="attractStatus" name="attractStatus" v-model="info.attractStatus" >
												<option value="undefined">---请选择---</option>
										        <option value="1">显示</option>
										        <option value="2">隐藏</option>										        
										    </select>
										</div>
									</div>
									<div class="o-input-box">
										<div class="input-left">联系电话：</div>
										<div class="input-right">
											<input class="form-control" type="text" id="attractPhone" name="attractPhone" v-model="info.attractPhone" />
										</div>
									</div>
									<div class="o-input-box">
										<div class="input-left">图片设置：</div>
										<div class="input-right outo-hight">
											<span class="img-span" title="缩略图"></span>
											<span class="img-span" title="缩略图"></span>
											<span class="img-span" title="缩略图"></span>
											<span class="img-span" title="缩略图"></span>
											<span class="img-span" title="缩略图"></span>
											<span class="img-span" title="缩略图"></span>
											<span class="img-span" title="缩略图"></span>
											<span class="img-span" title="缩略图"></span>
											<div class="d-file">
												<input class="fil" id="file1" type="file" value="" />
												<span class="s-up">选择上传</span>
												<span class="s-hint">（最多8张，建议像素>392*286）</span>
											</div>																		
										</div>
									</div>
									</form>
									<div class="obtn">
										<button @click="submit()">确认保存</button>
										<button @click="rollback()">取消返回</button>
									</div>
								</div>
								
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
		<script type="text/javascript" src="${pageContext.request.contextPath}/BackPage/js/vue.js"></script>
		<script type="text/javascript">
		var info = new Vue({
			el:"#record",
			data:{
				proregions:[],
				info:[],
			},
			 methods: {
				 rollback:function(){
					 location.href="${pageContext.request.contextPath}/BackPage/house_msg_edit.jsp";
				 },
				 submit:function(){
					 var arrtId = decodeURI(cookie.get("arrtId"));
					 
					 	var attractName = $("#attractName").val();
						var attractContent = $("#attractContent").val();
						var attractAddress = $("#attractAddress").val();
						var attractTraffic = $("#attractTraffic").val();
						var attractGarden = $("#attractGarden").val();
						var attractArea = $("#attractArea").val();
						var attractStation = $("#attractStation").val();
						var attractDecoration = $("#attractDecoration").val();
						var attractRate = $("#attractRate").val();
						var attractRentfree = $("#attractRentfree").val();
						var attractStatus = $("#attractStatus").val();
						var attractPhone = $("#attractPhone").val();
						
						//手机号码验证的正则表达式
						var regPhone = /^1[34578]\d{9}$/;
						
						if ($.trim(attractName&&attractContent&&attractAddress&&attractTraffic&&attractArea&&attractStation&&attractDecoration
								&&attractRate&&attractRentfree&&attractPhone).length == 0) {
							alert("请填写完整表单。");
						}else if(!regPhone.test(attractPhone)){
							alert("请填写正确的手机号码。");
						}else if (attractGarden=="undefined"&&attractStatus=="undefined") {
							alert("请选择所属园区或状态。");
						}else {
							if (arrtId=="undefined") {
								//alert($('#formdate').serialize());
						
								//alert("新增提交.");
								$.ajax({
									//几个参数需要注意一下
									type: "get",//方法类型
								    dataType: "json",//预期服务器返回的数据类型
								    url: "/EntrepreneurialCenter/Attract/addAttract" ,//url
								    data: $('#formdate').serialize(),
								    contentType : "application/x-www-form-urlencoded; charset=UTF-8",
								    success: function (result) {
									    console.log(result);//打印服务端返回的数据(调试用)
									    if (result.status == 200) {
								        	alert("新增成功。");
								        	location.reload();
								       	}else{
								       		alert(result.msg);
								       	};
								    }
								});
							}else{
							//alert("修改提交。");
							$.ajax({
								//几个参数需要注意一下
								type: "POST",//方法类型
								dataType: "json",//预期服务器返回的数据类型
								url: "/EntrepreneurialCenter/Attract/updateAttract" ,//url
								data: $('#formdate').serialize(),
								contentType : "application/x-www-form-urlencoded; charset=UTF-8",
								success: function (result) {
									//alert(result.data);//打印服务端返回的数据(调试用)
									if (result.status == 200) {
									    alert("修改成功。");
									    location.href="${pageContext.request.contextPath}/BackPage/house_msg_edit.jsp"
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
			 }
		})
		
		var that = this.info;
		$(function(){
			var arrtId = decodeURI(cookie.get("arrtId"));
			//alert(arrtId);
			if (arrtId=="undefined") {
				$("#upName").html("信息新增");
			}else{
				$.ajax({
					//几个参数需要注意一下
					type: "get",//方法类型
				    dataType: "json",//预期服务器返回的数据类型
				    url: "/EntrepreneurialCenter/Attract/getAttractById" ,//url
				    data: {id:arrtId},
				    contentType : "application/x-www-form-urlencoded; charset=UTF-8",
				    success: function (result) {
					    console.log(result);//打印服务端返回的数据(调试用)
					    //alert(result);
					    that.info = result;
				    }
				}); 
			}
			
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