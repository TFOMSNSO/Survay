/*
 * Метод отправляет данные на сервер с формы отчетов первого уровня 
 * 
 */
function onepartreports(buttonId) {
	
	var paramonepart = {}
	
	paramonepart["datestart"] = $("input[name='datebeginonereport']").val();
	paramonepart["dateend"] = $("input[name='dateendonereport']").val();
	
	paramonepart["lpu"] = $("#lpuFormOneRerort").val();ansFormOnePart1
	
	paramonepart["ans1"] = $("#ansFormOnePart1").is(':checked')
	paramonepart["ans2"] = $("#ansFormOnePart2").is(':checked')
	paramonepart["ans3"] = $("#ansFormOnePart3").is(':checked')
	paramonepart["ans4"] = $("#ansFormOnePart4").is(':checked')
	paramonepart["ans5"] = $("#ansFormOnePart5").is(':checked')
	
	
	paramonepart["onefoms"] = $("#oneTFOMS").is(':checked')
	paramonepart["onesimaz"] = $("#oneSimaz").is(':checked')
	paramonepart["oneingos"] = $("#oneIngos").is(':checked')
	paramonepart["onerosno"] = $("#oneRosno").is(':checked')
	
	paramonepart["plus_twolevel"] = $("#plus_twolevel").is(':checked')
    paramonepart["plus_onlytwolevel"] = $("#plus_onlytwolevel").is(':checked')
	
	paramonepart["kids"] = $("#kids").is(':checked')
	paramonepart["adult"] = $("#adult").is(':checked')
	
	var obj = document.getElementById(buttonId);
	if (obj) {obj.disabled = true;} 
	
	console.log($("input[name='datebeginonereport']").val()+'   '+$("input[name='dateendonereport']").val());
	$.ajax({
		url : 'firstPartReport',
		type: 'Post',
		dataType: 'json',
		data : JSON.stringify(paramonepart),
		contentType: 'application/json',
	    mimeType: 'application/json',
							success: function(data)
							{
								// pass to controller
								document.location.href = '/download'
								 	
								$("input[name='datebeginonereport']").val('');
								$("input[name='dateendonereport']").val('');
								
								$( "#oneTFOMS" ).prop( "checked", false );
								$( "#oneSimaz" ).prop( "checked", false );
								$( "#oneIngos" ).prop( "checked", false );
								$( "#oneRosno" ).prop( "checked", false );
								
								$( "#ansFormOnePart1" ).prop( "checked", false );
								$( "#ansFormOnePart2" ).prop( "checked", false );
								$( "#ansFormOnePart3" ).prop( "checked", false );
								$( "#ansFormOnePart4" ).prop( "checked", false );
								$( "#ansFormOnePart5" ).prop( "checked", false );
								
								$( "#plus_twolevel" ).prop( "checked", false );
								$( "#plus_onlytwolevel" ).prop( "checked", false );
							
								
								$( "#kids" ).prop( "checked", false );
								$( "#adult" ).prop( "checked", false );
								
								$( "#lpuFormOneRerort" ).val($("#lpuFormOneRerort").prop('defaultSelected'));
								obj.disabled = false;
						    },
						  
							    error: function(e){  
							      alert('Произошла ошибка обновите станицу'); 
							     
							    }		    
	});
}

/*
 * Метод отправляет данные на сервер с формы отчетов второго уровня поликлиника 
 * 
 */
