$(function(){
	
	var moveWidth = 450;
	var smallMovwWidth = 50;
	var num = 1;
	var index = 0;
	var s_li = $('.z-div2 li');
	var imgCount = s_li.length;
	
	$('.z-title i').text(num);
	
	//自动循环播放
	var time = setInterval(function(){
		page(true);
		Smollpage(true);
	},3000)
	//当鼠标进入图片区域时, 自动切换停止, 当鼠标离开后,又开始自动切换标移入停止滚动，移除继续
	$('.z-obox').hover(function () {
	  // 清除定时器
	    clearInterval(time);
	}, function () {
	    time = setInterval(function () {
	    page(true);
		Smollpage(true);
	    }, 3000)
	})
	
	
	//大图下一张
	$('.z-right').click(function(){
		page(true);
		Smollpage(true);
	});
	//大图上一张
	$('.z-left').click(function(){
		page(false);
		Smollpage(false);
	});
	//缩略图下一张
	$('.z-s-right').click(function(){
		Smollpage(true);
	});
	//缩略图上一张
	$('.z-s-left').click(function(){
		Smollpage(false);
	});
	
	//点击缩略图显示对应的大图
	s_li.click(function(){
//		$(this).addClass('bor-col').siblings().removeClass('bor-col');
		// 目标页的下标
	    var targetIndex = $(this).index();
	    // 只有当点击的不是当前页的圆点时才翻页
	    if(targetIndex!=index) {
	      page(targetIndex);
	     }
	    $('.z-title i').text(targetIndex+1);
	});
	
	/*大图转换*/
	function page(next){
		
		var offset = 0;
		if (typeof next==='boolean') {			
			offset = next?-moveWidth:moveWidth;
		} else{
			offset = -(next-index)*moveWidth;
		}	
		
		var currleft = $('.z-box2').position().left;		
		var sum = currleft+offset;		
		if(sum<-1800){
			sum = 0;
		}else if(sum>0){
			sum = -1800;
		}
		$('.z-box2').animate({left:sum},100);			
		
		pooage(next);
	}
	
	/*小图样式*/
	function pooage(next){
		var targetIndex = 0;
		if(typeof next === 'boolean') {
		  if(next) {
		    targetIndex = index + 1;   
		    if(targetIndex===imgCount) {
		      targetIndex = 0;
		    }
		  } else {
		    targetIndex = index - 1;
		    if(targetIndex===-1) { 
		      targetIndex = imgCount-1;
		    }
		  }
		} else {
		  targetIndex = next;
		}										
		// 将当前index的<li>的class移除
		s_li.eq(index).removeClass('z-bor-col');
		// 给目标添加class='bor-col'
		s_li.eq(targetIndex).addClass('z-bor-col');					
		// 将index更新为targetIndex
		index = targetIndex;
		
		$('.z-title i').text(index+1);
	}
	/*小图转换*/
	function Smollpage(next){
		var currleft = $('.z-div2').position().left;
		var offset = next?-smallMovwWidth:smallMovwWidth;
		var sum = currleft+offset;
		if(sum<-200){
			sum = 0;
		}else if(sum>0){
			sum = -200;
		}
		$('.z-div2').animate({left:sum},100);					
	}
});