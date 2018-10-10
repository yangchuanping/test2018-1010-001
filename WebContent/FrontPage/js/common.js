$(function(){	
	// 点击返回顶部
	// 自定义滚轮事件
	window.onscroll = function(){ //绑定scroll事件
	    var t = document.documentElement.scrollTop || document.body.scrollTop;  //获取滚动距离
	    if( t >= 300 ) {              //判断
			$('.backTop').show(200);
	    } else { 
			$('.backTop').hide(200);
	    } 
	}
	
	/*返回顶部*/
	$(".backTop").click(function() {
		$("html,body").stop().animate({scrollTop:0},300);
	});
	
	
	/*移动端菜单*/
	$('.caidan').click(function(event){
		event.stopImmediatePropagation();   //取消事件冒泡；
		$('.nav ul').stop().slideToggle(300);
	})
//	$(document).bind("click",function(){   //单击其他地方关闭
//  	$('.nav ul').stop().slideUp(300);
//	});
	
})