function secondpartreportsbigc(buttonId) {

	var values = {} , org = [] , ans = [],ansAaS = [], sc2=0 ,sc3=0 ,  sc = 0;
	
	$.each($("#formslcbReport").serializeArray(), function (i, field) {
	    if(field.name.indexOf('org[]')>=0){
	    	org[sc] = field.value;
	    	sc++;
	    }
	    else{
	    	if(field.name.indexOf('ans[]')>=0){
		    	ans[sc2] = field.value;
		    	sc2++;
		    }else{
		    	if(field.name.indexOf('ansAaS[]')>=0){
		    		ansAaS[sc3] = field.value;
		    		sc3++;
		    	}
		    	else{
		    		values[field.name] =field.value;
		    	}
	        }
	    	
	    }
	    
	});
	values['org'] = org;
	values['ans'] = ans;
	values['ansAaS'] = ansAaS;
	
	$("#slcb_spin").addClass("fa fa-cog fa-spin fa-2x fa-fw");
	
	$.ajax({
		url : 'slcbPartTwoReport',
		type: 'Post',
		dataType: 'json',
		data : JSON.stringify(values),
		contentType: 'application/json',
	    mimeType: 'application/json',
							success: function(data)
							{
								//console.log('YPPPPPPPPPPA');
								// pass to controller
								document.location.href = '/report_big_clinic';
								$("#slcb_spin").removeClass("fa fa-cog fa-spin fa-2x fa-fw");
								 	
								$("input[name='datebeginslcbreport']").val('');

								$("input[name='dateendslcbreport']").val('');
								
								$( "#twoslbcTFOMS" ).prop( "checked", false );
								$( "#twoslbcSimaz" ).prop( "checked", false );
								$( "#twoslbcIngos" ).prop( "checked", false );
								$( "#twoslbcRosno" ).prop( "checked", false );
								
								$( "div[id^='ansFormOnePartAaS']" ).prop( "checked", false );
								
								
								
								$("#formslcbReport input[type=checkbox]").each(function()
							    {
									$(this).prop( "checked", false );
							    });
								
							    //07.05.2019 нач	
							    $("#formslcbReport2 input[type=checkbox]").each(function()
											{
								$(this).prop( "checked", false );
								});
							    //07.05.2019 кон

							  //13.05.2019 нач	
							    $(".formsldsbReport2 input[type=checkbox]").each(function()
							    							    {
							    			$(this).prop( "checked", false );
							    							    });
							    //13.05.2019 кон

							  //15.05.2019 нач	
							    $(".bigreportssl2 input[type=checkbox]").each(function()
							    							    {
							    			$(this).prop( "checked", false );
							    							    });
							    //15.05.2019 кон

							  //05.06.2019 нач	
							    $(".bigreportssl3 input[type=checkbox]").each(function()
							    							    							    {
							    $(this).prop( "checked", false );
							    							    							    });
							  //05.06.2019 кон

							    
							    
							    
						/*		$( "#ansFormOnePart1" ).prop( "checked", false );
								$( "#ansFormOnePart2" ).prop( "checked", false );
								$( "#ansFormOnePart3" ).prop( "checked", false );
								$( "#ansFormOnePart4" ).prop( "checked", false );
								$( "#ansFormOnePart5" ).prop( "checked", false );
								
								$( "#lpuFormOneRerort" ).val($("#lpuFormOneRerort").prop('defaultSelected'));
								obj.disabled = false;*/
						    },
						  
							    error: function(e){  
							      alert('Произошла ошибка обновите станицу'); 
							     
							    }		    
	});
	
	
	
}

//07.05.2019 нач
/*
 * Метод отправляет данные на сервер с формы отчетов второго уровня поликлиника 
 * 
 */
function secondpartreportsbigc2(buttonId) {

	var values = {} , org = [] , ans = [],ansAaS = [], sc2=0 ,sc3=0 ,  sc = 0;
	
	$.each($("#formslcbReport2").serializeArray(), function (i, field) {
	    if(field.name.indexOf('org[]')>=0){
	    	org[sc] = field.value;
	    	sc++;
	    }
	    else{
	    	if(field.name.indexOf('ans[]')>=0){
		    	ans[sc2] = field.value;
		    	sc2++;
		    }else{
		    	if(field.name.indexOf('ansAaS[]')>=0){
		    		ansAaS[sc3] = field.value;
		    		sc3++;
		    	}
		    	else{
		    		values[field.name] =field.value;
		    	}
	        }
	    	
	    }
	    
	});
	values['org'] = org;
	values['ans'] = ans;
	values['ansAaS'] = ansAaS;
	
	$("#slcb_spin").addClass("fa fa-cog fa-spin fa-2x fa-fw");
	
	$.ajax({
		url : 'slcbPartTwoReport2',
		type: 'Post',
		dataType: 'json',
		data : JSON.stringify(values),
		contentType: 'application/json',
	    mimeType: 'application/json',
							success: function(data)
							{
								//console.log('YPPPPPPPPPPA');
								// pass to controller
								document.location.href = '/report_big_clinic2';
								$("#slcb_spin").removeClass("fa fa-cog fa-spin fa-2x fa-fw");
								 	
								$("input[name='datebeginslcbreport']").val('');

								$("input[name='dateendslcbreport']").val('');
								
	$( "#twoslbcTFOMS" ).prop( "checked", false );
	$( "#twoslbcSimaz" ).prop( "checked", false );
	$( "#twoslbcIngos" ).prop( "checked", false );
	$( "#twoslbcRosno" ).prop( "checked", false );
								
	$( "div[id^='ansFormOnePartAaS']" ).prop( "checked", false );
								
								
								
	$("#formslcbReport2 input[type=checkbox]").each(function()
							    {
			$(this).prop( "checked", false );
							    });
								
						/*		$( "#ansFormOnePart1" ).prop( "checked", false );
								$( "#ansFormOnePart2" ).prop( "checked", false );
								$( "#ansFormOnePart3" ).prop( "checked", false );
								$( "#ansFormOnePart4" ).prop( "checked", false );
								$( "#ansFormOnePart5" ).prop( "checked", false );
								
								$( "#lpuFormOneRerort" ).val($("#lpuFormOneRerort").prop('defaultSelected'));
								obj.disabled = false;*/
						    },
						  
							    error: function(e){  
							      alert('Произошла ошибка обновите станицу'); 
							     
							    }		    
	});
	
	
	
}
//07.05.2019 кон


