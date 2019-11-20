

/*
 * Метод обрабатывает такие моменты в анкете как 'хотел(а), но не смог(а)   к вопросу 31'
 * т.е. блокирует возможность проставить ответ в данном примере на вопрос 30
 * обрабатывает все вопросы сразу....
 */
function testclic(){
	if($("#question15").val() == 'Нет (к вопросу 18)'){
		$('#question16').prop('disabled', true);
		$('#question17').prop('disabled', true);
		$(".del15").css({'opacity':0.4,'pointer-events':'none'});
		}
	else{ $(".del15").css({'opacity':1,'pointer-events':'visible'}); $('#question16').prop('disabled', false); $('#question17').prop('disabled', false);}
	
	if($("#question21").val() == 'Нет (к вопросу 23)'){
		$('#question22_clinic').prop('disabled', true);
		$(".del21").css({'opacity':0.4,'pointer-events':'none'});
		}
	else{$(".del21").css({'opacity':1,'pointer-events':'visible'}); $('#question22_clinic').prop('disabled', false);}
	
	
//Вставил что было
	if($("#question27").val() == 'Да (к вопросу 29)'){
		
		 $('.validquest28 input:checkbox').each(function(){
			 $(this).prop('disabled', true);
		 })
		 $(".validquest28  input:text").prop('disabled', true);
		 
		$(".del29").css({'opacity':0.4,'pointer-events':'none'});
	}
	else{
		
		 $('.validquest28 input:checkbox').each(function(){
			 $(this).prop('disabled', false);
		 })
		 $(".validquest28  input:text").prop('disabled', false);
		$(".del29").css({'opacity':1,'pointer-events':'visible'});
		}
	
	/*
	if($("#question27").val() == 'Хотел(а), но не смог(ла) (к вопросу 28)'){	
	$('.validquest29 input:checkbox').each(function(){        
    $(this).prop('disabled', true);
    })
    $(".validquest29  input:text").prop('disabled', true);
    $(".del30,.del29").css({'opacity':0.4,'pointer-events':'none'});
	}*/
	
	
	
	
	if($("#question27").val() == 'Нет, не было необходимости (к вопросу 30)'){
		
		$('.validquest29 input:checkbox').each(function(){
			 $(this).prop('disabled', true);
		 })
		 $(".validquest29  input:text").prop('disabled', true);
		
		$('.validquest28 input:checkbox').each(function(){
			 $(this).prop('disabled', true);
		 })
		 $(".validquest28  input:text").prop('disabled', true);
		
		$(".del30,.del29").css({'opacity':0.4,'pointer-events':'none'});
		}
	else{
		
		$('.validquest29 input:checkbox').each(function(){
			 $(this).prop('disabled', false);
		 })
		 $(".validquest29  input:text").prop('disabled', false);
		$(".del30").css({'opacity':1,'pointer-events':'visible'});
		
		}
	if($("#question27").val() == 'Нет, не знал(а), что это возможно'){	
		//
		$('.validquest28 input:checkbox').each(function(){        
		$(this).prop('disabled', true);
		})
		$(".validquest28  input:text").prop('disabled', true);
		$(".del30,.del28").css({'opacity':0.4,'pointer-events':'none'});
		//
		$('.validquest29 input:checkbox').each(function(){        
	    $(this).prop('disabled', true);
	    })
	    $(".validquest29  input:text").prop('disabled', true);
	    $(".del30,.del29").css({'opacity':0.4,'pointer-events':'none'});
		}
	
	
//
		 var tt = 0;
		 $('div#quest28 input:checkbox').each(function(){
			 
			 if($(this).is(':checked')){tt ++;}
		   })
		 if(tt > 0){
			 
			 $('.validquest29 input:checkbox').each(function(){
				 $(this).prop('disabled', true);
			 })
			 $(".validquest29  input:text").prop('disabled', true);
			 $(".del30").css({'opacity':0.4,'pointer-events':'none'});
			 
			 }
		 else{
			 if($.trim($('div#quest28 input:text').val()) != '') {
				 
				 $('.validquest29 input:checkbox').each(function(){
					 $(this).prop('disabled', true);
				 })
				 $(".validquest29  input:text").prop('disabled', true);
				 
				$(".del30").css({'opacity':0.4,'pointer-events':'none'});
				 }
		 }
		 // зануляем тк буду использовать ниже
		 tt = 0;
	 
	 //Вставил что было
		 
		 if($("#question30").val() == 'Да (к вопросу 32)'){
			 
			 $('.validquest31 input:checkbox').each(function(){
				 $(this).prop('disabled', true);
			 })
			 $(".validquest31  input:text").prop('disabled', true);
			 $(".del31").css({'opacity':0.4,'pointer-events':'none'});
		 }
			else{
				$('.validquest31 input:checkbox').each(function(){
					 $(this).prop('disabled', false);
				 })
				 $(".validquest31  input:text").prop('disabled', false);
				$(".del31").css({'opacity':1,'pointer-events':'visible'});
		 }
		 
		 //
		
		 //
		 
		 if($("#question30").val() == 'Нет, не было необходимости (к вопросу 33)'){
			 
			 $('.validquest32 input:checkbox').each(function(){
				 $(this).prop('disabled', true);
			 })
			 $(".validquest32  input:text").prop('disabled', true);
			 
			 $('.validquest31 input:checkbox').each(function(){
				 $(this).prop('disabled', true);
			 })
			 $(".validquest31  input:text").prop('disabled', true);
			 
			 $(".del31,.del32").css({'opacity':0.4,'pointer-events':'none'});
			 }
			else{
				$('.validquest32 input:checkbox').each(function(){
					 $(this).prop('disabled', false);
				 })
				 $(".validquest32  input:text").prop('disabled', false);
				
				$(".del32").css({'opacity':1,'pointer-events':'visible'});
				}
//РАБОТАЕТ
 if($("#question30").val() == 'Нет, не знал(а), что это возможно'){
			 
			 $('.validquest32 input:checkbox').each(function(){
				 $(this).prop('disabled', true);
			 })
			 $(".validquest32  input:text").prop('disabled', true);
			 
			 $('.validquest31 input:checkbox').each(function(){
				 $(this).prop('disabled', true);
			 })
			 $(".validquest31  input:text").prop('disabled', true);
			 
			 $(".del31,.del32").css({'opacity':0.4,'pointer-events':'none'});
			 }
				

 

	//	 
		 
		 
	 
	 $('div#quest31 input:checkbox').each(function(){
		 if($(this).is(':checked')){tt ++;}
	   })
	   if(tt == 0){ 
		 	if($.trim($('div#quest31 input:text').val()) != '') {
		 		$('.validquest32 input:checkbox').each(function(){
					 $(this).prop('disabled', true);
				 })
				 $(".validquest32  input:text").prop('disabled', true);
		 		
				 $(".del32").css({'opacity':0.4,'pointer-events':'none'});
				 }
	   }
	 if(tt > 0){
		 $('.validquest32 input:checkbox').each(function(){
			 $(this).prop('disabled', true);
		 })
		 $(".validquest32  input:text").prop('disabled', true);
		 
		 $(".del32").css({'opacity':0.4,'pointer-events':'none'});
		 }
	   
	 
	 if($("#question33").val() == 'Да, я получал(а) бесплатную медицинскую помощь на других территориях РФ по полису ОМС (к вопросу 35)'){$('#question34').prop('disabled', true);$(".del34").css({'opacity':0.4,'pointer-events':'none'});}
		else{
			if($("#question33").val() == 'Нет, не приходилось (к вопросу 35)'){$(".del34").css({'opacity':0.4,'pointer-events':'none'}); $('#question34').prop('disabled', true);}
			else{$(".del34").css({'opacity':1,'pointer-events':'visible'}); $('#question34').prop('disabled', false);}
			}
	 
	 if($("#question35").val() == 'Не приходилось (к вопросу 37)'){$(".del36").css({'opacity':0.4,'pointer-events':'none'}); $('#question36').prop('disabled', true);}
		else{$(".del36").css({'opacity':1,'pointer-events':'visible'}); $('#question36').prop('disabled', false);}  
		
		if($("#question37").val() == 'Нет, никогда не приходилось к (вопросу 39)'){$(".del38").css({'opacity':0.4,'pointer-events':'none'}); $('#question38').prop('disabled', true);}
		else{$(".del38").css({'opacity':1,'pointer-events':'visible'}); $('#question38').prop('disabled', false);}
		
/*	if($("#ageSecondLevelClinic").val() < 18){
		
		$('#question41').prop('disabled', true);$(".del40").css({'opacity':0.4,'pointer-events':'none'});	
		$('#question42').prop('disabled', true);$(".del40").css({'opacity':0.4,'pointer-events':'none'});
		$('#question43').prop('disabled', true);$(".del40").css({'opacity':0.4,'pointer-events':'none'});
	}else{
		
		$('#question41').prop('disabled', false);$(".del40").css({'opacity':1,'pointer-events':'visible'});	
		$('#question42').prop('disabled', false);$(".del40").css({'opacity':1,'pointer-events':'visible'});
		$('#question43').prop('disabled', false);$(".del40").css({'opacity':1,'pointer-events':'visible'});
	}	
	
	
	
	if($("#ageSecondleveldaystacionar").val() < 18){
		
		$('#questionDS31').prop('disabled', true);$(".del30").css({'opacity':0.4,'pointer-events':'none'});	
		$('#questionDS32').prop('disabled', true);$(".del30").css({'opacity':0.4,'pointer-events':'none'});
		$('#questionDS33').prop('disabled', true);$(".del30").css({'opacity':0.4,'pointer-events':'none'});
	}else{
		
		$('#questionDS31').prop('disabled', false);$(".del30").css({'opacity':1,'pointer-events':'visible'});	
		$('#questionDS32').prop('disabled', false);$(".del30").css({'opacity':1,'pointer-events':'visible'});
		$('#questionDS33').prop('disabled', false);$(".del30").css({'opacity':1,'pointer-events':'visible'});
	}	
	
	
	if($("#ageSls").val() < 18){
		
		$('#questionS30').prop('disabled', true);$(".del29").css({'opacity':0.4,'pointer-events':'none'});	
		$('#questionS31').prop('disabled', true);$(".del29").css({'opacity':0.4,'pointer-events':'none'});
		$('#questionS32').prop('disabled', true);$(".del29").css({'opacity':0.4,'pointer-events':'none'});
	}else{
		
		$('#questionS30').prop('disabled', false);$(".del29").css({'opacity':1,'pointer-events':'visible'});	
		$('#questionS31').prop('disabled', false);$(".del29").css({'opacity':1,'pointer-events':'visible'});
		$('#questionS32').prop('disabled', false);$(".del29").css({'opacity':1,'pointer-events':'visible'});
	}	*/
	
	}		

/*
 * Метод обрабатывает нажатие Анкеты второго уровня -> АП помощь
 * 
 */
function alloneclinicsecondlevel(varr) {
	
	$.ajax({
		url : 'clinicsecondlevel',
		type: 'get',
		dataType: 'json',
		data : ({ test : varr}),
		contentType: 'application/json',
	    mimeType: 'application/json',
	    success: function(response){
 
		      if(response.status == "SUCCESS"){
		    	  userInfo = "<tr><th>№</th><th>МО</th><th>Дата опроса</th><th>Дата ввода</th><th>Пол</th><th>Возраст</th><th>Пользователь</th></tr>";
		    	  for(i =0 ; i < response.result.length ; i++){
		    		  userInfo += "<tr><td><span class='mycount'></span></td><td><a href='#' onclick=secondcliniceditid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].moSecondlevel + "</a></td><td><a href='#' onclick=secondcliniceditid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].dataRespSecondlevel + "</a></td><td><a href='#' onclick=secondcliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].dataInputSecondlevel + "</a></td><td><a href='#' onclick=secondcliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].sexSecondlevel + "</a></td><td><a href='#' onclick=secondcliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].ageSecondlevel + "</a></td><td><a href='#' onclick=secondcliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].polzovatelSecondlevel + "</a></td></tr>";
		    	  }
		    	  $('#records_tablesecondlevel').html(userInfo);
		    	  $('#records_tablesecondlevel').animate({opacity: 0}, 0 );
		    	  $('#records_tablesecondlevel').animate({opacity: 1}, 4000 );
		    	 
		      }else{
		      }	      
		    },  
		    error: function(e){  
		      alert('Произошла ошибка. Обновите страницу. ' + e);  
		    }
	});
	
}


function secondlevelclinic(varr) {
	
	
	if(	validateSecondClinic()){  $(".errorSecondClinic").css('display','block');	}else{
	
						var general = {}
						var sec1 = {}
						var sec2 = {}
						var question25 = {}
						var many = {}
						
						general["moSecondlevel"] = $("#moSecondLevel").val();
						general["dataRespSecondlevel"] = $("input[name='dataRespNSecondLevel']").val();
						general["visitClinicSecondlevel"] = $("#visitClinicSecondLevel").val();
						
						if($("#question2_1_clinic").is(':checked')){ many["question2_1_clinic"] = $("#question2_1_clinic").val();} else{ many["question2_1_clinic"] = "пусто";	}
						if($("#question2_2_clinic").is(':checked')){ many["question2_2_clinic"] = $("#question2_2_clinic").val();} else{ many["question2_2_clinic"] = "пусто";	}
						if($("#question2_3_clinic").is(':checked')){ many["question2_3_clinic"] = $("#question2_3_clinic").val();} else{ many["question2_3_clinic"] = "пусто";	}
						if($("#question2_4_clinic").is(':checked')){ many["question2_4_clinic"] = $("#question2_4_clinic").val();} else{ many["question2_4_clinic"] = "пусто";	}
						if($("#question2_5_clinic").is(':checked')){ many["question2_5_clinic"] = $("#question2_5_clinic").val();} else{ many["question2_5_clinic"] = "пусто";	}
						if($("#question2_6_clinic").val() != ''){many["question2_6_clinic"] = $("#question2_6_clinic").val();	}else{ many["question2_6_clinic"] = 'пусто';	}
						
						sec1["replacementClinicSecondlevel"] = $("#replacementClinicSecondLevel").val();
						sec1["question4"] = $("#question4").val();
						general["question5"] = $("#question5").val();
						
						if($("#question6_1_1_clinic").is(':checked')){ many["question6_1_1_clinic"] = $("#question6_1_1_clinic").val();} else{ many["question6_1_1_clinic"] = "пусто";	}
						if($("#question6_1_2_clinic").is(':checked')){ many["question6_1_2_clinic"] = $("#question6_1_2_clinic").val();} else{ many["question6_1_2_clinic"] = "пусто";	}
						if($("#question6_1_3_clinic").is(':checked')){ many["question6_1_3_clinic"] = $("#question6_1_3_clinic").val();} else{ many["question6_1_3_clinic"] = "пусто";	}
						if($("#question6_1_4_clinic").is(':checked')){ many["question6_1_4_clinic"] = $("#question6_1_4_clinic").val();} else{ many["question6_1_4_clinic"] = "пусто";	}
						if($("#question6_1_5_clinic").val() != ''){many["question6_1_5_clinic"] = $("#question6_1_5_clinic").val();	}else{ many["question6_1_5_clinic"] = 'пусто';	}
						
						if($("#question6_2_1_clinic").is(':checked')){ many["question6_2_1_clinic"] = $("#question6_2_1_clinic").val();} else{ many["question6_2_1_clinic"] = "пусто";	}
						if($("#question6_2_2_clinic").is(':checked')){ many["question6_2_2_clinic"] = $("#question6_2_2_clinic").val();} else{ many["question6_2_2_clinic"] = "пусто";	}
						if($("#question6_2_3_clinic").is(':checked')){ many["question6_2_3_clinic"] = $("#question6_2_3_clinic").val();} else{ many["question6_2_3_clinic"] = "пусто";	}
						if($("#question6_2_4_clinic").is(':checked')){ many["question6_2_4_clinic"] = $("#question6_2_4_clinic").val();} else{ many["question6_2_4_clinic"] = "пусто";	}
						if($("#question6_2_5_clinic").val() != ''){many["question6_2_5_clinic"] = $("#question6_2_5_clinic").val();	}else{ many["question6_2_5_clinic"] = 'пусто';	}
						
						sec1["question7"] = $("#question7").val();
						sec1["question8_1"] = $("#question8_1").val();
						sec1["question8_2"] = $("#question8_2").val();
						general["question9_1"] = $("#question9_1").val();
						general["question9_2"] = $("#question9_2").val();
						sec1["question10"] = $("#question10").val();
						general["question11"] = $("#question11").val();
						sec2["question12_clinic"] = $("#question12_clinic").val();
						sec1["question13"] = $("#question13").val();
						sec1["question14"] = $("#question14").val();
						sec1["question15"] = $("#question15").val();
						general["question16"] = $("#question16").val();
						general["question17"] = $("#question17").val();
						sec1["question18"] = $("#question18").val();
						general["question19"] = $("#question19").val();
						
						sec2["question20_1_clinic"] = $("#question20_1_clinic").val();
						sec2["question20_2_clinic"] = $("#question20_2_clinic").val();
						sec2["question20_3_clinic"] = $("#question20_3_clinic").val();
						sec2["question20_4_clinic"] = $("#question20_4_clinic").val();
						sec2["question20_5_clinic"] = $("#question20_5_clinic").val();
						sec2["question20_6_clinic"] = $("#question20_6_clinic").val();
						sec2["question20_7_clinic"] = $("#question20_7_clinic").val();
						sec2["question20_8_clinic"] = $("#question20_8_clinic").val();
						sec2["question20_9_clinic"] = $("#question20_9_clinic").val();
						sec2["question20_10_clinic"] = $("#question20_10_clinic").val();
						sec2["question20_11_clinic"] = $("#question20_11_clinic").val();
						sec2["question20_12_clinic"] = $("#question20_12_clinic").val();
						sec2["question20_13_clinic"] = $("#question20_13_clinic").val();
						sec2["question20_14_clinic"] = $("#question20_14_clinic").val();
						sec2["question20_15_clinic"] = $("#question20_15_clinic").val();
						sec2["question20_16_clinic"] = $("#question20_16_clinic").val();
						sec2["question20_17_clinic"] = $("#question20_17_clinic").val();
						sec1["question21"] = $("#question21").val();
						sec2["question22_clinic"] = $("#question22_clinic").val();
						sec1["question23"] = $("#question23").val();
						
						if($("#question24_1_clinic").is(':checked')){ many["question24_1_clinic"] = $("#question24_1_clinic").val();} else{ many["question24_1_clinic"] = "пусто";	}
						if($("#question24_2_clinic").is(':checked')){ many["question24_2_clinic"] = $("#question24_2_clinic").val();} else{ many["question24_2_clinic"] = "пусто";	}
						if($("#question24_3_clinic").is(':checked')){ many["question24_3_clinic"] = $("#question24_3_clinic").val();} else{ many["question24_3_clinic"] = "пусто";	}
						if($("#question24_4_clinic").is(':checked')){ many["question24_4_clinic"] = $("#question24_4_clinic").val();} else{ many["question24_4_clinic"] = "пусто";	}
						if($("#question24_5_clinic").is(':checked')){ many["question24_5_clinic"] = $("#question24_5_clinic").val();} else{ many["question24_5_clinic"] = "пусто";	}
						if($("#question24_6_clinic").is(':checked')){ many["question24_6_clinic"] = $("#question24_6_clinic").val();} else{ many["question24_6_clinic"] = "пусто";	}
						if($("#question24_7_clinic").is(':checked')){ many["question24_7_clinic"] = $("#question24_7_clinic").val();} else{ many["question24_7_clinic"] = "пусто";	}
						if($("#question24_8_clinic").is(':checked')){ many["question24_8_clinic"] = $("#question24_8_clinic").val();} else{ many["question24_8_clinic"] = "пусто";	}
						if($("#question24_9_clinic").is(':checked')){ many["question24_9_clinic"] = $("#question24_9_clinic").val();} else{ many["question24_9_clinic"] = "пусто";	}
						if($("#question24_10_clinic").val() != ''){many["question24_10_clinic"] = $("#question24_10_clinic").val();	}else{ many["question24_10_clinic"] = 'пусто';	}
					
						question25["question25_1_clinic"] = $("#question25_1_clinic").val();
						question25["question25_2_clinic"] = $("#question25_2_clinic").val();
						question25["question25_3_clinic"] = $("#question25_3_clinic").val();
						question25["question25_4_clinic"] = $("#question25_4_clinic").val();
						question25["question25_5_clinic"] = $("#question25_5_clinic").val();
						question25["question25_6_clinic"] = $("#question25_6_clinic").val();
						question25["question25_7_clinic"] = $("#question25_7_clinic").val();
						question25["question25_8_clinic"] = $("#question25_8_clinic").val();
						question25["question25_9_clinic"] = $("#question25_9_clinic").val();
						question25["question25_10_clinic"] = $("#question25_10_clinic").val();
						question25["question25_11_clinic"] = $("#question25_11_clinic").val();
						
						if($("#question26_1_clinic").is(':checked')){ many["question26_1_clinic"] = $("#question26_1_clinic").val();} else{ many["question26_1_clinic"] = "пусто";	}
						if($("#question26_2_clinic").is(':checked')){ many["question26_2_clinic"] = $("#question26_2_clinic").val();} else{ many["question26_2_clinic"] = "пусто";	}
						if($("#question26_3_clinic").is(':checked')){ many["question26_3_clinic"] = $("#question26_3_clinic").val();} else{ many["question26_3_clinic"] = "пусто";	}
						if($("#question26_4_clinic").is(':checked')){ many["question26_4_clinic"] = $("#question26_4_clinic").val();} else{ many["question26_4_clinic"] = "пусто";	}
						if($("#question26_5_clinic").is(':checked')){ many["question26_5_clinic"] = $("#question26_5_clinic").val();} else{ many["question26_5_clinic"] = "пусто";	}
						if($("#question26_6_clinic").is(':checked')){ many["question26_6_clinic"] = $("#question26_6_clinic").val();} else{ many["question26_6_clinic"] = "пусто";	}
						if($("#question26_7_clinic").val() != ''){many["question26_7_clinic"] = $("#question26_7_clinic").val();	}else{ many["question26_7_clinic"] = 'пусто';	}
						
						general["question27"] = $("#question27").val();
						
						if($("#question28_1_clinic").is(':checked')){ many["question28_1_clinic"] = $("#question28_1_clinic").val();} else{ many["question28_1_clinic"] = "пусто";	}
						if($("#question28_2_clinic").is(':checked')){ many["question28_2_clinic"] = $("#question28_2_clinic").val();} else{ many["question28_2_clinic"] = "пусто";	}
						if($("#question28_3_clinic").is(':checked')){ many["question28_3_clinic"] = $("#question28_3_clinic").val();} else{ many["question28_3_clinic"] = "пусто";	}
						if($("#question28_4_clinic").is(':checked')){ many["question28_4_clinic"] = $("#question28_4_clinic").val();} else{ many["question28_4_clinic"] = "пусто";	}
						if($("#question28_5_clinic").val() != ''){many["question28_5_clinic"] = $("#question28_5_clinic").val();	}else{ many["question28_5_clinic"] = 'пусто';	}
						if($("#question28_6_clinic").val() != ''){many["question28_6_clinic"] = $("#question28_6_clinic").val();	}else{ many["question28_6_clinic"] = 'пусто';	}
						
						if($("#question29_1_clinic").is(':checked')){ many["question29_1_clinic"] = $("#question29_1_clinic").val();} else{ many["question29_1_clinic"] = "пусто";	}
						if($("#question29_2_clinic").is(':checked')){ many["question29_2_clinic"] = $("#question29_2_clinic").val();} else{ many["question29_2_clinic"] = "пусто";	}
						if($("#question29_3_clinic").is(':checked')){ many["question29_3_clinic"] = $("#question29_3_clinic").val();} else{ many["question29_3_clinic"] = "пусто";	}
						if($("#question29_4_clinic").is(':checked')){ many["question29_4_clinic"] = $("#question29_4_clinic").val();} else{ many["question29_4_clinic"] = "пусто";	}
						if($("#question29_5_clinic").is(':checked')){ many["question29_5_clinic"] = $("#question29_5_clinic").val();} else{ many["question29_5_clinic"] = "пусто";	}
						if($("#question29_6_clinic").is(':checked')){ many["question29_6_clinic"] = $("#question29_6_clinic").val();} else{ many["question29_6_clinic"] = "пусто";	}
						if($("#question29_7_clinic").is(':checked')){ many["question29_7_clinic"] = $("#question29_7_clinic").val();} else{ many["question29_7_clinic"] = "пусто";	}
						if($("#question29_8_clinic").val() != ''){many["question29_8_clinic"] = $("#question29_8_clinic").val();	}else{ many["question29_8_clinic"] = 'пусто';	}
						
						general["question30"] = $("#question30").val();
						
						if($("#question31_1_clinic").is(':checked')){ many["question31_1_clinic"] = $("#question31_1_clinic").val();} else{ many["question31_1_clinic"] = "пусто";	}
						if($("#question31_2_clinic").is(':checked')){ many["question31_2_clinic"] = $("#question31_2_clinic").val();} else{ many["question31_2_clinic"] = "пусто";	}
						if($("#question31_3_clinic").val() != ''){many["question31_3_clinic"] = $("#question31_3_clinic").val();	}else{ many["question31_3_clinic"] = 'пусто';	}
						if($("#question31_4_clinic").val() != ''){many["question31_4_clinic"] = $("#question31_4_clinic").val();	}else{ many["question31_4_clinic"] = 'пусто';	}
						
						if($("#question32_1_clinic").is(':checked')){ many["question32_1_clinic"] = $("#question32_1_clinic").val();} else{ many["question32_1_clinic"] = "пусто";	}
						if($("#question32_2_clinic").is(':checked')){ many["question32_2_clinic"] = $("#question32_2_clinic").val();} else{ many["question32_2_clinic"] = "пусто";	}
						if($("#question32_3_clinic").is(':checked')){ many["question32_3_clinic"] = $("#question32_3_clinic").val();} else{ many["question32_3_clinic"] = "пусто";	}
						if($("#question32_4_clinic").is(':checked')){ many["question32_4_clinic"] = $("#question32_4_clinic").val();} else{ many["question32_4_clinic"] = "пусто";	}
						if($("#question32_5_clinic").is(':checked')){ many["question32_5_clinic"] = $("#question32_5_clinic").val();} else{ many["question32_5_clinic"] = "пусто";	}
						if($("#question32_6_clinic").val() != ''){many["question32_6_clinic"] = $("#question32_6_clinic").val();	}else{ many["question32_6_clinic"] = 'пусто';	}
						
						general["question33"] = $("#question33").val();
						general["question34"] = $("#question34").val();
						general["question35"] = $("#question35").val();
						general["question36"] = $("#question36").val();
						general["question37"] = $("#question37").val();
						general["question38"] = $("#question38").val();
						general["sexSecondlevel"] = $("#sexSecondLevelClinic").val();
						general["ageSecondlevel"] = $("#ageSecondLevelClinic").val();
						general["question41"] = $("#question41").val();
						general["question42"] = $("#question42").val();
						general["question43"] = $("#question43").val();
						
						general["polzovatelSecondlevel"] = $("#polzovatelClinicSecondLevel").val();
						
						// после нажатия добавить -> зачищаются периоды для кнопки выбрать
						$("input[name='namedateBeginsecondlevel']").val('');
						$("input[name='namedateEndsecondlevel']").val('');
						
						/*
						 * После того как была нажато редактирование и вылезло модальное с данными по редактированию ловим
						 * id этой записи. Если же была нажата просто кнопка "добавить запись" то if не отрабатывает и новая
						 * запись улетает с null id там он генериться тк запись новая.
						 * 
						 * Обрати внимание после отработки этого ajax поле input #id зануляется
						 * иначе при добавлении новой записи этот айдишник постоянно будет и соответственно не добавляться будет а 
						 * редактироваться по этому id
						 */
						if($("#idClinicSecondLevel").val()){ 	general["id"] = parseInt($("#idClinicSecondLevel").val());}
						
						$('#cancelCSL').trigger('click');
						//+ отрабатывает метод в other.js
						
						var sender = ({ survay1:general, survay2:sec1,survay3:sec2,survay4:question25,survay5:many}); 
						
				
						$.post('addsecondclinic',JSON.stringify(sender),function(response)
    	      	                {
								    	  $('#records_tablesecondlevel').animate({opacity: 0.0}, 2000 );
								    	  userInfo = "<tr><th>№</th><th>МО</th><th>Дата опроса</th><th>Дата ввода</th><th>Пол</th><th>Возраст</th><th>Пользователь</th></tr>";
								    	  for(i =0 ; i < response.result.length ; i++){
								    		  userInfo += "<tr><td><span class='mycount'></span></td><td><a href='#' onclick=secondcliniceditid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].moSecondlevel + "</a></td><td><a href='#' onclick=secondcliniceditid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].dataRespSecondlevel + "</a></td><td><a href='#' onclick=secondcliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].dataInputSecondlevel + "</a></td><td><a href='#' onclick=secondcliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].sexSecondlevel + "</a></td><td><a href='#' onclick=secondcliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].ageSecondlevel + "</a></td><td><a href='#' onclick=secondcliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].polzovatelSecondlevel + "</a></td></tr>";
								    	  }
								    	  setTimeout ("$('#records_tablesecondlevel').html('');",2000);
								    	  setTimeout ("$('#records_tablesecondlevel').append(userInfo);", 2000);
								    	  
								    	  $('#records_tablesecondlevel').animate({opacity: 1}, 2000 );
								    	  //  зануляем id input 
								    	  $("#idClinicSecondLevel").val('');
        	      	            },'json')
        	      	          	.error(function(msg) {console.log('test BAD'); $("#idClinicSecondLevel").val('');});
	}				
						
	}	
	

	
