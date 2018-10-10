<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<!--<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />-->
		<title>个人信息</title>
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
		<div id="record">
		<div class="content">
			<div class="news-obox">				
			<p class="navig">首页&nbsp;>&nbsp;个人信息</p>
				<div class="left-box">
					<ul>
						<li><a href="${pageContext.request.contextPath}/FrontPage/user_info_1.jsp">基本资料</a></li>
						<li><a class="active2" href="${pageContext.request.contextPath}/FrontPage/user_info_2.jsp">入园申请</a></li>
						<li><a href="${pageContext.request.contextPath}/FrontPage/user_info_3.jsp">退园申请</a></li>
						<li><a href="${pageContext.request.contextPath}/FrontPage/user_info_4.jsp">变更申请</a></li>
						<li><a href="${pageContext.request.contextPath}/FrontPage/user_info_5.jsp">维修申请</a></li>
						<li><a href="${pageContext.request.contextPath}/FrontPage/user_info_6.jsp">联系我们</a></li>
					</ul>
				</div>
				<div class="right-box">
					<div class="">
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
								<tr v-for="info in infoList">
									<td>{{ info.gardenCompany }}</td>
									<td>{{ formatDate(info.gardenCreate) }}</td>
									<td>{{ info.gardenLinkname }}</td>
									<td>
										<span v-if="info.gardenCheck==0">审核中</span>
										<span v-if="info.gardenCheck==1">审核通过</span>
										<span v-if="info.gardenCheck==2">审核未通过</span>
									</td>
									<td>
										<button type="button" class="btn btn-default btn-xs">详情</button>
										<button id="edit" type="button" class="btn btn-info btn-xs">编辑</button>									
										<button type="button" class="btn btn-danger btn-xs">删除</button>
									</td>
								</tr>
							</tbody>
						</table>
					</div>					
				</div>
			</div>
		</div>
				<!--弹窗-->
		<div id="in_garden_add" class="all-mark">
			<div class="mark-house-op Capply_add_mk">
				<div class="mark-heading">
					<p>入园申请添加</p>
					<img id="ing_quit" class="del-img" title="关闭" src="${pageContext.request.contextPath}/FrontPage/img/del.png"/>
				</div>
				<div class="input_all form-inline">
					<span>
						<lable>企业名称:</lable>
						<input class="form-control" type="text" />
					</span>
					<span>
						<lable>注册情况:</lable>
						<input class="form-control" type="text" />
					</span>
					<span>
						<lable>申请时间:</lable>
						<input class="form-control" type="date" />
					</span>
				</div>
				<div class="input_all form-inline">
					<span>
						<lable>申办面积:</lable>
						<input class="form-control" type="text" placeholder="㎡" />
					</span>
					<span>
						<lable>技术领域:</lable>
						<select class="form-control">
							<option>--请选择--</option>
							<option>电子信息</option>
							<option>IT互联网</option>
						</select>
					</span>
					<span>
						<lable>公司法人:</lable>
						<input class="form-control" type="text" />								
					</span>							
				</div>
				<div class="input_all form-inline">
					<span>
						<lable>联系电话:</lable>
						<input class="form-control" type="text" />	
					</span>
					<span>
						<lable>注册资本:</lable>
						<input class="form-control" type="date" />
					</span>
					<span>
						<lable>注册地址:</lable>
						<input class="form-control" type="text" />
					</span>							
				</div>
				<div class="input_all form-inline" style="padding-left: 15px;">
				    &nbsp;&nbsp;&nbsp;<lable>知识产权:</lable>&nbsp;&nbsp;
					<input type="checkbox" name="" id="" value="option1">&nbsp;发明专利&nbsp;&nbsp;
					<input type="checkbox" name="" id="" value="option2">&nbsp;实用新型专利&nbsp;&nbsp;
					<input type="checkbox" name="" id="" value="option3">&nbsp;外观设计专利&nbsp;&nbsp;
					<input type="checkbox" name="" id="" value="option4">&nbsp;软件著作权&nbsp;&nbsp;
					<input type="checkbox" name="" id="" value="option5">&nbsp;其他
				</div>
				<div class="input_all form-inline">
					<span>
						<lable>工商注册:</lable>
						<select class="form-control">
							<option>--请选择--</option>
							<option>已注册</option>
							<option>未注册</option>
						</select>
					</span>
					<span>
						<lable>公司成立时间:</lable>
						<input class="form-control" type="date" />
					</span>
					<span>
						<lable>年销售额:  </lable>
						<input class="form-control" type="text"/>
					</span>						
				</div>
				<div class="input_all form-inline">
					<span>
						<lable>年纳税额:</lable>
						<input class="form-control" type="text" />
					</span>
					<span>
						<lable>联系人姓名:</lable>
						<input class="form-control" type="text" />
					</span>
					<span>
						<lable>手机号码:</lable>
						<input class="form-control" type="text"/>
					</span>						
				</div>
				<div class="input_all form-inline">
					<span>
						<lable>传真电话:</lable>
						<input class="form-control" type="text" />
					</span>
					<span>
						<lable>电子邮箱:</lable>
						<input class="form-control" type="text" />
					</span>
					<span>
						<lable>现有总人数:</lable>
						<input class="form-control" type="text"/>
					</span>						
				</div>
				<div class="input_all form-inline">
					<span>
						<lable>博士/硕士:</lable>
						<input class="form-control" type="text" placeholder="万元" />
					</span>
					<span>
						<lable>本科/留学人员:</lable>
						<input class="form-control" type="text" />
					</span>												
				</div>						
				<div class="input_all form-inline" style="padding-left: 15px;">
					<lable>公司的主要产品:</lable>
					<textarea class="form-control Capply_add_textarea" name="" rows="" cols="" ></textarea>
				</div>
				<div class="input_all form-inline" style="padding-left: 15px;">
					<lable>代表人主要经历:</lable>
					<textarea class="form-control Capply_add_textarea" name="" rows="" cols="" ></textarea>
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
				<div class="d-other">							
					<div class="d-subm">
						<button class="btn btn-primary">提交保存</button>
					</div>
				</div>	
			</div>
		</div>
		<!--弹窗结束-->
		</div>
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
		var info = new Vue({
			el:"#record",
			data:{
				infoList:[],
				},
				 methods: {
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
				 }
		})
		
		var that = this.info;
			$(function(){
				$('#edit').click(function(){  //入园添加弹窗
					$('#in_garden_add').show();
				});
				$('#ing_quit').click(function(){  //入园添加弹窗关闭
					$('#in_garden_add').hide();
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
				
				$.ajax({
					//几个参数需要注意一下
					type: "get",//方法类型
			        dataType: "json",//预期服务器返回的数据类型
			        url: "/EntrepreneurialCenter/GardenApply/getGardenByFrontId" ,//url
			        data: {id:frontId},
			        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			        success: function (result) {
			        	console.log(result);//打印服务端返回的数据(调试用)
			        	that.infoList = result;
			        }
				});
			})
		</script>
	</body>
</html>
