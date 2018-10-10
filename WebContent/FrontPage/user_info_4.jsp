<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<!--<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />-->
		<title>基础资料</title>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/FrontPage/img/index/logo.png"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/bootstrap.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/user_info.css"/>
	</head>
	<body>
		<!--顶部菜单栏-->
		<nav class="nav">
		    <span class="s-logo">
		    	<img src="${pageContext.request.contextPath}/FrontPage/img/index/logo.png"/>
		    </span>
		    <div class="caidan show-xs">
		    	<img src="${pageContext.request.contextPath}/FrontPage/img/caidan.png"/>
		    </div>
	    	<ul>
		    	<li><a href="${pageContext.request.contextPath}/FrontPage/index.jsp">首页</a></li>
		    	<li><a href="${pageContext.request.contextPath}/FrontPage/attract_list.jsp">招商信息</a></li>
		    	<li><a href="${pageContext.request.contextPath}/FrontPage/garden_points.jsp">园区概况</a></li>
		    	<li><a href="${pageContext.request.contextPath}/FrontPage/garden_message.jsp">园区资讯</a></li>
		    	<li><a href="${pageContext.request.contextPath}/FrontPage/Settled_company.jsp">入驻企业</a></li>
		    	<%-- <li><a href="${pageContext.request.contextPath}/FrontPage/contact_us.jsp">联系我们</a></li> --%>
		    	<li class="login_li" style="display: none;">
		    		<a id="login_l1" href="${pageContext.request.contextPath}/FrontPage/login.jsp">登录</a>
		    		<a id="login_l2" href="${pageContext.request.contextPath}/FrontPage/user_info_1.jsp">企业中心</a>
		    	</li>
	    	</ul>
		   <span class="r-span r-s1 hide-xs">
		   		<a href="">		   			
			    	<img src="${pageContext.request.contextPath}/FrontPage/img/index/footer-smallphone.png"/>
			    	<i>全国热线电话</i><br />
			    	<i>400-0000-0000</i>
		   		</a>
		    </span>
		    <span class="r-span hide-xs">
		    	<a href="">		    		
			    	<img src="${pageContext.request.contextPath}/FrontPage/img/index/222222.png"/>
			    	<i>24小时客户</i><br />
			    	<i>立即咨询</i>
		    	</a>
		    </span>
		    <span class="login_in">
		    	<img src="${pageContext.request.contextPath}/FrontPage/img/index/zhanghao_icon.png"/>
		    	<a class="login_before" id="login_a1" href="${pageContext.request.contextPath}/FrontPage/login.jsp">登录</a>
		    	<a class="login_after" style="display: none;" id="login_a2" href="${pageContext.request.contextPath}/FrontPage/user_info_1.jsp">企业中心</a>
		    </span>
		</nav>
		<!--内容区-->
		<div class="content">
			<div class="news-obox">				
			<p class="navig">首页&nbsp;>&nbsp;个人信息</p>
				<div class="left-box">
					<ul>
						<li><a href="${pageContext.request.contextPath}/FrontPage/user_info_1.jsp">基本资料</a></li>
						<li><a href="${pageContext.request.contextPath}/FrontPage/user_info_2.jsp">入园申请</a></li>
						<li><a href="${pageContext.request.contextPath}/FrontPage/user_info_3.jsp">退园申请</a></li>
						<li><a class="active2" href="${pageContext.request.contextPath}/FrontPage/user_info_4.jsp">变更申请</a></li>
						<li><a href="${pageContext.request.contextPath}/FrontPage/user_info_5.jsp">维修申请</a></li>
						<li><a href="${pageContext.request.contextPath}/FrontPage/user_info_6.jsp">联系我们</a></li>
					</ul>
				</div>
				<div class="right-box">
					<div>
						<table class="table table-striped table-hover table-bordered">
							<thead>
								<tr>
									<th>公司名称</th>
									<th>申请时间</th>
									<th>发起人</th>
									<th>审核状态</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<td>广西****有限公司</td>
								<td>2011/04/25</td>
								<td>24k纯帅</td>
								<td>审核中</td>
								<td>
									<button type="button" class="btn btn-default btn-xs">详情</button>
									<button id="edit" type="button" class="btn btn-info btn-xs">编辑</button>
									<button type="button" class="btn btn-danger btn-xs">删除</button>
								</td>
							</tbody>
						</table>
					</div>					
				</div>
			</div>
		</div>
		<!--弹窗-->
		<div id="CP_apply_add" class="all-mark">
			<div class="mark-house-op Capply_add_mk">
				<div class="mark-heading">
					<p>企业拓展新增</p>
					<img id="Caex_quit" class="del-img" title="关闭" src="${pageContext.request.contextPath}/FrontPage/img/del.png"/>
				</div>
				<div class="input_all form-inline">
					<span>
						<lable>企业名称:</lable>
						<input class="form-control" type="text" />
					</span>
					<span>
						<lable>现所在园区:</lable>
						<input class="form-control" type="text" />
					</span>
					<span>
						<lable>现所在房间:</lable>
						<input class="form-control" type="text" />
					</span>
				</div>
				<div class="input_all form-inline">
					<span>
						<lable>现使用面积:</lable>
						<input class="form-control" type="text" placeholder="㎡" />
					</span>
					<span>
						<lable>申请时间:</lable>
						<input class="form-control" type="date" />
					</span>
					<span>
						<lable>申请拓展面积:</lable>
						<input class="form-control" type="text" placeholder="㎡" />								
					</span>							
				</div>						
				<div class="input_all form-inline" style="padding-left: 15px;">
					<lable>知识产权:</lable>&nbsp;&nbsp;
					<input type="checkbox" name="" id="" value="option1">&nbsp;发明专利&nbsp;&nbsp;
					<input type="checkbox" name="" id="" value="option2">&nbsp;实用新型专利&nbsp;&nbsp;
					<input type="checkbox" name="" id="" value="option3">&nbsp;外观设计专利&nbsp;&nbsp;
					<input type="checkbox" name="" id="" value="option4">&nbsp;软件著作权&nbsp;&nbsp;
					<input type="checkbox" name="" id="" value="option5">&nbsp;其他
				</div>
				<div class="input_all form-inline">
					<span>
						<lable>技术领域:</lable>
						<select class="form-control">
							<option>--选择--</option>
							<option>1111</option>
							<option>1111</option>
						</select>
					</span>
					<span>
						<lable>注册地址:  </lable>
						<input class="form-control" type="text"/>
					</span>	
					<span>
						<lable>公司成立时间:</lable>
						<input class="form-control" type="date" />
					</span>													
				</div>
				<div class="input_all form-inline">
					<span>
						<lable>法人代表:</lable>
						<input class="form-control" type="text" />
					</span>	
					<span>
						<lable>手机号码:</lable>
						<input class="form-control" type="text" />
					</span>
					<span>
						<lable>电子邮箱:</lable>
						<input class="form-control" type="text"  />
					</span>
										
				</div>
				<div class="input_all form-inline">
					<span>
						<lable>联系人:</lable>
						<input class="form-control" type="text" />
					</span>
					<span>
						<lable>手机号码:</lable>
						<input class="form-control" type="text" />
					</span>
					<span>
						<lable>传真/电话:</lable>
						<input class="form-control" type="text"/>
					</span>						
				</div>
				<div class="input_all form-inline">
					<span>
						<lable>电子邮箱:</lable>
						<input class="form-control" type="text" />
					</span>
					<span>
						<lable>去年销售额:</lable>
						<input class="form-control" type="text" />
					</span>
					<span>
						<lable>去年纳税额:</lable>
						<input class="form-control" type="text"/>
					</span>						
				</div>
				<div class="input_all form-inline">
					<span>
						<lable>注册资本:</lable>
						<input class="form-control" type="text" placeholder="万元" />
					</span>
					<span>
						<lable>年初至今销售额:</lable>
						<input class="form-control" type="text" />
					</span>
					<span>
						<lable>年初至今纳税额:</lable>
						<input class="form-control" type="text"/>
					</span>						
				</div>
				<div class="input_all form-inline">
					<span>
						<lable>公司现总人数:</lable>
						<input class="form-control" type="text" placeholder="人" />
					</span>
					<span>
						<lable>博士/硕士:</lable>
						<input class="form-control" type="text" placeholder="万元" />
					</span>
					<span>
						<lable>本科/留学人员:</lable>
						<input class="form-control" type="text"/>
					</span>						
				</div>
				<div class="input_all form-inline" style="padding-left: 15px;">
					<lable>公司主要产品:</lable>
					<textarea class="form-control Capply_add_textarea" name="" rows="" cols="" ></textarea>
				</div>
				<div class="input_all form-inline" style="padding-left: 15px;">
					<lable>企业基本情况:</lable>
					<textarea class="form-control Capply_add_textarea" name="" rows="" cols="" ></textarea>
				</div>
				<div class="input_all form-inline" style="padding-left: 15px;">
					<lable>目前经营情况:</lable>
					<textarea class="form-control Capply_add_textarea" name="" rows="" cols="" ></textarea>
				</div>
				<div class="input_all form-inline" style="padding-left: 15px;">
					<lable>场地申请说明:</lable>
					<textarea class="form-control Capply_add_textarea" name="" rows="" cols="" ></textarea>
				</div>
				<div class="d-other">							
					<div class="d-subm">
						<button class="btn btn-primary">提交保存</button>
					</div>
				</div>	
			</div>
		</div>
		<!--弹窗结束-->
		<!--返回头部按钮-->
		<div class="backTop">
			<img src="${pageContext.request.contextPath}/FrontPage/img/index/backTop.png"/>
		</div>
		<!--底部-->
		<div class="footer">
			<div class="f-left">
				<p>xxxxxxxx公众号</p>
				<div class="d-img">
					<img src=""/>
				</div>
			</div>
			<div class="f-right">
				<img class="hide-xs" src="${pageContext.request.contextPath}/FrontPage/img/index/footer-smallphone.png"/>
				<h2>客服电话: 400-0000-0000</h2>
				<p>公司邮编: 0000-0000-0000</p>
				<p>服务时间: 9:00-17:00 ( 周一至周五 )</p>
				<p>公司邮箱: xxxx@193.com</p>
				<p>公司地址: 广西桂林市七星区******</p>
			</div>
		</div>
		
		
		<script src="${pageContext.request.contextPath}/FrontPage/js/jquery-3.3.1.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath}/FrontPage/js/common.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/vue.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/general.js"></script>		
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/operatcookie.js"></script>	
		<script type="text/javascript">
			$(function(){
				$('#edit').click(function(){  //新增
					$('#CP_apply_add').show();
				});
				$('#Caex_quit').click(function(){  //新增窗口关闭
					$('#CP_apply_add').hide();
				})
				
				var frontName = decodeURI(cookie.get("frontName"));
				var frontPhone = decodeURI(cookie.get("frontPhone"));
				var frontId = decodeURI(cookie.get("frontId"));
				if(frontName=="undefined"&&frontPhone=="undefined"&&frontId=="undefined"){
					location.href = "index.jsp";
					$("#login_a1").show();
					$("#login_l1").show();
					$("#login_a2").hide();
					$("#login_l2").hide();
				}
			})
		</script>
	</body>
</html>