/*
 * Метод проверяет на заполненость всей формы второй уровень АП-П
 * метод учитывает если вопрос отключен
 */
function validateSecondClinic()
{
	      
		  // проверяем селекты
	     var t=0;
	      var $form = $('#formClinicSecondLevel') 
	      $('select', $form).each(function() {
	    	  if(!$(this).is(':disabled')){
	    		  // выбираем выбранное
	    		  if($(this).find('option:selected').text().length == 0){
		  	        	t++;
	    		  }  
	    	  }
	      });
	      //	про чекбоксы вопрос2
	      var d = 0;
		   $('.validquest2 input:checkbox').each(function(){
				 if(!$(this).is(':checked')){d++;}
		   })
		   // если все 5 чекбоксов не проставлены
		   if(d == 5){	if($.trim($(".validquest2  input:text").val()) != '') d=0; }
		   // если хотя бы один чек бокс проставлен т.е. d будет меньше 5
		   else{d =	0;}
		   
	      var d6_1 = 0;
		   $('.validquest6_1 input:checkbox').each(function(){
				 if(!$(this).is(':checked')){d6_1++;}
		   })
		   if(d6_1 == 4){	if($.trim($(".validquest6_1  input:text").val()) != '') d6_1=0; }
		   else{d6_1 =	0;}
		   
		   var d6_2 = 0;
		   $('.validquest6_2 input:checkbox').each(function(){
				 if(!$(this).is(':checked')){d6_2++;}
		   })
		   if(d6_2 == 4){	if($.trim($(".validquest6_2  input:text").val()) != '') d6_2=0; }
		   else{d6_2 =	0;}
		   
		   var d24 = 0;
		   $('.validquest24 input:checkbox').each(function(){
				 if(!$(this).is(':checked')){d24++;}
		   })
		   if(d24 == 9){	if($.trim($(".validquest24  input:text").val()) != '') d24=0; }
		   else{d24 =	0;}
		   
		   var d26 = 0;
		   $('.validquest26 input:checkbox').each(function(){
				 if(!$(this).is(':checked')){d26++;}
		   })
		   if(d26 == 6){	if($.trim($(".validquest26  input:text").val()) != '') d26=0; }
		   else{d26 =	0;}
		   
		   var d28 = 0;
		   // проверека на disable - исключаем из валидации отключенные вопросы (достаточно проверить хотя бы один чекбокс из вопроса)
		   if(!$('#question28_1_clinic').is(':disabled')){
			   $('.validquest28 input:checkbox').each(function(){
					 if(!$(this).is(':checked')){d28++;}
			   })
			   if(d28 == 4){	if($.trim($(".validquest28  input:text").val()) != '') d28=0; }
			   else{d28 =	0;}
		   }
		   
		   var d29 = 0;
		   if(!$('#question29_1_clinic').is(':disabled')){
			   $('.validquest29 input:checkbox').each(function(){
					 if(!$(this).is(':checked')){d29++;}
			   })
			   if(d29 == 7){	if($.trim($(".validquest29  input:text").val()) != '') d29=0; }
			   else{d29 =	0;}
		   }
		   
		   var d31 = 0;
		   if(!$('#question31_1_clinic').is(':disabled')){
			   $('.validquest31 input:checkbox').each(function(){
					 if(!$(this).is(':checked')){d31++;}
				   
			   })
			   if(d31 == 2){	if($.trim($("#question31_3_clinic").val()) != '' || $.trim($("#question31_4_clinic").val()) != '') d31=0; }
			   else{d31 =	0;}
		   }
		   
		   var d32 = 0;
		   if(!$('#question32_1_clinic').is(':disabled')){
			   $('.validquest32 input:checkbox').each(function(){
					 if(!$(this).is(':checked')){d32++;}
			   })
			   if(d32 == 5){	if($.trim($(".validquest32  input:text").val()) != '') d32=0; }
			   else{d32 =	0;}
		   }
		   
		   var d36= 0 ;
		   if(!$('#question36').is(':disabled')){	if($("#question36").val() == '') d36++;	}
		   
		   var d16= 0 ;
		   if(!$('#question16').is(':disabled')){	if($("#question16").val() == '') d16++;	}
		   
		   

	   console.log('t '+t+' d '+d+' d6_1 '+ d6_1+' d6_2 '+ d6_2+' d24 '+ d24+' d26 '+ d26+' d28 '+ d28+' d29 '+ d29+' d32 '+ d32+' d31 '+ d31+' d36 '+ d36+' d16 '+ d16);
	   if((t+d+d6_1+d6_2+d24+d26+d28+d29+d32+d31+d36+d16) > 0) return true; else false;   
}

/*
 * Метод заполняет модальное окно второго уровня данными по id записи (редакитирование)
 */
