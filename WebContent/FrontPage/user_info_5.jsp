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
						<li><a href="${pageContext.request.contextPath}/FrontPage/user_info_4.jsp">变更申请</a></li>
						<li><a class="active2" href="${pageContext.request.contextPath}/FrontPage/user_info_5.jsp">维修申请</a></li>
						<li><a href="${pageContext.request.contextPath}/FrontPage/user_info_6.jsp">联系我们</a></li>
					</ul>
				</div>
				<div class="right-box">
					<div>
						<table class="table table-striped table-hover table-bordered">
							<thead>
								<tr>
									<th>报修企业</th>
									<th>所属园区</th>
									<th>房间号</th>
									<th>联系方式</th>
									<th>报修时间</th>
									<th>状态</th>
									<th>所属类别</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<td>广西****有限公司</td>
								<td>信息产业园</td>
								<td>1-1*101</td>
								<td>13000000000</td>
								<td>2018-07-13</td>
								<td>未分配</td>
								<td>门窗损坏</td>
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
		<div id="hs_mk" class="all-mark">
			<div class="mark-house-op acc_op">
				<div class="mark-heading">
					<p>报修管理</p>
					<img id="hs_quit" class="del-img" title="关闭" src="${pageContext.request.contextPath}/FrontPage/img/del.png"/>
				</div>
				<div class="dpm_op_content form-inline">
					<lable>企业名称：</lable>
					<input class="form-control owidth" type="text" /><br /><br />
					<lable>联系电话：</lable>
					<input class="form-control owidth" type="text" /><br /><br />
					<lable>房间号码：</lable>
					<input class="form-control owidth" type="text" /><br /><br />
					<lable>所属园区：</lable>
					<input class="form-control owidth" type="text" /><br /><br />
					<lable>报修说明：</lable>
					<textarea class="form-control owidth" name="" rows="5" cols=""></textarea>
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
				$('#edit').click(function(){  //弹窗
					$('#hs_mk').show();
				});
				$('#hs_quit').click(function(){  //弹窗关闭
					$('#hs_mk').hide();
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