/*
 * Метод отправляет данные на сервер с формы отчетов второго уровня дс
 * 
 */
function secondpartreportsbigds(buttonId) {

	var values = {} , org = [] , ans = [],ansAaS = [], sc2=0,sc3=0,  sc = 0;
	
	$.each($("#formsldsbReport").serializeArray(), function (i, field) {
	    if(field.name.indexOf('org[]')>=0){
	    	org[sc] = field.value;
	    	sc++;
	    }
	    else{
	    	if(field.name.indexOf('ans[]')>=0){
		    	ans[sc2] = field.value;
		    	sc2++;
		    }else{
		    	if(field.name.indexOf('ansAaS[]')>=0){
		    		ansAaS[sc3] = field.value;
			    	sc3++;
		    	}else{
	        	values[field.name] =field.value;
		    	}
	        }
	    	
	    }
	    
	});
	values['org'] = org;
	values['ans'] = ans;
	values['ansAaS'] = ansAaS;
	
	$("#slcb_spin2").addClass("fa fa-cog fa-spin fa-2x fa-fw");
	
	$.ajax({
		url : 'sldsbPartTwoReport',
		type: 'Post',
		dataType: 'json',
		data : JSON.stringify(values),
		contentType: 'application/json',
	    mimeType: 'application/json',
							success: function(data)
							{
								// pass to controller
								document.location.href = '/report_big_ds';
								$("#slcb_spin2").removeClass("fa fa-cog fa-spin fa-2x fa-fw");
								 	
								$("input[name='datebeginslcbreport']").val('');

								$("input[name='dateendslcbreport']").val('');
								
								/*$( "#twosldsbTFOMS" ).prop( "checked", false );
								$( "#twosldsbSimaz" ).prop( "checked", false );
								$( "#twosldsbIngos" ).prop( "checked", false );
								$( "#twosldsbRosno" ).prop( "checked", false );
								
								$( "div[id^='ansFormOnePartAaS']" ).prop( "checked", false );*/
								
								
								
								$(".bigreportssl input[type=checkbox]").each(function()
							    {
									$(this).prop( "checked", false );
							    });
						    },
						  
							    error: function(e){  
							      alert('Произошла ошибка обновите станицу'); 
							     
							    }		    
	});
	
	
	
}


//13.05.2019 нач
/*
 * Метод отправляет данные на сервер с формы отчетов второго уровня дс
 * 
 */
function secondpartreportsbigds2(buttonId) {

	var values = {} , org = [] , ans = [],ansAaS = [], sc2=0,sc3=0,  sc = 0;
	
	$.each($("#formsldsbReport2").serializeArray(), function (i, field) {
	    if(field.name.indexOf('org[]')>=0){
	    	org[sc] = field.value;
	    	sc++;
	    }
	    else{
	    	if(field.name.indexOf('ans[]')>=0){
		    	ans[sc2] = field.value;
		    	sc2++;
		    }else{
		    	if(field.name.indexOf('ansAaS[]')>=0){
		    		ansAaS[sc3] = field.value;
			    	sc3++;
		    	}else{
	        	values[field.name] =field.value;
		    	}
	        }
	    	
	    }
	    
	});
	values['org'] = org;
	values['ans'] = ans;
	values['ansAaS'] = ansAaS;
	
	$("#slcb_spin2").addClass("fa fa-cog fa-spin fa-2x fa-fw");
	
	$.ajax({
		url : 'sldsbPartTwoReport2',
		type: 'Post',
		dataType: 'json',
		data : JSON.stringify(values),
		contentType: 'application/json',
	    mimeType: 'application/json',
							success: function(data)
							{
								// pass to controller
								document.location.href = '/report_big_ds2';
								$("#slcb_spin2").removeClass("fa fa-cog fa-spin fa-2x fa-fw");
								 	
								$("input[name='datebeginslcbreport']").val('');

								$("input[name='dateendslcbreport']").val('');
								
								$( "#twosldsbTFOMS" ).prop( "checked", false );
								$( "#twosldsbSimaz" ).prop( "checked", false );
								$( "#twosldsbIngos" ).prop( "checked", false );
								$( "#twosldsbRosno" ).prop( "checked", false );
								
								$( "div[id^='ansFormOnePartAaS']" ).prop( "checked", false );
								
								
								
	$(".formsldsbReport2 input[type=checkbox]").each(function()
							    {
			$(this).prop( "checked", false );
							    });
						    },
						  
							    error: function(e){  
							      alert('Произошла ошибка обновите станицу'); 
							     
							    }		    
	});
	
	
	
}
//13.05.2019 кон