function secondcliniceditid( varr,varr2) {
	console.log(varr+'  '+varr2);
	$.ajax({
		url : 'secondcliniceditid',
		type: 'get',
		dataType: 'json',
		data : ({ user: varr, id: varr2}),
		contentType: 'application/json',
	    mimeType: 'application/json',
	    success: function(response)
	    {
		      // we have the response 
		      if(response.status == "SUCCESS")
		      {
		    	  /*  console.log('test '+JSON.stringify(response));
		    		  console.log('=======================');
		    		  console.log('test '+JSON.stringify(response.result[0]));
		    		  console.log('=======================');
		    		  console.log('test '+JSON.stringify(response.result[0].survayClinicSec1));
		    		  console.log('=======================');
		    		  console.log('test '+JSON.stringify(response.result[0].question_many));
		    	  */
		    	  
		    	  $('#addOneClinicsecondlevel').trigger('click');
		    	  $('#myModalClinicSecondLevel .modal-title').text('Редактирование анкеты второго уровня');
		    	  $('.modal-header p').text('Редактирование анкеты амбулаторно-поликлинической помощи');
		    	  $('.renamebtn').text('Редактировать');
		    	  
		    	  for(i =0 ; i < response.result.length ; i++){
		    		  $("#idClinicSecondLevel").val(response.result[i].id);
		    		  $("input[name='dataRespNSecondLevel']").val(response.result[i].dataRespSecondlevel);
		    		  
		    		  $("#ageSecondLevelClinic").val(response.result[i].ageSecondlevel);
		    		  $("#moSecondLevel option:contains(" + response.result[i].moSecondlevel +")").prop('selected', true);
		    		  $("#sexSecondLevelClinic option:contains(" + response.result[i].sexSecondlevel +")").prop('selected', true);
		    		  $("#visitClinicSecondLevel option:contains(" + response.result[i].visitClinicSecondlevel +")").prop('selected', true);
		    		  $("#question5 option:contains(" + response.result[i].question5 +")").prop('selected', true);
		    		  $("#question9_1 option:contains(" + response.result[i].question9_1 +")").prop('selected', true);
		    		  $("#question9_2 option:contains(" + response.result[i].question9_2 +")").prop('selected', true);
		    		  $("#question11 option:contains(" + response.result[i].question11 +")").prop('selected', true);
		    		  $("#question16").val(response.result[i].question16);
		    		  $("#question17 option:contains(" + response.result[i].question17 +")").prop('selected', true);
		    		  $("#question19 option:contains(" + response.result[i].question19 +")").prop('selected', true);
		    		  $("#question27 option:contains(" + response.result[i].question27 +")").prop('selected', true);
		    		  $("#question30 option:contains(" + response.result[i].question30 +")").prop('selected', true);
		    		  $("#question33 option:contains(" + response.result[i].question33 +")").prop('selected', true);
		    		  $("#question34 option:contains(" + response.result[i].question34 +")").prop('selected', true);
		    		  $("#question35 option:contains(" + response.result[i].question35 +")").prop('selected', true);
		    		  $("#question36").val(response.result[i].question36);
		    		  $("#question37 option:contains(" + response.result[i].question37 +")").prop('selected', true);
		    		  $("#question38 option:contains(" + response.result[i].question38 +")").prop('selected', true);
		    		  $("#question41 option:contains(" + response.result[i].question41 +")").prop('selected', true);
		    		  $("#question42 option:contains(" + response.result[i].question42 +")").prop('selected', true);
		    		  $("#question43 option:contains(" + response.result[i].question43 +")").prop('selected', true);
		    	  }
		    	  
		    	  $("#replacementClinicSecondLevel option:contains(" + response.result[0].survayClinicSec1.replacementClinicSecondlevel +")").prop('selected', true);
		    	  $("#question4 option:contains(" + response.result[0].survayClinicSec1.question4 +")").prop('selected', true);
		    	  $("#question7 option:contains(" + response.result[0].survayClinicSec1.question7 +")").prop('selected', true);
		    	  $("#question8_1 option:contains(" + response.result[0].survayClinicSec1.question8_1 +")").prop('selected', true);
		    	  $("#question8_2 option:contains(" + response.result[0].survayClinicSec1.question8_2 +")").prop('selected', true);
		    	  $("#question10 option:contains(" + response.result[0].survayClinicSec1.question10 +")").prop('selected', true);
		    	  $("#question13 option:contains(" + response.result[0].survayClinicSec1.question13 +")").prop('selected', true);
		    	  $("#question14 option:contains(" + response.result[0].survayClinicSec1.question14 +")").prop('selected', true);
		    	  $("#question15 option:contains(" + response.result[0].survayClinicSec1.question15 +")").prop('selected', true);
		    	  $("#question18 option:contains(" + response.result[0].survayClinicSec1.question18 +")").prop('selected', true);
		    	  $("#question21 option:contains(" + response.result[0].survayClinicSec1.question21 +")").prop('selected', true);
		    	  $("#question23 option:contains(" + response.result[0].survayClinicSec1.question23 +")").prop('selected', true);
		    	  
		    	  $("#question12_clinic option:contains(" + response.result[0].survayClinicSec2.question12_clinic +")").prop('selected', true);
		    	  $("#question22_clinic option:contains(" + response.result[0].survayClinicSec2.question22_clinic +")").prop('selected', true);
		    	  $("#question20_1_clinic option:contains(" + response.result[0].survayClinicSec2.question20_1_clinic +")").prop('selected', true);
		    	  $("#question20_2_clinic option:contains(" + response.result[0].survayClinicSec2.question20_2_clinic +")").prop('selected', true);
		    	  $("#question20_3_clinic option:contains(" + response.result[0].survayClinicSec2.question20_3_clinic +")").prop('selected', true);
		    	  $("#question20_4_clinic option:contains(" + response.result[0].survayClinicSec2.question20_4_clinic +")").prop('selected', true);
		    	  $("#question20_5_clinic option:contains(" + response.result[0].survayClinicSec2.question20_5_clinic +")").prop('selected', true);
		    	  $("#question20_6_clinic option:contains(" + response.result[0].survayClinicSec2.question20_6_clinic +")").prop('selected', true);
		    	  $("#question20_7_clinic option:contains(" + response.result[0].survayClinicSec2.question20_7_clinic +")").prop('selected', true);
		    	  $("#question20_8_clinic option:contains(" + response.result[0].survayClinicSec2.question20_8_clinic +")").prop('selected', true);
		    	  $("#question20_9_clinic option:contains(" + response.result[0].survayClinicSec2.question20_9_clinic +")").prop('selected', true);
		    	  $("#question20_10_clinic option:contains(" + response.result[0].survayClinicSec2.question20_10_clinic +")").prop('selected', true);
		    	  $("#question20_11_clinic option:contains(" + response.result[0].survayClinicSec2.question20_11_clinic +")").prop('selected', true);
		    	  $("#question20_12_clinic option:contains(" + response.result[0].survayClinicSec2.question20_12_clinic +")").prop('selected', true);
		    	  $("#question20_13_clinic option:contains(" + response.result[0].survayClinicSec2.question20_13_clinic +")").prop('selected', true);
		    	  $("#question20_14_clinic option:contains(" + response.result[0].survayClinicSec2.question20_14_clinic +")").prop('selected', true);
		    	  $("#question20_15_clinic option:contains(" + response.result[0].survayClinicSec2.question20_15_clinic +")").prop('selected', true);
		    	  $("#question20_16_clinic option:contains(" + response.result[0].survayClinicSec2.question20_16_clinic +")").prop('selected', true);
		    	  $("#question20_17_clinic option:contains(" + response.result[0].survayClinicSec2.question20_17_clinic +")").prop('selected', true);
		    	  
		    	  $("#question25_1_clinic option:contains(" + response.result[0].survayClinicSec25.question25_1_clinic +")").prop('selected', true);
		    	  $("#question25_2_clinic option:contains(" + response.result[0].survayClinicSec25.question25_2_clinic +")").prop('selected', true);
		    	  $("#question25_3_clinic option:contains(" + response.result[0].survayClinicSec25.question25_3_clinic +")").prop('selected', true);
		    	  $("#question25_4_clinic option:contains(" + response.result[0].survayClinicSec25.question25_4_clinic +")").prop('selected', true);
		    	  $("#question25_5_clinic option:contains(" + response.result[0].survayClinicSec25.question25_5_clinic +")").prop('selected', true);
		    	  $("#question25_6_clinic option:contains(" + response.result[0].survayClinicSec25.question25_6_clinic +")").prop('selected', true);
		    	  $("#question25_7_clinic option:contains(" + response.result[0].survayClinicSec25.question25_7_clinic +")").prop('selected', true);
		    	  $("#question25_8_clinic option:contains(" + response.result[0].survayClinicSec25.question25_8_clinic +")").prop('selected', true);
		    	  $("#question25_9_clinic option:contains(" + response.result[0].survayClinicSec25.question25_9_clinic +")").prop('selected', true);
		    	  $("#question25_10_clinic option:contains(" + response.result[0].survayClinicSec25.question25_10_clinic +")").prop('selected', true);
		    	  $("#question25_11_clinic option:contains(" + response.result[0].survayClinicSec25.question25_11_clinic +")").prop('selected', true);
		    	  
		    	  for(i =0 ; i < response.result[0].question_many.length ; i++){
		    		  // ВТОРОЙ ВОПРОС
		    		  if(response.result[0].question_many[i].question2_clinic == 'Близко расположена к дому') {	$("#question2_1_clinic").prop("checked", true);} 
		    		  else{
		    			  if(response.result[0].question_many[i].question2_clinic == 'Здесь чисто и уютно, приятно находиться') { $("#question2_2_clinic").prop("checked", true);}
		    			  else{
		    				  if(response.result[0].question_many[i].question2_clinic == 'Здесь работают хорошие специалисты') {$("#question2_3_clinic").prop("checked", true);}
		    				  else{
		    					  if(response.result[0].question_many[i].question2_clinic == 'Большой спектр медицинских услуг') {$("#question2_4_clinic").prop("checked", true);}
		    					  else{
		    						  if(response.result[0].question_many[i].question2_clinic == 'Я прикреплен(а) к этой поликлинике, наблюдался(лась) здесь ранее') {$("#question2_5_clinic").prop("checked", true);}
		    						  else{
		    							  if(response.result[0].question_many[i].question2_clinic != null) $("#question2_6_clinic").val(response.result[0].question_many[i].question2_clinic);
		    						  }
		    					  }
		    				  }
		    			  }
		    		  } 
		    		  //  ВОПРОС 6.1
		    		  if(response.result[0].question_many[i].question6_1_clinic == 'В регистратуре') {	$("#question6_1_1_clinic").prop("checked", true);}
		    		  else{
		    			  if(response.result[0].question_many[i].question6_1_clinic == 'По телефону') {	$("#question6_1_2_clinic").prop("checked", true);}
		    			  else{
		    				  if(response.result[0].question_many[i].question6_1_clinic == 'Через интернет (портал госуслуг)') {	$("#question6_1_3_clinic").prop("checked", true);}
		    				  else{
		    					  if(response.result[0].question_many[i].question6_1_clinic == 'Через информационные терминалы в поликлинике') {	$("#question6_1_4_clinic").prop("checked", true);}
		    					  else{
		    						  if(response.result[0].question_many[i].question6_1_clinic != null) $("#question6_1_5_clinic").val(response.result[0].question_many[i].question6_1_clinic);
		    					  }
		    				  }
		    			  }
		    		  }
		    		  //  ВОПРОС 6.2
		    		  if(response.result[0].question_many[i].question6_2_clinic == 'В регистратуре') {	$("#question6_2_1_clinic").prop("checked", true);}
		    		  else{
		    			  if(response.result[0].question_many[i].question6_2_clinic == 'По телефону') {	$("#question6_2_2_clinic").prop("checked", true);}
		    			  else{
		    				  if(response.result[0].question_many[i].question6_2_clinic == 'Через интернет (портал госуслуг)') {	$("#question6_2_3_clinic").prop("checked", true);}
		    				  else{
		    					  if(response.result[0].question_many[i].question6_2_clinic == 'Через информационные терминалы в поликлинике') {	$("#question6_2_4_clinic").prop("checked", true);}
		    					  else{
		    						  if(response.result[0].question_many[i].question6_2_clinic != null) $("#question6_2_5_clinic").val(response.result[0].question_many[i].question6_2_clinic);  
		    					  }
		    				  }
		    			  }
		    		  }
		    		  //  ВОПРОС 24  
		    		  if(response.result[0].question_many[i].question24_clinic == 'От медицинских работников') {	$("#question24_1_clinic").prop("checked", true);}
		    		  else{
		    			  if(response.result[0].question_many[i].question24_clinic == 'От сотрудников страховой компании') {	$("#question24_2_clinic").prop("checked", true);}
		    			  else{
		    				  if(response.result[0].question_many[i].question24_clinic == 'От сотрудников Фонда ОМС') {	$("#question24_3_clinic").prop("checked", true);}
		    				  else{
		    					  if(response.result[0].question_many[i].question24_clinic == 'От знакомых/родственников') {	$("#question24_4_clinic").prop("checked", true);}
		    					  else{
		    						  if(response.result[0].question_many[i].question24_clinic == 'из средств массовой информации') {	$("#question24_5_clinic").prop("checked", true);}
		    						  else{
		    							  if(response.result[0].question_many[i].question24_clinic == 'из информации для населения в медицинских организациях (стенды, брошюры,листовки)') {	$("#question24_6_clinic").prop("checked", true);}
		    							  else{
		    								  if(response.result[0].question_many[i].question24_clinic == 'из сети интернет') {	$("#question24_7_clinic").prop("checked", true);}
		    								  else{
		    									  if(response.result[0].question_many[i].question24_clinic == 'Я не знаю своих прав') {	$("#question24_8_clinic").prop("checked", true);}
		    									  else{
		    										  if(response.result[0].question_many[i].question24_clinic == 'Затрудняюсь ответить') {	$("#question24_9_clinic").prop("checked", true);}
		    										  else{
		    											  if(response.result[0].question_many[i].question24_clinic != null)  $("#question24_10_clinic").val(response.result[0].question_many[i].question24_clinic);
		    										  }
		    									  }
		    								  }
		    							  }
		    						  }
		    					  }
		    				  }
		    			  }
		    		  }
		    		  //  ВОПРОС 26  
		    		  if(response.result[0].question_many[i].question26_clinic == 'Администрация медицинской организации') {	$("#question26_1_clinic").prop("checked", true);}
		    		  else{
		    			  if(response.result[0].question_many[i].question26_clinic == 'Страховая компания, выдавшая полис ОМС') {	$("#question26_2_clinic").prop("checked", true);}
		    			  else{
		    				  if(response.result[0].question_many[i].question26_clinic == 'Фонд обязательного медицинского страхования') {	$("#question26_3_clinic").prop("checked", true);}
		    				  else{
		    					  if(response.result[0].question_many[i].question26_clinic == 'Органы управления здравоохранением') {	$("#question26_4_clinic").prop("checked", true);}
		    					  else{
		    						  if(response.result[0].question_many[i].question26_clinic == 'Гражданский суд') {	$("#question26_5_clinic").prop("checked", true);}
		    						  else{
		    							  if(response.result[0].question_many[i].question26_clinic == 'Затрудняюсь ответить') {	$("#question26_6_clinic").prop("checked", true);}
		    							  else{
		    								  if(response.result[0].question_many[i].question26_clinic != null) $("#question26_7_clinic").val(response.result[0].question_many[i].question26_clinic);
		    							  }
		    						  }
		    					  }
		    				  }
		    			  }
		    		  }
		    		  // вопрос 28
		    		  if(response.result[0].question_many[i].question28_clinic == 'Не знал(а), куда обратиться') {	$("#question28_1_clinic").prop("checked", true);}
		    		  else{
		    			  if(response.result[0].question_many[i].question28_clinic == 'Решил(а), что пытаться бесполезно') {	$("#question28_2_clinic").prop("checked", true);}
		    			  else{
		    				  if(response.result[0].question_many[i].question28_clinic == 'Побоялся(лась) огласки') {	$("#question28_3_clinic").prop("checked", true);}
		    				  else{
		    					  if(response.result[0].question_many[i].question28_clinic == 'Не хотел(а) портить отношения с врачом') {	$("#question28_4_clinic").prop("checked", true);}
		    					  else{
		    						  if(response.result[0].question_many[i].question28_clinic != null) $("#question28_5_clinic").val(response.result[0].question_many[i].question28_clinic);
		    					  }
		    				  }
		    			  }
		    		  }
		    		  // ВОПРОС 29
		    		  if(response.result[0].question_many[i].question29_clinic == 'Врачом оказана некачественная медицинская помощь') {	$("#question29_1_clinic").prop("checked", true);}
		    		  else{
		    			  if(response.result[0].question_many[i].question29_clinic == 'Врачом разглашена конфиденциальная информация о состоянии здоровья') {	$("#question29_2_clinic").prop("checked", true);}
		    			  else{
		    				  if(response.result[0].question_many[i].question29_clinic == 'Врачом не были назначены необходимые диагностические процедуры') {	$("#question29_3_clinic").prop("checked", true);}
		    				  else{
		    					  if(response.result[0].question_many[i].question29_clinic == 'Врачом не было назначено необходимое лечение') {	$("#question29_4_clinic").prop("checked", true);}
		    					  else{
		    						  if(response.result[0].question_many[i].question29_clinic == 'Врач не дал направление на обследование в другую медицинскую организацию') {	$("#question29_5_clinic").prop("checked", true);}
		    						  else{
		    							  if(response.result[0].question_many[i].question29_clinic == 'Врач  пытался  получить деньги за те услуги, которые должны быть оказаны бесплатно') {	$("#question29_6_clinic").prop("checked", true);}
		    							  else{
		    								  if(response.result[0].question_many[i].question29_clinic == 'Врач вел себя грубо, безразлично, невежливо') {	$("#question29_7_clinic").prop("checked", true);}
		    								  else{
		    									  if(response.result[0].question_many[i].question29_clinic != null) $("#question29_8_clinic").val(response.result[0].question_many[i].question29_clinic);
		    								  }
		    							  }
		    						  }
		    					  }
		    				  }
		    			  }
		    		  }
		    		  // вопрос 31
		    		  if(response.result[0].question_many[i].question31_clinic == 'Не знал(а), куда обратиться') {	$("#question31_1_clinic").prop("checked", true);}
		    		  else{
		    			  if(response.result[0].question_many[i].question31_clinic == 'Решил(а), что пытаться бесполезно') {	$("#question31_2_clinic").prop("checked", true);}
		    			  else{
		    				  if(response.result[0].question_many[i].question31_clinic != null)  $("#question31_3_clinic").val(response.result[0].question_many[i].question31_clinic);
		    			  }
		    		  }
		    		  // вопрос 32
		    		  if(response.result[0].question_many[i].question32_clinic == 'в связи с переездом на новое место жительства') {	$("#question32_1_clinic").prop("checked", true);}
		    		  else{
		    			  if(response.result[0].question_many[i].question32_clinic == 'из-за неудобного режима работы') {	$("#question32_2_clinic").prop("checked", true);}
		    			  else{
		    				  if(response.result[0].question_many[i].question32_clinic == 'из-за плохих санитарно-гигиенических условий') {	$("#question32_3_clinic").prop("checked", true);}
		    				  else{
		    					  if(response.result[0].question_many[i].question32_clinic == 'в  связи  с  недостаточным  спектром  медицинских  услуг  (анализы, узи, флюорография, рентген и т.д.)') {	$("#question32_4_clinic").prop("checked", true);}
		    					  else{
		    						  if(response.result[0].question_many[i].question32_clinic == 'из-за недостаточно квалифицированного медицинского персонала') {	$("#question32_5_clinic").prop("checked", true);}
		    						  else{
		    							  if(response.result[0].question_many[i].question32_clinic != null)  $("#question32_6_clinic").val(response.result[0].question_many[i].question32_clinic);
		    						  }
		    					  }
		    				  }
		    			  }
		    		  }
		    		  
		    		  
		    	  }
		    	 // пробегаемся по модальному окну формы редактирования/заполнения  и делаем не активными вопросы которые пропускаются. 
		    	  testclic();
		    	  
		    	  if($("#question15").val() == 'Нет (к вопросу 18)') $(".del15").css({'opacity':0.4,'pointer-events':'none'});
		    	  if($("#question21").val() == 'Нет (к вопросу 23)') $(".del21").css({'opacity':0.4,'pointer-events':'none'});
		    	  
		      }else
		      {
		    	 
		      }	      
	    },  
		    error: function(e){  
		      alert('Error: ' + e);  
		    }
	});
}

/*
*
*   АНКЕТА ВТОРОГО УРОВНЯ ДНЕВНОЙ СТАЦИОНАР
*
*===============================================================================================================================================================================================
*
*/

/*
 * Метод обрабатывает такие моменты в анкете как 'хотел(а), но не смог(а)   к вопросу 31'
 * т.е. блокирует возможность проставить ответ в данном примере на вопрос 30
 * обрабатывает все вопросы сразу....
 */
function dsslvalidlev2(){
	
	if($("#question11sec1").val() == 'Нет к (вопросу 13)'){
		$('#question12sec2').prop('disabled', true);
		$(".deldssl12").css({'opacity':0.4});
		}
	else{ $(".deldssl12").css({'opacity':1}); $('#question12sec2').prop('disabled', false); }
	
	//Вставил что было
//ПОКА БЛОЧУ
	/*
if($("#questionDS17").val() == 'Да (к вопросу 19)'){
		
		$('.validquestdssl18 input:checkbox').each(function(){
			 $(this).prop('disabled', true);
		 })
		 $(".validquestdssl18  input:text").prop('disabled', true);
		$(".deldssl18").css({'opacity':0.4});
	}
	else{
			$('.validquestdssl18 input:checkbox').each(function(){
				 $(this).prop('disabled', false);
			 })
			 $(".validquestdssl18  input:text").prop('disabled', false);
			$(".deldssl18").css({'opacity':1}); 
	
*/

			
					
			
			
			
		//Здесь блокирует только 18
/*if($("#questionDS17").val() == 'Нет, не было необходимости (к вопросу 20)'){
				
				$('.validquestdssl18 input:checkbox').each(function(){
					 $(this).prop('disabled', true);
				 })
				 $(".validquestdssl18  input:text").prop('disabled', true);
				$(".deldssl18").css({'opacity':0.4});
				
				$('.validquestdssl19 input:checkbox').each(function(){
					 $(this).prop('disabled', true);
				 })
				 $(".validquestdssl19  input:text").prop('disabled', true);
				$(".deldssl19").css({'opacity':0.4});
			}
			else{
					$('.validquestdssl18 input:checkbox').each(function(){
					 $(this).prop('disabled', false);
					
					 })
					 $(".validquestdssl18  input:text").prop('disabled', false);
					$(".deldssl18").css({'opacity':1});
					
					$('.validquestdssl19 input:checkbox').each(function(){
						$(this).prop('disabled', false);
						
					 })
					 $(".validquestdssl19  input:text").prop('disabled', false);
					$(".deldssl19").css({'opacity':1});
					
				}*/

	//ПОКА БЛОЧУ
	/*
			if($("#questionDS17").val() == 'Нет, не было необходимости (к вопросу 20)'){
				
				$('.validquestdssl18 input:checkbox').each(function(){
				$(this).prop('disabled', true);
				})
				$(".validquestdssl18  input:text").prop('disabled', true);
				$(".deldssl18").css({'opacity':0.4,'pointer-events':'none'});
									
				$('.validquestdssl19 input:checkbox').each(function(){
				 $(this).prop('disabled', true);
					 })
				$(".validquestdssl19  input:text").prop('disabled', true);
				$(".deldssl19").css({'opacity':0.4,'pointer-events':'none'});
				}
				else{
				$('.validquestdssl18 input:checkbox').each(function(){
				 $(this).prop('disabled', false);
				})
				$(".validquestdssl18  input:text").prop('disabled', false);
				$(".deldssl18").css({'opacity':1,'pointer-events':'visible'});
										
				$('.validquestdssl19 input:checkbox').each(function(){
				 $(this).prop('disabled', false);
				 })
				 $(".validquestdssl19  input:text").prop('disabled', false);
				$(".deldssl19").css({'opacity':1,'pointer-events':'visible'});
									}
			

			
	if($("#questionDS17").val() == 'Нет, не знал(а), что это возможно'){
		$('.validquestdssl18 input:checkbox').each(function(){
			 $(this).prop('disabled', true);
		 })
		 $(".validquestdssl18  input:text").prop('disabled', true);
		$(".deldssl18").css({'opacity':0.4,'pointer-events':'none'});
		
		$('.validquestdssl19 input:checkbox').each(function(){
			 $(this).prop('disabled', true);
		 })
		 $(".validquestdssl19  input:text").prop('disabled', true);
		$(".deldssl19").css({'opacity':0.4,'pointer-events':'none'});		
	
				}
				
	

	
}
	*/
	//ПРОБА555 РАБОТАЕТ
	if($("#questionDS17").val() == 'Да (к вопросу 19)'){ 
				
	$('.validquestdssl18 input:checkbox').each(function(){
	 $(this).prop('disabled', true);
	 })
	$(".validquestdssl18  input:text").prop('disabled', true);
	$(".validquestdssl18").css({'opacity':0.4,'pointer-events':'none'});
				
				
	$('.validquestdssl19 input:checkbox').each(function(){
	 $(this).prop('disabled', false);
	})
	$(".validquestdssl19  input:text").prop('disabled', false);
	$(".validquestdssl19").css({'opacity':1,'pointer-events':'visible'});
				
	}
	else{
	$('.validquestdssl18 input:checkbox').each(function(){
	 $(this).prop('disabled', false);
	 })
	$(".validquestdssl18  input:text").prop('disabled', false);
	$(".validquestdssl18").css({'opacity':1,'pointer-events':'visible'});
					
					
					
					
	if($("#questionDS17").val() == 'Нет, не было необходимости (к вопросу 20)'){
						
	$('.validquestdssl18 input:checkbox').each(function(){
	$(this).prop('disabled', true);
	})
	$(".validquestdssl18  input:text").prop('disabled', true);
	$(".validquestdssl18").css({'opacity':0.4,'pointer-events':'none'});
						
	$('.validquestdssl19 input:checkbox').each(function(){
	 $(this).prop('disabled', true);
	})
	 $(".validquestdssl19  input:text").prop('disabled', true);
	$(".validquestdssl19").css({'opacity':0.4,'pointer-events':'none'});
	}
			else{
		$('.validquestdssl18 input:checkbox').each(function(){
		 $(this).prop('disabled', false);
		 })
	 $(".validquestdssl18  input:text").prop('disabled', false);
							$(".validquestdssl18").css({'opacity':1,'pointer-events':'visible'});
							
	$('.validquestdssl19 input:checkbox').each(function(){
			 $(this).prop('disabled', false);
			 })
	$(".validquestdssl19  input:text").prop('disabled', false);
							$(".validquestdssl19").css({'opacity':1,'pointer-events':'visible'});
						}
if($("#questionDS17").val() == 'Нет, не знал(а), что это возможно'){
						
$('.validquestdssl18 input:checkbox').each(function(){
$(this).prop('disabled', true);
})
$(".validquestdssl18  input:text").prop('disabled', true);
$(".validquestdssl18").css({'opacity':0.4,'pointer-events':'none'});
						
$('.validquestdssl19 input:checkbox').each(function(){
	 $(this).prop('disabled', true);
 })
$(".validquestdssl19  input:text").prop('disabled', true);
	$(".validquestdssl19").css({'opacity':0.4,'pointer-events':'none'});
					}
					
			}	

	

			
			
	//
	 var sht = 0;
	 if(!$('#questionDS18many_1').is(':disabled')){
		 $('.validquestdssl18 input:checkbox').each(function(){
			 if($(this).is(':checked')){sht ++;}
			 if(sht == 0){
				 if($.trim($('#questionDS18many_5').val()) != '') sht++;
			 }
		 })
		 if(sht > 0){
			 
			 $('.validquestdssl19 input:checkbox').each(function(){
				 $(this).prop('disabled', true);
			 })
			 $(".validquestdssl19  input:text").prop('disabled', true);
			 $(".deldssl19").css({'opacity':0.4});
			 
		 }
	 }
	 sht = 0;
	
	 //Вставил как было
	 //ПОКА ЗАБЛОЧИЛ
	 /*
	 if($("#questionDS20").val() == 'Да (к вопросу 22)'){
			
			$('.validquestdssl21 input:checkbox').each(function(){
				 $(this).prop('disabled', true);
			 })
			 $(".validquestdssl21  input:text").prop('disabled', true);
			$(".deldssl21").css({'opacity':0.4,'pointer-events':'none'});
		}
		else{
				$('.validquestdssl21 input:checkbox').each(function(){
					 $(this).prop('disabled', false);
				 })
				 $(".validquestdssl21  input:text").prop('disabled', false);
				$(".deldssl21").css({'opacity':1,'pointer-events':'visible'}); 
				
				if($("#questionDS20").val() == 'Нет, не было необходимости (к вопросу 23)'){
					
					$('.validquestdssl21 input:checkbox').each(function(){
						 $(this).prop('disabled', true);
					 })
					 $(".validquestdssl21  input:text").prop('disabled', true);
					$(".deldssl21").css({'opacity':0.4,'pointer-events':'none'});
					
					$('.validquestdssl22 input:checkbox').each(function(){
						 $(this).prop('disabled', true);
					 })
					 $(".validquestdssl22  input:text").prop('disabled', true);
					$(".deldssl22").css({'opacity':0.4,'pointer-events':'none'});
				}
				else{
						$('.validquestdssl21 input:checkbox').each(function(){
							 $(this).prop('disabled', false);
						 })
						 $(".validquestdssl21  input:text").prop('disabled', false);
						$(".deldssl21").css({'opacity':1,'pointer-events':'visible'});
						
						$('.validquestdssl22 input:checkbox').each(function(){
							 $(this).prop('disabled', false);
						 })
						 $(".validquestdssl22  input:text").prop('disabled', false);
						$(".deldssl22").css({'opacity':1,'pointer-events':'visible'});
					}
if($("#questionDS20").val() == 'Нет, не знал(а), что это возможно'){
					
					$('.validquestdssl21 input:checkbox').each(function(){
						 $(this).prop('disabled', true);
					 })
					 $(".validquestdssl21  input:text").prop('disabled', true);
					$(".deldssl21").css({'opacity':0.4,'pointer-events':'none'});
					
					$('.validquestdssl22 input:checkbox').each(function(){
						 $(this).prop('disabled', true);
					 })
					 $(".validquestdssl22  input:text").prop('disabled', true);
					$(".deldssl22").css({'opacity':0.4,'pointer-events':'none'});
				}	
		}

	 //
	 */
	//ПРОБА555 РАБОТАЕТ
		if($("#questionDS20").val() == 'Да (к вопросу 22)'){ 
					
		$('.validquestdssl21 input:checkbox').each(function(){
		 $(this).prop('disabled', true);
		 })
		$(".validquestdssl21  input:text").prop('disabled', true);
		$(".validquestdssl21").css({'opacity':0.4,'pointer-events':'none'});
					
					
		$('.validquestdssl22 input:checkbox').each(function(){
		 $(this).prop('disabled', false);
		})
		$(".validquestdssl22  input:text").prop('disabled', false);
		$(".validquestdssl22").css({'opacity':1,'pointer-events':'visible'});
					
		}
		else{
		$('.validquestdssl21 input:checkbox').each(function(){
		 $(this).prop('disabled', false);
		 })
		$(".validquestdssl21  input:text").prop('disabled', false);
		$(".validquestdssl21").css({'opacity':1,'pointer-events':'visible'});
						
						
						
						
		if($("#questionDS20").val() == 'Нет, не было необходимости (к вопросу 23)'){
							
		$('.validquestdssl21 input:checkbox').each(function(){
		$(this).prop('disabled', true);
		})
		$(".validquestdssl21  input:text").prop('disabled', true);
		$(".validquestdssl21").css({'opacity':0.4,'pointer-events':'none'});
							
		$('.validquestdssl22 input:checkbox').each(function(){
		 $(this).prop('disabled', true);
		})
		 $(".validquestdssl22  input:text").prop('disabled', true);
		$(".validquestdssl22").css({'opacity':0.4,'pointer-events':'none'});
		}
				else{
			$('.validquestdssl21 input:checkbox').each(function(){
			 $(this).prop('disabled', false);
			 })
		 $(".validquestdssl21  input:text").prop('disabled', false);
								$(".validquestdssl21").css({'opacity':1,'pointer-events':'visible'});
								
		$('.validquestdssl22 input:checkbox').each(function(){
				 $(this).prop('disabled', false);
				 })
		$(".validquestdssl22  input:text").prop('disabled', false);
								$(".validquestdssl22").css({'opacity':1,'pointer-events':'visible'});
							}
	if($("#questionDS20").val() == 'Нет, не знал(а), что это возможно'){
							
	$('.validquestdssl21 input:checkbox').each(function(){
	$(this).prop('disabled', true);
	})
	$(".validquestdssl21  input:text").prop('disabled', true);
	$(".validquestdssl21").css({'opacity':0.4,'pointer-events':'none'});
							
	$('.validquestdssl22 input:checkbox').each(function(){
		 $(this).prop('disabled', true);
	 })
	$(".validquestdssl22  input:text").prop('disabled', true);
		$(".validquestdssl22").css({'opacity':0.4,'pointer-events':'none'});
						}
						
				}	

	 
	 if(!$('#questionDS21many_1').is(':disabled')){
		 
		 $('.validquestdssl21 input:checkbox').each(function(){
			 
			 if($(this).is(':checked')){sht ++;}
			 if(sht == 0){
				 if($.trim($('#questionDS21many_3').val()) != '') sht++;
			 }
		 })
		 if(sht > 0){
			 
			 $('.validquestdssl22 input:checkbox').each(function(){
				 $(this).prop('disabled', true);
			 })
			 $(".validquestdssl22  input:text").prop('disabled', true);
			 $(".deldssl22").css({'opacity':0.4});

		 }
	 }
	 
	 if($("#questionDS23").val() == 'Да, я получал(а) бесплатную медицинскую помощь на других территориях РФпо полису ОМС (к вопросу 25)' ||
			 $("#questionDS23").val() == 'Нет, не приходилось (к вопросу 25)'){
			
			$('.validquestdssl24 input:checkbox').each(function(){
				 $(this).prop('disabled', true);
			 })
			 $(".validquestdssl24  input:text").prop('disabled', true);
			$(".deldssl24").css({'opacity':0.4,'pointer-events':'none'});
		}else
		{
			$('.validquestdssl24 input:checkbox').each(function(){
				 $(this).prop('disabled', false);
			 })
			 $(".validquestdssl24  input:text").prop('disabled', false);
			$(".deldssl24").css({'opacity':1,'pointer-events':'visible'});
		}
	 
	 
	 if($("#questionDS27").val() == 'Нет, никогда не приходилось (к вопросу 29)'){ $(".ssldel28").css({'opacity':0.4,'pointer-events':'none'}); $('#questionDS28').prop('disabled', true); }
		else{$(".ssldel28").css({'opacity':1,'pointer-events':'visible'}); $('#questionDS28').prop('disabled', false);}
	
	}		

