<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>场地变更申请</title>
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
		<div class="content" id="recode">
			<div class="apply-title">
				<img src="${pageContext.request.contextPath}/FrontPage/img/site_changes/t_logo.png"/>
				<span>企业拓展申请</span>
				<i>（&nbsp;填写后我们将尽快联系您&nbsp;）</i>
			</div>
			<!--左侧表单-->
			<form id="formdate" method="post">
			<input hidden="" id="frontId" name="frontId" />
			<div class="d-list-left reset-height">
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>企业名称</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="siteCompany" name="siteCompany" placeholder="请填写企业名称">
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>现所在园区</span>
					</div>
					<div class="box-right">
						<select name="siteGarden" id="siteGarden" class="form-control input-width">
							<option v-for="reg in proregions" :value="reg.regionTitle">{{ reg.regionTitle }}</option>
						</select>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>现所在房间</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="siteNumber" name="siteNumber">
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>现使用面积</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width2" id="siteArea" name="siteArea" onkeyup="num(this)"><span>&nbsp;㎡</span>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>申请时间</span>
					</div>
					<div class="box-right">
						<input type="date" class="form-control input-width" id="siteDate" name="siteDate">
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>申请拓展面积</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width2" id="siteApplyarea" name="siteApplyarea" onkeyup="num(this)"><span>&nbsp;㎡</span>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>主要产品</span>
					</div>
					<div class="box-right marTop2">
						 <textarea class="form-control" rows="3" id="siteProduct" name="siteProduct"></textarea>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>技术领域</span>
					</div>
					<div class="box-right">
						<select class="form-control input-width" id="indId" name="indId">
					       <option v-for="info in infoList" v-bind:value="info.indId">{{info.indTitle}}</option>
					    </select>
					</div>
				</div>
				<div class="obox marTop4">
					<div class="box-left">
						<i>*</i>
						<span>知识产权</span>
					</div>
					<div class="box-right a-hight">
						<input type="checkbox" name="siteIp" id="siteIp" value="发明专利">&nbsp;发明专利&nbsp;&nbsp;
						<input type="checkbox" name="siteIp" id="siteIp" value="实用新型专利">&nbsp;实用新型专利&nbsp;&nbsp;
						<input type="checkbox" name="siteIp" id="siteIp" value="外观设计专利">&nbsp;外观设计专利&nbsp;&nbsp;
						<input type="checkbox" name="siteIp" id="siteIp" value="软件著作权">&nbsp;软件著作权&nbsp;&nbsp;
						<input type="checkbox" name="siteIp" id="siteIp" value="其他">&nbsp;其他
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>注册地址</span>
					</div>
					<div class="box-right marTop2">
						 <textarea class="form-control" rows="3" id="siteAddress" name="siteAddress"></textarea>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>公司成立时间</span>
					</div>
					<div class="box-right">
						<input type="date" class="form-control input-width" id="siteFormed" name="siteFormed">
					</div>
				</div>
				<div class="obox marTop4">
					<div class="box-left">
						<i>*</i>
						<span>法人代表</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="siteLawperson" name="siteLawperson">
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>手机号码</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width2" id="siteLawphone" name="siteLawphone" onkeyup='this.value=this.value.replace(/\D/gi,"")'/>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>QQ/E-mail</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width2" id="siteLawemail" name="siteLawemail">
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>联系人</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width2" id="siteLinkname" name="siteLinkname">
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>手机号码</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="siteLinkphone" name="siteLinkphone" onkeyup='this.value=this.value.replace(/\D/gi,"")'/>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>传真/电话</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="siteLinkfax" name="siteLinkfax">
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>QQ/E-mail</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="siteLinkemail" name="siteLinkemail">
					</div>
				</div>
			</div>
			<!--右侧表单-->
			<div class="d-list-right reset-height">	
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>去年销售额</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="siteLastsale" name="siteLastsale" onkeyup="num(this)">
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>去年纳税额</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="siteLastratal" name="siteLastratal" onkeyup="num(this)">
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>注册资本</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width2" id="siteCapital" name="siteCapital" onkeyup="num(this)"><span>&nbsp;万元</span>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>年初至今销售额</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="siteYtdsale" name="siteYtdsale" onkeyup="num(this)">
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>年初至今纳税额</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width" id="siteYtdratal" name="siteYtdratal" onkeyup="num(this)">
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>公司现有总人数</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width2" id="siteHeadcount" name="siteHeadcount" onkeyup='this.value=this.value.replace(/\D/gi,"")'><span>&nbsp;人</span>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>博士/硕士</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width2" id="siteDrma" name="siteDrma" onkeyup='this.value=this.value.replace(/\D/gi,"")'><span>&nbsp;人</span>
					</div>
				</div>
				<div class="obox">
					<div class="box-left">
						<i>*</i>
						<span>本科/留学人员</span>
					</div>
					<div class="box-right">
						<input type="text" class="form-control input-width2" id="siteUndergraduate" name="siteUndergraduate" onkeyup='this.value=this.value.replace(/\D/gi,"")'><span>&nbsp;人</span>
					</div>
				</div>
				<div class="obox txt-height">
					<div class="box-left">
						<i>*</i>
						<span>企业基本情况</span>
					</div>
					<div class="box-right marTop2 ">
						 <textarea class="form-control txt-height" rows="3" id="siteBasecase" name="siteBasecase"></textarea>
					</div>
				</div>
				<div class="obox txt-height">
					<div class="box-left">
						<i>*</i>
						<span>目前经营情况</span>
					</div>
					<div class="box-right marTop2">
						 <textarea class="form-control txt-height" rows="3" id="siteBusinesscase" name="siteBusinesscase"></textarea>
					</div>
				</div>
				<div class="obox  txt-height">
					<div class="box-left">
						<i>*</i>
						<span>场地申请说明</span>
					</div>
					<div class="box-right marTop2">
						 <textarea class="form-control txt-height" rows="3" id="siteExplain" name="siteExplain"></textarea>
					</div>
				</div>
				<div class="caption1 marTop3">
					新办企业需要提供资料
					<div class="triangle1"></div>
				</div>
				<div class="op1">
					<p>1、上一年及近期财务报表；</p>
					<p>2、营业执照复印件；</p>
					<p>3、税务登记证复印件；</p>
					<p>4、组织机构代码证复印件；</p>
				</div>
			</div>
			<div class="d-lable1">
				<i>*</i>
				<span>本人/公司保证上述提供的材料真实、可靠，并承担由此引起的相关责任。</span>
			</div>
			<div class="d-btn" onclick="submit()">提交申请</div>
			</form>
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
		var info = new Vue({
			el:"#recode",
			data:{
				infoList:[],
				proregions:[],
			}
		})
		
		var that = this.info;
		$(function(){
			var frontId = decodeURI(cookie.get("frontId"));
			$("#frontId").val(frontId);
			//alert(1111);
			$.ajax({
				type:"get",
				url:"/EntrepreneurialCenter/ComIndustries/getAllComIndustriesInfo",
				async: false,
				dataType : "json",
				contentType : "application/x-www-form-urlencoded; charset=UTF-8",
				success:function(data)
				{
					//alert(data);
					that.infoList = data;
				}
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
		        	that.proregions = result;
		        }
		       	}); 
		})
		
		
		function num(obj){
			obj.value = obj.value.replace(/[^\d.]/g,""); //清除"数字"和"."以外的字符
			obj.value = obj.value.replace(/^\./g,""); //验证第一个字符是数字
			obj.value = obj.value.replace(/\.{2,}/g,"."); //只保留第一个, 清除多余的
			obj.value = obj.value.replace(".","$#$").replace(/\./g,"").replace("$#$",".");
			obj.value = obj.value.replace(/^(\-)*(\d+)\.(\d\d).*$/,'$1$2.$3'); //只能输入两个小数
		}
		
		function submit(){
			//alert(111);
			var siteCompany = $("#siteCompany").val();
			var siteGarden = $("#siteGarden").val();
			var siteNumber = $("#siteNumber").val();
			var siteArea = $("#siteArea").val();
			var siteDate = $("#siteDate").val();
			var siteApplyarea = $("#siteApplyarea").val();
			var siteProduct = $("#siteProduct").val();
			var indId = $("#indId").val();
			var siteIp = "";
			$("input[name=siteIp]").each(function() {  
	            if ($(this).prop("checked")) {  
	            	siteIp += ","+$(this).val();  
	            }  
	        });  
			var siteAddress = $("#siteAddress").val();
			var siteFormed = $("#siteFormed").val();
			var siteLawperson = $("#siteLawperson").val();
			var siteLawphone = $("#siteLawphone").val();
			var siteLawemail = $("#siteLawemail").val();
			var siteLinkname = $("#siteLinkname").val();
			var siteLinkphone = $("#siteLinkphone").val();
			var siteLinkfax = $("#siteLinkfax").val();
			var siteLinkemail = $("#siteLinkemail").val();
			var siteLastsale = $("#siteLastsale").val();
			var siteLastratal = $("#siteLastratal").val();
			var siteCapital = $("#siteCapital").val();
			var siteYtdsale = $("#siteYtdsale").val();
			var siteYtdratal = $("#siteYtdratal").val();
			var siteHeadcount = $("#siteHeadcount").val();
			var siteDrma = $("#siteDrma").val();
			var siteUndergraduate = $("#siteUndergraduate").val();
			var siteBasecase = $("#siteBasecase").val();
			var siteBusinesscase = $("#siteBusinesscase").val();
			var siteExplain = $("#siteExplain").val();
			
			//手机号码验证的正则表达式
			var regPhone = /^1[34578]\d{9}$/;
			
			if ($.trim(siteCompany&&siteGarden&&siteNumber&&siteArea&&siteDate&&siteApplyarea&&siteProduct&&indId&&siteIp&&siteAddress&&siteFormed&&siteLawperson
					&&siteLawphone&&siteLawemail&&siteLinkname&&siteLinkphone&&siteLinkfax&&siteLinkemail&&siteLastsale&&siteLastratal&&siteCapital&&siteYtdsale
					&&siteYtdratal&&siteHeadcount&&siteDrma&&siteUndergraduate&&siteBasecase&&siteBusinesscase&&siteExplain).length == 0) {
				alert('请填写完整表单.');
				return false;
			}else if(!regPhone.test(siteLawphone&&siteLinkphone)){
				alert('请填写法人/联系人正确的手机号码。')
			}else{
				//alert($('#formdate').serialize());
				if(confirm("是否新增信息？新增后不可修改。")) {
					$.ajax({
						//几个参数需要注意一下
						type: "POST",//方法类型
				        dataType: "json",//预期服务器返回的数据类型
				        url: "/EntrepreneurialCenter/SiteChanges/addSiteChanges" ,//url
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
				}
			}
			
				 
		}
		</script>
		
	</body>
</html>
