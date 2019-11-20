		var opt; 
		function secondclinic(varr){				
			$.ajax({
				url : 'firstchartpieclinic',
				type: 'get',
				dataType: 'json',
				data : ({ test : varr}),
				contentType: 'application/json',
			    mimeType: 'application/json',
			    success: function(response){
		 
				      if(response.status == "SUCCESS"){
				    	  
				    	 var x = response.result[0];
				    	 var y = response.result[1];
			    	     var z = response.result[2];
				    	 var v = response.result[3];
				    	 
		    	 	opt = {
						      tooltip: {
						          trigger: 'item',
						          formatter: "{a} <br/>{b} : {c} ({d}%)"
						      },
						      legend: {
						          x: 'center',
						          y: 'left',
						          data: ['М 18-59лет', 'Ж 18-54лет', 'М > 60лет', 'Ж > 55лет']
						      },
						      toolbox: {
						          show: true,
						          feature: {
						              magicType: {
						                  show: true,
						                  type: ['pie', 'funnel']
						              },
						              restore: {
						                  show: true
						              },
						              saveAsImage: {
						                  show: true
						              }
						          }
						      },
						      calculable: true,
						      series: [
						          {
						              name: 'Количество опрошенных',
						              type: 'pie',
						              radius: [13, 70],
						              center: ['50%', 100],
						              roseType: 'area',
						              x: '50%', // for funnel
						              max: 40, // for funnel
						              sort: 'ascending', // for funnel
						              data: [
						                  {
						                      value: x,
						                      name: 'М 18-59лет'
						                  },
						                  {
						                      value: y,
						                      name: 'Ж 18-54лет'
						                  },
						                  {
						                      value: z,
						                      name: 'М >60лет'
						                  },
						                  {
						                      value: v,
						                      name: 'Ж >55лет'
						                  }
						          ]
						      }
						  ]
				}           
				    	 
				    	var myChart = echarts.init(document.getElementById('echart_pie2'), theme);
			            myChart.setOption(opt); 
				    	 
				    	 
				      }else{
				      }	      
				    },  
				    error: function(e){  
				      alert('Произошла ошибка. Обновите страницу. ' + e);  
				    }
			});
}	
		
		/*
		 * Метод выводит график пирог при нажатии кнопки выбрать (выбор периода дат)
		 * 
		 */
		
		function secondclinicbetween(varr,dab,dae){				
			$.ajax({
				url : 'firstchartpieclinicbetween',
				type: 'get',
				dataType: 'json',
				data : ({ datebegin: dab, dateend: dae, userp:varr}),
				contentType: 'application/json',
			    mimeType: 'application/json',
			    success: function(response){
		 
				      if(response.status == "SUCCESS"){
				    	  
				    	 var x = response.result[0];
				    	 var y = response.result[1];
			    	     var z = response.result[2];
				    	 var v = response.result[3];
				    	 
		    	 	opt = {
						      tooltip: {
						          trigger: 'item',
						          formatter: "{a} <br/>{b} : {c} ({d}%)"
						      },
						      legend: {
						          x: 'center',
						          y: 'left',
						          data: ['М 18-59лет', 'Ж 18-54лет', 'М > 60лет', 'Ж > 55лет']
						      },
						      toolbox: {
						          show: true,
						          feature: {
						              magicType: {
						                  show: true,
						                  type: ['pie', 'funnel']
						              },
						              restore: {
						                  show: true
						              },
						              saveAsImage: {
						                  show: true
						              }
						          }
						      },
						      calculable: true,
						      series: [
						          {
						              name: 'Количество опрошенных',
						              type: 'pie',
						              radius: [13, 70],
						              center: ['50%', 100],
						              roseType: 'area',
						              x: '50%', // for funnel
						              max: 40, // for funnel
						              sort: 'ascending', // for funnel
						              data: [
						                  {
						                      value: x,
						                      name: 'М 18-59лет'
						                  },
						                  {
						                      value: y,
						                      name: 'Ж 18-54лет'
						                  },
						                  {
						                      value: z,
						                      name: 'М >60лет'
						                  },
						                  {
						                      value: v,
						                      name: 'Ж >55лет'
						                  }
						          ]
						      }
						  ]
				}           
				    	 
				    	var myChart = echarts.init(document.getElementById('echart_pie2'), theme);
			            myChart.setOption(opt); 
				    	 
				    	 
				      }else{
				      }	      
				    },  
				    error: function(e){  
				      alert('Произошла ошибка. Обновите страницу. ' + e);  
				    }
			});
}	
		