// ============================= ХОВЕР =========================================
$('.deldssl22').hover(function() {
	if($.trim($('#questionDS21many_3').val()) != '')
	{
		$('.validquestdssl22 input:checkbox').each(function(){
			 $(this).prop('disabled', true);
		 })
		 $(".validquestdssl22  input:text").prop('disabled', true);
		 $(".deldssl22").css({'opacity':0.4});
	}
	else
	{
		var qwe = 0;
		$('.validquestdssl21 input:checkbox').each(function(){
			if($(this).is(':checked')){qwe ++;}
		 })

		 // т.е. если помимо input text  стоят отметки в чек боксах то ничего...иначе...
		 if(qwe > 0){}else
		 {
			$('.validquestdssl22 input:checkbox').each(function(){
				 $(this).prop('disabled', false);
			 })
			 $(".validquestdssl22  input:text").prop('disabled', false);
			 $(".deldssl22").css({'opacity':1});
		 }	 
	}
});

$('.deldssl18').hover(function() {
	if($.trim($('#questionDS18many_5').val()) != '')
	{
		$('.validquestdssl19 input:checkbox').each(function(){
			 $(this).prop('disabled', true);
		 })
		 $(".validquestdssl19  input:text").prop('disabled', true);
		 $(".deldssl19").css({'opacity':0.4});
	}
	else
	{
		var qwe = 0;
		$('.validquestdssl18 input:checkbox').each(function(){
			if($(this).is(':checked')){qwe ++;}
		 })

		 // т.е. если помимо input text  стоят отметки в чек боксах то ничего...иначе...
		 if(qwe > 0){}else
		 {
			$('.validquestdssl19 input:checkbox').each(function(){
				 $(this).prop('disabled', false);
			 })
			 $(".validquestdssl19  input:text").prop('disabled', false);
			 $(".deldssl19").css({'opacity':1});
		 }	 
	}
});

// =========================== КОНЕЦ ХОВЕР ============================================

/*
 * Метод проверяет на заполненость всей формы второй уровень ДС
 * метод учитывает если вопрос отключен
 */
function validateSecondDS()
{
	      
		  // проверяем селекты	без права выбора 'Другое (напишите)'
	     var t=0;
	      var $form = $('#formDSSL') 
	      $('select', $form).each(function() {
	    	  if(!$(this).is(':disabled') ){
	    		  if('questionDS1'!= $(this).attr('id') && 'questionDS2'!= $(this).attr('id') && 'questionDS3'!= $(this).attr('id') && 'questionDS32'!= $(this).attr('id')){
	    			  
		    		  // выбираем выбранное
		    		  if($(this).find('option:selected').text().length == 0){
			  	        	t++;
		    		  }  
	    		  }
	    		  else
	    		  {
	    			  if('questionDS1'=== $(this).attr('id'))
	    			  {
	    				  if($('#questionDS1dr').is(':visible')){
	    					  if($.trim($('#questionDS1dr').val()) == ''){
			    				  t++;  
	    					  }
		    			  }else
		    			  {
		    				  if($(this).find('option:selected').text().length == 0){
					  	        	t++;
		    				  }  
		    			  }
	    			  }
	    			  
	    			  if('questionDS2'=== $(this).attr('id'))
	    			  {
	    				  if($('#questionDS2dr').is(':visible')){
	    					  if($.trim($('#questionDS2dr').val()) == ''){
			    				  t++;  
	    					  }
		    			  }else
		    			  {
		    				  if($(this).find('option:selected').text().length == 0){
					  	        	t++;
		    				  }  
		    			  }
	    			  }
	    			  
	    			  if('questionDS3'=== $(this).attr('id'))
	    			  {
	    				  if($('#questionDS3dr').is(':visible')){
	    					  if($.trim($('#questionDS3dr').val()) == ''){
			    				  t++;  
	    					  }
		    			  }else
		    			  {
		    				  if($(this).find('option:selected').text().length == 0){
					  	        	t++;
		    				  }  
		    			  }
	    			  }
	    			  
	    			  if('questionDS32'=== $(this).attr('id'))
	    			  {
	    				  if($('#questionDS32dr').is(':visible')){
	    					  if($.trim($('#questionDS32dr').val()) == ''){
			    				  t++;  
	    					  }
		    			  }else
		    			  {
		    				  if($(this).find('option:selected').text().length == 0){
					  	        	t++;
		    				  }  
		    			  }
	    			  }
	    			  
	    		  }
	    	  }
	      });
	      
	      //	про чекбоксы 
	      var d14 = 0;
		   $('.validquestdssl14 input:checkbox').each(function(){
				 if(!$(this).is(':checked')){d14++;}
		   })
		   if(d14 == 9){	if($.trim($(".validquestdssl14  input:text").val()) != '') d14=0; }
		   else{d14 =	0;}
	      
	      var d = 0;
		   $('.validquestdssl16 input:checkbox').each(function(){
				 if(!$(this).is(':checked')){d++;}
		   })
		   // если все 6 чекбоксов не проставлены
		   if(d == 6){	if($.trim($(".validquestdssl16  input:text").val()) != '') d=0; }
		   // если хотя бы один чек бокс проставлен т.е. d будет меньше 5
		   else{d =	0;}
		   
		   var d_18 = 0;
			// проверека на disable - исключаем из валидации отключенные вопросы (достаточно проверить хотя бы один чекбокс из вопроса)
		   if(!$('#questionDS18many_1').is(':disabled')){
			   $('.validquestdssl18 input:checkbox').each(function(){
					 if(!$(this).is(':checked')){d_18++;}
			   })
			   if(d_18 == 4){	if($.trim($(".validquestdssl18  input:text").val()) != '') d_18=0; }
			   else{d_18 =	0;}
		   }
		   
		   var d_19 = 0;
		   if(!$('#questionDS19many_1').is(':disabled')){
			   $('.validquestdssl19 input:checkbox').each(function(){
					 if(!$(this).is(':checked')){d_19++;}
			   })
			   if(d_19 == 7){	if($.trim($(".validquestdssl19  input:text").val()) != '') d_19=0; }
			   else{d_19 =	0;}
		   }   
		   
		   var d_21 = 0;
		   if(!$('#questionDS21many_1').is(':disabled')){
			   $('.validquestdssl21 input:checkbox').each(function(){
					 if(!$(this).is(':checked')){d_21++;}
			   })
			   if(d_21 == 2){	if($.trim($(".validquestdssl21  input:text").val()) != '') d_21=0; }
			   else{d_21 =	0;}
		   }	   
		   
		   var d_22 = 0;
		   if(!$('#questionDS22many_1').is(':disabled')){
			   if(!$('#questionDS22many_1').is(':disabled')){
				   $('.validquestdssl22 input:checkbox').each(function(){
						 if(!$(this).is(':checked')){d_22++;}
				   })
				   if(d_22 == 5){	if($.trim($(".validquestdssl22  input:text").val()) != '') d_22=0; }
				   else{d_22 =	0;}
			   }   
		   }
		   
		   var d_24 = 0;
		   if(!$('#questionDS24many_1').is(':disabled')){
			   $('.validquestdssl24 input:checkbox').each(function(){
					 if(!$(this).is(':checked')){d_24++;}
			   })
			   if(d_24 == 2){	if($.trim($(".validquestdssl24  input:text").val()) != '') d_24=0; }
			   else{d_24 =	0;}
		   }   
		   
		   var d25_5= 0 ;
		   if(!$('#question25_5').is(':disabled')){	if($.trim($("#question25_5").val()) == '') d25_5++;	}
		   
		   var d26= 0 ;
		   if(!$('#questionDS26').is(':disabled')){	if($.trim($("#questionDS26").val()) == '') d26++;	}
		   
		   var d28= 0 ;
		   if(!$('#questionDS28').is(':disabled')){	if($.trim($("#questionDS28").val()) == '') d28++;	}
		   
		   
		  console.log('t '+t+' d14 '+d14+' d16 '+d+' d_18 '+d_18+' d_19 '+d_19+' d_21 '+d_21+' d_22 '+d_22+' d_24 '+d_24+' d25_5 '+d25_5+' d26 '+d26+' d28 '+d28); 
	      if((t+d+d_18+d_19+d_21+d_22+d_24+d25_5+d26+d14+d28) > 0) return true; else false;	
}