/*
 * Метод отправляет данные на сервер с формы отчетов второго уровня стационар
 * 
 */
function secondpartreportsbigs(buttonId) {

	var values = {} , org = [] , ans = [],ansAaS = [], sc2=0 ,sc3=0,  sc = 0;
	
	$.each($("#formslsbReport").serializeArray(), function (i, field) {
	    if(field.name.indexOf('org[]')>=0){
	    	org[sc] = field.value;
	    	sc++;
	    }
	    else{
	    	if(field.name.indexOf('ans[]')>=0){
		    	ans[sc2] = field.value;
		    	sc2++;
		    }else{
		    	if(field.name.indexOf('ansAaS[]')>=0){
		    		ansAaS[sc3] = field.value;
			    	sc3++;
		    	}
		    	else{
	        	values[field.name] =field.value;
		    	}
	        }
	    	
	    }
	    
	});
	values['org'] = org;
	values['ans'] = ans;
	values['ansAaS'] = ansAaS;
	
	$("#slcb_spin3").addClass("fa fa-cog fa-spin fa-2x fa-fw");
	
	$.ajax({
		url : 'slsbPartTwoReport',
		type: 'Post',
		dataType: 'json',
		data : JSON.stringify(values),
		contentType: 'application/json',
	    mimeType: 'application/json',
							success: function(data)
							{
								// pass to controller
								document.location.href = '/report_big_s'
								 	
								$("#slcb_spin3").removeClass("fa fa-cog fa-spin fa-2x fa-fw");
							 	
								$("input[name='datebeginslcbreport']").val('');

								$("input[name='dateendslcbreport']").val('');
								
								$(".bigreportssl input[type=checkbox]").each(function()
							    {
									$(this).prop( "checked", false );
							    });
						    },
						  
							    error: function(e){  
							      alert('Произошла ошибка обновите станицу'); 
							     
							    }		    
	});
	
	
	
}


//15.05.2019 нач
/*
 * Метод отправляет данные на сервер с формы отчетов второго уровня стационар
 * 
 */
function secondpartreportsbigs2(buttonId) {

	var values = {} , org = [] , ans = [],ansAaS = [], sc2=0 ,sc3=0,  sc = 0;
	
	$.each($("#formslsbReport2").serializeArray(), function (i, field) {
	    if(field.name.indexOf('org[]')>=0){
	    	org[sc] = field.value;
	    	sc++;
	    }
	    else{
	    	if(field.name.indexOf('ans[]')>=0){
		    	ans[sc2] = field.value;
		    	sc2++;
		    }else{
		    	if(field.name.indexOf('ansAaS[]')>=0){
		    		ansAaS[sc3] = field.value;
			    	sc3++;
		    	}
		    	else{
	        	values[field.name] =field.value;
		    	}
	        }
	    	
	    }
	    
	});
	values['org'] = org;
	values['ans'] = ans;
	values['ansAaS'] = ansAaS;
	
	$("#slcb_spin3").addClass("fa fa-cog fa-spin fa-2x fa-fw");
	
	$.ajax({
		url : 'slsbPartTwoReport2',
		type: 'Post',
		dataType: 'json',
		data : JSON.stringify(values),
		contentType: 'application/json',
	    mimeType: 'application/json',
							success: function(data)
							{
								// pass to controller
								document.location.href = '/report_big_s2'
								 	
								$("#slcb_spin3").removeClass("fa fa-cog fa-spin fa-2x fa-fw");
							 	
								$("input[name='datebeginslcbreport']").val('');

								$("input[name='dateendslcbreport']").val('');
								
								$(".bigreportssl2 input[type=checkbox]").each(function()
							    {
									$(this).prop( "checked", false );
							    });
						    },
						  
							    error: function(e){  
							      alert('Произошла ошибка обновите станицу'); 
							     
							    }		    
	});
	
	
	
}
//15.05.2019 кон