function seconddaystac(varr){		
		$.ajax({
			url : 'firstchartpiedaystac',
			type: 'get',
			dataType: 'json',
			data : ({ test : varr}),
			contentType: 'application/json',
		    mimeType: 'application/json',
		    success: function(response){
	 
			      if(response.status == "SUCCESS"){
			    	  	
			    	  	 var x = response.result[0];
				    	 var y = response.result[1];
			    	     var z = response.result[2];
				    	 var v = response.result[3];
				    	 
		    	 	opt = {
						      tooltip: {
						          trigger: 'item',
						          formatter: "{a} <br/>{b} : {c} ({d}%)"
						      },
						      legend: {
						          x: 'center',
						          y: 'left',
						          data: ['М 18-59лет', 'Ж 18-54лет', 'М > 60лет', 'Ж > 55лет']
						      },
						      toolbox: {
						          show: true,
						          feature: {
						              magicType: {
						                  show: true,
						                  type: ['pie', 'funnel']
						              },
						              restore: {
						                  show: true
						              },
						              saveAsImage: {
						                  show: true
						              }
						          }
						      },
						      calculable: true,
						      series: [
						          {
						              name: 'Количество опрошенных',
						              type: 'pie',
						              radius: [13, 70],
						              center: ['50%', 100],
						              roseType: 'area',
						              x: '50%', // for funnel
						              max: 40, // for funnel
						              sort: 'ascending', // for funnel
						              data: [
						                  {
						                      value: x,
						                      name: 'М 18-59лет'
						                  },
						                  {
						                      value: y,
						                      name: 'Ж 18-54лет'
						                  },
						                  {
						                      value: z,
						                      name: 'М >60лет'
						                  },
						                  {
						                      value: v,
						                      name: 'Ж >55лет'
						                  }
						          ]
						      }
						  ]
				}           
				    	 
				    	var myChart = echarts.init(document.getElementById('echart_pie2'), theme);
			            myChart.setOption(opt);
			    	  
			    	  
			    	  
			      }else{
			      }	      
			    },  
			    error: function(e){  
			      alert('Error: ' + e);  
			    }
		});
}		

/*
 * Метод выводит график пирог при нажатии кнопки выбрать (выбор периода дат)
 * 
 */

function seconddaystacbetween(varr,dab,dae){		
	$.ajax({
		url : 'firstchartpiedaystacbetween',
		type: 'get',
		dataType: 'json',
		data : ({ datebegin: dab, dateend: dae, userp:varr}),
		contentType: 'application/json',
	    mimeType: 'application/json',
	    success: function(response){
 
		      if(response.status == "SUCCESS"){
		    	  	
		    	  	 var x = response.result[0];
			    	 var y = response.result[1];
		    	     var z = response.result[2];
			    	 var v = response.result[3];
			    	 
	    	 	opt = {
					      tooltip: {
					          trigger: 'item',
					          formatter: "{a} <br/>{b} : {c} ({d}%)"
					      },
					      legend: {
					          x: 'center',
					          y: 'left',
					          data: ['М 18-59лет', 'Ж 18-54лет', 'М > 60лет', 'Ж > 55лет']
					      },
					      toolbox: {
					          show: true,
					          feature: {
					              magicType: {
					                  show: true,
					                  type: ['pie', 'funnel']
					              },
					              restore: {
					                  show: true
					              },
					              saveAsImage: {
					                  show: true
					              }
					          }
					      },
					      calculable: true,
					      series: [
					          {
					              name: 'Количество опрошенных',
					              type: 'pie',
					              radius: [13, 70],
					              center: ['50%', 100],
					              roseType: 'area',
					              x: '50%', // for funnel
					              max: 40, // for funnel
					              sort: 'ascending', // for funnel
					              data: [
					                  {
					                      value: x,
					                      name: 'М 18-59лет'
					                  },
					                  {
					                      value: y,
					                      name: 'Ж 18-54лет'
					                  },
					                  {
					                      value: z,
					                      name: 'М >60лет'
					                  },
					                  {
					                      value: v,
					                      name: 'Ж >55лет'
					                  }
					          ]
					      }
					  ]
			}           
			    	 
			    	var myChart = echarts.init(document.getElementById('echart_pie2'), theme);
		            myChart.setOption(opt);
		    	  
		    	  
		    	  
		      }else{
		      }	      
		    },  
		    error: function(e){  
		      alert('Error: ' + e);  
		    }
	});
}		

function secondstac(varr){
	$.ajax({
		url : 'firstchartpiestac',
		type: 'get',
		dataType: 'json',
		data : ({ test : varr}),
		contentType: 'application/json',
	    mimeType: 'application/json',
	    success: function(response){
 
		      if(response.status == "SUCCESS"){
		    	  
		    	  	var x = response.result[0];
			    	 var y = response.result[1];
		    	     var z = response.result[2];
			    	 var v = response.result[3];
			    	 
	    	 	opt = {
					      tooltip: {
					          trigger: 'item',
					          formatter: "{a} <br/>{b} : {c} ({d}%)"
					      },
					      legend: {
					          x: 'center',
					          y: 'left',
					          data: ['М 18-59лет', 'Ж 18-54лет', 'М > 60лет', 'Ж > 55лет']
					      },
					      toolbox: {
					          show: true,
					          feature: {
					              magicType: {
					                  show: true,
					                  type: ['pie', 'funnel']
					              },
					              restore: {
					                  show: true
					              },
					              saveAsImage: {
					                  show: true
					              }
					          }
					      },
					      calculable: true,
					      series: [
					          {
					              name: 'Количество опрошенных',
					              type: 'pie',
					              radius: [13, 70],
					              center: ['50%', 100],
					              roseType: 'area',
					              x: '50%', // for funnel
					              max: 40, // for funnel
					              sort: 'ascending', // for funnel
					              data: [
					                  {
					                      value: x,
					                      name: 'М 18-59лет'
					                  },
					                  {
					                      value: y,
					                      name: 'Ж 18-54лет'
					                  },
					                  {
					                      value: z,
					                      name: 'М >60лет'
					                  },
					                  {
					                      value: v,
					                      name: 'Ж >55лет'
					                  }
					          ]
					      }
					  ]
			}           
			    	 
			    	var myChart = echarts.init(document.getElementById('echart_pie2'), theme);
		            myChart.setOption(opt);

		      }else{
		      }	      
		    },  
		    error: function(e){  
		      alert('Error: ' + e);  
		    }
	});
}

