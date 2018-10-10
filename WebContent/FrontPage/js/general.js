/**
 * 通用js。
 */


//退出登录。
function Logout(){
		cookie.del("frontName");	
		cookie.del("frontPhone");
		cookie.del("frontId");
		alert("退出成功。")
		location.reload();
		//location.href = "login.jsp";
};

$(function(){
	var frontName = decodeURI(cookie.get("frontName"));
	var frontPhone = decodeURI(cookie.get("frontPhone"));
	var frontId = decodeURI(cookie.get("frontId"));
	//alert(frontId+frontName+frontPhone);
	if(frontName=="undefined"&&frontPhone=="undefined"&&frontId=="undefined"){
		//location.href = "index.jsp";
		$("#login_a1").show();
		$("#login_l1").show();
		$("#login_a2").hide();
		$("#login_l2").hide();
	}else{
		$("#login_a2").show();
		$("#login_l2").show();
		$("#login_a1").hide();
		$("#login_l1").hide();
	}
	
})
