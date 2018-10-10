/**
 * 通用js。
 */

//退出登录。
function Logout(){
		cookie.del("user");	
		cookie.del("userGpId");
		cookie.del("userId");
		location.href = "login.jsp";
};

$(function(){
	//alert(111);
	var user = decodeURI(cookie.get("user"));
	var userGpId = decodeURI(cookie.get("userGpId"));
	var userId = decodeURI(cookie.get("userId"));
	//alert(user);
	if(user=="undefined"&&userGpId=="undefined"&&userId=="undefined"){
		location.href = "login.jsp";
	}
	
	document.getElementById("log_span").innerText = user;
    document.getElementById("log_h2").innerText = user;
    
})