function secondstacbetween(varr,dab,dae){
	$.ajax({
		url : 'firstchartpiestacbetween',
		type: 'get',
		dataType: 'json',
		data : ({ datebegin: dab, dateend: dae, userp:varr}),
		contentType: 'application/json',
	    mimeType: 'application/json',
	    success: function(response){
 
		      if(response.status == "SUCCESS"){
		    	  
		    	  	var x = response.result[0];
			    	 var y = response.result[1];
		    	     var z = response.result[2];
			    	 var v = response.result[3];
			    	 
	    	 	opt = {
					      tooltip: {
					          trigger: 'item',
					          formatter: "{a} <br/>{b} : {c} ({d}%)"
					      },
					      legend: {
					          x: 'center',
					          y: 'left',
					          data: ['М 18-59лет', 'Ж 18-54лет', 'М > 60лет', 'Ж > 55лет']
					      },
					      toolbox: {
					          show: true,
					          feature: {
					              magicType: {
					                  show: true,
					                  type: ['pie', 'funnel']
					              },
					              restore: {
					                  show: true
					              },
					              saveAsImage: {
					                  show: true
					              }
					          }
					      },
					      calculable: true,
					      series: [
					          {
					              name: 'Количество опрошенных',
					              type: 'pie',
					              radius: [13, 70],
					              center: ['50%', 100],
					              roseType: 'area',
					              x: '50%', // for funnel
					              max: 40, // for funnel
					              sort: 'ascending', // for funnel
					              data: [
					                  {
					                      value: x,
					                      name: 'М 18-59лет'
					                  },
					                  {
					                      value: y,
					                      name: 'Ж 18-54лет'
					                  },
					                  {
					                      value: z,
					                      name: 'М >60лет'
					                  },
					                  {
					                      value: v,
					                      name: 'Ж >55лет'
					                  }
					          ]
					      }
					  ]
			}           
			    	 
			    	var myChart = echarts.init(document.getElementById('echart_pie2'), theme);
		            myChart.setOption(opt);

		      }else{
		      }	      
		    },  
		    error: function(e){  
		      alert('Error: ' + e);  
		    }
	});
}


/*
 * Метод обрабатывает нажатие Анкеты первого уровня -> АП помощь
 * 
 */
function alloneclinic(varr) {
	
	$.ajax({
		url : 'oneclinic',
		type: 'get',
		dataType: 'json',
		data : ({ test : varr}),
		contentType: 'application/json',
	    mimeType: 'application/json',
	    success: function(response){
 
		      if(response.status == "SUCCESS"){
		    	  userInfo = "<tr><th>№</th><th>МО</th><th>Дата опроса</th><th>Дата ввода</th><th>Пол</th><th>Возраст</th><th>Пользователь</th></tr>";
		    	  for(i =0 ; i < response.result.length ; i++){
		    		  userInfo += "<tr><td><span class='mycount'></span></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].mo + "</a></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].dataResp + "</a></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].dataInput + "</a></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].sex + "</a></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].age + "</a></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].polzovatel + "</a></td></tr>";
		    	  }
		    	  
		    	  $('#records_table').html(userInfo);
		    	  $('#records_table').animate({opacity: 0}, 0 );
		    	  $('#records_table').animate({opacity: 1}, 4000 );
		    	 
		      }else{
		      }	      
		    },  
		    error: function(e){  
		      alert('Произошла ошибка. Обновите страницу. ' + e);  
		    }
	});
	
	setTimeout( function () { secondclinic(varr);},4000);	
}

/*
 *  Метод обрабатывает нажатие клавиши добавить запись (Добавление анкеты) и обновляет список из базы
 *  с уже добаленной записью
 * 
 */
function oneclinic(varr) {
	
	if(	validateOneClinic()){  $(".errorOneClinic").css('display','block');	}else{
	
						var search = {}
						
						search["age"] = $("#age").val();     
						search["ambulance"] = $("#ambulance").val();
						search["clinicDoctor"] = $("#clinicDoctor").val();
						search["dataResp"] = $("input[name='dataRespN']").val();
						search["diagnosticTests"] = $("#diagnosticTests").val();
						search["equipment"] = $("#equipment").val();
						search["freeHelp"] = $("#freeHelp").val();
						search["mo"] = $("#mo").val();
						search["laboratoryResearch"] = $("#laboratoryResearch").val();
						search["medicalSpecialists"] = $("#medicalSpecialists").val();
						search["qualityAmbulance"] = $("#qualityAmbulance").val();
						search["repairs"] = $("#repairs").val();
						search["seeADoctor"] = $("#seeADoctor").val();
						search["sex"] = $("#sex").val();
						search["therapist"] = $("#therapist").val();
						search["waitingTime"] = $("#waitingTime").val();
						search["waitingTime2"] = $("#waitingTime2").val();
						
						$("input[name='namedateBegin']").val('');
						$("input[name='namedateEnd']").val('');
						
						search["polzovatel"] = $("#polzovatel").val();
						/*
						 * После того как была нажато редактирование и вылезло модальное с данными по редактированию ловим
						 * id этой записи. Если же была нажата проста кнопка "добавить запись" то if не отрабатывает и новая
						 * запись улетает с null id там он генериться тк запись новая.
						 * 
						 * Обрати внимание после отработки этого ajax поле input #id зануляется
						 * иначе при добавлении новой записи этот айдишник постоянно будет и соответственно не добавляться будет а 
						 * редактироваться по этому id
						 */
						if($("#id").val()){ 	search["id"] = parseInt($("#id").val());}
						
						$('#cancelOneClinic').trigger('click');
						$.ajax({
							url : 'addoneclinic',
							type: 'Post',
							dataType: 'json',
							contentType: 'application/json',
						    mimeType: 'application/json',
							data : JSON.stringify(search),
							success: function(response){
							      // we have the response 
							      if(response.status == "SUCCESS"){
							    	  $('#records_table').animate({opacity: 0.0}, 2000 );
							    	  userInfo = "<tr><th>№</th><th>МО</th><th>Дата опроса</th><th>Дата ввода</th><th>Пол</th><th>Возраст</th><th>Пользователь</th></tr>";
							    	  for(i =0 ; i < response.result.length ; i++){
							    		  userInfo += "<tr><td><span class='mycount'></span></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].mo + "</a></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].dataResp + "</a></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].dataInput + "</a></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].sex + "</a></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].age + "</a></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].polzovatel + "</a></td></tr>";
							    	  }
							    	  setTimeout ("$('#records_table').html('');",2000);
							    	  setTimeout ("$('#records_table').append(userInfo);", 2000);
							    	  
							    	  $('#records_table').animate({opacity: 1}, 2000 );
							    	  //  зануляем id input 
							    	  $("#id").val('');
							      }else{
							      }	      
							    },
							    error: function(e){  
							      alert('Error: ' + e); 
							      //  зануляем id input 
						    	  $("#id").val('');
							    }
						})
	
					
						
	}		
	
	setTimeout( function () { secondclinic(varr);},4000);

}