function secondlevelds(varr) {
	
	
	if(validateSecondDS()){  $(".errorDSSL").css('display','block');	}else{
	
						var general = {}
						var sec1 = {}
						var sec2 = {}
						var question25 = {}
						var question15 = {}
						var many = {}
						
						general["moSecondleveldaystacionar"] = $("#moSecondleveldaystacionar").val();
						general["dataRespSecondleveldaystacionar"] = $("input[name='dataRespDSSL']").val();
						if($.trim($('#questionDS1dr').val())){	general["questionDS1"] = $.trim($('#questionDS1dr').val())}else{	general["questionDS1"] = $("#questionDS1").val();	}
						if($.trim($('#questionDS2dr').val())){	general["questionDS2"] = $.trim($('#questionDS2dr').val())}else{	general["questionDS2"] = $("#questionDS2").val();	}
						if($.trim($('#questionDS3dr').val())){	general["questionDS3"] = $.trim($('#questionDS3dr').val())}else{	general["questionDS3"] = $("#questionDS3").val();	}
						general["questionDS4"] = $("#questionDS4").val();
						general["questionDS5"] = $("#questionDS5").val();
						general["questionDS6"] = $("#questionDS6").val();
						sec2["question7sec2"] = $("#question7sec2").val();
						sec1["question8sec1"] = $("#question8sec1").val();
						general["questionDS9"] = $("#questionDS9").val();
						sec2["question10_1sec2"] = $("#question10_1sec2").val();
						sec2["question10_2sec2"] = $("#question10_2sec2").val();
						sec2["question10_3sec2"] = $("#question10_3sec2").val();
						sec2["question10_4sec2"] = $("#question10_4sec2").val();
						sec2["question10_5sec2"] = $("#question10_5sec2").val();
						sec2["question10_6sec2"] = $("#question10_6sec2").val();
						sec2["question10_7sec2"] = $("#question10_7sec2").val();
						sec2["question10_8sec2"] = $("#question10_8sec2").val();
						sec2["question10_9sec2"] = $("#question10_9sec2").val();
						sec2["question10_10sec2"] = $("#question10_10sec2").val();
						sec2["question10_11sec2"] = $("#question10_11sec2").val();
						sec2["question10_12sec2"] = $("#question10_12sec2").val();
						sec2["question10_13sec2"] = $("#question10_13sec2").val();
						sec2["question10_14sec2"] = $("#question10_14sec2").val();
						sec1["question11sec1"] = $("#question11sec1").val();
						sec2["question12sec2"] = $("#question12sec2").val();
						sec1["question13sec1"] = $("#question13sec1").val();
						
						if($("#questionDS14many_1").is(':checked')){ many["questionDS14many_1"] = $("#questionDS14many_1").val();} else{ many["questionDS14many_1"] = "пусто";	}
						if($("#questionDS14many_2").is(':checked')){ many["questionDS14many_2"] = $("#questionDS14many_2").val();} else{ many["questionDS14many_2"] = "пусто";	}
						if($("#questionDS14many_3").is(':checked')){ many["questionDS14many_3"] = $("#questionDS14many_3").val();} else{ many["questionDS14many_3"] = "пусто";	}
						if($("#questionDS14many_4").is(':checked')){ many["questionDS14many_4"] = $("#questionDS14many_4").val();} else{ many["questionDS14many_4"] = "пусто";	}
						if($("#questionDS14many_5").is(':checked')){ many["questionDS14many_5"] = $("#questionDS14many_5").val();} else{ many["questionDS14many_5"] = "пусто";	}
						if($("#questionDS14many_6").is(':checked')){ many["questionDS14many_6"] = $("#questionDS14many_6").val();} else{ many["questionDS14many_6"] = "пусто";	}
						if($("#questionDS14many_7").is(':checked')){ many["questionDS14many_7"] = $("#questionDS14many_7").val();} else{ many["questionDS14many_7"] = "пусто";	}
						if($("#questionDS14many_8").is(':checked')){ many["questionDS14many_8"] = $("#questionDS14many_8").val();} else{ many["questionDS14many_8"] = "пусто";	}
						if($("#questionDS14many_9").is(':checked')){ many["questionDS14many_9"] = $("#questionDS14many_9").val();} else{ many["questionDS14many_9"] = "пусто";	}
						if($("#questionDS14many_10").val() != ''){many["questionDS14many_10"] = $("#questionDS14many_10").val();	}else{ many["questionDS14many_10"] = 'пусто';	}
						
						question15["question15_1_clinic"] = $("#question15_1_clinic").val();
						question15["question15_2_clinic"] = $("#question15_2_clinic").val();
						question15["question15_3_clinic"] = $("#question15_3_clinic").val();
						question15["question15_4_clinic"] = $("#question15_4_clinic").val();
						question15["question15_5_clinic"] = $("#question15_5_clinic").val();
						question15["question15_6_clinic"] = $("#question15_6_clinic").val();
						question15["question15_7_clinic"] = $("#question15_7_clinic").val();
						question15["question15_8_clinic"] = $("#question15_8_clinic").val();
						question15["question15_9_clinic"] = $("#question15_9_clinic").val();
						question15["question15_10_clinic"] = $("#question15_10_clinic").val();
						question15["question15_11_clinic"] = $("#question15_11_clinic").val();
						
						if($("#questionDS16many_1").is(':checked')){ many["questionDS16many_1"] = $("#questionDS16many_1").val();} else{ many["questionDS16many_1"] = "пусто";	}
						if($("#questionDS16many_2").is(':checked')){ many["questionDS16many_2"] = $("#questionDS16many_2").val();} else{ many["questionDS16many_2"] = "пусто";	}
						if($("#questionDS16many_3").is(':checked')){ many["questionDS16many_3"] = $("#questionDS16many_3").val();} else{ many["questionDS16many_3"] = "пусто";	}
						if($("#questionDS16many_4").is(':checked')){ many["questionDS16many_4"] = $("#questionDS16many_4").val();} else{ many["questionDS16many_4"] = "пусто";	}
						if($("#questionDS16many_5").is(':checked')){ many["questionDS16many_5"] = $("#questionDS16many_5").val();} else{ many["questionDS16many_5"] = "пусто";	}
						if($("#questionDS16many_6").is(':checked')){ many["questionDS16many_6"] = $("#questionDS16many_6").val();} else{ many["questionDS16many_6"] = "пусто";	}
						if($("#questionDS16many_7").val() != ''){many["questionDS16many_7"] = $("#questionDS16many_7").val();	}else{ many["questionDS16many_7"] = 'пусто';	}
						
						general["questionDS17"] = $("#questionDS17").val();
						
						if($("#questionDS18many_1").is(':checked')){ many["questionDS18many_1"] = $("#questionDS18many_1").val();} else{ many["questionDS18many_1"] = "пусто";	}
						if($("#questionDS18many_2").is(':checked')){ many["questionDS18many_2"] = $("#questionDS18many_2").val();} else{ many["questionDS18many_2"] = "пусто";	}
						if($("#questionDS18many_3").is(':checked')){ many["questionDS18many_3"] = $("#questionDS18many_3").val();} else{ many["questionDS18many_3"] = "пусто";	}
						if($("#questionDS18many_4").is(':checked')){ many["questionDS18many_4"] = $("#questionDS18many_4").val();} else{ many["questionDS18many_4"] = "пусто";	}
						if($("#questionDS18many_5").val() != ''){many["questionDS18many_5"] = $("#questionDS18many_5").val();	}else{ many["questionDS18many_5"] = 'пусто';	}
						if($("#questionDS18many_6").val() != ''){many["questionDS18many_6"] = $("#questionDS18many_6").val();	}else{ many["questionDS18many_6"] = 'пусто';	}
						
						if($("#questionDS19many_1").is(':checked')){ many["questionDS19many_1"] = $("#questionDS19many_1").val();} else{ many["questionDS19many_1"] = "пусто";	}
						if($("#questionDS19many_2").is(':checked')){ many["questionDS19many_2"] = $("#questionDS19many_2").val();} else{ many["questionDS19many_2"] = "пусто";	}
						if($("#questionDS19many_3").is(':checked')){ many["questionDS19many_3"] = $("#questionDS19many_3").val();} else{ many["questionDS19many_3"] = "пусто";	}
						if($("#questionDS19many_4").is(':checked')){ many["questionDS19many_4"] = $("#questionDS19many_4").val();} else{ many["questionDS19many_4"] = "пусто";	}
						if($("#questionDS19many_5").is(':checked')){ many["questionDS19many_5"] = $("#questionDS19many_5").val();} else{ many["questionDS19many_5"] = "пусто";	}
						if($("#questionDS19many_6").is(':checked')){ many["questionDS19many_6"] = $("#questionDS19many_6").val();} else{ many["questionDS19many_6"] = "пусто";	}
						if($("#questionDS19many_7").is(':checked')){ many["questionDS19many_7"] = $("#questionDS19many_7").val();} else{ many["questionDS19many_7"] = "пусто";	}
						if($("#questionDS19many_8").val() != ''){many["questionDS19many_8"] = $("#questionDS19many_8").val();	}else{ many["questionDS19many_8"] = 'пусто';	}
						
						general["questionDS20"] = $("#questionDS20").val();
						
						if($("#questionDS21many_1").is(':checked')){ many["questionDS21many_1"] = $("#questionDS21many_1").val();} else{ many["questionDS21many_1"] = "пусто";	}
						if($("#questionDS21many_2").is(':checked')){ many["questionDS21many_2"] = $("#questionDS21many_2").val();} else{ many["questionDS21many_2"] = "пусто";	}
						if($("#questionDS21many_3").val() != ''){many["questionDS21many_3"] = $("#questionDS21many_3").val();	}else{ many["questionDS21many_3"] = 'пусто';	}
						if($("#questionDS21many_4").val() != ''){many["questionDS21many_4"] = $("#questionDS21many_4").val();	}else{ many["questionDS21many_4"] = 'пусто';	}
						
						if($("#questionDS22many_1").is(':checked')){ many["questionDS22many_1"] = $("#questionDS22many_1").val();} else{ many["questionDS22many_1"] = "пусто";	}
						if($("#questionDS22many_2").is(':checked')){ many["questionDS22many_2"] = $("#questionDS22many_2").val();} else{ many["questionDS22many_2"] = "пусто";	}
						if($("#questionDS22many_3").is(':checked')){ many["questionDS22many_3"] = $("#questionDS22many_3").val();} else{ many["questionDS22many_3"] = "пусто";	}
						if($("#questionDS22many_4").is(':checked')){ many["questionDS22many_4"] = $("#questionDS22many_4").val();} else{ many["questionDS22many_4"] = "пусто";	}
						if($("#questionDS22many_5").is(':checked')){ many["questionDS22many_5"] = $("#questionDS22many_5").val();} else{ many["questionDS22many_5"] = "пусто";	}
						if($("#questionDS22many_6").val() != ''){many["questionDS22many_6"] = $("#questionDS22many_6").val();	}else{ many["questionDS22many_6"] = 'пусто';	}
						
						general["questionDS23"] = $("#questionDS23").val();
						
						if($("#questionDS24many_1").is(':checked')){ many["questionDS24many_1"] = $("#questionDS24many_1").val();} else{ many["questionDS24many_1"] = "пусто";	}
						if($("#questionDS24many_2").is(':checked')){ many["questionDS24many_2"] = $("#questionDS24many_2").val();} else{ many["questionDS24many_2"] = "пусто";	}
						if($("#questionDS24many_3").val() != ''){many["questionDS24many_3"] = $("#questionDS24many_3").val();	}else{ many["questionDS24many_3"] = 'пусто';	}
						
						question25["question25_1"] = $("#question25_1").val();
						question25["question25_2"] = $("#question25_2").val();
						question25["question25_3"] = $("#question25_3").val();
						question25["question25_4"] = $("#question25_4").val();
						question25["question25_5"] = $("#question25_5").val();
						
						general["questionDS26"] = $("#questionDS26").val();
						general["questionDS27"] = $("#questionDS27").val();
						general["questionDS28"] = $("#questionDS28").val();
						general["sexSecondleveldaystacionar"] = $("#sexSecondleveldaystacionar").val();
						general["ageSecondleveldaystacionar"] = $("#ageSecondleveldaystacionar").val();
						general["questionDS31"] = $("#questionDS31").val();
						if($.trim($('#questionDS32dr').val())){	general["questionDS32"] = $.trim($('#questionDS32dr').val())}else{	general["questionDS32"] = $("#questionDS32").val();	}
						general["questionDS33"] = $("#questionDS33").val();
						
						general["polzSecondleveldaystacionar"] = $("#polzSecondleveldaystacionar").val();
						
						// после нажатия добавить -> зачищаются периоды для кнопки выбрать
						//$("input[name='namedateBeginsecondlevel']").val('');
						//$("input[name='namedateEndsecondlevel']").val('');
						
						/*
						 * После того как была нажато редактирование и вылезло модальное с данными по редактированию ловим
						 * id этой записи. Если же была нажата просто кнопка "добавить запись" то if не отрабатывает и новая
						 * запись улетает с null id там он генериться тк запись новая.
						 * 
						 * Обрати внимание после отработки этого ajax поле input #id зануляется
						 * иначе при добавлении новой записи этот айдишник постоянно будет и соответственно не добавляться будет а 
						 * редактироваться по этому id
						 */
						if($("#idDSSL").val()){ 	general["id"] = parseInt($("#idDSSL").val());}
						
						$('#cancelDSSL').trigger('click');
						//+ отрабатывает метод в other.js
						
						var sender = ({ survay1:general, survay2:sec1,survay3:sec2,survay4:question15,survay5:question25,survay6:many}); 
						
				
						$.post('adddssl',JSON.stringify(sender),function(response)
    	      	                {
									$('#records_tableDSSL').animate({opacity: 0.0}, 2000 );
							    	  userInfo = "<tr><th>№</th><th>МО</th><th>Дата опроса</th><th>Дата ввода</th><th>Пол</th><th>Возраст</th><th>Пользователь</th></tr>";
							    	  for(i =0 ; i < response.result.length ; i++){
							    		  userInfo += "<tr><td><span class='mycount'></span></td><td><a href='#' onclick=dsslid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].moSecondleveldaystacionar + "</a></td><td><a href='#' onclick=dsslid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].dataRespSecondleveldaystacionar + "</a></td><td><a href='#' onclick=dsslid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].dataInputSecondlevel + "</a></td><td><a href='#' onclick=dsslid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].sexSecondleveldaystacionar + "</a></td><td><a href='#' onclick=dsslid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].ageSecondleveldaystacionar + "</a></td><td><a href='#' onclick=dsslid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].polzSecondleveldaystacionar + "</a></td></tr>";
							    	  }
							    	  setTimeout ("$('#records_tableDSSL').html('');",2000);
							    	  setTimeout ("$('#records_tableDSSL').append(userInfo);", 2000);
							    	  
							    	  $('#records_tableDSSL').animate({opacity: 1}, 2000 );
							    	  //  зануляем id input 
							    	  $("#idDSSL").val('');
        	      	            },'json')
        	      	          	.error(function(msg) {console.log('test BAD'); $("#idDSSL").val('');});
	}					
					
						
	}	


/*
 * Метод обрабатывает нажатие Анкеты второго уровня -> ДС помощь
 * 
 */
function alldssl(varr) {
	
	$.ajax({
		url : 'alldssl',
		type: 'get',
		dataType: 'json',
		data : ({ test : varr}),
		contentType: 'application/json',
	    mimeType: 'application/json',
	    success: function(response){
 
		      if(response.status == "SUCCESS"){
		    	  userInfo = "<tr><th>№</th><th>МО</th><th>Дата опроса</th><th>Дата ввода</th><th>Пол</th><th>Возраст</th><th>Пользователь</th></tr>";
		    	  for(i =0 ; i < response.result.length ; i++){
		    		  userInfo += "<tr><td><span class='mycount'></span></td><td><a href='#' onclick=dsslid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].moSecondleveldaystacionar + "</a></td><td><a href='#' onclick=dsslid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].dataRespSecondleveldaystacionar + "</a></td><td><a href='#' onclick=dsslid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].dataInputSecondlevel + "</a></td><td><a href='#' onclick=dsslid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].sexSecondleveldaystacionar + "</a></td><td><a href='#' onclick=dsslid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].ageSecondleveldaystacionar + "</a></td><td><a href='#' onclick=dsslid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].polzSecondleveldaystacionar + "</a></td></tr>";
		    	  }
		    	  $('#records_tableDSSL').html(userInfo);
		    	  $('#records_tableDSSL').animate({opacity: 0}, 0 );
		    	  $('#records_tableDSSL').animate({opacity: 1}, 4000 );
		    	 
		      }else{
		      }	      
		    },  
		    error: function(e){  
		      alert('Произошла ошибка. Обновите страницу. ' + e);  
		    }
	});
	
}



/*
 * Метод заполняет модальное окно второго уровня данными по id записи (редакитирование)
 * ДС
 */
function dsslid( varr,varr2) {
	console.log(varr+'  '+varr2);
	$.ajax({
		url : 'seconddsid',
		type: 'get',
		dataType: 'json',
		data : ({ user: varr, id: varr2}),
		contentType: 'application/json',
	    mimeType: 'application/json',
	    success: function(response)
	    {
		      // we have the response 
		      if(response.status == "SUCCESS")
		      {
		    	    /*console.log('test '+JSON.stringify(response));
		    		  console.log('=======================');
		    		  console.log('test '+JSON.stringify(response.result[0]));
		    		  console.log('=======================');
		    		  console.log('test '+JSON.stringify(response.result[0].survayClinicSec1));
		    		  console.log('=======================');
		    		  console.log('test '+JSON.stringify(response.result[0].question_many));
		    	  */
		    	  
		    	    $('#addOneDayStacionarsecondlevel').trigger('click');
			    	$('#myModal1secondlevel .modal-title').text('Редактирование анкеты второго уровня');
			    	$('.modal-header p').text('Редактирование анкеты дневного стационара');
			    	$('.renamebtndssl').text('Редактировать');
			    	
			    	for(i =0 ; i < response.result.length ; i++){
			    		  $("#idDSSL").val(response.result[i].id);
			    		  $("#moSecondleveldaystacionar option:contains(" + response.result[i].moSecondleveldaystacionar +")").prop('selected', true);
			    		  $("input[name='dataRespDSSL']").val(response.result[i].dataRespSecondleveldaystacionar);
			    		  
			    		  if(response.result[i].questionDS1 != 'Лечение' && response.result[i].questionDS1 != 'Обследование' && response.result[i].questionDS1 != 'Реабилитация' ){
			    			  $('#questionDS1dr').fadeIn();
			    			  $('#questionDS1dr').val(response.result[i].questionDS1);
			    			  $("#questionDS1 option:contains('Другое (напишите)')").prop('selected', true);
			    		  }else{	$("#questionDS1 option:contains(" + response.result[i].questionDS1 +")").prop('selected', true);	}
			    		  
			    		  if(response.result[i].questionDS2 != 'Терапевтическом' && response.result[i].questionDS2 != 'Гинекологическом' && response.result[i].questionDS2 != 'Хирургическом' && response.result[i].questionDS2 != 'Восстановительного лечения' ){
			    			  $('#questionDS2dr').fadeIn();
			    			  $('#questionDS2dr').val(response.result[i].questionDS2);
			    			  $("#questionDS2 option:contains('Другое (напишите)')").prop('selected', true);
			    		  }else{	$("#questionDS2 option:contains(" + response.result[i].questionDS2 +")").prop('selected', true);	}
			    		  
			    		  if(response.result[i].questionDS3 != 'Поликлиники' && response.result[i].questionDS3 != 'Стационара (больницы)'){
			    			  $('#questionDS3dr').fadeIn();
			    			  $('#questionDS3dr').val(response.result[i].questionDS3);
			    			  $("#questionDS3 option:contains('Другое (напишите)')").prop('selected', true);
			    		  }else{	$("#questionDS3 option:contains(" + response.result[i].questionDS3 +")").prop('selected', true);	}
			    		  
			    		  $("#questionDS4 option:contains(" + response.result[i].questionDS4 +")").prop('selected', true);
			    		  $("#questionDS5 option:contains(" + response.result[i].questionDS5 +")").prop('selected', true);
			    		  $("#questionDS6 option:contains(" + response.result[i].questionDS6 +")").prop('selected', true);
			    		  $("#questionDS9 option:contains(" + response.result[i].questionDS9 +")").prop('selected', true);
			    		  $("#questionDS17 option:contains(" + response.result[i].questionDS17 +")").prop('selected', true);
			    		  $("#questionDS20 option:contains(" + response.result[i].questionDS20 +")").prop('selected', true);
			    		  $("#questionDS23 option:contains(" + response.result[i].questionDS23 +")").prop('selected', true);
			    		  $("#questionDS26").val(response.result[i].questionDS26);
			    		  $("#questionDS27 option:contains(" + response.result[i].questionDS27 +")").prop('selected', true);
			    		  $("#questionDS28 option:contains(" + response.result[i].questionDS28 +")").prop('selected', true);
			    		  $("#questionDS31 option:contains(" + response.result[i].questionDS31 +")").prop('selected', true);
			    		  $("#questionDS32 option:contains(" + response.result[i].questionDS32 +")").prop('selected', true);
			    		  
			    		  if(response.result[i].questionDS32 != 'Предприниматель' && response.result[i].questionDS32 != 'Руководитель' && response.result[i].questionDS32 != 'Служащий' 
			    			  && response.result[i].questionDS32 != 'ИТР, специалист' 
		    				  && response.result[i].questionDS32 != 'Научный работник, преподаватель, учитель'
	    					  && response.result[i].questionDS32 != 'Рабочий'
    						  && response.result[i].questionDS32 != 'Пенсионер'
							  && response.result[i].questionDS32 != 'Домохозяйка'
							  && response.result[i].questionDS32 != 'Учащийся'
							  && response.result[i].questionDS32 != 'Безработный'){
			    			  $('#questionDS32dr').fadeIn();
			    			  $('#questionDS32dr').val(response.result[i].questionDS32);
			    			  $("#questionDS32 option:contains('Другое (напишите)')").prop('selected', true);
			    		  }else{	$("#questionDS32 option:contains(" + response.result[i].questionDS32 +")").prop('selected', true);	}
			    		  
			    		  $("#questionDS33 option:contains(" + response.result[i].questionDS33 +")").prop('selected', true);
			    		  $("#sexSecondleveldaystacionar option:contains(" + response.result[i].sexSecondleveldaystacionar +")").prop('selected', true);
			    		  $("#ageSecondleveldaystacionar").val(response.result[i].ageSecondleveldaystacionar);
			    		  $("#polzSecondleveldaystacionar option:contains(" + response.result[i].polzSecondleveldaystacionar +")").prop('selected', true);
			    		  
			    		  $("#question8sec1 option:contains(" + response.result[0].survayclinicdaystacionarSec1.question8sec1 +")").prop('selected', true);
			    		  $("#question11sec1 option:contains(" + response.result[0].survayclinicdaystacionarSec1.question11sec1 +")").prop('selected', true);
			    		  $("#question13sec1 option:contains(" + response.result[0].survayclinicdaystacionarSec1.question13sec1 +")").prop('selected', true);
			    		  
			    		  $("#question7sec2 option:contains(" + response.result[0].scdsslsec2.question7sec2 +")").prop('selected', true);
			    		  $("#question10_1sec2 option:contains(" + response.result[0].scdsslsec2.question10_1sec2 +")").prop('selected', true);
			    		  $("#question10_2sec2 option:contains(" + response.result[0].scdsslsec2.question10_2sec2 +")").prop('selected', true);
			    		  $("#question10_3sec2 option:contains(" + response.result[0].scdsslsec2.question10_3sec2 +")").prop('selected', true);
			    		  $("#question10_4sec2 option:contains(" + response.result[0].scdsslsec2.question10_4sec2 +")").prop('selected', true);
			    		  $("#question10_5sec2 option:contains(" + response.result[0].scdsslsec2.question10_5sec2 +")").prop('selected', true);
			    		  $("#question10_6sec2 option:contains(" + response.result[0].scdsslsec2.question10_6sec2 +")").prop('selected', true);
			    		  $("#question10_7sec2 option:contains(" + response.result[0].scdsslsec2.question10_7sec2 +")").prop('selected', true);
			    		  $("#question10_8sec2 option:contains(" + response.result[0].scdsslsec2.question10_8sec2 +")").prop('selected', true);
			    		  $("#question10_9sec2 option:contains(" + response.result[0].scdsslsec2.question10_9sec2 +")").prop('selected', true);
			    		  $("#question10_10sec2 option:contains(" + response.result[0].scdsslsec2.question10_10sec2 +")").prop('selected', true);
			    		  $("#question10_11sec2 option:contains(" + response.result[0].scdsslsec2.question10_11sec2 +")").prop('selected', true);
			    		  $("#question10_12sec2 option:contains(" + response.result[0].scdsslsec2.question10_12sec2 +")").prop('selected', true);
			    		  $("#question10_13sec2 option:contains(" + response.result[0].scdsslsec2.question10_13sec2 +")").prop('selected', true);
			    		  $("#question10_14sec2 option:contains(" + response.result[0].scdsslsec2.question10_14sec2 +")").prop('selected', true);
			    		  $("#question12sec2 option:contains(" + response.result[0].scdsslsec2.question12sec2 +")").prop('selected', true);
			    		  
			    		  $("#question15_1_clinic option:contains(" + response.result[0].scdsslsec15.question15_1_clinic +")").prop('selected', true);
			    		  $("#question15_2_clinic option:contains(" + response.result[0].scdsslsec15.question15_2_clinic +")").prop('selected', true);
			    		  $("#question15_3_clinic option:contains(" + response.result[0].scdsslsec15.question15_3_clinic +")").prop('selected', true);
			    		  $("#question15_4_clinic option:contains(" + response.result[0].scdsslsec15.question15_4_clinic +")").prop('selected', true);
			    		  $("#question15_5_clinic option:contains(" + response.result[0].scdsslsec15.question15_5_clinic +")").prop('selected', true);
			    		  $("#question15_6_clinic option:contains(" + response.result[0].scdsslsec15.question15_6_clinic +")").prop('selected', true);
			    		  $("#question15_7_clinic option:contains(" + response.result[0].scdsslsec15.question15_7_clinic +")").prop('selected', true);
			    		  $("#question15_8_clinic option:contains(" + response.result[0].scdsslsec15.question15_8_clinic +")").prop('selected', true);
			    		  $("#question15_9_clinic option:contains(" + response.result[0].scdsslsec15.question15_9_clinic +")").prop('selected', true);
			    		  $("#question15_10_clinic option:contains(" + response.result[0].scdsslsec15.question15_10_clinic +")").prop('selected', true);
			    		  $("#question15_11_clinic option:contains(" + response.result[0].scdsslsec15.question15_11_clinic +")").prop('selected', true);
			    		  
			    		  $("#question25_1 option:contains(" + response.result[0].scdsslsec25.question25_1 +")").prop('selected', true);
			    		  $("#question25_2 option:contains(" + response.result[0].scdsslsec25.question25_2 +")").prop('selected', true);
			    		  $("#question25_3 option:contains(" + response.result[0].scdsslsec25.question25_3 +")").prop('selected', true);
			    		  $("#question25_4 option:contains(" + response.result[0].scdsslsec25.question25_4 +")").prop('selected', true);
			    		  $("#question25_5").val(response.result[0].scdsslsec25.question25_5);
			    		  
			    		  for(i =0 ; i < response.result[0].manyDSSL.length ; i++){
			    		  
				    		  // вопрос 14
				    		  if(response.result[0].manyDSSL[i].questionDS14many == 'От медицинских работников') {	$("#questionDS14many_1").prop("checked", true);}
				    		  else{
				    			  if(response.result[0].manyDSSL[i].questionDS14many == 'От сотрудников страховой компании') {	$("#questionDS14many_2").prop("checked", true);}
				    			  else{
				    				  if(response.result[0].manyDSSL[i].questionDS14many == 'От сотрудников Фонда ОМС') {	$("#questionDS14many_3").prop("checked", true);}
					    			  else{
					    				  if(response.result[0].manyDSSL[i].questionDS14many == 'От знакомых/родственников') {	$("#questionDS14many_4").prop("checked", true);}
						    			  else{
						    				  if(response.result[0].manyDSSL[i].questionDS14many == 'из средств массовой информации') {	$("#questionDS14many_5").prop("checked", true);}
							    			  else{
							    				  if(response.result[0].manyDSSL[i].questionDS14many == 'из информации для населения в медицинских организациях (стенды, брошюры,листовки)') {	$("#questionDS14many_6").prop("checked", true);}
								    			  else{
								    				  if(response.result[0].manyDSSL[i].questionDS14many == 'из сети интернет') {	$("#questionDS14many_7").prop("checked", true);}
									    			  else{
									    				  if(response.result[0].manyDSSL[i].questionDS14many == 'Я не знаю своих прав') {	$("#questionDS14many_8").prop("checked", true);}
										    			  else{
										    				  if(response.result[0].manyDSSL[i].questionDS14many == 'Затрудняюсь ответить') {	$("#questionDS14many_9").prop("checked", true);}
											    			  else{
											    				  if(response.result[0].manyDSSL[i].questionDS14many != null) $("#questionDS14many_10").val(response.result[0].manyDSSL[i].questionDS14many);
											    			  }
										    			  }
									    			  }
								    			  }
							    			  }
						    			  }
					    			  }
				    			  }
				    		  }
				    		  //вопрос 16  
				    		  if(response.result[0].manyDSSL[i].questionDS16many == 'Администрация медицинской организации') {	$("#questionDS16many_1").prop("checked", true);}
			    			  else{
			    				  if(response.result[0].manyDSSL[i].questionDS16many == 'Страховая компания, выдавшая полис ОМС') {	$("#questionDS16many_2").prop("checked", true);}
				    			  else{
				    				  if(response.result[0].manyDSSL[i].questionDS16many == 'Фонд обязательного медицинского страхования') {	$("#questionDS16many_3").prop("checked", true);}
					    			  else{
					    				  if(response.result[0].manyDSSL[i].questionDS16many == 'Органы управления здравоохранением') {	$("#questionDS16many_4").prop("checked", true);}
						    			  else{
						    				  if(response.result[0].manyDSSL[i].questionDS16many == 'Гражданский суд') {	$("#questionDS16many_5").prop("checked", true);}
							    			  else{
							    				  if(response.result[0].manyDSSL[i].questionDS16many == 'Затрудняюсь ответить') {	$("#questionDS16many_6").prop("checked", true);}
								    			  else{
								    				  if(response.result[0].manyDSSL[i].questionDS16many != null) $("#questionDS16many_7").val(response.result[0].manyDSSL[i].questionDS16many);
								    			  }
							    			  }
						    			  }
					    			  }
				    			  }
			    			  }
				    		  
				    		  //вопрос 18
				    		  if(response.result[0].manyDSSL[i].questionDS18many == 'Не знал(а), куда обратиться') {	$("#questionDS18many_1").prop("checked", true);}
			    			  else{
			    				  if(response.result[0].manyDSSL[i].questionDS18many == 'Решил(а), что пытаться бесполезно') {	$("#questionDS18many_2").prop("checked", true);}
				    			  else{
				    				  if(response.result[0].manyDSSL[i].questionDS18many == 'Побоялся(лась) огласки') {	$("#questionDS18many_3").prop("checked", true);}
					    			  else{
					    				  if(response.result[0].manyDSSL[i].questionDS18many == 'Не хотел(а) портить отношения с врачом') {	$("#questionDS18many_4").prop("checked", true);}
						    			  else{
						    				  if(response.result[0].manyDSSL[i].questionDS18many != null) $("#questionDS18many_5").val(response.result[0].manyDSSL[i].questionDS18many);
						    			  }
					    			  }
				    			  }
			    			  }
				    		  
				    		  // вопрос 19
				    		  if(response.result[0].manyDSSL[i].questionDS19many == 'Врачом оказана некачественная медицинская помощь') {	$("#questionDS19many_1").prop("checked", true);}
			    			  else{
			    				  if(response.result[0].manyDSSL[i].questionDS19many == 'Врачом разглашена конфиденциальная информация о состоянии здоровья') {	$("#questionDS19many_2").prop("checked", true);}
				    			  else{
				    				  if(response.result[0].manyDSSL[i].questionDS19many == 'Врачом не были назначены необходимые диагностические процедуры') {	$("#questionDS19many_3").prop("checked", true);}
					    			  else{
					    				  if(response.result[0].manyDSSL[i].questionDS19many == 'Врачом не было назначено необходимое лечение') {	$("#questionDS19many_4").prop("checked", true);}
						    			  else{
						    				  if(response.result[0].manyDSSL[i].questionDS19many == 'Врач не дал направление на обследование в другую медицинскую организацию') {	$("#questionDS19many_5").prop("checked", true);}
							    			  else{
							    				  if(response.result[0].manyDSSL[i].questionDS19many == 'Врач  пытался  получить деньги за те услуги, которые должны быть оказаны бесплатно') {	$("#questionDS19many_6").prop("checked", true);}
								    			  else{
								    				  if(response.result[0].manyDSSL[i].questionDS19many == 'Врач вел себя грубо, безразлично, невежливо') {	$("#questionDS19many_7").prop("checked", true);}
									    			  else{
									    				  if(response.result[0].manyDSSL[i].questionDS19many != null) $("#questionDS19many_8").val(response.result[0].manyDSSL[i].questionDS19many);
									    			  }
								    			  }
							    			  }
						    			  }  
					    			  }
				    			  }
			    			  }
				    		  
				    		  // вопрос 21
				    		  if(response.result[0].manyDSSL[i].questionDS21many == 'Не знал(а), куда обратиться') {	$("#questionDS21many_1").prop("checked", true);}
			    			  else{
			    				  if(response.result[0].manyDSSL[i].questionDS21many == 'Решил(а), что пытаться бесполезно') {	$("#questionDS21many_2").prop("checked", true);}
				    			  else{
				    				  if(response.result[0].manyDSSL[i].questionDS21many != null) $("#questionDS21many_3").val(response.result[0].manyDSSL[i].questionDS21many);
				    			  }
			    			  }
				    		  
				    		  //вопрос 22
				    		  if(response.result[0].manyDSSL[i].questionDS22many == 'В связи с переездом на новое место жительства') {	$("#questionDS22many_1").prop("checked", true);}
			    			  else{
			    				  if(response.result[0].manyDSSL[i].questionDS22many == 'из-за неудобного режима работы') {	$("#questionDS22many_2").prop("checked", true);}
				    			  else{
				    				  if(response.result[0].manyDSSL[i].questionDS22many == 'из-за плохих санитарно-гигиенических условий') {	$("#questionDS22many_3").prop("checked", true);}
					    			  else{
					    				  if(response.result[0].manyDSSL[i].questionDS22many == 'В связи с недостаточным спектром медицинских услуг (анализы, УЗИ, ФЛГ, рентген и др)') {	$("#questionDS22many_4").prop("checked", true);}
						    			  else{
						    				  if(response.result[0].manyDSSL[i].questionDS22many == 'из-за недостаточно квалифицированного медицинского персонала') {	$("#questionDS22many_5").prop("checked", true);}
							    			  else{
							    				  if(response.result[0].manyDSSL[i].questionDS22many != null) $("#questionDS22many_6").val(response.result[0].manyDSSL[i].questionDS22many);
							    			  }
						    			  }
					    			  }
				    			  }
			    			  }
				    		  
				    		  //вопрос 24
				    		  if(response.result[0].manyDSSL[i].questionDS24many == 'В медицинской организации, в которой я хотел(а) лечиться, слишком многоприкрепленного населения') {	$("#questionDS24many_1").prop("checked", true);}
			    			  else{
			    				  if(response.result[0].manyDSSL[i].questionDS24many == 'из-за отсутствия местной регистрации') {	$("#questionDS24many_2").prop("checked", true);}
				    			  else{
				    				  	if(response.result[0].manyDSSL[i].questionDS24many != null) $("#questionDS24many_3").val(response.result[0].manyDSSL[i].questionDS24many);
				    			  }
			    			  }
			    		  }
			    		  
							
			    	  }
		    	  
			    	
			    	dsslvalidlev2();	
		      }else
		      {
		    	 
		      }	      
	    },  
		    error: function(e){  
		      alert('Error: ' + e);  
		    }
	});
}

