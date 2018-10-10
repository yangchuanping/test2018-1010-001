<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>入园申请</title>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/FrontPage/img/index/logo.png"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/bootstrap.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/common.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/FrontPage/css/item/garden_apply.css"/>
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
		<form id="formdate" method="post">
		<div class="content">
			<div class="apply-title">
				<img src="${pageContext.request.contextPath}/FrontPage/img/garden_apply/apply_logo.png"/>
				<span>入园申请</span>
				<i>（&nbsp;填写后我们将尽快联系您&nbsp;）</i>
			</div>
			<!--左侧表单-->
			<div class="d-list-left">
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>入园企业名称</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="gardenCompany" name="gardenCompany" placeholder="请填写企业名称">
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>公司注册情况</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="gardenRegistration" name="gardenRegistration">
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>申请时间</span>
					</div>
					<div class="box-right">
						<input type="date" class="form-control input-width" id="gardenDate" name="gardenDate">
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>申请办公面积</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width2" id="gardenArea" name="gardenArea" onkeyup="num(this)"><span>&nbsp;㎡</span>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>技术领域</span>
					</div>
					<div class="box-right" id="recode" >
						<select class="form-control input-width" id="indId" name="indId">
					       <option v-for="info in infoList" v-bind:value="info.indId">{{info.indTitle}}</option>
					    </select>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>主要产品</span>
					</div>
					<div class="box-right marTop2">
						 <textarea class="form-control" rows="3" id="gardenProducts" name="gardenProducts"></textarea>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>工商注册情况</span>
					</div>
					<div class="box-right marTop1">
						<input type="radio" name="gardenIacr" id="gardenIacr" value="1" >&nbsp;未注册&nbsp;&nbsp;
						<input type="radio" name="gardenIacr" id="gardenIacr" value="2" checked="checked">&nbsp;已注册
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>公司法人</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="gardenLawperson" name="gardenLawperson">
					</div>
				</div>
				<div class="obox marTop3">
					<div class="box-left">
						<i>*</i>
						<span>法人手机号码</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="gardenLawphone" name="gardenLawphone" onkeyup='this.value=this.value.replace(/\D/gi,"")'>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>注册资本</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width2" id="gardenCapital" name="gardenCapital" onkeyup="num(this)"><span>&nbsp;万元</span>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>注册地址</span>
					</div>
					<div class="box-right marTop2">
						 <textarea class="form-control" rows="3" id="gardenAddress" name="gardenAddress"></textarea>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>公司成立时间</span>
					</div>
					<div class="box-right">
						<input type="date" class="form-control input-width" id="gardenRegtime" name="gardenRegtime">
					</div>
				</div>
				<div class="obox marTop3">
					<div class="box-left">
						<i>*</i>
						<span>年销售额</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width2" id="gardenSale" name="gardenSale" onkeyup="num(this)"><span>&nbsp;万元</span>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>年纳税额</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width2" id="gardenRatal" name="gardenRatal" onkeyup="num(this)"><span>&nbsp;万元</span>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>知识产权</span>
					</div>
					<div class="box-right a-hight">
						<input type="checkbox" name="gardenIp" id="gardenIp" value="发明专利">&nbsp;发明专利&nbsp;&nbsp;
						<input type="checkbox" name="gardenIp" id="gardenIp" value="实用新型专利">&nbsp;实用新型专利&nbsp;&nbsp;
						<input type="checkbox" name="gardenIp" id="gardenIp" value="外观设计专利">&nbsp;外观设计专利&nbsp;&nbsp;
						<input type="checkbox" name="gardenIp" id="gardenIp" value="软件著作权">&nbsp;软件著作权&nbsp;&nbsp;
						<input type="checkbox" name="gardenIp" id="gardenIp" value="其他">&nbsp;其他
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>联系人姓名</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="gardenLinkname" name="gardenLinkname">
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>联系人手机号</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="gardenLinkphone" name="gardenLinkphone" onkeyup='this.value=this.value.replace(/\D/gi,"")'>
						<input hidden="" id="frontId" name="frontId" />
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>传真/电话</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="gardenLinkfax" name="gardenLinkfax">
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>QQ/E-mail</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="gardenLinkemail" name="gardenLinkemail">
					</div>
				</div>
			</div>
			<!--右侧表单-->
			<div class="d-list-right">				
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>公司现有总人数</span>
						
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width2" id="gardenHeadcount" name="gardenHeadcount" onkeyup='this.value=this.value.replace(/\D/gi,"")'><span>&nbsp;人</span>
					</div>
				</div>
				<p class="p-show">点击填写股东名单</p>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>博士/硕士</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width2" id="gardenDrma" name="gardenDrma" onkeyup='this.value=this.value.replace(/\D/gi,"")'><span>&nbsp;人</span>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>本科/留学人员</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width2" id="gardenUndergraduate" name="gardenUndergraduate" onkeyup='this.value=this.value.replace(/\D/gi,"")'><span>&nbsp;人</span>
					</div>
				</div>
				<div class="d-experience">
					<i>*</i>
					<span>法定代表人主要经历</span>
					<textarea class="form-control" rows="3" placeholder="字数限制500以内" id="gardenLawcareer" name="gardenLawcareer"></textarea>
				</div>
				<div class="caption1">
					新办企业需要提供资料
					<div class="triangle1"></div>
				</div>
				<div class="op1">
					<p>1、入园申请表；</p>
					<p>2、企业名称预先核准通知书；</p>
					<p>3、法人代表身份证复印件；</p>
					<p>4、项目简介</p>
					<p>（包含公司简介；主营业务；项目概况，知识产权状况；团队构成等）</p>
				</div>
				<div class="caption1">
					企业入园需提供的资料
					<div class="triangle1"></div>
				</div>
				<div class="op1">
					<p>1、入园申请表；</p>
					<p>2、法人代表身份证复印件（印原件）；</p>
					<p>3、营业执照复印件（印原件）；</p>
					<p>4、组织机构代码证复印件（印原件）</p>
					<p>5、税务登记证复印件（印原件）</p>
					<p>6、知识产权证明文件复印件（印原件）；</p>
					<p>7、项目简介（包含公司简介；主营业务及业绩；项目概况：创新点、技术水平、知识产权状况；团队构成等）</p>
					<p>*以上所有资料都需盖公章</p>
				</div>
				<div class="caption1">
					办理流程
					<div class="triangle1"></div>
				</div>
				<div class="flow1">
					<span class="st">申请</span>
					<span class="triangle2"></span>
					<span class="st">企业评估</span>
					<span class="triangle2"></span>
					<span class="st">企业入园考察</span>
					<span class="triangle2"></span>
					<span class="st">签署服务合同</span>
					<span class="triangle2"></span>
					<span class="st">入驻</span>
				</div>
			</div>
			<div class="d-lable1">
				<i>*</i>
				<span>本人/公司保证上述提供的材料真实、可靠，并承担由此引起的相关责任。</span>
			</div>
			<div class="d-btn" onclick="submit()">提交申请</div>
		</div>
		</form>	
		<!--弹出框-->
		<div class="mask">
			<div class="mask-content">
				<div class="banner">公司股东名单</div>
				<div class="mask-table">
					<table class="table2" id="gardenPartner">
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
					            <td><input type="text" name="name" id="name" value="" /></td>
					            <td><input type="text" name="sex" id="sex" value="" /></td>
					            <td><input type="text" name="age" id="age" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					        </tr>
					        <tr>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					        </tr>
					        <tr>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					        </tr>
					        <tr>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					        </tr>
					        <tr>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					        </tr>
					        <tr>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					        </tr>
					        <tr>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					        </tr>
					        <tr>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					        </tr>
							 <tr>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					        </tr>
					        <tr>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					            <td><input type="text" name="" id="" value="" /></td>
					        </tr>
				  		 </tbody>
					</table>
				</div>
				<div class="mask-btn">
					<button id="confirm">确   定</button>
					<button id="back">取   消</button>				
				</div>
			</div>
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
		<script src="${pageContext.request.contextPath}/FrontPage/js/vue.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/general.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/FrontPage/js/operatcookie.js"></script>
		<script type="text/javascript">
			$(function(){
				$('.p-show').click(function(){
					$('.mask').show();
				})
				$('#confirm').click(function(){
					$('.mask').hide();
					
				})
				$('#back').click(function(){
					$('.mask').hide();
					$('.mask input').val('');
				})
				
				$.ajax({
					type:"get",
					url:"/EntrepreneurialCenter/ComIndustries/getAllComIndustriesInfo",
					async: false,
					dataType : "json",
					contentType : "application/x-www-form-urlencoded; charset=UTF-8",
					success:function(data)
					{
						//alert(data);
						var info = new Vue({
							el:"#recode",
							data:{
								infoList:data
							}
						})
					}
				})
			});
			
			function num(obj){
				obj.value = obj.value.replace(/[^\d.]/g,""); //清除"数字"和"."以外的字符
				obj.value = obj.value.replace(/^\./g,""); //验证第一个字符是数字
				obj.value = obj.value.replace(/\.{2,}/g,"."); //只保留第一个, 清除多余的
				obj.value = obj.value.replace(".","$#$").replace(/\./g,"").replace("$#$",".");
				obj.value = obj.value.replace(/^(\-)*(\d+)\.(\d\d).*$/,'$1$2.$3'); //只能输入两个小数
			}
			
			function submit(){
				//alert(111)
				var gardenCompany = $("#gardenCompany").val();
				var gardenRegistration = $("#gardenRegistration").val();
				var gardenDate = $("#gardenDate").val();
				var gardenArea = $("#gardenArea").val();
				var indId = $("#indId").val();
				var gardenProducts = $("#gardenProducts").val();
				var gardenIacr = $("#gardenIacr:checked").val();
				var gardenLawperson = $("#gardenLawperson").val();
				var gardenLawphone = $("#gardenLawphone").val();
				var gardenCapital = $("#gardenCapital").val();
				var gardenAddress = $("#gardenAddress").val();
				var gardenRegtime = $("#gardenRegtime").val();
				var gardenSale = $("#gardenSale").val();
				var gardenRatal = $("#gardenRatal").val();
				var gardenIp = "";
				$("input[name=gardenIp]").each(function() {  
		            if ($(this).prop("checked")) {  
		            	gardenIp += ","+$(this).val();  
		            }  
		        }); 
				var gardenLinkname = $("#gardenLinkname").val();
				var gardenLinkphone = $("#gardenLinkphone").val();
				var gardenLinkfax = $("#gardenLinkfax").val();
				var gardenLinkemail = $("#gardenLinkemail").val();
				var gardenHeadcount = $("#gardenHeadcount").val();
				
				var gardenDrma = $("#gardenDrma").val();
				var gardenUndergraduate = $("#gardenUndergraduate").val();
				var gardenLawcareer = $("#gardenLawcareer").val();
				
				//手机号码验证的正则表达式
				var regPhone = /^1[34578]\d{9}$/;
				
				//alert(indId+gardenIacr)
				if ($.trim(gardenCompany&&gardenRegistration&&gardenDate&&gardenArea&&indId&&gardenProducts&&gardenIacr&&gardenLawperson&&gardenLawphone&&gardenCapital&&gardenAddress
						&&gardenRegtime&&gardenSale&&gardenRatal&&gardenIp&&gardenLinkname&&gardenLinkphone&&gardenLinkfax&&gardenLinkemail&&gardenHeadcount
						&&gardenDrma&&gardenUndergraduate&&gardenLawcareer).length == 0) {
					alert('请填写完整表单.');
					return false;
				} else if(!regPhone.test(gardenLawphone&&gardenLinkphone)){
					alert('请填写法人/联系人正确的手机号码。')
				}else  {
					//alert($('#formdate').serialize());
					  				
					if(confirm("是否新增入园信息？（新增成功后会根据联系人手机号码自动生成账号，默认密码123456。登陆后可完善相关信息并能使用其他功能。新增成功后请尽快登录账号修改新密码。）")) {
						$.ajax({
							//几个参数需要注意一下
							type: "POST",//方法类型
					        dataType: "json",//预期服务器返回的数据类型
					        url: "/EntrepreneurialCenter/UserFront/getPhoneIsRepet" ,//url
					        data: {value:gardenLinkphone},
					        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
					        success: function (result) {
					        	console.log(result);//打印服务端返回的数据(调试用)
					        	//alert($("#frontId").val());
					        	if (result.status == 500) {
					        		if(confirm("系统检测到此联系人手机号码已被注册。是否是您的账号，确认则信息添加在此账号下。不是则请更换其他联系人手机号码。")) {
					        			$("#frontId").val(result.data);
					        			$.ajax({
											//几个参数需要注意一下
											type: "POST",//方法类型
									        dataType: "json",//预期服务器返回的数据类型
									        url: "/EntrepreneurialCenter/GardenApply/addGardenApply" ,//url
									        data: $('#formdate').serialize(),
									        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
									        success: function (result) {
									        	console.log(result);//打印服务端返回的数据(调试用)
									        	if (result.status == 200) {
									        		alert("新增成功！");
									        		location.reload();
									       		};
									        },
									        error : function() {
									        	alert("新增失败！");
									        	}
									       	}); 
					        		}
					       		}else{
					       			alert("此联系人手机号会自动生成账号。密码默认12345.")
					       			$.ajax({
											//几个参数需要注意一下
											type: "POST",//方法类型
									        dataType: "json",//预期服务器返回的数据类型
									        url: "/EntrepreneurialCenter/UserFront/addUserFront" ,//url
									        data: {frontName:gardenLinkname,frontTelephone:gardenLinkphone},
									        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
									        success: function (result) {
									        	console.log(result);//打印服务端返回的数据(调试用)
									        	$("#frontId").val(result.data);
									        	if (result.status == 200) {
									        		$.ajax({
														//几个参数需要注意一下
														type: "POST",//方法类型
												        dataType: "json",//预期服务器返回的数据类型
												        url: "/EntrepreneurialCenter/GardenApply/addGardenApply" ,//url
												        data: $('#formdate').serialize(),
												        contentType : "application/x-www-form-urlencoded; charset=UTF-8",
												        success: function (result) {
												        	console.log(result);//打印服务端返回的数据(调试用)
												        	if (result.status == 200) {
												        		alert("新增成功！");
												        		location.reload();
												       		};
												        },
												        error : function() {
												        	alert("异常！");
												        	}
												       	}); 
									       		};
									        },
									        error : function() {
									        	alert("新增失败！");
									        	}
									       	}); 
					       			
					       		}
					        }
					    }); 
						
					}
				}
			}
			
		</script>
		
	</body>
</html>