/*
 * Метод обрабатывает нажатие Выбрать (период за который надо вывести записи) на листе анк первого уровня АП пом
 * 
 */
function oneclinicbetween( varr) {
	
	var inputText = $("#dateBegin").val();
	var inputText2 = $("#dateEnd").val();
	console.log('log2 '+inputText+'  '+inputText2);
	
	$.ajax({
		url : 'oneclinicbetween',
		type: 'get',
		dataType: 'json',
		data : ({ datebegin: inputText, dateend: inputText2, userp:varr}),
		contentType: 'application/json',
	    mimeType: 'application/json',
	    success: function(response){
		      // we have the response 
		      if(response.status == "SUCCESS"){
		    	  $('#records_table').animate({opacity: 0.0}, 3000 );
		    	  
		    	  userInfo = "<tr><th>№</th><th>МО</th><th>Дата опроса</th><th>Дата ввода</th><th>Пол</th><th>Возраст</th><th>Пользователь</th></tr>";
		    	  for(i =0 ; i < response.result.length ; i++){
		    		  userInfo += "<tr><td><span class='mycount'></span></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].mo + "</a></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].dataResp + "</a></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].dataInput + "</a></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].sex + "</a></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].age + "</a></td><td><a href='#' onclick=onecliniceditid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].polzovatel + "</a></td></tr>";
		    	  }
		    	  setTimeout ("$('#records_table').html('');",3000);
		    	  setTimeout ("$('#records_table').append(userInfo);", 3000);
		    	  
		    	  $('#records_table').animate({opacity: 1}, 3000 );
		    	 
		      }else{
		    	 
		      }	      
		    },  
		    error: function(e){  
		      alert('Error: ' + e);  
		    }
	});
	
	setTimeout( function () { secondclinicbetween(varr,inputText,inputText2);},4000);
}

/*
 * Метод обновляет запись в модальном окне первого уровня
 */
function oneLevel1() {
	$('#myModal .modal-title').text('Добавить анкету первого уровня');
	$('.modal-header p').text('Добавление анкеты амбулаторно-поликлинической помощи');
	$('.editonelev').text('Добавить анкету');
}

function oneLevel2() {
	$('#myModal1 .modal-title').text('Добавить анкету первого уровня');
	$('.modal-header p').text('Добавление анкеты дневного стационара');
	$('.editonelev').text('Добавить анкету');
}

function oneLevel3() {
	$('#myModal2 .modal-title').text('Добавить анкету первого уровня');
	$('.modal-header p').text('Добавление анкеты стационара');
	$('.editonelev').text('Добавить анкету');
}



/*
 * Метод заполняет модальное окно первого уровня данными по id записи (редакитирование)
 * Поликлиника
 */