/*
 * 
 * @@@@@@@@@@@@ ВТОРОЙ УРОВЕНЬ СТАЦИОНАР @@@@@@@@@@@@@@@@@@@
 * 
 * 
 */	

	/*
	 * Метод обрабатывает нажатие Анкеты второго уровня -> С помощь
	 * 
	 */
	function allstacsl(varr) {
		
		$.ajax({
			url : 'allssl',
			type: 'get',
			dataType: 'json',
			data : ({ test : varr}),
			contentType: 'application/json',
		    mimeType: 'application/json',
		    success: function(response){
	 
			      if(response.status == "SUCCESS"){
			    	  userInfo = "<tr><th>№</th><th>МО</th><th>Дата опроса</th><th>Дата ввода</th><th>Пол</th><th>Возраст</th><th>Пользователь</th></tr>";
			    	  for(i =0 ; i < response.result.length ; i++){
			    		  userInfo += "<tr><td><span class='mycount'></span></td><td><a href='#' onclick=sslid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].moSLS + "</a></td><td><a href='#' onclick=sslid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].dataRespSls + "</a></td><td><a href='#' onclick=sslid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].dataInputSls + "</a></td><td><a href='#' onclick=sslid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].sexSls+ "</a></td><td><a href='#' onclick=sslid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].ageSls + "</a></td><td><a href='#' onclick=sslid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].polzSecondlSls+ "</a></td></tr>";
			    	  }
			    	  $('#records_tableSSL').html(userInfo);
			    	  $('#records_tableSSL').animate({opacity: 0}, 0 );
			    	  $('#records_tableSSL').animate({opacity: 1}, 4000 );
			    	 
			      }else{
			      }	      
			    },  
			    error: function(e){  
			      alert('Произошла ошибка. Обновите страницу. ' + e);  
			    }
		});
		
	}

	