//05.06.2019 нач
/*
 * Метод отправляет данные на сервер с формы отчетов второго уровня стационар
 * 
 */
function secondpartreportsbigs3(buttonId) {

	var values = {} , org = [] , ans = [],ansAaS = [], sc2=0 ,sc3=0,  sc = 0;
	
	$.each($("#formslsbReport3").serializeArray(), function (i, field) {
	    if(field.name.indexOf('org[]')>=0){
	    	org[sc] = field.value;
	    	sc++;
	    }
	    else{
	    	if(field.name.indexOf('ans[]')>=0){
		    	ans[sc2] = field.value;
		    	sc2++;
		    }else{
		    	if(field.name.indexOf('ansAaS[]')>=0){
		    		ansAaS[sc3] = field.value;
			    	sc3++;
		    	}
		    	else{
	        	values[field.name] =field.value;
		    	}
	        }
	    	
	    }
	    
	});
	values['org'] = org;
	values['ans'] = ans;
	values['ansAaS'] = ansAaS;
	
	$("#slcb_spin3").addClass("fa fa-cog fa-spin fa-2x fa-fw");
	
	$.ajax({
		url : 'slsbPartTwoReport3',
		type: 'Post',
		dataType: 'json',
		data : JSON.stringify(values),
		contentType: 'application/json',
	    mimeType: 'application/json',
							success: function(data)
							{
								// pass to controller
								document.location.href = '/report_big_s3'
								 	
								$("#slcb_spin3").removeClass("fa fa-cog fa-spin fa-2x fa-fw");
							 	
								$("input[name='datebeginslcbreport']").val('');

								$("input[name='dateendslcbreport']").val('');

								
	$(".bigreportssl3 input[type=checkbox]").each(function()
							    {
									$(this).prop( "checked", false );
							    });
						    },
						  
							    error: function(e){  
							      alert('Произошла ошибка обновите станицу'); 
							     
							    }		    
	});
	
	
	
}
//05.06.2019 кон



function twopartreports(buttonId) {
	
	var search = {}
	
	search["datestart"] = $("input[name='datebegintworeport']").val();
	search["dateend"] = $("input[name='dateendtworeport']").val();
	
	search["lpu"] = $("#lpuFormTwoRerort").val();ansFormOnePart1
	
	search["ans1"] = $("#ansFormTwoPart1").is(':checked')
	search["ans2"] = $("#ansFormTwoPart2").is(':checked')
	search["ans3"] = $("#ansFormTwoPart3").is(':checked')
	search["ans4"] = $("#ansFormTwoPart4").is(':checked')
	search["ans5"] = $("#ansFormTwoPart5").is(':checked')
	
	
	search["onefoms"] = $("#twoTFOMS").is(':checked')
	search["onesimaz"] = $("#twoSimaz").is(':checked')
	search["oneingos"] = $("#twoIngos").is(':checked')
	search["onerosno"] = $("#twoRosno").is(':checked')
	
	search["kids"] = $("#kids").is(':checked')
	search["adult"] = $("#adult").is(':checked')
	
	var obj = document.getElementById(buttonId);
	if (obj) {obj.disabled = true;} 
	
	console.log($("input[name='datebegintworeport']").val()+'   '+$("input[name='dateendtworeport']").val());
	$.ajax({
		url : 'secondPartReport',
		type: 'Post',
		dataType: 'json',
		data : JSON.stringify(search),
		contentType: 'application/json',
	    mimeType: 'application/json',
							success: function(data)
							{
								// pass to controller
								document.location.href = '/download'
								 	
								$("input[name='datebegintworeport']").val('');
								$("input[name='dateendtworeport']").val('');
								
								$( "#twoTFOMS" ).prop( "checked", false );
								$( "#twoSimaz" ).prop( "checked", false );
								$( "#twoIngos" ).prop( "checked", false );
								$( "#twoRosno" ).prop( "checked", false );
								
								$( "#ansFormTwoPart1" ).prop( "checked", false );
								$( "#ansFormTwoPart2" ).prop( "checked", false );
								$( "#ansFormTwoPart3" ).prop( "checked", false );
								$( "#ansFormTwoPart4" ).prop( "checked", false );
								$( "#ansFormTwoPart5" ).prop( "checked", false );
								
								$( "#kids" ).prop( "checked", false );
								$( "#adult" ).prop( "checked", false );
								
								$( "#lpuFormTwoRerort" ).val($("#lpuFormTwoRerort").prop('defaultSelected'));
								obj.disabled = false;
						    },
						  
							    error: function(e){  
							      alert('Произошла ошибка обновите станицу'); 
							     
							    }		    
	});
}