function onecliniceditid( varr,varr2) {
	console.log(varr+'  '+varr2);
	$.ajax({
		url : 'onecliniceditid',
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
		    	  $('#addOneClinic').trigger('click');
		    	  $('#myModal .modal-title').text('Редактирование анкеты первого уровня');
		    	  $('.modal-header p').text('Редактирование анкеты амбулаторно-поликлинической помощи');
		    	  $('.editonelev').text('Редактировать');
		    	  
		    	  
		    	  
		    	  for(i =0 ; i < response.result.length ; i++){
		    		  $("#mo option:contains(" + response.result[i].mo +")").prop('selected', true);
		    		  $("#age").val(response.result[i].age);
		    		  $("#ambulance option:contains(" + response.result[i].ambulance +")").prop('selected', true);
		    		  $("#clinicDoctor option:contains(" + response.result[i].clinicDoctor +")").prop('selected', true);
		    		  $("#diagnosticTests option:contains(" + response.result[i].diagnosticTests +")").prop('selected', true);
		    		  $("#equipment option:contains(" + response.result[i].equipment +")").prop('selected', true);
		    		  $("#freeHelp option:contains(" + response.result[i].freeHelp +")").prop('selected', true);
		    		  $("#laboratoryResearch option:contains(" + response.result[i].laboratoryResearch +")").prop('selected', true);
		    		  $("#medicalSpecialists option:contains(" + response.result[i].medicalSpecialists +")").prop('selected', true);
		    		  $("#qualityAmbulance option:contains(" + response.result[i].qualityAmbulance +")").prop('selected', true);
		    		  $("#repairs option:contains(" + response.result[i].repairs +")").prop('selected', true);
		    		  $("#seeADoctor option:contains(" + response.result[i].seeADoctor +")").prop('selected', true);
		    		  $("#sex option:contains(" + response.result[i].sex +")").prop('selected', true);
		    		  $("#therapist option:contains(" + response.result[i].therapist +")").prop('selected', true);
		    		  $("#waitingTime option:contains(" + response.result[i].waitingTime +")").prop('selected', true);
		    		  $("#waitingTime2 option:contains(" + response.result[i].waitingTime2 +")").prop('selected', true);
		    		  
		    		  $("#id").val(response.result[i].id);
					  $("input[name='dataRespN']").val(response.result[i].dataResp);
		    	  }
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
 * Метод проверяет на заполненость всей формы первый уровень АП-П
 */
function validateOneClinic()
{
	if(!$("#age").val()||
	   !$("#ambulance").val()||
	   !$("#clinicDoctor").val()||
	   !$("input[name='dataRespN']").val()||
	   !$("#diagnosticTests").val()||
	   !$("#equipment").val()||
	   !$("#freeHelp").val()||
	   !$("#mo").val()||
	   !$("#laboratoryResearch").val()||
	   !$("#medicalSpecialists").val()||
	   !$("#qualityAmbulance").val()||
	   !$("#repairs").val()||
	   !$("#seeADoctor").val()||
	   !$("#sex").val()||
	   !$("#therapist").val()||
	   !$("#waitingTime").val()||
	   !$("#waitingTime2").val()) return true;
	
		else return false;
}



/*	ДНЕВНОЙ СТАЦИОНАР	*/


/*
 * Метод проверяет на заполненость всей формы первый уровень АП-П
 */
function validateOneDayStacionar()
{
	
	if(!$("#moDayStac").val()||
	   !$("#qualityDaystac").val()||
	   !$("#rapairsDaystac").val()||
	   !$("input[name='dataRespDS']").val()||
	   !$("#comfortDaystac").val()||
	   !$("#servicesDaystac").val()||
	   !$("#equipmentDaystac").val()||
	   !$("#medicineDaystac").val()||
	   !$("#laboratoryDaystac").val()||
	   !$("#therapistDaystac").val()||
	   !$("#ambulanceDaystac").val()||
	   !$("#qualityAmbulanceDaystac").val()||
	   !$("#sexDaystac").val()||
	   !$("#ageDaystac").val()) return true;
	
		else return false;
}




/*
 * Метод обрабатывает нажатие Анкеты первого уровня -> Дневной Стационар
 * 
 */
function allonedaystacionar(varr) {
	
	
	$.ajax({
		url : 'onedaystacionar',
		type: 'get',
		dataType: 'json',
		data : ({ test : varr}),
		contentType: 'application/json',
	    mimeType: 'application/json',
	    success: function(response){
 
		      if(response.status == "SUCCESS"){
		    	  userInfo = "<tr><th>№</th><th>ID</th><th>МО</th><th>Дата опроса</th><th>Дата ввода</th><th>Пол</th><th>Возраст</th><th>Пользователь</th></tr>";
		    	  for(i =0 ; i < response.result.length ; i++){
		    		  userInfo += "<tr><td><span class='mycount'></span></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].id + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].moDayStac + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].dataRespDaystac + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].dataInputDaystac + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].sexDaystac + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].ageDaystac + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].polzovateldaystacionar + "</a></td></tr>";
		    	  }
		    	  
		    	  $('#records_tableOneDayStacionar').html(userInfo);
		    	  $('#records_tableOneDayStacionar').animate({opacity: 0}, 0 );
		    	  $('#records_tableOneDayStacionar').animate({opacity: 1}, 3000 );
		    	 
		      }else{
		      }	      
		    },  
		    error: function(e){  
		      alert('Error: ' + e);  
		    }
	});
	
	setTimeout( function () { seconddaystac(varr);},1000);
}

/*
 *  Метод обрабатывает нажатие клавиши добавить запись (Добавление анкеты) и обновляет список из базы
 *  с уже добаленной записью анкет Дневного стационара
 * 
 */
function onedaystacionar(varr) {
	
	if(	validateOneDayStacionar()){  $(".errorOneClinic").css('display','block');	}else{
		
						$("input[name='namedateEndDayStacionar']").val('');
						$("input[name='namedateBeginDayStacionar']").val('');	
	
						var search = {}
						
						search["moDayStac"] = $("#moDayStac").val();
						search["dataRespDaystac"] = $("input[name='dataRespDS']").val();
						search["qualityDaystac"] = $("#qualityDaystac").val();
						search["rapairsDaystac"] = $("#rapairsDaystac").val();
						search["comfortDaystac"] = $("#comfortDaystac").val();
						search["servicesDaystac"] = $("#servicesDaystac").val();
						search["equipmentDaystac"] = $("#equipmentDaystac").val();
						search["medicineDaystac"] = $("#medicineDaystac").val();
						search["laboratoryDaystac"] = $("#laboratoryDaystac").val();
						search["therapistDaystac"] = $("#therapistDaystac").val();
						search["ambulanceDaystac"] = $("#ambulanceDaystac").val();
						search["qualityAmbulanceDaystac"] = $("#qualityAmbulanceDaystac").val();
						search["sexDaystac"] = $("#sexDaystac").val();
						search["ageDaystac"] = $("#ageDaystac").val();
						
						search["polzovateldaystacionar"] = $("#polzovateldaystacionar").val();
						/*
						 * После того как была нажато редактирование и вылезло модальное с данными по редактированию ловим
						 * id этой записи. Если же была нажата проста кнопка "добавить запись" то if не отрабатывает и новая
						 * запись улетает с null id там он генериться тк запись новая.
						 * 
						 * Обрати внимание полсле отработки этого ajax поле input #id зануляется
						 * иначе при добавлении новой записи этот одишник постоянно будет и соответственно не добавляться будет а 
						 * редактироваться по этому id
						 */
						if($("#idoneDayStac").val()){ 	search["id"] = parseInt($("#idoneDayStac").val());}
						console.log('log '+ $("#idoneDayStac").val());
						$('#cancelOneDayStacionar').trigger('click');
						
						$.ajax({
							url : 'addonedaystac',
							type: 'Post',
							dataType: 'json',
							contentType: 'application/json',
						    mimeType: 'application/json',
							data : JSON.stringify(search),
							success: function(response){
							      if(response.status == "SUCCESS"){
							    	  $('#records_tableOneDayStacionar').animate({opacity: 0.0}, 2000 );
							    	  userInfo = "<tr><th>№</th><th>ID</th><th>МО</th><th>Дата опроса</th><th>Дата ввода</th><th>Пол</th><th>Возраст</th><th>Пользователь</th></tr>";
							    	  for(i =0 ; i < response.result.length ; i++){
							    		  userInfo += "<tr><td><span class='mycount'></span></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].id + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].moDayStac + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].dataRespDaystac + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].dataInputDaystac + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].sexDaystac + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].ageDaystac + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].polzovateldaystacionar + "</a></td></tr>";
							    	  }
							    	  setTimeout ("$('#records_tableOneDayStacionar').html('');",2000);
							    	  setTimeout ("$('#records_tableOneDayStacionar').append(userInfo);", 2000);
							    	  
							    	  $('#records_tableOneDayStacionar').animate({opacity: 1}, 2000 );
							    	  //  зануляем id input 
							    	  $("#idoneDayStac").val('');
							      }else{
							      }	      
							    },  
							    error: function(e){  
							      alert('Error: ' + e); 
							      //  зануляем id input 
						    	  $("#idoneDayStac").val('');
							    }
						});
	}	
	
	setTimeout( function () { seconddaystac(varr);},4000);
}

/*
 * Метод заполняет модальное окно первого уровня дневного стационара по id  
 */
function onedaystacid( varr,varr2) {
	console.log(varr+'  '+varr2);
	$.ajax({
		url : 'onedaystacid',
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
		    	  $('#addOneDayStacionar').trigger('click');
		    	  $('#myModal1 .modal-title').text('Редактирование анкеты первого уровня');
		    	  $('.modal-header p').text('Редактирование анкеты дневного стационара');
		    	  $('.editonelev').text('Редактировать');
		    	  
		    	  for(i =0 ; i < response.result.length ; i++){
		    		  
		    		  $("#moDayStac option:contains(" + response.result[i].moDayStac +")").prop('selected', true);
		    		  $("input[name='dataRespDS']").val(response.result[i].dataRespDaystac);
					  $("#qualityDaystac option:contains(" + response.result[i].qualityDaystac +")").prop('selected', true);
					  $("#rapairsDaystac option:contains(" + response.result[i].rapairsDaystac +")").prop('selected', true);
					  $("#comfortDaystac option:contains(" + response.result[i].comfortDaystac +")").prop('selected', true);
					  $("#servicesDaystac option:contains(" + response.result[i].servicesDaystac +")").prop('selected', true);
					  $("#equipmentDaystac option:contains(" + response.result[i].equipmentDaystac +")").prop('selected', true);
					  $("#medicineDaystac option:contains(" + response.result[i].medicineDaystac +")").prop('selected', true);
					  $("#laboratoryDaystac option:contains(" + response.result[i].laboratoryDaystac +")").prop('selected', true);
					  $("#therapistDaystac option:contains(" + response.result[i].therapistDaystac +")").prop('selected', true);
					  $("#ambulanceDaystac option:contains(" + response.result[i].ambulanceDaystac +")").prop('selected', true);
					  $("#qualityAmbulanceDaystac option:contains(" + response.result[i].qualityAmbulanceDaystac +")").prop('selected', true);
					  $("#sexDaystac option:contains(" + response.result[i].sexDaystac +")").prop('selected', true);
					  $("#ageDaystac").val(response.result[i].ageDaystac);
		    		  
					  $("#idoneDayStac").val(response.result[i].id);
					  
		    	  }
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
 * Метод обрабатывает нажатие Выбрать (период за который надо вывести записи) на листе анк первого уровня АП пом
 * 
 */
function onedaystacbetween( varr) {
	
	var inputText = $("#dateBeginDayStacionar").val();
	var inputText2 = $("#dateEndDayStacionar").val();
	console.log('log2 '+inputText+'  '+inputText2);
	
	$.ajax({
		url : 'onedaystacbetween',
		type: 'get',
		dataType: 'json',
		data : ({ datebegin: inputText, dateend: inputText2, userp:varr}),
		contentType: 'application/json',
	    mimeType: 'application/json',
	    success: function(response){
		      // we have the response 
		      if(response.status == "SUCCESS"){
		    	  $('#records_tableOneDayStacionar').animate({opacity: 0.0}, 3000 );
		    	  
		    	  userInfo = "<tr><th>№</th><th>ID</th><th>МО</th><th>Дата опроса</th><th>Дата ввода</th><th>Пол</th><th>Возраст</th><th>Пользователь</th></tr>";
		    	  for(i =0 ; i < response.result.length ; i++){
		    		  userInfo += "<tr><td><span class='mycount'></span></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].id + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].moDayStac + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].dataRespDaystac + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].dataInputDaystac + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].sexDaystac + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].ageDaystac + "</a></td><td><a href='#' onclick=onedaystacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].polzovateldaystacionar + "</a></td></tr>";
		    	  }
		    	  setTimeout ("$('#records_tableOneDayStacionar').html('');",3000);
		    	  setTimeout ("$('#records_tableOneDayStacionar').append(userInfo);", 3000);
		    	  
		    	  $('#records_tableOneDayStacionar').animate({opacity: 1}, 3000 );
		    	 
		      }else{
		    	 
		      }	      
		    },  
		    error: function(e){  
		      alert('Error: ' + e);  
		    }
	});
	
	setTimeout( function () { seconddaystacbetween(varr,inputText,inputText2);},4000);
}


/* СТАЦИОНАР*/

/*
 * Метод проверяет на заполненость всей формы первый уровень СТАЦИОНАРНОЙ ПОМОЩИ
 */
function validateOneStacionar()
{
	if(!$("#moonestac").val()||
	   !$("#qualityStac").val()||
	   !$("#rapairsStac").val()||
	   !$("input[name='dataonestac']").val()||
	   !$("#comfortStac").val()||
	   !$("#foodStac").val()||
	   !$("#equipmentStac").val()||
	   !$("#medicineStac").val()||
	   !$("#termsStac").val()||
	   !$("#laboratoryStac").val()||
	   !$("#therapistStac").val()||
	   !$("#ambulanceStac").val()||
	   !$("#qualityAmbulanceStac").val()||
	   !$("#ageStac").val()||
	   !$("#sexStac").val()) return true;
	
		else return false;
}


/*
 *  Метод обрабатывает нажатие клавиши добавить запись (Добавление анкеты) и обновляет список из базы
 *  с уже добаленной записью анкет  стационара
 * 
 */
function onestacionar(varr) {
	
	if(	validateOneStacionar()){  $(".errorOneClinic").css('display','block');	}else{
	
						$("input[name='namedateBeginStacionar']").val('');
						$("input[name='namedateEndStacionar']").val('');	
		
						var search = {}
						
						search["moonestac"] = $("#moonestac").val();
						search["dataRespStac"] = $("input[name='dataonestac']").val();
						search["qualityStac"] = $("#qualityStac").val();
						search["rapairsStac"] = $("#rapairsStac").val();
						search["comfortStac"] = $("#comfortStac").val();
						search["foodStac"] = $("#foodStac").val();
						search["equipmentStac"] = $("#equipmentStac").val();
						search["medicineStac"] = $("#medicineStac").val();
						search["termsStac"] = $("#termsStac").val();
						search["laboratoryStac"] = $("#laboratoryStac").val();
						search["therapistStac"] = $("#therapistStac").val();
						search["ambulanceStac"] = $("#ambulanceStac").val();
						search["qualityAmbulanceStac"] = $("#qualityAmbulanceStac").val();
						search["sexStac"] = $("#sexStac").val();
						search["ageStac"] = $("#ageStac").val();
						
						search["polzovatelonestac"] = $("#polzovatelonestac").val();
						/*
						 * После того как была нажато редактирование и вылезло модальное с данными по редактированию ловим
						 * id этой записи. Если же была нажата проста кнопка "добавить запись" то if не отрабатывает и новая
						 * запись улетает с null id там он генериться тк запись новая.
						 * 
						 * Обрати внимание полсле отработки этого ajax поле input #id зануляется
						 * иначе при добавлении новой записи этот одишник постоянно будет и соответственно не добавляться будет а 
						 * редактироваться по этому id
						 */
						if($("#idoneStac").val()){ 	search["id"] = parseInt($("#idoneStac").val());}
						console.log('log '+ $("#idoneStac").val());
						$('#cancelOneStac').trigger('click');
						
						$.ajax({
							url : 'addonestac',
							type: 'Post',
							dataType: 'json',
							contentType: 'application/json',
						    mimeType: 'application/json',
							data : JSON.stringify(search),
							success: function(response){
							      if(response.status == "SUCCESS"){
							    	  $('#records_tableOneStacionar').animate({opacity: 0.0}, 2000 );
							    	  userInfo = "<tr><th>№</th><th>МО</th><th>Дата опроса</th><th>Дата ввода</th><th>Пол</th><th>Возраст</th><th>Пользователь</th></tr>";
							    	  for(i =0 ; i < response.result.length ; i++){
							    		  userInfo += "<tr><td><span class='mycount'></span></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].moonestac + "</a></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].dataRespStac + "</a></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].dataInputStac + "</a></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].sexStac + "</a></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].ageStac + "</a></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].polzovatelonestac + "</a></td></tr>";
							    	  }
							    	  setTimeout ("$('#records_tableOneStacionar').html('');",2000);
							    	  setTimeout ("$('#records_tableOneStacionar').append(userInfo);", 2000);
							    	  
							    	  $('#records_tableOneStacionar').animate({opacity: 1}, 2000 );
							    	  //  зануляем id input 
							    	  $("#idoneStac").val('');
							      }else{
							      }	      
							    },  
							    error: function(e){  
							      alert('Error: ' + e); 
							      //  зануляем id input 
						    	  $("#idoneStac").val('');
							    }
						});
	}				
	
	setTimeout( function () { secondstac(varr);},4000);
}

/*
 * Метод обрабатывает нажатие Анкеты первого уровня -> Стационар
 * 
 */
function allonestacionar(varr) {
	
	
	$.ajax({
		url : 'onestacionar',
		type: 'get',
		dataType: 'json',
		data : ({ test : varr}),
		contentType: 'application/json',
	    mimeType: 'application/json',
	    success: function(response){
 
		      if(response.status == "SUCCESS"){
		    	  userInfo = "<tr><th>№</th><th>МО</th><th>Дата опроса</th><th>Дата ввода</th><th>Пол</th><th>Возраст</th><th>Пользователь</th></tr>";
		    	  for(i =0 ; i < response.result.length ; i++){
		    		  userInfo += "<tr><td><span class='mycount'></span></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].moonestac + "</a></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].dataRespStac + "</a></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].dataInputStac + "</a></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].sexStac + "</a></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].ageStac + "</a></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].polzovatelonestac + "</a></td></tr>";
		    	  }
		    	  
		    	  $('#records_tableOneStacionar').html(userInfo);
		    	  $('#records_tableOneStacionar').animate({opacity: 0}, 0 );
		    	  $('#records_tableOneStacionar').animate({opacity: 1}, 3000 );
		    	 
		      }else{
		      }	      
		    },  
		    error: function(e){  
		      alert('Error: ' + e);  
		    }
	});
	
	setTimeout( function () { secondstac(varr);},4000);
}