/*
 * ВТОРОЙ УРОВЕНЬ - СТАЦИОНАР
 * Метод добавляет запись в базу данных 
 */	

	function secondlevelsls(varr) {
		
		
		if(validateSecondS()){  $(".errorSLS").css('display','block');	}else{
		
							var general = {}
							var sec1 = {}
							var sec2 = {}
							var sec3 = {}
							var many = {}
							
							general["moSLS"] = $("#moSLS").val();
							general["dataRespSls"] = $("input[name='dataRespSls']").val();
							if($.trim($('#questionS1dr').val())){	general["questionS1"] = $.trim($('#questionS1dr').val())}else{	general["questionS1"] = $("#questionS1").val();	}
							general["questionS2"] = $("#questionS2").val();
							general["questionS3"] = $("#questionS3").val();
							general["questionS4"] = $("#questionS4").val();
							sec1["questionS5sec1"] = $("#questionS5sec1").val();
							general["questionS6"] = $("#questionS6").val();
							general["questionS7"] = $("#questionS7").val();
							general["questionS8"] = $("#questionS8").val();
							sec1["questionS9_1sec1"] = $("#questionS9_1sec1").val();
							sec1["questionS9_2sec1"] = $("#questionS9_2sec1").val();
							sec1["questionS9_3sec1"] = $("#questionS9_3sec1").val();
							sec1["questionS9_4sec1"] = $("#questionS9_4sec1").val();
							sec1["questionS9_5sec1"] = $("#questionS9_5sec1").val();
							sec1["questionS9_6sec1"] = $("#questionS9_6sec1").val();
							sec1["questionS9_7sec1"] = $("#questionS9_7sec1").val();
							sec1["questionS9_8sec1"] = $("#questionS9_8sec1").val();
							sec1["questionS9_9sec1"] = $("#questionS9_9sec1").val();
							sec1["questionS9_10sec1"] = $("#questionS9_10sec1").val();
							sec1["questionS9_11sec1"] = $("#questionS9_11sec1").val();
							sec1["questionS9_12sec1"] = $("#questionS9_12sec1").val();
							sec1["questionS9_13sec1"] = $("#questionS9_13sec1").val();
							sec1["questionS9_14sec1"] = $("#questionS9_14sec1").val();
							sec1["questionS9_15sec1"] = $("#questionS9_15sec1").val();
							sec1["questionS9_16sec1"] = $("#questionS9_16sec1").val();
							sec1["questionS9_17sec1"] = $("#questionS9_17sec1").val();
							sec1["questionS9_18sec1"] = $("#questionS9_18sec1").val();
							sec1["questionS9_19sec1"] = $("#questionS9_19sec1").val();
							general["questionS10"] = $("#questionS10").val();
							sec1["questionS11sec1"] = $("#questionS11sec1").val();
							general["questionS12"] = $("#questionS12").val();
							
							if($("#questionS13many_1").is(':checked')){ many["questionS13many_1"] = $("#questionS13many_1").val();} else{ many["questionS13many_1"] = "пусто";	}
							if($("#questionS13many_2").is(':checked')){ many["questionS13many_2"] = $("#questionS13many_2").val();} else{ many["questionS13many_2"] = "пусто";	}
							if($("#questionS13many_3").is(':checked')){ many["questionS13many_3"] = $("#questionS13many_3").val();} else{ many["questionS13many_3"] = "пусто";	}
							if($("#questionS13many_4").is(':checked')){ many["questionS13many_4"] = $("#questionS13many_4").val();} else{ many["questionS13many_4"] = "пусто";	}
							if($("#questionS13many_5").is(':checked')){ many["questionS13many_5"] = $("#questionS13many_5").val();} else{ many["questionS13many_5"] = "пусто";	}
							if($("#questionS13many_6").is(':checked')){ many["questionS13many_6"] = $("#questionS13many_6").val();} else{ many["questionS13many_6"] = "пусто";	}
							if($("#questionS13many_7").is(':checked')){ many["questionS13many_7"] = $("#questionS13many_7").val();} else{ many["questionS13many_7"] = "пусто";	}
							if($("#questionS13many_8").is(':checked')){ many["questionS13many_8"] = $("#questionS13many_8").val();} else{ many["questionS13many_8"] = "пусто";	}
							if($("#questionS13many_9").is(':checked')){ many["questionS13many_9"] = $("#questionS13many_9").val();} else{ many["questionS13many_9"] = "пусто";	}
							if($("#questionS13many_10").val() != ''){many["questionS13many_10"] = $("#questionS13many_10").val();	}else{ many["questionS13many_10"] = 'пусто';	}
							
							sec2["question14_1sec2"] = $("#question14_1sec2").val();
							sec2["question14_2sec2"] = $("#question14_2sec2").val();
							sec2["question14_3sec2"] = $("#question14_3sec2").val();
							sec2["question14_4sec2"] = $("#question14_4sec2").val();
							sec2["question14_5sec2"] = $("#question14_5sec2").val();
							sec2["question14_6sec2"] = $("#question14_6sec2").val();
							sec2["question14_7sec2"] = $("#question14_7sec2").val();
							sec2["question14_8sec2"] = $("#question14_8sec2").val();
							sec2["question14_9sec2"] = $("#question14_9sec2").val();
							sec2["question14_10sec2"] = $("#question14_10sec2").val();
							sec2["question14_11sec2"] = $("#question14_11sec2").val();
							
							if($("#questionS15many_1").is(':checked')){ many["questionS15many_1"] = $("#questionS15many_1").val();} else{ many["questionS15many_1"] = "пусто";	}
							if($("#questionS15many_2").is(':checked')){ many["questionS15many_2"] = $("#questionS15many_2").val();} else{ many["questionS15many_2"] = "пусто";	}
							if($("#questionS15many_3").is(':checked')){ many["questionS15many_3"] = $("#questionS15many_3").val();} else{ many["questionS15many_3"] = "пусто";	}
							if($("#questionS15many_4").is(':checked')){ many["questionS15many_4"] = $("#questionS15many_4").val();} else{ many["questionS15many_4"] = "пусто";	}
							if($("#questionS15many_5").is(':checked')){ many["questionS15many_5"] = $("#questionS15many_5").val();} else{ many["questionS15many_5"] = "пусто";	}
							if($("#questionS15many_6").is(':checked')){ many["questionS15many_6"] = $("#questionS15many_6").val();} else{ many["questionS15many_6"] = "пусто";	}
							if($("#questionS15many_7").val() != ''){many["questionS15many_7"] = $("#questionS15many_7").val();	}else{ many["questionS15many_7"] = 'пусто';	}
							
							general["questionS16"] = $("#questionS16").val();
							
							if($("#questionS17many_1").is(':checked')){ many["questionS17many_1"] = $("#questionS17many_1").val();} else{ many["questionS17many_1"] = "пусто";	}
							if($("#questionS17many_2").is(':checked')){ many["questionS17many_2"] = $("#questionS17many_2").val();} else{ many["questionS17many_2"] = "пусто";	}
							if($("#questionS17many_3").is(':checked')){ many["questionS17many_3"] = $("#questionS17many_3").val();} else{ many["questionS17many_3"] = "пусто";	}
							if($("#questionS17many_4").is(':checked')){ many["questionS17many_4"] = $("#questionS17many_4").val();} else{ many["questionS17many_4"] = "пусто";	}
							if($("#questionS17many_5").val() != ''){many["questionS17many_5"] = $("#questionS17many_5").val();	}else{ many["questionS17many_5"] = 'пусто';	}
							
							if($("#questionS18many_1").is(':checked')){ many["questionS18many_1"] = $("#questionS18many_1").val();} else{ many["questionS18many_1"] = "пусто";	}
							if($("#questionS18many_2").is(':checked')){ many["questionS18many_2"] = $("#questionS18many_2").val();} else{ many["questionS18many_2"] = "пусто";	}
							if($("#questionS18many_3").is(':checked')){ many["questionS18many_3"] = $("#questionS18many_3").val();} else{ many["questionS18many_3"] = "пусто";	}
							if($("#questionS18many_4").is(':checked')){ many["questionS18many_4"] = $("#questionS18many_4").val();} else{ many["questionS18many_4"] = "пусто";	}
							if($("#questionS18many_5").is(':checked')){ many["questionS18many_5"] = $("#questionS18many_5").val();} else{ many["questionS18many_5"] = "пусто";	}
							if($("#questionS18many_6").is(':checked')){ many["questionS18many_6"] = $("#questionS18many_6").val();} else{ many["questionS18many_6"] = "пусто";	}
							if($("#questionS18many_7").is(':checked')){ many["questionS18many_7"] = $("#questionS18many_7").val();} else{ many["questionS18many_7"] = "пусто";	}
							if($("#questionS18many_8").val() != ''){many["questionS18many_8"] = $("#questionS18many_8").val();	}else{ many["questionS18many_8"] = 'пусто';	}
							
							
							general["questionS19"] = $("#questionS19").val();
							
							if($("#questionS20many_1").is(':checked')){ many["questionS20many_1"] = $("#questionS20many_1").val();} else{ many["questionS20many_1"] = "пусто";	}
							if($("#questionS20many_2").is(':checked')){ many["questionS20many_2"] = $("#questionS20many_2").val();} else{ many["questionS20many_2"] = "пусто";	}
							if($("#questionS20many_3").val() != ''){many["questionS20many_3"] = $("#questionS20many_3").val();	}else{ many["questionS20many_3"] = 'пусто';	}
							
							if($("#questionS21many_1").is(':checked')){ many["questionS21many_1"] = $("#questionS21many_1").val();} else{ many["questionS21many_1"] = "пусто";	}
							if($("#questionS21many_2").is(':checked')){ many["questionS21many_2"] = $("#questionS21many_2").val();} else{ many["questionS21many_2"] = "пусто";	}
							if($("#questionS21many_3").is(':checked')){ many["questionS21many_3"] = $("#questionS21many_3").val();} else{ many["questionS21many_3"] = "пусто";	}
							if($("#questionS21many_4").is(':checked')){ many["questionS21many_4"] = $("#questionS21many_4").val();} else{ many["questionS21many_4"] = "пусто";	}
							if($("#questionS21many_5").is(':checked')){ many["questionS21many_5"] = $("#questionS21many_5").val();} else{ many["questionS21many_5"] = "пусто";	}
							if($("#questionS21many_6").val() != ''){many["questionS21many_6"] = $("#questionS21many_6").val();	}else{ many["questionS21many_6"] = 'пусто';	}
							
							general["questionS22"] = $("#questionS22").val();
							
							if($("#questionS23many_1").is(':checked')){ many["questionS23many_1"] = $("#questionS23many_1").val();} else{ many["questionS23many_1"] = "пусто";	}
							if($("#questionS23many_2").is(':checked')){ many["questionS23many_2"] = $("#questionS23many_2").val();} else{ many["questionS23many_2"] = "пусто";	}
							if($("#questionS23many_3").val() != ''){many["questionS23many_3"] = $("#questionS23many_3").val();	}else{ many["questionS23many_3"] = 'пусто';	}
							
							sec3["question24_1sec3"] = $("#question24_1sec3").val();
							sec3["question24_2sec3"] = $("#question24_2sec3").val();
							sec3["question24_3sec3"] = $("#question24_3sec3").val();
							sec3["question24_4sec3"] = $("#question24_4sec3").val();
							sec3["question24_5sec3"] = $("#question24_5sec3").val();
							
							general["questionS25"] = $("#questionS25").val();
							general["questionS26"] = $("#questionS26").val();
							general["questionS27"] = $("#questionS27").val();
							general["sexSls"] = $("#sexSls").val();
							general["ageSls"] = $("#ageSls").val();
							general["questionS30"] = $("#questionS30").val();
							if($.trim($('#questionS31dr').val())){	general["questionS31"] = $.trim($('#questionS31dr').val())}else{	general["questionS31"] = $("#questionS31").val();	}
							general["questionS32"] = $("#questionS32").val();
							
							general["polzSecondlSls"] = $("#polzSecondlSls").val();
							
							// после нажатия добавить -> зачищаются периоды для кнопки выбрать
							//$("input[name='namedateBeginsecondlevel']").val('');
							//$("input[name='namedateEndsecondlevel']").val('');
							
							/*
							 * После того как была нажато редактирование и вылезло модальное с данными по редактированию ловим
							 * id этой записи. Если же была нажата просто кнопка "добавить запись" то if не отрабатывает и новая
							 * запись улетает с null id там он генериться тк запись новая.
							 * 
							 * Обрати внимание после отработки этого ajax поле input #id зануляется
							 * иначе при добавлении новой записи этот айдишник постоянно будет и соответственно не добавляться будет а 
							 * редактироваться по этому id
							 */
							if($("#idSLS").val()){ 	general["id"] = parseInt($("#idSLS").val());}
							
							$('#cancelSLS').trigger('click');
							// отрабатывает метод в other.js
							
							var sender = ({ survay1:general, survay2:sec1, survay3:sec2,survay4:sec3, survay5:many}); 
							
					
							$.post('addssl',JSON.stringify(sender),function(response)
	    	      	                {
										
										$('#records_tableSSL').animate({opacity: 0.0}, 2000 );
								    	  userInfo = "<tr><th>№</th><th>МО</th><th>Дата опроса</th><th>Дата ввода</th><th>Пол</th><th>Возраст</th><th>Пользователь</th></tr>";
								    	  for(i =0 ; i < response.result.length ; i++){
  												userInfo += "<tr><td><span class='mycount'></span></td><td><a href='#' onclick=sslid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].moSLS + "</a></td><td><a href='#' onclick=sslid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].dataRespSls + "</a></td><td><a href='#' onclick=sslid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].dataInputSls + "</a></td><td><a href='#' onclick=sslid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].sexSls+ "</a></td><td><a href='#' onclick=sslid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].ageSls + "</a></td><td><a href='#' onclick=sslid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].polzSecondlSls+ "</a></td></tr>";
								    	  }
								    	  setTimeout ("$('#records_tableSSL').html('');",2000);
								    	  setTimeout ("$('#records_tableSSL').append(userInfo);", 2000);
								    	  
								    	  $('#records_tableSSL').animate({opacity: 1}, 2000 );
								    	  //  зануляем id input 
								    	  $("#idDSSL").val('');
	        	      	            },'json')
	        	      	          	.error(function(msg) {console.log('test BAD'); $("#idDSSL").val('');});
	        	      	          	
		}				
						
							
		}	
	
	
	/*
	 * Метод заполняет модальное окно второго уровня данными по id записи (редактирование)
	 * СТАЦИОНАР
	 */
	function sslid( varr,varr2) {
		console.log(varr+'  '+varr2);
		
		$.ajax({
			url : 'slsid',
			type: 'get',
			dataType: 'json',
			data : ({ user: varr, id: varr2}),
			contentType: 'application/json',
		    mimeType: 'application/json',
		    success: function(response)
		    {
		    	
		    	// we have the response 
			      if(response.status == "SUCCESS")
			      {
			    	  /*		console.log('test '+JSON.stringify(response));
			    	  		console.log('=======================');
			    		  console.log('test '+JSON.stringify(response.result[0]));
			    		  console.log('=======================');
			    		  console.log('test '+JSON.stringify(response.result[0].survayClinicSec1));
			    		  console.log('=======================');
			    		  console.log('test '+JSON.stringify(response.result[0].question_many));
			    	  */
			    	    
			    	    $('#addStacionarsecondlevel').trigger('click');
				    	$('#myModal2secondlevel .modal-title').text('Редактирование анкеты второго уровня');
				    	$('.modal-header p').text('Редактирование анкеты стационарной помощи');
				    	$('.renamebtnssl').text('Редактировать');
				    	
				    	for(i =0 ; i < response.result.length ; i++){
				    		  $("#idSLS").val(response.result[i].id);
				    		  $("#moSLS option:contains(" + response.result[i].moSLS +")").prop('selected', true);
				    		  $("input[name='dataRespSls']").val(response.result[i].dataRespSls);
				    		  
				    		  if(response.result[i].questionS1 != 'В плановом порядке (по направлению поликлиники)' &&
				    				  response.result[i].questionS1 != 'В срочном порядке (бригадой "скорой помощи")' &&
				    				  response.result[i].questionS1 != 'Пришел(ла) сам(а)' ){
				    			  $('#questionS1dr').fadeIn();
				    			  $('#questionS1dr').val(response.result[i].questionS1);
				    			  $("#questionS1 option:contains('Другое (напишите)')").prop('selected', true);
				    		  }else{	$("#questionS1 option:contains(" + response.result[i].questionS1 +")").prop('selected', true);	}
				    		  
				    		  
				    		  $("#questionS2 option:contains(" + response.result[i].questionS2 +")").prop('selected', true);
				    		  $("#questionS3").val(response.result[i].questionS3);
				    		  $("#questionS4 option:contains(" + response.result[i].questionS4 +")").prop('selected', true);
				    		  $("#questionS5sec1 option:contains(" + response.result[0].scsslsec1.questionS5sec1 +")").prop('selected', true);
				    		  $("#questionS6 option:contains(" + response.result[i].questionS6 +")").prop('selected', true);
				    		  $("#questionS7 option:contains(" + response.result[i].questionS7 +")").prop('selected', true);
				    		  $("#questionS8 option:contains(" + response.result[i].questionS8 +")").prop('selected', true);
				    		  
				    		  $("#questionS9_1sec1 option:contains(" + response.result[0].scsslsec1.questionS9_1sec1 +")").prop('selected', true);
				    		  $("#questionS9_2sec1 option:contains(" + response.result[0].scsslsec1.questionS9_2sec1 +")").prop('selected', true);
				    		  $("#questionS9_3sec1 option:contains(" + response.result[0].scsslsec1.questionS9_3sec1 +")").prop('selected', true);
				    		  $("#questionS9_4sec1 option:contains(" + response.result[0].scsslsec1.questionS9_4sec1 +")").prop('selected', true);
				    		  $("#questionS9_5sec1 option:contains(" + response.result[0].scsslsec1.questionS9_5sec1 +")").prop('selected', true);
				    		  $("#questionS9_6sec1 option:contains(" + response.result[0].scsslsec1.questionS9_6sec1 +")").prop('selected', true);
				    		  $("#questionS9_7sec1 option:contains(" + response.result[0].scsslsec1.questionS9_7sec1 +")").prop('selected', true);
				    		  $("#questionS9_8sec1 option:contains(" + response.result[0].scsslsec1.questionS9_8sec1 +")").prop('selected', true);
				    		  $("#questionS9_9sec1 option:contains(" + response.result[0].scsslsec1.questionS9_9sec1 +")").prop('selected', true);
				    		  $("#questionS9_10sec1 option:contains(" + response.result[0].scsslsec1.questionS9_10sec1 +")").prop('selected', true);
				    		  $("#questionS9_11sec1 option:contains(" + response.result[0].scsslsec1.questionS9_11sec1 +")").prop('selected', true);
				    		  $("#questionS9_12sec1 option:contains(" + response.result[0].scsslsec1.questionS9_12sec1 +")").prop('selected', true);
				    		  $("#questionS9_13sec1 option:contains(" + response.result[0].scsslsec1.questionS9_13sec1 +")").prop('selected', true);
				    		  $("#questionS9_14sec1 option:contains(" + response.result[0].scsslsec1.questionS9_14sec1 +")").prop('selected', true);
				    		  $("#questionS9_15sec1 option:contains(" + response.result[0].scsslsec1.questionS9_15sec1 +")").prop('selected', true);
				    		  $("#questionS9_16sec1 option:contains(" + response.result[0].scsslsec1.questionS9_16sec1 +")").prop('selected', true);
				    		  $("#questionS9_17sec1 option:contains(" + response.result[0].scsslsec1.questionS9_17sec1 +")").prop('selected', true);
				    		  $("#questionS9_18sec1 option:contains(" + response.result[0].scsslsec1.questionS9_18sec1 +")").prop('selected', true);
				    		  $("#questionS9_19sec1 option:contains(" + response.result[0].scsslsec1.questionS9_19sec1 +")").prop('selected', true);
				    		  
				    		  $("#questionS10 option:contains(" + response.result[i].questionS10 +")").prop('selected', true);
				    		  $("#questionS12 option:contains(" + response.result[i].questionS12 +")").prop('selected', true);
				    		  $("#questionS16 option:contains(" + response.result[i].questionS16 +")").prop('selected', true);
				    		  $("#questionS19 option:contains(" + response.result[i].questionS19 +")").prop('selected', true);
				    		  $("#questionS22 option:contains(" + response.result[i].questionS22 +")").prop('selected', true);
				    		  $("#questionS25").val(response.result[i].questionS25);
				    		  $("#questionS26 option:contains(" + response.result[i].questionS26 +")").prop('selected', true);
				    		  $("#questionS27 option:contains(" + response.result[i].questionS27 +")").prop('selected', true);
				    		  $("#questionS30 option:contains(" + response.result[i].questionS30 +")").prop('selected', true);
				    		  $("#questionS31 option:contains(" + response.result[i].questionS31 +")").prop('selected', true);
				    		  $("#questionS32 option:contains(" + response.result[i].questionS32 +")").prop('selected', true);
				    		  
				    		  $("#questionS11sec1 option:contains(" + response.result[0].scsslsec1.questionS11sec1 +")").prop('selected', true);
				    		  
				    		  $("#question14_1sec2 option:contains(" + response.result[0].scsslsec2.question14_1sec2 +")").prop('selected', true);
				    		  $("#question14_2sec2 option:contains(" + response.result[0].scsslsec2.question14_2sec2 +")").prop('selected', true);
				    		  $("#question14_3sec2 option:contains(" + response.result[0].scsslsec2.question14_3sec2 +")").prop('selected', true);
				    		  $("#question14_4sec2 option:contains(" + response.result[0].scsslsec2.question14_4sec2 +")").prop('selected', true);
				    		  $("#question14_5sec2 option:contains(" + response.result[0].scsslsec2.question14_5sec2 +")").prop('selected', true);
				    		  $("#question14_6sec2 option:contains(" + response.result[0].scsslsec2.question14_6sec2 +")").prop('selected', true);
				    		  $("#question14_7sec2 option:contains(" + response.result[0].scsslsec2.question14_7sec2 +")").prop('selected', true);
				    		  $("#question14_8sec2 option:contains(" + response.result[0].scsslsec2.question14_8sec2 +")").prop('selected', true);
				    		  $("#question14_9sec2 option:contains(" + response.result[0].scsslsec2.question14_9sec2 +")").prop('selected', true);
				    		  $("#question14_10sec2 option:contains(" + response.result[0].scsslsec2.question14_10sec2 +")").prop('selected', true);
				    		  $("#question14_11sec2 option:contains(" + response.result[0].scsslsec2.question14_11sec2 +")").prop('selected', true);
				    		  
				    		  
				    		  $("#question24_1sec3 option:contains(" + response.result[0].scsslsec3.question24_1sec3 +")").prop('selected', true);
				    		  $("#question24_2sec3 option:contains(" + response.result[0].scsslsec3.question24_2sec3 +")").prop('selected', true);
				    		  $("#question24_3sec3 option:contains(" + response.result[0].scsslsec3.question24_3sec3 +")").prop('selected', true);
				    		  $("#question24_4sec3 option:contains(" + response.result[0].scsslsec3.question24_4sec3 +")").prop('selected', true);
				    		  $("#question24_5sec3 option:contains(" + response.result[0].scsslsec3.question24_5sec3 +")").prop('selected', true);
				    		  
				    		  $("#sexSls option:contains(" + response.result[i].sexSls +")").prop('selected', true);
				    		  
				    		  $("#ageSls").val(response.result[i].ageSls);
				    		  
				    		  for(i =0 ; i < response.result[0].manySSL.length ; i++){
				    			  
				    			  
				    			  // вопрос 13
					    		  if(response.result[0].manySSL[i].questionS13many == 'От медицинских работников') {	$("#questionS13many_1").prop("checked", true);}
					    		  else{
					    			  if(response.result[0].manySSL[i].questionS13many == 'От сотрудников страховой компании') {	$("#questionS13many_2").prop("checked", true);}
					    			  else{
					    				  if(response.result[0].manySSL[i].questionS13many == 'От сотрудников Фонда ОМС') {	$("#questionS13many_3").prop("checked", true);}
						    			  else{
						    				  if(response.result[0].manySSL[i].questionS13many == 'От знакомых/родственников') {	$("#questionS13many_4").prop("checked", true);}
							    			  else{
							    				  if(response.result[0].manySSL[i].questionS13many == 'из средств массовой информации') {	$("#questionS13many_5").prop("checked", true);}
								    			  else{
								    				  if(response.result[0].manySSL[i].questionS13many == 'из информации для населения в медицинских организациях (стенды, брошюры,листовки)') {	$("#questionS13many_6").prop("checked", true);}
									    			  else{
									    				  if(response.result[0].manySSL[i].questionS13many == 'из сети интернет') {	$("#questionS13many_7").prop("checked", true);}
										    			  else{
										    				  if(response.result[0].manySSL[i].questionS13many == 'Я не знаю своих прав') {	$("#questionS13many_8").prop("checked", true);}
											    			  else{
											    				  if(response.result[0].manySSL[i].questionS13many == 'Затрудняюсь ответить') {	$("#questionS13many_9").prop("checked", true);}
												    			  else{
												    				  if(response.result[0].manySSL[i].questionS13many != null) $("#questionS13many_10").val(response.result[0].manySSL[i].questionS13many);
												    			  }
											    			  }
										    			  }
									    			  }
								    			  }
							    			  }
						    			  }
					    			  }
					    		  }
				    			  
				    			  // вопрос 15
					    		  if(response.result[0].manySSL[i].questionS15many == 'Администрация медицинской организации') {	$("#questionS15many_1").prop("checked", true);}
				    			  else{
				    				  if(response.result[0].manySSL[i].questionS15many == 'Страховая компания, выдавшая полис ОМС') {	$("#questionS15many_2").prop("checked", true);}
					    			  else{
					    				  if(response.result[0].manySSL[i].questionS15many == 'Фонд обязательного медицинского страхования') {	$("#questionS15many_3").prop("checked", true);}
						    			  else{
						    				  if(response.result[0].manySSL[i].questionS15many == 'Органы управления здравоохранением') {	$("#questionS15many_4").prop("checked", true);}
							    			  else{
							    				  if(response.result[0].manySSL[i].questionS15many == 'Гражданский суд') {	$("#questionS15many_5").prop("checked", true);}
								    			  else{
								    				  if(response.result[0].manySSL[i].questionS15many == 'Затрудняюсь ответить') {	$("#questionS15many_6").prop("checked", true);}
									    			  else{
									    				  if(response.result[0].manySSL[i].questionS15many != null) $("#questionS15many_7").val(response.result[0].manySSL[i].questionS15many);
									    			  }
								    			  }
							    			  }
						    			  }
					    			  }
				    			  }
					    		  
					    		  // вопрос 17
					    		  if(response.result[0].manySSL[i].questionS17many == 'Не знал(а), куда обратиться') {	$("#questionS17many_1").prop("checked", true);}
				    			  else{
				    				  if(response.result[0].manySSL[i].questionS17many == 'Решил(а), что пытаться бесполезно') {	$("#questionS17many_2").prop("checked", true);}
					    			  else{
					    				  if(response.result[0].manySSL[i].questionS17many == 'Побоялся(лась) огласки') {	$("#questionS17many_3").prop("checked", true);}
						    			  else{
						    				  if(response.result[0].manySSL[i].questionS17many == 'Не хотел(а) портить отношения с врачом') {	$("#questionS17many_4").prop("checked", true);}
							    			  else{
							    				  if(response.result[0].manySSL[i].questionS17many != null) $("#questionS17many_5").val(response.result[0].manySSL[i].questionS17many);
							    			  }
						    			  }
					    			  }
				    			  }
					    		  
					    		  // вопрос 18
					    		  if(response.result[0].manySSL[i].questionS18many == 'Врачом оказана некачественная медицинская помощь') {	$("#questionS18many_1").prop("checked", true);}
				    			  else{
				    				  if(response.result[0].manySSL[i].questionS18many == 'Врачом разглашена конфиденциальная информация о состоянии здоровья') {	$("#questionS18many_2").prop("checked", true);}
					    			  else{
					    				  if(response.result[0].manySSL[i].questionS18many == 'Врачом не были назначены необходимые диагностические процедуры') {	$("#questionS18many_3").prop("checked", true);}
						    			  else{
						    				  if(response.result[0].manySSL[i].questionS18many == 'Врачом не было назначено необходимое лечение') {	$("#questionS18many_4").prop("checked", true);}
							    			  else{
							    				  if(response.result[0].manySSL[i].questionS18many == 'Врач не дал направление на обследование в другую медицинскую организацию') {	$("#questionS18many_5").prop("checked", true);}
								    			  else{
								    				  if(response.result[0].manySSL[i].questionS18many == 'Врач  пытался  получить деньги за те услуги, которые должны быть оказаны бесплатно') {	$("#questionS18many_6").prop("checked", true);}
									    			  else{
									    				  if(response.result[0].manySSL[i].questionS18many == 'Врач вел себя грубо, безразлично, невежливо') {	$("#questionS18many_7").prop("checked", true);}
										    			  else{
										    				  if(response.result[0].manySSL[i].questionS18many != null) $("#questionS18many_8").val(response.result[0].manySSL[i].questionS18many);
										    			  }
									    			  }
								    			  }
							    			  }  
						    			  }
					    			  }
				    			  }
					    		  
					    		  // вопрос 20
					    		  if(response.result[0].manySSL[i].questionS20many == 'Не знал(а), куда обратиться') {	$("#questionS20many_1").prop("checked", true);}
				    			  else{
				    				  if(response.result[0].manySSL[i].questionS20many == 'Решил(а), что пытаться бесполезно') {	$("#questionS20many_2").prop("checked", true);}
					    			  else{
					    				  if(response.result[0].manySSL[i].questionS20many != null) $("#questionS20many_3").val(response.result[0].manySSL[i].questionS20many);
					    			  }
				    			  }
					    		  
					    		  // вопрос 21
					    		  if(response.result[0].manySSL[i].questionS21many == 'В связи с переездом на новое место жительства') {	$("#questionS21many_1").prop("checked", true);}
				    			  else{
				    				  if(response.result[0].manySSL[i].questionS21many == 'из-за неудобного режима работы') {	$("#questionS21many_2").prop("checked", true);}
					    			  else{
					    				  if(response.result[0].manySSL[i].questionS21many == 'из-за плохих санитарно-гигиенических условий') {	$("#questionS21many_3").prop("checked", true);}
						    			  else{
						    				  if(response.result[0].manySSL[i].questionS21many == 'В связи с недостаточным спектром медицинских услуг (анализы, узи,флг,рентген и т.п.)') {	$("#questionS21many_4").prop("checked", true);}
							    			  else{
							    				  if(response.result[0].manySSL[i].questionS21many == 'из-за недостаточно квалифицированного медицинского персонала') {	$("#questionS21many_5").prop("checked", true);}
								    			  else{
								    				  if(response.result[0].manySSL[i].questionS21many != null) $("#questionS21many_6").val(response.result[0].manySSL[i].questionS21many);
								    			  }
							    			  }
						    			  }
					    			  }
				    			  }
					    		  // вопрос 23
					    		  if(response.result[0].manySSL[i].questionS23many == 'В медицинской организации, в которой я хотел(а) лечиться, слишком многоприкрепленного населения') {	$("#questionS23many_1").prop("checked", true);}
				    			  else{
				    				  if(response.result[0].manySSL[i].questionS23many == 'из-за отсутствия местной регистрации') {	$("#questionS23many_2").prop("checked", true);}
					    			  else{
					    				  	if(response.result[0].manySSL[i].questionS23many != null) $("#questionS23many_3").val(response.result[0].manySSL[i].questionS23many);
					    			  }
				    			  }
				    		  }
				    		  
				    		  
				    		  
				    	}	  
			      }
		    	
		
			      sslvalidlev();
			 },  
			    error: function(e){  
			      alert('Error: ' + e);  
			    }
		});
		
	}
	
	
	/*
	 * Метод обрабатывает такие моменты в анкете второрго уровня СТАЦИОНАР как  к вопросу 31'
	 * т.е. блокирует вопросы которые нужно перепрыгнуть
	 */
	function sslvalidlev(){
		
		 if($("#questionS10").val() == 'Нет (к вопросу 12)'){ $(".ssldel11").css({'opacity':0.4,'pointer-events':'none'}); $('#questionS11sec1').prop('disabled', true);}
			else{$(".ssldel11").css({'opacity':1,'pointer-events':'visible'}); $('#questionS11sec1').prop('disabled', false);}
		 
		 
		 //Вставил как было
		//ПОА ЗАБЛОЧИЛ
		 /*
		 if($("#questionS16").val() == 'Да (к вопросу 18)'){
				
				$('.validquestS17 input:checkbox').each(function(){
					 $(this).prop('disabled', true);
				 })
				 $(".validquestS17  input:text").prop('disabled', true);
				$(".delssl17").css({'opacity':0.4,'pointer-events':'none'});
				
				
				
				$('.validquestS18 input:checkbox').each(function(){
					 $(this).prop('disabled', false);
				 })
				 $(".validquestS18  input:text").prop('disabled', false);
				//$(".delssl18").css({'opacity':1,'pointer-events':'visible'});
				$(".validquestS18").css({'opacity':1,'pointer-events':'visible'});
				
			}
			else{
					$('.validquestS17 input:checkbox').each(function(){
						 $(this).prop('disabled', false);
					 })
					 $(".validquestS17  input:text").prop('disabled', false);
					$(".delssl17").css({'opacity':1,'pointer-events':'visible'});
					
					
					
					
					if($("#questionS16").val() == 'Нет, не было необходимости (к вопросу 19)'){
						
						$('.validquestS17 input:checkbox').each(function(){
							 $(this).prop('disabled', true);
						 })
						 $(".validquestS17  input:text").prop('disabled', true);
						//$(".delssl17").css({'opacity':0.4,'pointer-events':'none'});
						$(".validquestS17").css({'opacity':0.4,'pointer-events':'none'});
						
						$('.validquestS18 input:checkbox').each(function(){
							 $(this).prop('disabled', true);
						 })
						 $(".validquestS18  input:text").prop('disabled', true);
						//$(".delssl18").css({'opacity':0.4,'pointer-events':'none'});
						$(".validquestS18").css({'opacity':0.4,'pointer-events':'none'});
					}
					else{
							$('.validquestS17 input:checkbox').each(function(){
								 $(this).prop('disabled', false);
							 })
							 $(".validquestS17  input:text").prop('disabled', false);
							$(".delssl17").css({'opacity':1,'pointer-events':'visible'});
							
							
							$('.validquestS18 input:checkbox').each(function(){
								 $(this).prop('disabled', false);
							 })
							 $(".validquestS18  input:text").prop('disabled', false);
							$(".delssl18").css({'opacity':1,'pointer-events':'visible'});
							
						}
if($("#questionS16").val() == 'Нет, не знал(а), что это возможно'){
						
						$('.validquestS17 input:checkbox').each(function(){
							 $(this).prop('disabled', true);
						 })
						 $(".validquestS17  input:text").prop('disabled', true);
						$(".delssl17").css({'opacity':0.4,'pointer-events':'none'});
						
						
						
						$('.validquestS18 input:checkbox').each(function(){
							 $(this).prop('disabled', true);
						 })
						 $(".validquestS18  input:text").prop('disabled', true);
						//$(".delssl18").css({'opacity':0.4,'pointer-events':'none'});
						$(".validquestS18").css({'opacity':0.4,'pointer-events':'none'});
						
			}

			}
	*/		


		 
		//ПРОБА ЕЩЕ ОДНА
		//РАБ НО БЛОЧИМ
		 /*
		 if($("#questionS16").val() == 'Да (к вопросу 18)'){
				
				$('.validquestS17 input:checkbox').each(function(){
					 $(this).prop('disabled', true);
				 })
				 $(".validquestS17  input:text").prop('disabled', true);
				$(".validquestS17").css({'opacity':0.4,'pointer-events':'none'});
				
				
				$('.validquestS18 input:checkbox').each(function(){
					 $(this).prop('disabled', false);
				 })
				 $(".validquestS18  input:text").prop('disabled', false);
				$(".validquestS18").css({'opacity':1,'pointer-events':'visible'});
				
			}
			else{
					$('.validquestS17 input:checkbox').each(function(){
						 $(this).prop('disabled', false);
					 })
					 $(".validquestS17  input:text").prop('disabled', false);
					$(".validquestS17").css({'opacity':1,'pointer-events':'visible'});
					
					//ПРОБА		
					if($("#questionS16").val() == 'Хотел(а), но не смог(ла) (к вопросу 17)'){	
						
					$('.validquestS18 input:checkbox').each(function(){        
					$(this).prop('disabled', true);
					})
					$(".validquestS18 input:text").prop('disabled', true);
					$(".validquestS18").css({'opacity':0.4,'pointer-events':'none'});
					}			
		
						
					
					if($("#questionS16").val() == 'Нет, не было необходимости (к вопросу 19)'){
						
						$('.validquestS17 input:checkbox').each(function(){
					 		$(this).prop('disabled', true);
				 		})
				 		$(".validquestS17  input:text").prop('disabled', true);
						$(".validquestS17").css({'opacity':0.4,'pointer-events':'none'});
						
						$('.validquestS18 input:checkbox').each(function(){
							 $(this).prop('disabled', true);
						 })
						 $(".validquestS18  input:text").prop('disabled', true);
						$(".validquestS18").css({'opacity':0.4,'pointer-events':'none'});
					}
					else{
							$('.validquestS17 input:checkbox').each(function(){
								 $(this).prop('disabled', false);
							 })
							 $(".validquestS17  input:text").prop('disabled', false);
							$(".validquestS17").css({'opacity':1,'pointer-events':'visible'});
							
							$('.validquestS18 input:checkbox').each(function(){
								 $(this).prop('disabled', false);
							 })
							 $(".validquestS18  input:text").prop('disabled', false);
							$(".validquestS18").css({'opacity':1,'pointer-events':'visible'});
						}
if($("#questionS16").val() == 'Нет, не знал(а), что это возможно'){
						
						$('.validquestS17 input:checkbox').each(function(){
					 		$(this).prop('disabled', true);
				 		})
				 		$(".validquestS17  input:text").prop('disabled', true);
						$(".validquestS17").css({'opacity':0.4,'pointer-events':'none'});
						
						$('.validquestS18 input:checkbox').each(function(){
							 $(this).prop('disabled', true);
						 })
						 $(".validquestS18  input:text").prop('disabled', true);
						$(".validquestS18").css({'opacity':0.4,'pointer-events':'none'});
					}
		
			}	
*/
		 if($("#questionS16").val() == 'Да (к вопросу 18)'){
				
			 $('.validquestS17 input:checkbox').each(function(){
			  $(this).prop('disabled', true);
			 				})
			 $(".validquestS17  input:text").prop('disabled', true);
			 $(".validquestS17").css({'opacity':0.4,'pointer-events':'none'});
			 				
			 				
			 $('.validquestS18 input:checkbox').each(function(){
			  $(this).prop('disabled', false);
			 				})
			 $(".validquestS18  input:text").prop('disabled', false);
			 $(".validquestS18").css({'opacity':1,'pointer-events':'visible'});
			 				
			 			}
			 			else{
			 $('.validquestS17 input:checkbox').each(function(){
			  $(this).prop('disabled', false);
			 				})
			 	 $(".validquestS17  input:text").prop('disabled', false);
			 	$(".validquestS17").css({'opacity':1,'pointer-events':'visible'});
			 					
			 					
			 					//ПРОБА		
			/* if($("#questionS16").val() == 'Хотел(а), но не смог(ла) (к вопросу 17)'){
			 						
			 $('.validquestS18 input:checkbox').each(function(){           
			 	$(this).prop('disabled', true);
			 			})
			 	$(".validquestS18 input:text").prop('disabled', true);
			 	//$(".delssl18").css({'opacity':0.4,'pointer-events':'none'});
			 	$(".validquestS18").css({'opacity':0.4,'pointer-events':'none'});
			 	
			 	
			 	}*/
			

			 					
			 if($("#questionS16").val() == 'Нет, не было необходимости (к вопросу 19)'){
			 						
			 $('.validquestS17 input:checkbox').each(function(){
			 	 		$(this).prop('disabled', true);
			 					})
			 	$(".validquestS17  input:text").prop('disabled', true);
			 	$(".validquestS17").css({'opacity':0.4,'pointer-events':'none'});
			 						
			 	$('.validquestS18 input:checkbox').each(function(){
			 	 $(this).prop('disabled', true);
			 			})
			 	 $(".validquestS18  input:text").prop('disabled', true);
			 	$(".validquestS18").css({'opacity':0.4,'pointer-events':'none'});
			 					}
			 		else{
			 	$('.validquestS17 input:checkbox').each(function(){
			 	$(this).prop('disabled', false);
			 			 })
			 	 $(".validquestS17  input:text").prop('disabled', false);
			 							$(".validquestS17").css({'opacity':1,'pointer-events':'visible'});
			 							
			 	$('.validquestS18 input:checkbox').each(function(){
			 	 $(this).prop('disabled', false);
			 				})
			 	$(".validquestS18  input:text").prop('disabled', false);
			 							$(".validquestS18").css({'opacity':1,'pointer-events':'visible'});
			 						}
			 if($("#questionS16").val() == 'Нет, не знал(а), что это возможно'){
			 						
			 $('.validquestS17 input:checkbox').each(function(){
			 	$(this).prop('disabled', true);
			 				})
			 	$(".validquestS17  input:text").prop('disabled', true);
			 	$(".validquestS17").css({'opacity':0.4,'pointer-events':'none'});
			 						
			 $('.validquestS18 input:checkbox').each(function(){
			 	 $(this).prop('disabled', true);
			 			})
			 	 $(".validquestS18  input:text").prop('disabled', true);
			 	$(".validquestS18").css({'opacity':0.4,'pointer-events':'none'});
			 					}
			 
			 if($("#questionS16").val() == 'Хотел(а), но не смог(ла) (к вопросу 17)'){
					
				 $('.validquestS18 input:checkbox').each(function(){           
				 	$(this).prop('disabled', true);
				 			})
				 	$(".validquestS18 input:text").prop('disabled', true);
				 	//$(".delssl18").css({'opacity':0.4,'pointer-events':'none'});
				 	$(".validquestS18").css({'opacity':0.4,'pointer-events':'none'});
				 	
				 	
				 	}
			 			}

		
		//
				 var tt = 0;
				 $('div#quest28 input:checkbox').each(function(){
					 
					 if($(this).is(':checked')){tt ++;}
				   })
				 if(tt > 0){
					 
					 $('.validquestS17 input:checkbox').each(function(){
						 $(this).prop('disabled', true);
					 })
					 $(".validquestS17  input:text").prop('disabled', true);
					 $(".del30").css({'opacity':0.4,'pointer-events':'none'});
					 
					 }
				 else{
					 if($.trim($('div#quest28 input:text').val()) != '') {
						 
						 $('.validquestS17 input:checkbox').each(function(){
							 $(this).prop('disabled', true);
						 })
						 $(".validquestS17  input:text").prop('disabled', true);
						 
						$(".del30").css({'opacity':0.4,'pointer-events':'none'});
						 }
				 }
	

		 //
		 
		 var  sht = 0;
		 if(!$('#questionS18many_1').is(':disabled')){
			 
			 $('.validquestS18 input:checkbox').each(function(){
				 
				 if($(this).is(':checked')){sht ++;}
				 if(sht == 0){
					 if($.trim($('#questionS18many_8').val()) != '') sht++;
				 }
			 })
			 if(sht > 0){
				 
				 //$(".validquestS19").css({'opacity':0.4,'pointer-events':'none'});
				 $(".validquestS19").css({'opacity':0.4});
				 $('#questionS19').prop('disabled', true);

			 }else{
				 //$(".validquestS19").css({'opacity':1,'pointer-events':'visible'});
				 $(".validquestS19").css({'opacity':1});
				 $('#questionS19').prop('disabled', false);
			 }
		 }
		 
		//Вставил как было
		 if($("#questionS19").val() == 'Да (к вопросу 21)'){
				
				$('.validquestS20 input:checkbox').each(function(){
					 $(this).prop('disabled', true);
				 })
				 $(".validquestS20  input:text").prop('disabled', true);
				$(".validquestS20").css({'opacity':0.4,'pointer-events':'none'});
				
				
				$('.validquestS21 input:checkbox').each(function(){
					 $(this).prop('disabled', false);
				 })
				 $(".validquestS21  input:text").prop('disabled', false);
				$(".validquestS21").css({'opacity':1,'pointer-events':'visible'});
				
			}
			else{
					$('.validquestS20 input:checkbox').each(function(){
						 $(this).prop('disabled', false);
					 })
					 $(".validquestS20  input:text").prop('disabled', false);
					$(".validquestS20").css({'opacity':1,'pointer-events':'visible'});
			
					
					//ПРОБА		
					if($("#questionS19").val() == 'Хотел(а), но не смог(ла) (к вопросу 20)'){
						
					$('.validquestS21 input:checkbox').each(function(){            
					$(this).prop('disabled', true);
					})
					$(".validquestS21 input:text").prop('disabled', true);
					$(".validquestS21").css({'opacity':0.4,'pointer-events':'none'});
					}				
					
					if($("#questionS19").val() == 'Нет, не было необходимости (к вопросу 22)'){
						
						$('.validquestS20 input:checkbox').each(function(){
					 		$(this).prop('disabled', true);
				 		})
				 		$(".validquestS20  input:text").prop('disabled', true);
						$(".validquestS20").css({'opacity':0.4,'pointer-events':'none'});
						
						$('.validquestS21 input:checkbox').each(function(){
							 $(this).prop('disabled', true);
						 })
						 $(".validquestS21  input:text").prop('disabled', true);
						$(".validquestS21").css({'opacity':0.4,'pointer-events':'none'});
					}
					else{
							$('.validquestS20 input:checkbox').each(function(){
								 $(this).prop('disabled', false);
							 })
							 $(".validquestS20  input:text").prop('disabled', false);
							$(".validquestS20").css({'opacity':1,'pointer-events':'visible'});
							
							$('.validquestS21 input:checkbox').each(function(){
								 $(this).prop('disabled', false);
							 })
							 $(".validquestS21  input:text").prop('disabled', false);
							$(".validquestS21").css({'opacity':1,'pointer-events':'visible'});
						}
if($("#questionS19").val() == 'Нет, не знал(а), что это возможно'){
						
						$('.validquestS20 input:checkbox').each(function(){
					 		$(this).prop('disabled', true);
				 		})
				 		$(".validquestS20  input:text").prop('disabled', true);
						$(".validquestS20").css({'opacity':0.4,'pointer-events':'none'});
						
						$('.validquestS21 input:checkbox').each(function(){
							 $(this).prop('disabled', true);
						 })
						 $(".validquestS21  input:text").prop('disabled', true);
						$(".validquestS21").css({'opacity':0.4,'pointer-events':'none'});
					}
		
			}	
		
		// 
		 
		 
		 
		 var  sht1 = 0;
		 if(!$('#questionS20many_1').is(':disabled')){
			 
			 $('.validquestS20 input:checkbox').each(function(){
				 
				 if($(this).is(':checked')){sht1 ++;}
				 if(sht1 == 0){
					 if($.trim($('#questionS20many_3').val()) != '') sht1++;
				 }
			 })
			 if(sht1 > 0){
				 
				 $('.validquestS21 input:checkbox').each(function(){
					 $(this).prop('disabled', true);
				 })
				 $(".validquestS21  input:text").prop('disabled', true);
				$(".validquestS21").css({'opacity':0.4});

			 }else{
				 $('.validquestS21 input:checkbox').each(function(){
					 $(this).prop('disabled', false);
				 })
				 $(".validquestS21  input:text").prop('disabled', false);
				$(".validquestS21").css({'opacity':1});
			 }
		 }
		 
		 if($("#questionS22").val() == 'Да, я получал(а) бесплатную медицинскую помощь на других территориях РФ по полису ОМС (к вопросу 24)' || 
				 $("#questionS22").val() == 'Нет, не приходилось (к вопросу 24)'){
				
				$('.validquestS23 input:checkbox').each(function(){
					 $(this).prop('disabled', true);
				 })
				 
				 $(".validquestS23  input:text").prop('disabled', true);
				$(".validquestS23").css({'opacity':0.4,'pointer-events':'none'});
			}
		 	else{
		 		
		 		$('.validquestS23 input:checkbox').each(function(){
					 $(this).prop('disabled', false);
				 })
				 
				 $(".validquestS23  input:text").prop('disabled', false);
				$(".validquestS23").css({'opacity':1,'pointer-events':'visible'});
		 	}
		 
		 
		 if($("#questionS26").val() == 'Нет, никогда не приходилось (к вопросу 28)'){ $(".sslvalid27").css({'opacity':0.4,'pointer-events':'none'}); $('#questionS27').prop('disabled', true);}
			else{$(".sslvalid27").css({'opacity':1,'pointer-events':'visible'}); $('#questionS27').prop('disabled', false);}
		 
		// ===========================================ХОВЕР============================================= 
		 $('.validquestS19').hover(function() {
				if($.trim($('#questionS18many_8').val()) != '')
				{
					
					// $(".validquestS19").css({'opacity':0.4,'pointer-events':'none'});
					$(".validquestS19").css({'opacity':0.4});
					 $('#questionS19').prop('disabled', true);
				}
				else
				{
					var qwe = 0;
					$('.validquestS18 input:checkbox').each(function(){
						if($(this).is(':checked')){qwe ++;}
					 })

					 // т.е. если помимо input text  стоят отметки в чек боксах то ничего...иначе...
					 if(qwe > 0){}else
					 {
						// $(".validquestS19").css({'opacity':1,'pointer-events':'visible'});
						 $(".validquestS19").css({'opacity':1});
						 $('#questionS19').prop('disabled', false);
					 }	 
				}
			});
		 
		 
		 $('.validquestS21').hover(function() {
				if($.trim($('#questionS20many_3').val()) != '')
				{
					
					$('.validquestS21 input:checkbox').each(function(){
						 $(this).prop('disabled', true);
					 })
					 $(".validquestS21  input:text").prop('disabled', true);
					$(".validquestS21").css({'opacity':0.4});
				}
				else
				{
					var qe = 0;
					$('.validquestS20 input:checkbox').each(function(){
						if($(this).is(':checked')){qe ++;}
					 })

					 // т.е. если помимо input text  стоят отметки в чек боксах то ничего...иначе...
					 if(qe > 0){}else
					 {
						 $('.validquestS21 input:checkbox').each(function(){
							 $(this).prop('disabled', false);
						 })
						 $(".validquestS21  input:text").prop('disabled', false);
						$(".validquestS21").css({'opacity':1});
					 }	 
				}
			});
		 //==============================================================================================
		
	}
	
	/*
	 * Метод проверяет на заполненость всей формы второй уровень С
	 * метод учитывает если вопрос отключен
	 */
	function validateSecondS()
	{
		      
			  // проверяем селекты	без права выбора 'Другое (напишите)'
		     var t=0;
		      var $form = $('#formSSL') 
		      $('select', $form).each(function() {
		    	  if(!$(this).is(':disabled') ){
		    		  if('questionS1'!= $(this).attr('id')  && 'questionS31'!= $(this).attr('id')){
		    			  
			    		  // выбираем выбранное
			    		  if($(this).find('option:selected').text().length == 0){
				  	        	t++;
			    		  }  
		    		  }
		    		  else
		    		  {
		    			  if('questionS1'=== $(this).attr('id'))
		    			  {
		    				  if($('#questionS1dr').is(':visible')){
		    					  if($.trim($('#questionS1dr').val()) == ''){
				    				  t++;  
		    					  }
			    			  }else
			    			  {
			    				  if($(this).find('option:selected').text().length == 0){
						  	        	t++;
			    				  }  
			    			  }
		    			  }
		    			  
		    			  
		    			  if('questionS31'=== $(this).attr('id'))
		    			  {
		    				  if($('#questionS31dr').is(':visible')){
		    					  if($.trim($('#questionS31dr').val()) == ''){
				    				  t++;  
		    					  }
			    			  }else
			    			  {
			    				  if($(this).find('option:selected').text().length == 0){
						  	        	t++;
			    				  }  
			    			  }
		    			  }
		    			  
		    		  }
		    	  }
		      });
		      
		      var d_17 = 0;
			   if(!$('#questionS17many_1').is(':disabled')){
				   $('.validquestS17 input:checkbox').each(function(){
						 if(!$(this).is(':checked')){d_17++;}
				   })
				   if(d_17 == 4){	if($.trim($(".validquestS17  input:text").val()) != '') d_17=0; }
				   else{d_17 =	0;}
			   }
			   
			   var d_18 = 0;
			   if(!$('#questionS18many_1').is(':disabled')){
				   $('.validquestS18 input:checkbox').each(function(){
						 if(!$(this).is(':checked')){d_18++;}
				   })
				   if(d_18 == 7){	if($.trim($(".validquestS18  input:text").val()) != '') d_18=0; }
				   else{d_18 =	0;}
			   }
			   
			   var d_20 = 0;
			   if(!$('#questionS20many_1').is(':disabled')){
				   $('.validquestS20 input:checkbox').each(function(){
						 if(!$(this).is(':checked')){d_20++;}
				   })
				   if(d_20 == 2){	if($.trim($(".validquestS20  input:text").val()) != '') d_20=0; }
				   else{d_20 =	0;}
			   }
			   
			   var d_21 = 0;
			   if(!$('#questionS21many_1').is(':disabled')){
				   $('.validquestS21 input:checkbox').each(function(){
						 if(!$(this).is(':checked')){d_21++;}
				   })
				   if(d_21 == 5){	if($.trim($(".validquestS21  input:text").val()) != '') d_21=0; }
				   else{d_21 =	0;}
			   }
			   
			   
			   var d_23 = 0;
			   if(!$('#questionS23many_1').is(':disabled')){
				   $('.validquestS23 input:checkbox').each(function(){
						 if(!$(this).is(':checked')){d_23++;}
				   })
				   if(d_23 == 2){	if($.trim($(".validquestS21  input:text").val()) != '') d_23=0; }
				   else{d_23 =	0;}
			   }
		      
		      
		     
			   
			   
			  console.log('t '+t+' d17 '+d_17+' d18 '+d_18+' d20 '+d_20+' d21 '+d_21+' d23 '+d_23); 
		      if((t+d_17+d_18+d_20+d_21+d_23) > 0) return true; else false;	
	}


