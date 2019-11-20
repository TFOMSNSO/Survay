/*
 * Модуль обрабатывает различные комбинации между нажатиями на кнопки в подменю АНКЕТЫ ПЕРВОГО УРОВНЯ
 * 
 */
// Кнопка амбул-полик помощь
	   $('#one_ambul_pol').click(function()
               {  
		   			if ($('#dim').is(':visible'))
    	    		{
		   				$("#dim").fadeOut();
		   				$('.mask_pseudo2').css('opacity',0.01);
		   				
    	    		}
		   			else
		   			{
		   				if ($('#dim2,#dim3,#dimsecondlevel,#dim2secondlevel,#dim3secondlevel').is(':visible')){
		   						$("#dim2").fadeOut();$("#dim3").fadeOut();
		   						$('#dimsecondlevel').fadeOut();
		   						$('#dim2secondlevel').fadeOut();
		   						$('#dim3secondlevel').fadeOut();
		   					}
		   				var widthGet = $('.container-fluid').width();
		    	        var heightGet = $(window).height();
		    	        
		    	        $('#dim').width(widthGet-20);
	    	            $('#dim').height(heightGet-300);
	    	            $('#fgf').height(heightGet-460);
	    	            setTimeout("$('#dim').fadeIn();",500);
	    	            
	    	            $('.mask_pseudo2').css('opacity',1);
	    	            
		   			}
  	     		 	
               });
	   
		// Кнопка дневной стационвр
	   $('#one_day').click(function()
               {  
		   			if ($('#dim2').is(':visible'))
    	    		{
		   				$("#dim2").fadeOut();
		   				$('.mask_pseudo2').css('opacity',0.01);
    	    		}
		   			else
		   			{
		   				if ($('#dim,#dim3,#dimsecondlevel,#dim2secondlevel,#dim3secondlevel').is(':visible')){
		   						$("#dim").fadeOut();$("#dim3").fadeOut();
		   						$('#dimsecondlevel').fadeOut();
		   						$('#dim2secondlevel').fadeOut();
		   						$('#dim3secondlevel').fadeOut();
		   					}
		   				var widthGet = $('.container-fluid').width();
		    	        var heightGet = $(window).height();
		    	        
		    	        $('#dim2').width(widthGet-20);
	    	            $('#dim2').height(heightGet-300);
	    	            $('#tableOneDayStacionar').height(heightGet-460);
	    	            setTimeout("$('#dim2').fadeIn();",500);
	    	            
	    	            $('.mask_pseudo2').css('opacity',1);
	    	            
		   			}
  	     		 	
               });
	   
		// Кнопка станионар
	   $('#one_stac').click(function()
               {  
		   			if ($('#dim3').is(':visible'))
    	    		{
		   				$("#dim3").fadeOut();
		   				$('.mask_pseudo2').css('opacity',0.01);
    	    		}
		   			else
		   			{
		   				if ($('#dim2,#dim,#dimsecondlevel,#dim2secondlevel,#dim3secondlevel').is(':visible')){
		   					$("#dim2").fadeOut();$("#dim").fadeOut();
		   					$('#dimsecondlevel').fadeOut();
	   						$('#dim2secondlevel').fadeOut();
	   						$('#dim3secondlevel').fadeOut();
		   				}
		   				
		   				
		   				var widthGet = $('.container-fluid').width();
		    	        var heightGet = $(window).height();
		    	        
		    	        $('#dim3').width(widthGet-20);
	    	            $('#dim3').height(heightGet-300);
	    	            $('#tableOneStacionar').height(heightGet-460);
	    	            setTimeout("$('#dim3').fadeIn();",500);
	    	            
	    	            $('.mask_pseudo2').css('opacity',1);
	    	            var myChart = echarts.init(document.getElementById('echart_pie2'), theme);
	    	            myChart.setOption(opt);
		   			}
               });