/*
 * Метод заполняет модальное окно первого уровня  стационара по id
 * стационар  
 */
function onestacid( varr,varr2) {
	console.log(varr+'  '+varr2);
	$.ajax({
		url : 'onestacid',
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
		    	  $('#addOneStacionar').trigger('click');
		    	  $('#myModal2 .modal-title').text('Редактирование анкеты первого уровня');
		    	  $('.modal-header p').text('Редактирование анкеты стационара');
		    	  $('.editonelev').text('Редактировать');
		    	  
		    	  for(i =0 ; i < response.result.length ; i++){
		    		  
		    		    $("#moonestac option:contains(" + response.result[i].moonestac +")").prop('selected', true);
						$("input[name='dataonestac']").val(response.result[i].dataRespStac);
						$("#qualityStac option:contains(" + response.result[i].qualityStac +")").prop('selected', true);
						$("#rapairsStac option:contains(" + response.result[i].rapairsStac +")").prop('selected', true);
						$("#comfortStac option:contains(" + response.result[i].comfortStac +")").prop('selected', true);
						$("#foodStac option:contains(" + response.result[i].foodStac +")").prop('selected', true);
						$("#equipmentStac option:contains(" + response.result[i].equipmentStac +")").prop('selected', true);
						$("#medicineStac option:contains(" + response.result[i].medicineStac +")").prop('selected', true);
						$("#termsStac option:contains(" + response.result[i].termsStac +")").prop('selected', true);
						$("#laboratoryStac option:contains(" + response.result[i].laboratoryStac +")").prop('selected', true);
						$("#therapistStac option:contains(" + response.result[i].therapistStac +")").prop('selected', true);
						$("#ambulanceStac option:contains(" + response.result[i].ambulanceStac +")").prop('selected', true);
						$("#qualityAmbulanceStac option:contains(" + response.result[i].qualityAmbulanceStac +")").prop('selected', true);
						$("#sexStac option:contains(" + response.result[i].sexStac +")").prop('selected', true);
						$("#ageStac").val(response.result[i].ageStac);
						
						$("#idoneStac").val(response.result[i].id);
		    	  }
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
 * Метод обрабатывает нажатие Выбрать (период за который надо вывести записи) на листе анк первого уровня стационарной
 *  помощи
 */
function onestacbetween( varr) {
	
	var inputText = $("#dateBeginStacionar").val();
	var inputText2 = $("#dateEndStacionar").val();
	console.log('log2 '+inputText+'  '+inputText2);
	
	$.ajax({
		url : 'onestacbetween',
		type: 'get',
		dataType: 'json',
		data : ({ datebegin: inputText, dateend: inputText2, userp:varr}),
		contentType: 'application/json',
	    mimeType: 'application/json',
	    success: function(response){
		      // we have the response 
		      if(response.status == "SUCCESS"){
		    	  $('#records_tableOneStacionar').animate({opacity: 0.0}, 3000 );
		    	  
		    	  userInfo = "<tr><th>№</th><th>МО</th><th>Дата опроса</th><th>Дата ввода</th><th>Пол</th><th>Возраст</th><th>Пользователь</th></tr>";
		    	  for(i =0 ; i < response.result.length ; i++){
		    		  userInfo += "<tr><td><span class='mycount'></span></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].moonestac + "</a></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  + response.result[i].dataRespStac + "</a></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].dataInputStac + "</a></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].sexStac + "</a></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].ageStac + "</a></td><td><a href='#' onclick=onestacid('"+varr+"','"+response.result[i].id+"')>"  +response.result[i].polzovatelonestac + "</a></td></tr>";
		    	  }
		    	  setTimeout ("$('#records_tableOneStacionar').html('');",3000);
		    	  setTimeout ("$('#records_tableOneStacionar').append(userInfo);", 3000);
		    	  
		    	  $('#records_tableOneStacionar').animate({opacity: 1}, 3000 );
		    	 
		      }else{
		    	 
		      }	      
		    },  
		    error: function(e){  
		      alert('Error: ' + e);  
		    }
	});
	
	setTimeout( function () { secondstacbetween(varr,inputText,inputText2);},4000);
}

