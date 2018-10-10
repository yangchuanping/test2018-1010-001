<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>退租申请</title>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/FrontPage/img/index/logo.png"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/bootstrap.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/quit_apply.css"/>
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
		    	<li class="active1"><a href="${pageContext.request.contextPath}/FrontPage/attract_list.jsp">招商信息</a></li>
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
		<div class="content" id="record">
			<div class="apply-title">
				<img src="${pageContext.request.contextPath}/FrontPage/img/quit_apply/quit_icon.png"/>
				<span>退租申请</span>
				<i>（&nbsp;填写后我们将尽快联系您&nbsp;）</i>
			</div>
			<div class="inside-box">
				<div class="list-box">
					<div class="left-box">
						<i>*</i>企业名称
					</div>
					<div class="right-box">
						<input name="quitCompany" type="text" class="form-control owidth" id="quitCompany" placeholder="请填写企业名称">
					</div>
				</div>
				<div class="list-box">
					<div class="left-box">
						<i>*</i>所在园区
					</div>
					<div class="right-box">
						<select name="quitRegion" id="quitRegion" class="form-control owidth">
							<option v-for="reg in proregions" :value="reg.regionTitle">{{ reg.regionTitle }}</option>
						</select>
					</div>
				</div>
				<div class="list-box">
					<div class="left-box">
						<i>*</i>园区房号
					</div>
					<div class="right-box">
						<input type="text" class="form-control owidth" id="quitNumber" name="quitNumber">
					</div>
				</div>
				<div class="list-box">
					<div class="left-box">
						<i>*</i>联系人姓名
					</div>
					<div class="right-box">
						<input type="text" class="form-control owidth" id="quitName" name="quitName">
					</div>
				</div>
				<div class="list-box">
					<div class="left-box">
						<i>*</i>联系电话
					</div>
					<div class="right-box">
						<input type="text" class="form-control owidth" id="quitPhone" name="quitPhone">
					</div>
				</div>
				<div class="list-box">
					<div class="left-box">
						<i>*</i>申请退租日期
					</div>
					<div class="right-box">
						<input type="date" class="form-control owidth" id="quitDate" name="quitDate">
					</div>
				</div>
				<div class="banner">（承诺此后一周内将物品清理完毕）</div>
				<div class="list-box">
					<div class="left-box">
						<i>*</i>退租状态&nbsp;:
					</div>
					<div class="right-box ohight">
						<input type="radio" name="quitState" id="quitState" value="1" checked="checked">&nbsp;保持已装修状态&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="radio" name="quitState" id="quitState" value="2">&nbsp;拆除装修恢复原状&nbsp;&nbsp;
					</div>
				</div>
				<div class="list-box">
					<div class="left-box">
						<i>*</i>退租类型&nbsp;:
					</div>
					<div class="right-box ohight">
						<input type="radio" name="quitType" id="quitType" value="1" checked="checked">&nbsp;合同到期&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="radio" name="quitType" id="quitType" value="2">&nbsp;提前退租&nbsp;&nbsp;
					</div>
				</div>
			</div>
			<div class="button" onclick="submit()">提交申请</div>
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
				proregions:[],
			}
		});
		
		function submit(){
			var quitCompany = $("#quitCompany").val();
			var quitNumber = $("#quitNumber").val();
			var quitName = $("#quitName").val();
			var quitPhone = $("#quitPhone").val();
			var quitDate = $("#quitDate").val();
			var quitState = $("#quitState:checked").val();
			var quitType = $("#quitType:checked").val();
			var quitRegion = $("#quitRegion").val();
			var frontId = decodeURI(cookie.get("frontId"));
			
			//手机号码验证的正则表达式
			var regPhone = /^1[34578]\d{9}$/;
			
			if ($.trim(quitCompany&&quitNumber&&quitName&&quitPhone&&quitDate).length == 0) {
				alert('请填写完整表单.');
				return false;
			}else if (!regPhone.test(quitPhone)) {
				alert('请填写正确的手机号码。');
				return false;
			}else{
				//alert(quitCompany+quitNumber+quitName+quitPhone+quitDate+quitState+quitType);
				if(confirm("是否新增信息？新增后不可修改。")) {
					$.ajax({
						type:"post",
						url:"/EntrepreneurialCenter/QuitApply/addQuitApply",
						dataType : "json",
						async: false,
						data : {frontId:frontId,"quitCompany":quitCompany,"quitNumber":quitNumber,"quitName":quitName,"quitPhone":quitPhone,"quitDate":quitDate,"quitState":quitState,"quitType":quitType,"quitRegion":quitRegion},
						success:function(data)
						{
							//alert(data)
							if (data.status == 200) {
								alert("新增成功！");
								location.reload();
							} else {
								alert("登录失败，原因是：" + data.msg);
							}  
						}
					});  
				}
			}
		}
		
		var that = this.info;
		$(function(){
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
		});
		</script>
	</body>
</html>
