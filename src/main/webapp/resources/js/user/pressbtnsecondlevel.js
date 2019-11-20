/*
 * Модуль обрабатывает различные комбинации между нажатиями на кнопки в подменю АНКЕТЫ ВТОРОГО УРОВНЯ
 * 
 */
		// Кнопка амбул-полик помощь
	   $('#one_ambul_polsecondlevel').click(function()
               {  
		   			if ($('#dimsecondlevel').is(':visible'))
    	    		{
		   				$("#dimsecondlevel").fadeOut();
		   				$('.mask_pseudo2').css('opacity',0.01);
		   				
    	    		}
		   			else
		   			{
		   				if ($('#dim2secondlevel,#dim3secondlevel,#dim,#dim2,#dim3').is(':visible')){
		   						$("#dim2secondlevel").fadeOut();
		   						$("#dim3secondlevel").fadeOut();
		   						$("#dim2").fadeOut();
		   						$("#dim").fadeOut();
		   						$("#dim3").fadeOut();
		   					}
		   				var widthGet = $('.container-fluid').width();
		    	        var heightGet = $(window).height();
		    	        
		    	        $('#dimsecondlevel').width(widthGet-20);
	    	            $('#dimsecondlevel').height(heightGet-300);
	    	            $('#fgfsecondlevel').height(heightGet-460);
	    	            setTimeout("$('#dimsecondlevel').fadeIn();",500);
	    	            
	    	            $('.mask_pseudo2').css('opacity',1);
	    	            
		   			}
  	     		 	
               });
	   
		// Кнопка дневной стационвр
	   $('#one_daysecondlevel').click(function()
               {  
		   			if ($('#dim2secondlevel').is(':visible'))
    	    		{
		   				$("#dim2secondlevel").fadeOut();
		   				$('.mask_pseudo2').css('opacity',0.01);
    	    		}
		   			else
		   			{
		   				if ($('#dimsecondlevel,#dim3secondlevel,#dim,#dim2,#dim3').is(':visible')){
		   						$("#dimsecondlevel").fadeOut();$("#dim3secondlevel").fadeOut();
		   						$("#dim2").fadeOut();
		   						$("#dim").fadeOut();
		   						$("#dim3").fadeOut();
		   					}
		   				var widthGet = $('.container-fluid').width();
		    	        var heightGet = $(window).height();
		    	        
		    	        $('#dim2secondlevel').width(widthGet-20);
	    	            $('#dim2secondlevel').height(heightGet-300);
	    	            $('#tableDSSL').height(heightGet-460);
	    	            setTimeout("$('#dim2secondlevel').fadeIn();",500);
	    	            
	    	            $('.mask_pseudo2').css('opacity',1);
	    	            
		   			}
  	     		 	
               });
	   
		// Кнопка станионар
	   $('#one_stacsecondlevel').click(function()
               {  
		   			if ($('#dim3secondlevel').is(':visible'))
    	    		{
		   				$("#dim3secondlevel").fadeOut();
		   				$('.mask_pseudo2').css('opacity',0.01);
    	    		}
		   			else
		   			{
		   				if ($('#dim2secondlevel,#dimsecondlevel,#dim,#dim2,#dim3').is(':visible')){
		   						$("#dim2secondlevel").fadeOut();
		   						$("#dimsecondlevel").fadeOut();
		   						$("#dim2").fadeOut();
		   						$("#dim").fadeOut();
		   						$("#dim3").fadeOut();
		   					}
		   				
		   				
		   				var widthGet = $('.container-fluid').width();
		    	        var heightGet = $(window).height();
		    	        
		    	        $('#dim3secondlevel').width(widthGet-20);
	    	            $('#dim3secondlevel').height(heightGet-300);
	    	            $('#tableOneStacionarsecondlevel').height(heightGet-460);
	    	            setTimeout("$('#dim3secondlevel').fadeIn();",500);
	    	            
	    	            $('.mask_pseudo2').css('opacity',1);
		   			}
               });
