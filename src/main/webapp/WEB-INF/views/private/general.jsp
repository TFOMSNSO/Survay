<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ page session="false"%>
<!doctype html>
<html lang="ru">
<head>
<meta charset="utf-8">
<title>Главная</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/tableoneLevel.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/shine.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
<link rel="stylesheet" type="text/css" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/js/1.11.2/themes/smoothness/jquery-ui.css">


<script src="${pageContext.request.contextPath}/resources/js/jquery-1.11.0.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/1.11.2/jquery-ui.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.validate.js"></script>

<!-- echart -->
    <script src="${pageContext.request.contextPath}/resources/js/echarts-all.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/green.js"></script>




<sec:authentication var="principal" property="principal" />




<script type="text/javascript">
	console.log('${pageContext.request.contextPath}');
$(document).ready(function()
{ 
	
	
	$(this).click(function(){ shine(); });
	var user = '${principal.username}';
	console.log('log '+ user);
	
	if(user == 'smo_simaz')
	{
		$("#oneTFOMS").attr("disabled", true);
		$("#oneIngos").attr("disabled", true);
		$("#oneRosno").attr("disabled", true);
		
		$("#twosldsbTFOMS").attr("disabled", true);
		$("#twosldsbIngos").attr("disabled", true);
		$("#twosldsbRosno").attr("disabled", true);
		
		$("#twoslbcTFOMS").attr("disabled", true);
		$("#twoslbcIngos").attr("disabled", true);
		$("#twoslbcRosno").attr("disabled", true);
		
		
	
		$("#twoslsbTFOMS").attr("disabled", true);
		$("#twoslsbIngos").attr("disabled", true);
		$("#twoslsbRosno").attr("disabled", true);
	}
	
	if(user == 'smo_rosno')
	{
		$("#oneTFOMS").attr("disabled", true);
		$("#oneIngos").attr("disabled", true);
		$("#oneSimaz").attr("disabled", true);
		
		$("#twosldsbTFOMS").attr("disabled", true);
		$("#twosldsbIngos").attr("disabled", true);
		$("#twosldsbSimaz").attr("disabled", true);
		
		$("#twoslbcTFOMS").attr("disabled", true);
		$("#twoslbcIngos").attr("disabled", true);
		$("#twoslbcSimaz").attr("disabled", true);
		
		$("#twoslsbTFOMS").attr("disabled", true);
		$("#twoslsbIngos").attr("disabled", true);
		$("#twoslsbSimaz").attr("disabled", true);
		
	}
	
	if(user == 'smo_ingos')
	{
		$("#oneTFOMS").attr("disabled", true);
		$("#oneRosno").attr("disabled", true);
		$("#oneSimaz").attr("disabled", true);
		
		$("#twosldsbTFOMS").attr("disabled", true);
		$("#twosldsbRosno").attr("disabled", true);
		$("#twosldsbSimaz").attr("disabled", true);
		
		$("#twoslbcTFOMS").attr("disabled", true);
		$("#twoslbcRosno").attr("disabled", true);
		$("#twoslbcSimaz").attr("disabled", true);
		
		$("#twoslsbTFOMS").attr("disabled", true);
		$("#twoslsbRosno").attr("disabled", true);
		$("#twoslsbSimaz").attr("disabled", true);
		
	}
	
	$( "#dateBegin" ).datepicker({dateFormat:'dd.mm.yy'});

	$( "#datePartOneClinic" ).datepicker({dateFormat:'dd.mm.yy'});
	$( "#dateEnd" ).datepicker({dateFormat:'dd.mm.yy'});
	
	$( "#dateBeginsecondlevel" ).datepicker({dateFormat:'dd.mm.yy'});
	$( "#datePartSecondClinic" ).datepicker({dateFormat:'dd.mm.yy'});
	$( "#dateEndsecondlevel" ).datepicker({dateFormat:'dd.mm.yy'});

	$( "#dateBeginDayStacionar" ).datepicker({dateFormat:'dd.mm.yy'});
	$( "#dateEndDayStacionar" ).datepicker({dateFormat:'dd.mm.yy'});
	$( "#datePartOneDayStac" ).datepicker({dateFormat:'dd.mm.yy'});
	
	$( "#dateBeginDayStacionarsecondlevel" ).datepicker({dateFormat:'dd.mm.yy'});
	$( "#dateEndDayStacionarsecondlevel" ).datepicker({dateFormat:'dd.mm.yy'});
	$( "#datePartOneDayStacsecondlevel" ).datepicker({dateFormat:'dd.mm.yy'});

	$( "#dateBeginStacionar" ).datepicker({dateFormat:'dd.mm.yy'});
	$( "#dateEndStacionar" ).datepicker({dateFormat:'dd.mm.yy'});
	$( "#datePartOneStac" ).datepicker({dateFormat:'dd.mm.yy'});
	
	$( "#dateBeginStacionarsecondlevel" ).datepicker({dateFormat:'dd.mm.yy'});
	$( "#dateEndStacionarsecondlevel" ).datepicker({dateFormat:'dd.mm.yy'});
	$( "#datePartOneStacsecondlevel" ).datepicker({dateFormat:'dd.mm.yy'});
	
	// for reports
	
	$( "#dateBeginOneReport" ).datepicker({dateFormat:'dd.mm.yy'});
	$( "#dateEndOneReport" ).datepicker({dateFormat:'dd.mm.yy'});
	
	

	$( "#dateBeginOneReportlg" ).datepicker({dateFormat:'dd.mm.yy'});
	$( "#dateEndOneReportlg" ).datepicker({dateFormat:'dd.mm.yy'});
	
	// level two reports
	$( "#dateBeginTwoReport" ).datepicker({dateFormat:'dd.mm.yy'});
	$( "#dateEndTwoReport" ).datepicker({dateFormat:'dd.mm.yy'});
	
	$( "#dateBeginslcbReport" ).datepicker({dateFormat:'dd.mm.yy'});
	$( "#dateEndslcbReport" ).datepicker({dateFormat:'dd.mm.yy'});

	$( "#dateBeginsldsbReport" ).datepicker({dateFormat:'dd.mm.yy'});
	$( "#dateEndsldsbReport" ).datepicker({dateFormat:'dd.mm.yy'});
	
	
	$( "#dateBeginslsbReport" ).datepicker({dateFormat:'dd.mm.yy'});
	$( "#dateEndslsbReport" ).datepicker({dateFormat:'dd.mm.yy'});



});
</script>
<script>
$(document).ready(function() {
	
$("#formOneReport").validate({
   	submitHandler: function() {
		onepartreports('btnsf');
	  }
	});
	
$("#formtwoReport").validate({
   	submitHandler: function() {
		twopartreports('btntworep');
	  }
	});	
	
$("#formslcbReport").validate({
   	submitHandler: function() {
   		secondpartreportsbigc('slcbbtn');
	  }
	});

//07.05.2019 нач
$("#formslcbReport2").validate({
   	submitHandler: function() {
   		secondpartreportsbigc2('slcbbtn2');
	  }
	});
//07.05.2019 кон


$("#formsldsbReport").validate({
   	submitHandler: function() {
   		secondpartreportsbigds('sldsbbtn');
	  }
	});

//13.05.2019
$("#formsldsbReport2").validate({
   	submitHandler: function() {
   		secondpartreportsbigds2('sldsbbtn2');
	  }
	});
//13.05.2019





$("#formslsbReport").validate({
   	submitHandler: function() {
   		secondpartreportsbigs('slsbbtn');
	  }
	});	

//15.05.2019 нач
$("#formslsbReport2").validate({
   	submitHandler: function() {
   		secondpartreportsbigs2('slsbbtn2');
	  }
	});	
//15.05.2019 кон


//05.06.2019 нач
$("#formslsbReport3").validate({
   	submitHandler: function() {
   		secondpartreportsbigs3('slsbbtn3');
	  }
	});	
//05.06.2019 кон


});
</script>

</head>
<body>
<div class="mask pseudo" style="position: static;"><a href="#" style="margin-top:20px;margin-left:50px;margin-bottom:0px;"><img src="${pageContext.request.contextPath}/resources/image/logo.png"/></a></div>
<div class="mask_pseudo2" id="echart_pie2" style="position: static;"></div>
<svg height="0">
  <!-- THE mask -->
  <mask id="mask-firefox">
    <image width="150" height="64" xlink:href="http://dev.iamvdo.me/newLogoCSS3create2.png" filter="url(#filter)" /> 
  </mask>
  
  <!-- the filter to make the image white -->
  <filter id="filter">
    <feFlood flood-color="white" />
    <feComposite in2="SourceAlpha" operator="in" />
  </filter>
</svg>
<div class="conteinerHeader" style="position: absolute; width:1350px;">
					 <nav class="navbar navbar-default navbar-inverse" role="navigation">
			    <div class="container-fluid">
			        <!-- Brand and toggle get grouped for better mobile display -->
			        <div class="navbar-header">
			            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
			                <span class="sr-only">Toggle navigation</span>
			                <span class="icon-bar"></span>
			                <span class="icon-bar"></span>
			                <span class="icon-bar"></span>
			            </button>
			        </div>
			
			        <!-- Collect the nav links, forms, and other content for toggling -->
			        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			            <ul class="nav navbar-nav">
			            <li><a href="#" class="menufonts"><i class="fa fa-warning faa-flash animated-hover"></i>&nbsp;&nbsp;Выборка</a></li>
			                <li class="dropdown">
			                    <a href="#" class="dropdown-toggle menufonts" data-toggle="dropdown"><i class="fa fa-list-alt "></i>&nbsp;&nbsp;Анкеты первого уровня <span class="caret"></span></a>
			                    <ul class="dropdown-menu" role="menu">
			                        <li><a href="#" id="one_ambul_pol" onclick="alloneclinic('${principal.username}')"><i class="fa fa-ambulance"></i>&nbsp;&nbsp;Амбул-полик помощь</a></li>
			                        <li class="divider"></li>
			                        <li><a href="#" id="one_day" onclick="allonedaystacionar('${principal.username}')"><i class="fa fa-medkit"></i>&nbsp;&nbsp;Дневной стационар</a></li>
			                        <li class="divider"></li>
			                        <li><a href="#" id="one_stac" onclick="allonestacionar('${principal.username}')"><i class="fa fa-stethoscope"></i>&nbsp;&nbsp;Стационар</a></li>
			                        
			                    </ul>
			                </li>
			                
			                <li class="dropdown">
			                    <a href="#" class="dropdown-toggle menufonts" data-toggle="dropdown"><i class="fa fa-align-right"></i>&nbsp;&nbsp;Анкеты второго уровня <span class="caret"></span></a>
			                    <ul class="dropdown-menu" role="menu">
			                        <li><a href="#" id="one_ambul_polsecondlevel" onclick="alloneclinicsecondlevel('${principal.username}')"><i class="fa fa-ambulance"></i>&nbsp;&nbsp;Амбул-полик помощь</a></li>
			                        <li class="divider"></li>
			                        <li><a href="#" id="one_daysecondlevel" onclick="alldssl('${principal.username}')"><i class="fa fa-medkit"></i>&nbsp;&nbsp;Дневной стационар</a></li>
			                        <li class="divider"></li>
			                        <li><a href="#" id="one_stacsecondlevel" onclick="allstacsl('${principal.username}')"><i class="fa fa-stethoscope"></i>&nbsp;&nbsp;Стационар</a></li>
			                    </ul>
			                </li>
			                
			                <li class="dropdown">
			                    <a href="#" class="dropdown-toggle menufonts" data-toggle="dropdown"><i class="fa fa-book"></i>&nbsp;&nbsp;Отчеты <span class="caret"></span></a>
			                    <ul class="dropdown-menu" role="menu">
			                        
	              					 <li class="dropdown-submenu">
						              <a href="#">Отчеты первого уровня</a>
						              <ul class="dropdown-menu">
						                <li><a href="#"  data-toggle="modal" data-target="#myModal777">Индикатор доступности и качества медицинской помощи</a></li>
						              </ul>
						            </li>	
	              						
			                        <li class="divider"></li>
			                        
			                        <li class="dropdown-submenu">
						              <a href="#">Отчеты второго уровня</a>
						              <ul class="dropdown-menu">
						                <li><a href="#" data-toggle="modal" data-target="#myModalSSL">Индикатор доступности и качества медицинской помощи</a></li>
						                <li class="divider"></li>
          		              				 <li class="dropdown-submenu">
									              <a href="#">Оценка уровня удовлетворенности работы</a>
									              <ul class="dropdown-menu">
									                <li><a href="#"  data-toggle="modal" data-target="#myModalslclinic">Поликлиническая помощь</a></li>
									                <li class="divider"></li>
									                <li><a href="#" data-toggle="modal" data-target="#myModalslds">Дневной стационар</a></li>
									                <li class="divider"></li>
													<li><a href="#" data-toggle="modal" data-target="#myModalsls">Стационарная помощь</a></li>									                
									              </ul>
								            </li>	
						              </ul>
						            </li>
						        
						        <li class="divider"></li>
						        <li class="dropdown-submenu">
	
		<a href="#">Отчеты</a>
	<ul class="dropdown-menu">
		<li><a href="#"  data-toggle="modal" data-target="#myModalslclinic2">По СМО</a></li>
	                <li class="divider"></li>
	<li><a href="#" data-toggle="modal" data-target="#myModalslds2">Удовлетворенность Город/Область</a></li>
	<li class="divider"></li>
	<li><a href="#" data-toggle="modal" data-target="#myModalsls2">По МО</a></li>		
	
	<li class="divider"></li>
	<li><a href="#" data-toggle="modal" data-target="#myModalsls3">Удовлетворенность по форме ЗПЗ</a></li>							                
	              </ul>
		   </li>	
			  </ul>
				</li>
						        
						           
			                    </ul>
			                </li>
			            </ul>
			            <ul class="nav navbar-nav navbar-right">
			                <li class="dropdown">
			                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><b>Пользователь</b> <span class="caret"></span></a>
			                    <ul id="login-dp" class="dropdown-menu">
			                        <li>
			                            <div class="row">
			                                <div class="col-md-12">
			                                    <div class="social-buttons">
			                                        <a href="#" class="btn btn-tw">Информация для пользователя</a>
			                                    </div>
			                                        <div class="form-group">
			                                           	<a href="#"><b>Главная</b></a><br>
			                                           	<a href="j_spring_security_logout" id="exitfromsite"><b>Выход</b></a><br>
			                                           	<a href="#"><b>Написать администратору</b></a><br><br>
			                                        </div>
			                                </div>
			                                <div class="bottom text-center">
			                                    Вы вошли как: <a href="#"><b>${principal.username}</b></a>
			                                </div>
			                            </div>
			                        </li>
			                    </ul>
			                </li>
			            </ul>
			        </div>
			        <!-- /.navbar-collapse -->
			    </div>
			    <!-- /.container-fluid -->
			</nav>
			
<!-- BLOCK MODAL WINDOWS FROM MENU -->
          		<div class="modal fade" id="myModal777" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header backgrheader">
									<button type="button btn-primary" class="close"
										data-dismiss="modal" aria-hidden="true">&times;</button>
									<h3 class="modal-title">Отчет первого уровня</h3>
									<p>Индикатор доступности и качества медицинской помощи</p><br>

								</div>
								<div class="modal-body backgr">
										<form class="cmxform" id="formOneReport" action="firstPartReport" method="">
										<table cellspacing='15'>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите дату:</h4></td>
										</tr>
										<tr>
											<td>
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateBeginOneReport"  name="datebeginonereport" placeholder="" title="Укажите дату начала отчета">&nbsp;
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateEndOneReport"  name="dateendonereport" placeholder="" title="Укажите дату окончания отчета">
											</td>
										</tr>
										<tr><td><label class="error" style="display: none; color:red;"></label></td></tr>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите ЛПУ:</h4></td>
										</tr>
										<tr>
											<td>
												<select class="form-control2 required" id="lpuFormOneRerort" style="width: 350px" id="" title="Введите лечебное учреждение">
											        <option value=""></option>
											        <option>Все</option>
											        <c:forEach var="ls" items="${listmo}">
											        <option>${ls.value}</option>
											        </c:forEach>
											    </select>
											</td>
										</tr>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите категорию ответа:</h4></td>
										</tr>
										<tr>
											<td>
												<input type="checkbox" id="ansFormOnePart1"  value="" name="ans[]" required minlength="1" checked> Удовлетворен(а)&nbsp;<br>
												<input type="checkbox" id="ansFormOnePart2" value="" name="ans[]" checked> Скорее удовлетворен(а), чем не удовлетворен(а)&nbsp;<br>
												<input type="checkbox" id="ansFormOnePart3" value="" name="ans[]" checked> Скорее не удовлетворен(а), чем удовлетворен(а)&nbsp;<br>
												<input type="checkbox" id="ansFormOnePart4" value="" name="ans[]" checked> Не удовлетворен(а)&nbsp;<br>
												<input type="checkbox" id="ansFormOnePart5" value="" name="ans[]" checked> Затрудняюсь ответить&nbsp;
											</td>
										</tr>
										<tr><td><label for="ans[]" class="error" id="ans-error" style="display: none; color:red;">Пожалуйста выберите хотя бы один вариант ответа</label></td></tr>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите СМО(ТФОМС):</h4></td>
										</tr>
										<tr>
											<td>
												<input type="checkbox" id="oneTFOMS"  value="onetfoms" name="org[]" required minlength="1"> ТФОМС&nbsp;
												<input type="checkbox" id="oneSimaz" value="onesimaz" name="org[]"> СимазМед&nbsp;
												<input type="checkbox" id="oneIngos" value="oneingos" name="org[]"> Ингосстрах&nbsp;
												<input type="checkbox" id="oneRosno" value="onerosno" name="org[]"> РОСНО
											</td>
										</tr>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите дети/взрослые:</h4></td>
										</tr>
										<tr>
											<td>
												<input type="checkbox" name="kidsname" id="kids" value="kids">&nbsp;Дети
											</td>
										</tr>
										<tr>
											<td>
												<input type="checkbox" name="adultname" id="adult" value="adult">&nbsp;Взрослые
											</td>
										</tr>
										<tr>
										<tr><td><label for="org[]" class="error" id="org-error" style="display: none; color:red;">Пожалуйста выберите хотя бы одну организацию</label></td></tr>
										<tr><td>&nbsp;</td></tr>
										<tr>
											<td>
												<input type="checkbox" name="plus_twolevelname" id="plus_twolevel" value="plus_twolevelval">&nbsp;С учётом втрого уровня (для форм ПГ)
											</td>
										</tr>
										<tr>
										<td>&nbsp;</td>
										</tr>
										

										<tr>
											<td>
												<input type="checkbox" name="plus_onlytwolevelname" id="plus_onlytwolevel" value="plus_onlytwolevelval">&nbsp;Второй уровень (для форм ПГ)
											</td>
										</tr>
										<tr>
										<td>&nbsp;</td>
										</tr>
										
										
										<tr>
										<td><button type="submit" value="Submit" id="btnsf"  class="btn btn-primary">Скачать отчет</button></td>
										</tr>
										</table>
									</form>
									
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-primary" id="closereportonepart" data-dismiss="modal">Закрыть окно</button>
								</div>
							</div>
						</div>
					</div>
<!-- CAST BLOCK MODAL WINDOWS FROM MENU -->


<!-- BLOCK MODAL BIG REPORT SECOND LEVEL  CLINIC WINDOWS FROM MENU -->
          		<div class="modal fade" id="myModalslclinic" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header backgrheader">
									<button type="button btn-primary" class="close"
										data-dismiss="modal" aria-hidden="true">&times;</button>
									<h3 class="modal-title">Отчет второго уровня поликлинической помощи</h3>
									<p>Оценка уровня удовлетворенности работы амулаторно-поликлинической помощи по результатам анкетирования второго уровня</p>

								</div>
								<div class="modal-body backgr">
										<form class="bigreportssl" id="formslcbReport" action="slcbPartTwoReport" method="">
										<table cellspacing='15'>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите дату:</h4></td>
										</tr>
										<tr>
											<td>
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateBeginslcbReport"  name="datebeginslcbreport" placeholder="" title="Укажите дату начала отчета">&nbsp;
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateEndslcbReport"  name="dateendslcbreport" placeholder="" title="Укажите дату окончания отчета">
											</td>
										</tr>
										<tr><td><label class="error" style="display: none; color:red;"></label></td></tr>
									 	<tr>
											<td style="text-decoration: underline;"><h4>Выберите ЛПУ:</h4></td>
										</tr>
										<tr>
											<td>
											<div style="height: 200px;overflow: auto;width: 100%;" id="divlistMO">
												<input type="checkbox" id="ansFormOnePart1"  value="Все" name="ans[]" required minlength="1">Все<br>
													<c:forEach var="ls" items="${listmo}" varStatus="loop">
												        <input type="checkbox" id="ansFormOnePart${loop.index+2}" value="${ls.value}" name="ans[]"> ${ls.value}<br>
											        </c:forEach>
											</div>	
											</td>
										</tr>  
										<tr><td><label for="ans[]" class="error" id="ans-error" style="display: none; color:red;">Пожалуйста выберите хотя бы один вариант ответа</label></td></tr>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите категорию респондентов:</h4></td>
										</tr>
										<tr>
											<td>
											<div style="height: 100px;overflow: auto;width: 100%;" id="divlistAaS">
										        <input type="checkbox" id="ansFormOnePartAaS_1" value="1" name="ansAaS[]"  required minlength="1">Мужчины 18-59 лет<br>
										        <input type="checkbox" id="ansFormOnePartAaS_2" value="2" name="ansAaS[]">Женщины 18-54 года<br>
										        <input type="checkbox" id="ansFormOnePartAaS_3" value="3" name="ansAaS[]">Мужчины 60 и старше<br>
										        <input type="checkbox" id="ansFormOnePartAaS_4" value="4" name="ansAaS[]">Женщины 55 и старше<br>
											</div>	
											</td>
										</tr>
										<tr><td><label for="ansAaS[]" class="error" id="ans-error" style="display: none; color:red;">Пожалуйста выберите хотя бы один вариант ответа</label></td></tr>  
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите СМО(ТФОМС):</h4></td>
										</tr>
										<tr>
											<td>
												<input type="checkbox" id="twoslbcTFOMS"  value="twotfoms" name="org[]" required minlength="1"> ТФОМС&nbsp;
												<input type="checkbox" id="twoslbcSimaz" value="twosimaz" name="org[]"> СимазМед&nbsp;
												<input type="checkbox" id="twoslbcIngos" value="twoingos" name="org[]"> Ингосстрах&nbsp;
												<input type="checkbox" id="twoslbcRosno" value="tworosno" name="org[]"> РОСНО
											</td>
										</tr>
										<tr><td><label for="org[]" class="error" id="org-error" style="display: none; color:red;">Пожалуйста выберите хотя бы одну организацию</label></td></tr>
										<tr><td>&nbsp;</td></tr>
										<tr>
										<td><button  style="margin-top: 11px;" type="submit" value="Submit" id="slcbbtn"  class="btn btn-primary">Скачать отчет</button>
										
											<i id="slcb_spin" class="" aria-hidden="true"></i>
												<span class="sr-only">Saving. Hang tight!</span>
										</td>
										</tr>
										</table>
									</form>
									
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-primary" id="closereportonepart" data-dismiss="modal">Закрыть окно</button>
								</div>
							</div>
						</div>
					</div>
<!-- CAST BLOCK MODAL WINDOWS FROM MENU -->


<!-- BLOCK MODAL BIG REPORT SECOND LEVEL  CLINIC WINDOWS FROM MENU -->
          		<div class="modal fade" id="myModalslclinic2" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header backgrheader">
									<button type="button btn-primary" class="close"
										data-dismiss="modal" aria-hidden="true">&times;</button>
									<h3 class="modal-title">Отчет по страховым</h3>
									
								</div>
								<div class="modal-body backgr">
										<form class="bigreportssl" id="formslcbReport2" action="slcbPartTwoReport2" method="">
										<table cellspacing='15'>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите дату:</h4></td>
										</tr>
										<tr>
											<td>
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateBeginslcbReport"  name="datebeginslcbreport" placeholder="" title="Укажите дату начала отчета">&nbsp;
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateEndslcbReport"  name="dateendslcbreport" placeholder="" title="Укажите дату окончания отчета">
											</td>
										</tr>
										<tr><td><label class="error" style="display: none; color:red;"></label></td></tr>
									 	
 
										<tr><td><label for="ans[]" class="error" id="ans-error" style="display: none; color:red;">Пожалуйста выберите хотя бы один вариант ответа</label></td></tr>

										
										<tr><td><label for="ansAaS[]" class="error" id="ans-error" style="display: none; color:red;">Пожалуйста выберите хотя бы один вариант ответа</label></td></tr>  

										<tr>
											<td>
											<input type="checkbox" id="twoslbcTFOMS"  value="twotfoms" name="org[]" required minlength="1"> 	

											</td>
										</tr>
										
										
										<tr><td><label for="org[]" class="error" id="org-error" style="display: none; color:red;">Пожалуйста выберите хотя бы одну организацию</label></td></tr>
										<tr><td>&nbsp;</td></tr>
										<tr>
<td><button  style="margin-top: 11px;" type="submit" value="Submit" id="slcbbtn2"  class="btn btn-primary">Скачать отчет</button>
										
<i id="slcb_spin" class="" aria-hidden="true"></i>
												<span class="sr-only">Saving. Hang tight!</span>
										</td>
										</tr>
										</table>
									</form>
									
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-primary" id="closereportonepart" data-dismiss="modal">Закрыть окно</button>
								</div>
							</div>
						</div>
					</div>



<!-- BLOCK MODAL BIG REPORT SECOND LEVEL  DS WINDOWS FROM MENU -->
          		<div class="modal fade" id="myModalslds" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header backgrheader">
									<button type="button btn-primary" class="close"
										data-dismiss="modal" aria-hidden="true">&times;</button>
									<h3 class="modal-title">Отчет второго уровня дневного стационара</h3>
									<p>Оценка уровня удовлетворенности работы дневного стационара по результатам анкетирования второго уровня</p>

								</div>
								<div class="modal-body backgr">
										<form class="bigreportssl" id="formsldsbReport" action="sldsbPartTwoReport" method="">
										<table cellspacing='15'>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите дату:</h4></td>
										</tr>
										<tr>
											<td>
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateBeginsldsbReport"  name="datebeginslcbreport" placeholder="" title="Укажите дату начала отчета">&nbsp;
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateEndsldsbReport"  name="dateendslcbreport" placeholder="" title="Укажите дату окончания отчета">
											</td>
										</tr>
										<tr><td><label class="error" style="display: none; color:red;"></label></td></tr>
									 	<tr>
											<td style="text-decoration: underline;"><h4>Выберите ЛПУ:</h4></td>
										</tr>
										<tr>
											<td>
											<div style="height: 200px;overflow: auto;width: 100%;" id="divlistMO">
												<input type="checkbox" id="ansFormOnePart1"  value="Все" name="ans[]" required minlength="1">Все<br>
													<c:forEach var="ls" items="${listmo}" varStatus="loop">
												        <input type="checkbox" id="ansFormOnePart${loop.index+2}" value="${ls.value}" name="ans[]"> ${ls.value}<br>
											        </c:forEach>
											</div>	
											</td>
										</tr>  
										<tr><td><label for="ans[]" class="error" id="ans-error" style="display: none; color:red;">Пожалуйста выберите хотя бы один вариант ответа</label></td></tr>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите категорию респондентов:</h4></td>
										</tr>
										<tr>
											<td>
											<div style="height: 100px;overflow: auto;width: 100%;" id="divlistAaS">
										        <input type="checkbox" id="ansFormOnePartAaS_1" value="1" name="ansAaS[]"  required minlength="1">Мужчины 18-59 лет<br>
										        <input type="checkbox" id="ansFormOnePartAaS_2" value="2" name="ansAaS[]">Женщины 18-54 года<br>
										        <input type="checkbox" id="ansFormOnePartAaS_3" value="3" name="ansAaS[]">Мужчины 60 и старше<br>
										        <input type="checkbox" id="ansFormOnePartAaS_4" value="4" name="ansAaS[]">Женщины 55 и старше<br>
											</div>	
											</td>
										</tr>
										<tr><td><label for="ansAaS[]" class="error" id="ans-error" style="display: none; color:red;">Пожалуйста выберите хотя бы один вариант ответа</label></td></tr>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите СМО(ТФОМС):</h4></td>
										</tr>
										<tr>
											<td>
												<input type="checkbox" id="twosldsbTFOMS"  value="twotfoms" name="org[]" required minlength="1"> ТФОМС&nbsp;
												<input type="checkbox" id="twosldsbSimaz" value="twosimaz" name="org[]"> СимазМед&nbsp;
												<input type="checkbox" id="twosldsbIngos" value="twoingos" name="org[]"> Ингосстрах&nbsp;
												<input type="checkbox" id="twosldsbRosno" value="tworosno" name="org[]"> РОСНО
											</td>
										</tr>
										<tr><td><label for="org[]" class="error" id="org-error" style="display: none; color:red;">Пожалуйста выберите хотя бы одну организацию</label></td></tr>
										<tr><td>&nbsp;</td></tr>
										<tr>
										<td><button type="submit" value="Submit" id="sldsbbtn"  class="btn btn-primary">Скачать отчет</button>
										
												<i id="slcb_spin2" class="" aria-hidden="true"></i>
												<span class="sr-only">Saving. Hang tight!</span>
										</td>
										</tr>
										</table>
									</form>
									
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-primary" id="closereportonepart" data-dismiss="modal">Закрыть окно</button>
								</div>
							</div>
						</div>
					</div>
<!-- CAST BLOCK MODAL WINDOWS FROM MENU -->


<!-- BLOCK MODAL BIG REPORT SECOND LEVEL  DS WINDOWS FROM MENU -->
          		<div class="modal fade" id="myModalslds2" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
						<div class="modal-dialog">
				<div class="modal-content">
								<div class="modal-header backgrheader">
								<button type="button btn-primary" class="close"
										data-dismiss="modal" aria-hidden="true">&times;</button>
									<h3 class="modal-title">Удовлетворенность Город/Область</h3>
								</div>
								<div class="modal-body backgr">
										<form class="bigreportssl" id="formsldsbReport2" action="sldsbPartTwoReport2" method="">
										<table cellspacing='15'>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите дату:</h4></td>
										</tr>
										<tr>
											<td>
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateBeginsldsbReport"  name="datebeginslcbreport" placeholder="" title="Укажите дату начала отчета">&nbsp;
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateEndsldsbReport"  name="dateendslcbreport" placeholder="" title="Укажите дату окончания отчета">
											</td>
										</tr>
										<tr><td><label class="error" style="display: none; color:red;"></label></td></tr>

										<tr>
											<td>

											</td>
										</tr>  


										<tr>
											<td>
												<input type="checkbox" id="twosldsbTFOMS1"  value="twotfoms" name="org[]" required minlength="1"> 
										
											</td>
										</tr>
										
										<tr>
<td><button style="margin-top: 11px;" type="submit" value="Submit" id="sldsbbtn2"  class="btn btn-primary">Скачать отчет</button>
										
												
<i id="slcb_spin2" class="" aria-hidden="true"></i>
												<span class="sr-only">Saving. Hang tight!</span>
										</td>
										</tr>
										</table>
									</form>
									
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-primary" id="closereportonepart" data-dismiss="modal">Закрыть окно</button>
								</div>
							</div>
						</div>
					</div>
<!-- CAST BLOCK MODAL WINDOWS FROM MENU -->






<!-- BLOCK MODAL BIG REPORT SECOND LEVEL  STAC WINDOWS FROM MENU -->
          		<div class="modal fade" id="myModalsls" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header backgrheader">
									<button type="button btn-primary" class="close"
										data-dismiss="modal" aria-hidden="true">&times;</button>
									<h3 class="modal-title">Отчет второго уровня Стационарной помощи</h3>
									<p>Оценка уровня удовлетворенности работы Стационарной помощи по результатам анкетирования второго уровня</p>

								</div>
								<div class="modal-body backgr">
										<form class="bigreportssl" id="formslsbReport" action="slsbPartTwoReport" method="">
									id="dateBeginslsbReport"  name="datebeginslcbreport" placeholder="" title="Укажите 	<table cellspacing='15'>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите дату:</h4></td>
										</tr>
										<tr>
											<td>
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateBeginslsbReport"  name="datebeginslcbreport" placeholder="" title="Укажите дату начала отчета">&nbsp;
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateEndslsbReport"  name="dateendslcbreport" placeholder="" title="Укажите дату окончания отчета">
											</td>
										</tr>
										<tr><td><label class="error" style="display: none; color:red;"></label></td></tr>
									 	<tr>
											<td style="text-decoration: underline;"><h4>Выберите ЛПУ:</h4></td>
										</tr>
										<tr>
											<td>
											<div style="height: 200px;overflow: auto;width: 100%;" id="divlistMO">
												<input type="checkbox" id="ansFormOnePart1"  value="Все" name="ans[]" required minlength="1">Все<br>
													<c:forEach var="ls" items="${listmo}" varStatus="loop">
												        <input type="checkbox" id="ansFormOnePart${loop.index+2}" value="${ls.value}" name="ans[]"> ${ls.value}<br>
											        </c:forEach>
											</div>	
											</td>
										</tr>  
										<tr><td><label for="ans[]" class="error" id="ans-error" style="display: none; color:red;">Пожалуйста выберите хотя бы один вариант ответа</label></td></tr>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите категорию респондентов:</h4></td>
										</tr>
										<tr>
											<td>
											<div style="height: 100px;overflow: auto;width: 100%;" id="divlistAaS">
										        <input type="checkbox" id="ansFormOnePartAaS_1" value="1" name="ansAaS[]"  required minlength="1">Мужчины 0-59 лет<br>
										        <input type="checkbox" id="ansFormOnePartAaS_2" value="2" name="ansAaS[]">Женщины 0-54 года<br>
										        <input type="checkbox" id="ansFormOnePartAaS_3" value="3" name="ansAaS[]">Мужчины 60 и старше<br>
										        <input type="checkbox" id="ansFormOnePartAaS_4" value="4" name="ansAaS[]">Женщины 55 и старше<br>
											</div>	
											</td>
										</tr>
										<tr><td><label for="ansAaS[]" class="error" id="ans-error" style="display: none; color:red;">Пожалуйста выберите хотя бы один вариант ответа</label></td></tr>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите СМО(ТФОМС):</h4></td>
										</tr>
										<tr>
											<td>
												<input type="checkbox" id="twoslsbTFOMS"  value="twotfoms" name="org[]" required minlength="1"> ТФОМС&nbsp;
												<input type="checkbox" id="twoslsbSimaz" value="twosimaz" name="org[]"> СимазМед&nbsp;
												<input type="checkbox" id="twoslsbIngos" value="twoingos" name="org[]"> Ингосстрах&nbsp;
												<input type="checkbox" id="twoslsbRosno" value="tworosno" name="org[]"> РОСНО
											</td>
										</tr>
										<tr><td><label for="org[]" class="error" id="org-error" style="display: none; color:red;">Пожалуйста выберите хотя бы одну организацию</label></td></tr>
										<tr><td>&nbsp;</td></tr>
										<tr>
										<td><button type="submit" value="Submit" id="slsbbtn"  class="btn btn-primary">Скачать отчет</button>
												<i id="slcb_spin3" class="" aria-hidden="true"></i>
												<span class="sr-only">Saving. Hang tight!</span>
										</td>
										</tr>
										</table>
									</form>
									
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-primary" id="closereportonepart" data-dismiss="modal">Закрыть окно</button>
								</div>
							</div>
						</div>
					</div>
<!-- CAST BLOCK MODAL WINDOWS FROM MENU -->


<!-- BLOCK MODAL BIG REPORT SECOND LEVEL  STAC WINDOWS FROM MENU -->
          		<div class="modal fade" id="myModalsls2" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header backgrheader">
									<button type="button btn-primary" class="close"
										data-dismiss="modal" aria-hidden="true">&times;</button>
									<h3 class="modal-title">По МО</h3>
								</div>
								<div class="modal-body backgr">
										<form class="bigreportssl" id="formslsbReport2" action="slsbPartTwoReport2" method="">
										<table cellspacing='15'>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите дату:</h4></td>
										</tr>
										<tr>
											<td>
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateBeginslsbReport"  name="datebeginslcbreport" placeholder="" title="Укажите дату начала отчета">&nbsp;
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateEndslsbReport"  name="dateendslcbreport" placeholder="" title="Укажите дату окончания отчета">
											</td>
										</tr>
										<tr><td><label class="error" style="display: none; color:red;"></label></td></tr>
									 	
 
										<tr><td><label for="ans[]" class="error" id="ans-error" style="display: none; color:red;">Пожалуйста выберите хотя бы один вариант ответа</label></td></tr>


										<tr><td><label for="ansAaS[]" class="error" id="ans-error" style="display: none; color:red;">Пожалуйста выберите хотя бы один вариант ответа</label></td></tr>

										<tr>
											<td>
												<input type="checkbox" id="twoslsbTFOMS"  value="twotfoms" name="org[]" required minlength="1"> 

											</td>
										</tr>
										<tr><td><label for="org[]" class="error" id="org-error" style="display: none; color:red;">Пожалуйста выберите хотя бы одну организацию</label></td></tr>
										<tr><td>&nbsp;</td></tr>
										<tr>
										<td><button type="submit" value="Submit" id="slsbbtn2"  class="btn btn-primary">Скачать отчет</button>
												<i id="slcb_spin3" class="" aria-hidden="true"></i>
												<span class="sr-only">Saving. Hang tight!</span>
										</td>
										</tr>
										</table>
									</form>
									
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-primary" id="closereportonepart" data-dismiss="modal">Закрыть окно</button>
								</div>
							</div>
						</div>
					</div>
<!-- CAST BLOCK MODAL WINDOWS FROM MENU -->


<!-- BLOCK MODAL BIG REPORT SECOND LEVEL  STAC WINDOWS FROM MENU -->
          		<div class="modal fade" id="myModalsls3" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header backgrheader">
									<button type="button btn-primary" class="close"
										data-dismiss="modal" aria-hidden="true">&times;</button>
									<h3 class="modal-title">Удовлетворенность по форме ЗПЗ</h3>
								</div>
								<div class="modal-body backgr">
										<form class="bigreportssl" id="formslsbReport3" action="slsbPartTwoReport3" method="">
										<table cellspacing='15'>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите дату:</h4></td>
										</tr>
										<tr>
											<td>
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateBeginslsbReport"  name="datebeginslcbreport" placeholder="" title="Укажите дату начала отчета">&nbsp;
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateEndslsbReport"  name="dateendslcbreport" placeholder="" title="Укажите дату окончания отчета">
											</td>
										</tr>
											                   
<tr>
											<td style="text-decoration: underline;"><h4>Выберите СМО(ТФОМС):</h4></td>
										</tr>
										<tr>
											<td>
												<input type="checkbox" id="twoslbcTFOMS"  value="twotfoms" name="org[]" required minlength="1"> ВСЕ&nbsp;
												<input type="checkbox" id="twoslbcSimaz" value="twosimaz" name="org[]"> Симаз-Мед&nbsp;
												<input type="checkbox" id="twoslbcIngos" value="twoingos" name="org[]"> Ингосстрах&nbsp;
												<input type="checkbox" id="twoslbcRosno" value="tworosno" name="org[]"> ВТБ-МС
											</td>
										</tr>
										
										<tr><td><label class="error" style="display: none; color:red;"></label></td></tr>
									 	
 
										<tr><td><label for="ans[]" class="error" id="ans-error" style="display: none; color:red;">Пожалуйста выберите хотя бы один вариант ответа</label></td></tr>


										<tr><td><label for="ansAaS[]" class="error" id="ans-error" style="display: none; color:red;">Пожалуйста выберите хотя бы один вариант ответа</label></td></tr>

									<%-- 	<tr>
									  	    <td>
												<input type="checkbox" id="twoslsbTFOMS"  value="twotfoms" name="org[]" required minlength="1"> 

											</td>

											
										</tr> --%>
										<tr><td><label for="org[]" class="error" id="org-error" style="display: none; color:red;">Пожалуйста выберите хотя бы одну организацию</label></td></tr>
										<tr><td>&nbsp;</td></tr>
										<tr>
										<td><button type="submit" value="Submit" id="slsbbtn3"  class="btn btn-primary">Скачать отчет</button>
												<i id="slcb_spin3" class="" aria-hidden="true"></i>
												<span class="sr-only">Saving. Hang tight!</span>
										</td>
										</tr>
										</table>
									</form>
									
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-primary" id="closereportonepart" data-dismiss="modal">Закрыть окно</button>
								</div>
							</div>
						</div>
					</div>
<!-- CAST BLOCK MODAL WINDOWS FROM MENU -->





<!-- BLOCK MODAL SECOND LEVEL WINDOWS FROM MENU -->
          		<div class="modal fade" id="myModalSSL" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header backgrheader">
									<button type="button btn-primary" class="close"
										data-dismiss="modal" aria-hidden="true">&times;</button>
									<h3 class="modal-title">Отчет второго уровня</h3>
									<p>Индикатор доступности и качества медицинской помощи</p><br>

								</div>
								<div class="modal-body backgr">
										<form class="cmxform2" id="formtwoReport" action="secondPartReport">
										<table cellspacing='15'>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите дату:</h4></td>
										</tr>
										<tr>
											<td>
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateBeginTwoReport"  name="datebegintworeport" placeholder="" title="Укажите дату начала отчета">&nbsp;
											<input  class="form-control2 required"  aria-describedby="sizing-addon3" id="dateEndTwoReport"  name="dateendtworeport" placeholder="" title="Укажите дату окончания отчета">
											</td>
										</tr>
										<tr><td><label class="error" style="display: none; color:red;"></label></td></tr>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите ЛПУ:</h4></td>
										</tr>
										<tr>
											<td>
												<select class="form-control2 required" id="lpuFormTwoRerort" style="width: 350px" id="" title="Введите лечебное учреждение">
											        <option value=""></option>
											        <option>Все</option>
											        <c:forEach var="ls" items="${listmo}">
											        <option>${ls.value}</option>
											        </c:forEach>
											    </select>
											</td>
										</tr>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите категорию ответа:</h4></td>
										</tr>
										<tr>
											<td>
												<input type="checkbox" id="ansFormTwoPart1"  value="" name="ans[]" required minlength="1" checked> Удовлетворен(а)&nbsp;<br>
												<input type="checkbox" id="ansFormTwoPart2" value="" name="ans[]" checked> Скорее удовлетворен(а), чем не удовлетворен(а)&nbsp;<br>
												<input type="checkbox" id="ansFormTwoPart3" value="" name="ans[]" checked> Скорее не удовлетворен(а), чем удовлетворен(а)&nbsp;<br>
												<input type="checkbox" id="ansFormTwoPart4" value="" name="ans[]" checked> Не удовлетворен(а)&nbsp;<br>
												<input type="checkbox" id="ansFormTwoPart5" value="" name="ans[]" checked> Затрудняюсь ответить&nbsp;
											</td>
										</tr>
										<tr><td><label for="ans[]" class="error" id="ans-error" style="display: none; color:red;">Пожалуйста выберите хотя бы один вариант ответа</label></td></tr>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите СМО(ТФОМС):</h4></td>
										</tr>
										<tr>
											<td>
												<input type="checkbox" id="twoTFOMS"  value="onetfoms" name="org[]" required minlength="1"> ТФОМС&nbsp;
												<input type="checkbox" id="twoSimaz" value="onesimaz" name="org[]"> СимазМед&nbsp;
												<input type="checkbox" id="twoIngos" value="oneingos" name="org[]"> Ингосстрах&nbsp;
												<input type="checkbox" id="twoRosno" value="onerosno" name="org[]"> РОСНО
											</td>
										</tr>
										<tr><td><label for="org[]" class="error" id="org-error" style="display: none; color:red;">Пожалуйста выберите хотя бы одну организацию</label></td></tr>
										<tr><td>&nbsp;</td></tr>
										<tr>
											<td style="text-decoration: underline;"><h4>Выберите дети/взрослые:</h4></td>
										</tr>
										<tr>
											<td>
												<input type="checkbox" name="kidsname" id="kids" value="kids">&nbsp;Дети
											</td>
										</tr>
										<tr>
											<td>
												<input type="checkbox" name="adultname" id="adult" value="adult">&nbsp;Взрослые
											</td>
										</tr>
										<tr>
										<td><button type="submit" value="Submit" id="btntworep"  class="btn btn-primary">Скачать отчет</button></td>
										</tr>
										</table>
									</form>
									
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-primary" id="closereportonepart" data-dismiss="modal">Закрыть окно</button>
								</div>
							</div>
						</div>
					</div>
<!-- CAST BLOCK SECOND LEVEL MODAL WINDOWS FROM MENU -->





<div id="dim">
			<div class="msgbox">
				<!-- 	<a class="close" href="#" ><img src="close.jpg"/></a>  -->
				<div class="msgboxp">
					<h4 id="shadow_oneclinic">Анкета первого уровня амбулаторно-поликлинической помощи</h4>
				</div>
			</div>
			
			<div  style="position: absolute; left:35%;">
			<TABLE>
				<TR> 
					<TD style="padding-right:15px;">
						<input  class="form-control"  aria-describedby="sizing-addon3" id="dateBegin" name="namedateBegin" placeholder="">
					</TD>
					<td style="padding-right:15px;">
     					<input  class="form-control"  aria-describedby="sizing-addon3" id="dateEnd" name="namedateEnd" placeholder="">
     				</td>
     				<td style="padding-right:15px;">
     					<button class="btn btn-success" id="getqueryoneclinic" onclick="oneclinicbetween('${principal.username}')">Выбрать</button>
     				</td>
     				<td>
     					<button class="btn btn-success" id="addOneClinic" data-toggle="modal" data-target="#myModal" onclick="oneLevel1()">Добавить запись</button>
     				</td>
     			</TR>
     		</TABLE>
			</div><br><br>
<div id="fgf" style="overflow-y: scroll; height:100px; margin-top:35px;">			
			<table id="records_table" class="table table-striped" style="margin:0px auto; width:85%;"></table>
</div>	

        
</div>

<div id="dimsecondlevel">
			<div class="msgbox">
				<!-- 	<a class="close" href="#" ><img src="close.jpg"/></a>  -->
				<div class="msgboxp">
					<h4 id="shadow_oneclinic">Анкета второго уровня амбулаторно-поликлинической помощи</h4>
				</div>
			</div>
			
			<div  style="position: absolute; left:35%;">
			<TABLE>
				<TR> 
					<TD style="padding-right:15px;">
						<input  class="form-control"  aria-describedby="sizing-addon3" id="dateBeginsecondlevel" name="namedateBeginsecondlevel" placeholder="">
					</TD>
					<td style="padding-right:15px;">
     					<input  class="form-control"  aria-describedby="sizing-addon3" id="dateEndsecondlevel" name="namedateEndsecondlevel" placeholder="">
     				</td>
     				<td style="padding-right:15px;">
     					<button class="btn btn-success" id="getqueryoneclinic" /*onclick="oneclinicbetween('${principal.username}')"*/>Выбрать</button>
     				</td>
     				<td>
     					<button class="btn btn-success" id="addOneClinicsecondlevel" data-toggle="modal" data-target="#myModalClinicSecondLevel" onclick="levelsecond()">Добавить запись</button>
     				</td>
     			</TR>
     		</TABLE>
			</div><br><br>
<div id="fgfsecondlevel" style="overflow-y: scroll; height:100px; margin-top:35px;">			
			<table id="records_tablesecondlevel" class="table table-striped" style="margin:0px auto; width:85%;"></table>
</div>	

        
</div>
<div id="dim2">
			<div class="msgbox2">
				<!-- 	<a class="close" href="#" ><img src="close.jpg"/></a>  -->
				<div class="msgboxp2">
					<h4 id="shadow_oneclinic2">Анкета первого уровня дневного стационара</h4>
				</div>
			</div>
			
			<div  style="position: absolute; left:35%;">
			<TABLE>
				<TR> 
					<TD style="padding-right:15px;">
						<input  class="form-control"  aria-describedby="sizing-addon3" id="dateBeginDayStacionar" name="namedateBeginDayStacionar" placeholder="">
					</TD>
					<td style="padding-right:15px;">
     					<input  class="form-control"  aria-describedby="sizing-addon3" id="dateEndDayStacionar" name="namedateEndDayStacionar" placeholder="">
     				</td>
     				<td style="padding-right:15px;">
     					<button class="btn btn-success"  onclick="onedaystacbetween('${principal.username}')">Выбрать</button>
     				</td>
     				<td>
     					<button class="btn btn-success" id="addOneDayStacionar" data-toggle="modal" data-target="#myModal1" onclick="oneLevel2()">Добавить запись</button>
     				</td>
     			</TR>
     		</TABLE>
			</div>
			<br><br>
<div id="tableOneDayStacionar" style="overflow-y: scroll; height:100px; margin-top:35px;">			
			<table id="records_tableOneDayStacionar" class="table table-striped" style="margin:0px auto; width:85%;"></table>
</div>	
			
		</div>
		
<div id="dim2secondlevel">
	<div class="msgbox2">
		<!-- 	<a class="close" href="#" ><img src="close.jpg"/></a>  -->
		<div class="msgboxp2">
			<h4 id="shadow_oneclinic2">Анкета второго уровня дневного стационара</h4>
		</div>
	</div>
	
	<div  style="position: absolute; left:35%;">
	<TABLE>
		<TR> 
			<TD style="padding-right:15px;">
				<input  class="form-control"  aria-describedby="sizing-addon3" id="dateBeginDayStacionarsecondlevel" name="namedateBeginDayStacionarsecondlevel" placeholder="">
			</TD>
			<td style="padding-right:15px;">
   					<input  class="form-control"  aria-describedby="sizing-addon3" id="dateEndDayStacionarsecondlevel" name="namedateEndDayStacionarsecondlevel" placeholder="">
   				</td>
   				<td style="padding-right:15px;">
   					<button class="btn btn-success"  /*onclick="onedaystacbetween('${principal.username}')"*/>Выбрать</button>
   				</td>
   				<td>
   					<button class="btn btn-success" id="addOneDayStacionarsecondlevel" data-toggle="modal" data-target="#myModal1secondlevel" onclick="levelseconddssl()">Добавить запись</button>
     				</td>
     			</TR>
     		</TABLE>
			</div>
			<br><br>
<div id="tableDSSL" style="overflow-y: scroll; height:100px; margin-top:35px;">			
	<table id="records_tableDSSL" class="table table-striped" style="margin:0px auto; width:85%;"></table>
</div>	
			
</div>
				
<div id="dim3">
			<div class="msgbox3">
				<!-- 	<a class="close" href="#" ><img src="close.jpg"/></a>  -->
				<div class="msgboxp3">
					<h4 id="shadow_oneclinic3">Анкета первого уровня стационарной помощи</h4>
				</div>
			</div>
			<div  style="position: absolute; left:35%;">
			<TABLE>
				<TR> 
					<TD style="padding-right:15px;">
						<input  class="form-control"  aria-describedby="sizing-addon3" id="dateBeginStacionar" name="namedateBeginStacionar" placeholder="">
					</TD>
					<td style="padding-right:15px;">
     					<input  class="form-control"  aria-describedby="sizing-addon3" id="dateEndStacionar" name="namedateEndStacionar" placeholder="">
     				</td>
     				<td style="padding-right:15px;">
     					<button class="btn btn-success"  onclick="onestacbetween('${principal.username}')">Выбрать</button>
     				</td>
     				<td>
     					<button class="btn btn-success" id="addOneStacionar" data-toggle="modal" data-target="#myModal2" onclick="oneLevel3()">Добавить запись</button>
     				</td>
     			</TR>
     		</TABLE>
			</div>
			<br><br>
<div id="tableOneStacionar" style="overflow-y: scroll; height:100px; margin-top:35px;">			
			<table id="records_tableOneStacionar" class="table table-striped" style="margin:0px auto; width:85%;"></table>
		</div>		
</div> 

<div id="dim3secondlevel">
			<div class="msgbox3">
				<!-- 	<a class="close" href="#" ><img src="close.jpg"/></a>  -->
				<div class="msgboxp3">
					<h4 id="shadow_oneclinic3">Анкета второго уровня стационарной помощи</h4>
				</div>
			</div>
			<div  style="position: absolute; left:35%;">
			<TABLE>
				<TR> 
					<TD style="padding-right:15px;">
						<input  class="form-control"  aria-describedby="sizing-addon3" id="dateBeginStacionarsecondlevel" name="namedateBeginStacionarsecondlevel" placeholder="">
					</TD>
					<td style="padding-right:15px;">
     					<input  class="form-control"  aria-describedby="sizing-addon3" id="dateEndStacionarsecondlevel" name="namedateEndStacionarsecondlevel" placeholder="">
     				</td>
     				<td style="padding-right:15px;">
     					<button class="btn btn-success"  /*onclick="onestacbetween('${principal.username}')"*/>Выбрать</button>
     				</td>
     				<td>
     					<button class="btn btn-success" id="addStacionarsecondlevel" data-toggle="modal" data-target="#myModal2secondlevel" onclick="levelsecondssl()">Добавить запись</button>
     				</td>
     			</TR>
     		</TABLE>
			</div>
			<br><br>
<div id="tableOneStacionarsecondlevel" style="overflow-y: scroll; height:100px; margin-top:35px;">			
			<table id="records_tableSSL" class="table table-striped" style="margin:0px auto; width:85%;"></table>
		</div>		
</div>


<!-- <div class="conteinerHeader"> -->

<!-- Добавить запись (модальное окно первого уровня АПУ) -->
					<div class="modal  fade" id="myModal" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
						<div class="modal-dialog modal-lg">
							<div class="modal-content">
								<div class="modal-header backgrheader">
									<button type="button btn-primary" class="close"
										data-dismiss="modal" aria-hidden="true">&times;</button>
									<h3 class="modal-title">Добавить анкету первого уровня</h3>
									<p>Добавление анкеты  амбулаторно-поликлинической помощи</p>

								</div>
					<div  id="form1" >			
								<div class="modal-body backgr" >
									<div  class="wrap-hv">
											<div><p class="hv">Укажите медицинское учреждение где проходил опрос</p></div>
										    <div class="col-xs-4">
										      <select class="form-control input-sm" id="mo" title="Введите лечебное учреждение">
										        <option value=""></option>
										        <c:forEach var="ls" items="${listmo}">
										        <option>${ls.value}</option>
										        </c:forEach>
										      </select>
										    </div><br><br>
									</div>	    
								    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">Укажите дату проведения опроса в данном мед учреждении</p></div>
									    <div class="col-xs-4">
									      <input  class="form-control"  aria-describedby="sizing-addon3" id="datePartOneClinic" name="dataRespN" placeholder="">
									    </div><br><br>
									</div>    
								    								
									<p>1.	Оцените уровень вашей  удовлетворенности следующими характеристиками работы поликлиники:</p>
									<div  class="wrap-hv">
										<div><p class="hv">1.1 Насколько Вы удовлетворены качеством бесплатной медицинской помощи, получаемой в поликлинике</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="freeHelp" title="Введите качество удовлетворенности бесплатной мед помощи">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									 </div>   
		 						    
								    <div  class="wrap-hv">
										<div><p class="hv">1.2 Техническим состоянием, ремонтом помещений:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="repairs" title="Введите удовлетворенность техническим состоянием">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.3 Оснащенностью современным медицинским оборудованием:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="equipment" title="Введите удовлетворенность оснащенностью мед оборудованием">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.4 Организацией записи на прием к врачу:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="seeADoctor" title="Введите удовлетворенность организации записи на прием к врачу">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									 </div>   
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.5 Временем ожидания приема врача:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="waitingTime" title="Введите удовлетворенность временем ожидания">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.6 Сроками ожидания медицинских услуг после записи:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="waitingTime2" title="Введите удовлетворенность сроками ожидания после записи">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.7 Доступностью необходимых лабораторных исследований/анализов:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="laboratoryResearch" title="Введите удовлетворенность доступностью необходимыми лабораторными исследованиями или анализами">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.8 Доступностью диагностических исследований (ЭКГ, УЗИ и т.д.):</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="diagnosticTests" title="Введите удовлетворенность доступностью диагностическими исследованиями">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.9 Доступностью мед.помощи терапевтов:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="therapist" title="Введите удовлетворенность мед помощью терапевтов">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									 </div>   
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.10 Доступностью мед.помощи врачей-специалистов:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="medicalSpecialists" title="Введите удовлетворенность мед помощью врачей-специалистов">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
								    </div>
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.11 Работой врачей в поликлинике:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="clinicDoctor" title="Введите удовлетворенность работой врачей в поликлинике">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									 </div>   
								    
								    <div  class="wrap-hv">
										<div><p class="hv">2.	Приходилось ли вам лично (для себя) за последние 3 месяца обращаться куслугам скорой медицинской помощи?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="ambulance" title="Введите обращения к скорой помощи">
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет</option>
									      </select>
									    </div><br><br>
								    </div>
								    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">3.	На сколько вы удовлетворены качеством оказанной вам скорой медицинскойпомощи?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="qualityAmbulance" title="Введите удовлетворенность качеством скорой помощи">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									 </div>   
								    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">4.	Пол респондента:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="sex"title="Введите пол">
									      	<option value=""></option>
									        <option>Мужской</option>
									        <option>Женский</option>
									      </select>
									    </div><br><br>
									 </div>   
								    
								    <div  class="wrap-hv">
										<div><p class="hv">5.	Возраст респондента (лет):</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="age"  title="Введите возраст">
									      	<option value=""></option>
									      	<c:forEach var="ag" items="${listage}">
									        <option>${ag.value}</option>
									        </c:forEach>
									      </select>
									    </div><br><br>
									</div>    
								    
								</div>
								<input type="hidden" id="polzovatel" value="${principal.username}"/>
								<input type="hidden" id="id" value=""/>
								
								<div class="modal-footer"><div class="errorOneClinic" style="display:none; margin-bottom: 15px; color:red;"><h4>В анкете все поля обязательны.<br>Заполните все поля.</h4></div> 
								<button type="button" id="cancelOneClinic" class="btn btn-primary" data-dismiss="modal">Отмена</button>
									<button  class="btn btn-success editonelev"  onclick='oneclinic("${principal.username}")'>Добавить анкету</button>
								</div>
							</div>
						</div>
					</div>
		</div>		
<!-- конец Добавить запись (модальное окно) -->

<!-- Добавить запись (модальное окно второго уровня АПУ) -->
					<div class="modal  fade" id="myModalClinicSecondLevel" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
						<div class="modal-dialog modal-lg">
							<div class="modal-content">
								<div class="modal-header backgrheader">
								<!-- 	<button type="button btn-primary" class="close"
										data-dismiss="modal" aria-hidden="true">&times;</button>  -->
									<h3 class="modal-title">Добавить анкету второго уровня</h3>
									<p>Добавление анкеты  амбулаторно-поликлинической помощи</p>

								</div>
					<div  id="formClinicSecondLevel" >			
								<div class="modal-body backgr" >
									<div  class="wrap-hv">
											<div><p class="hv">Укажите медицинское учреждение где проходил опрос</p></div>
										    <div class="col-xs-4">
										      <select class="form-control input-sm" id="moSecondLevel" title="Введите лечебное учреждение">
										        <option value=""></option>
										        <c:forEach var="ls" items="${listmo}">
										        <option>${ls.value}</option>
										        </c:forEach>
										      </select>
										    </div><br><br>
									</div>	    
								    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">Укажите дату проведения опроса в данном мед учреждении</p></div>
									    <div class="col-xs-4">
									      <input  class="form-control"  aria-describedby="sizing-addon3" id="datePartSecondClinic" name="dataRespNSecondLevel" placeholder="">
									    </div><br><br>
									</div>    
								    								
									<div  class="wrap-hv">
										<div><p class="hv">1.	Как часто Вы посещаете поликлинику: (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="visitClinicSecondLevel">
									      	<option value=""></option>
									        <option>Один раз в несколько лет</option>
									        <option>Один - два раза в год</option>
									        <option>В среднем раз в месяц</option>
									        <option>Два - четыре раза в месяц</option>
									        <option>Два - три раза в неделю или чаше</option>
									      </select>
									    </div><br><br>
									 </div>   
		 						    
								    <div  class="wrap-hv" style="height: 180px;">
										<div><p class="hv">2.	Почему Вы посещаете именно эту поликлинику?: (возможно несколько вариантов ответа)</p></div>
									    <div class="col-xs-4 validquest2" style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="question2_1_clinic"  value="Близко расположена к дому" > Близко расположена к дому&nbsp;<br>
												<input type="checkbox" id="question2_2_clinic" value="Здесь чисто и уютно, приятно находиться" > Здесь чисто и уютно, приятно находиться&nbsp;<br>
												<input type="checkbox" id="question2_3_clinic" value="Здесь работают хорошие специалисты" > Здесь работают хорошие специалисты&nbsp;<br>
												<input type="checkbox" id="question2_4_clinic" value="Большой спектр медицинских услуг" > Большой спектр медицинских услуг&nbsp;<br>
												<input type="checkbox" id="question2_5_clinic" value="Я прикреплен(а) к этой поликлинике, наблюдался(лась) здесь ранее" > Я прикреплен(а) к этой поликлинике, наблюдался(лась) здесь ранее&nbsp;<br>
												Другое(напишиете)...&nbsp;<input type="text" class="length" id="question2_6_clinic" > 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">3.	Представьте, что Вам предложили поменять поликлинику. Вы бы сделали это? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="replacementClinicSecondLevel" >
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>     
									
									 <div  class="wrap-hv">
										<div><p class="hv">4.	Представьте, что вы не прикреплены ни к одной из поликлиник. Вы бы выбрали вашу поликлинику? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question4" >
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div> 
									
									 <div  class="wrap-hv">
										<div><p class="hv">5.	Удобен ли для вас график работы врачей и служб поликлиники? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question5" >
									      	<option value=""></option>
									        <option>Да, полностью удобен</option>
									        <option>По большей части удобен</option>
									        <option>Скорее не удобен</option>
									        <option>Совершенно не удобен</option>
									      </select>
									    </div><br><br>
									</div>       
									
									<div  class="wrap-hv" style="height: 170px;">
										<div><p class="hv">6.1.	Каким образом  в вашей поликлинике можно взять талон/записаться на прием к участковому терапевту</p></div>
									    <div class="col-xs-4 validquest6_1" style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="question6_1_1_clinic"  value="В регистратуре" > В регистратуре&nbsp;<br>
												<input type="checkbox" id="question6_1_2_clinic" value="По телефону" >По телефону&nbsp;<br>
												<input type="checkbox" id="question6_1_3_clinic" value="Через интернет (портал госуслуг)" > Через интернет (портал госуслуг)&nbsp;<br>
												<input type="checkbox" id="question6_1_4_clinic" value="Через информационные терминалы в поликлинике" > Через информационные терминалы в поликлинике&nbsp;<br>
												Другое(напишиете)...&nbsp;<input type="text" class="length" id="question6_1_5_clinic"> 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv" style="height: 170px;">
										<div><p class="hv">6.2.	Каким образом  в вашей поликлинике можно взять талон/записаться на прием к узкому специалисту</p></div>
									    <div class="col-xs-4 validquest6_2" style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="question6_2_1_clinic"  value="В регистратуре" > В регистратуре&nbsp;<br>
												<input type="checkbox" id="question6_2_2_clinic" value="По телефону" >По телефону&nbsp;<br>
												<input type="checkbox" id="question6_2_3_clinic" value="Через интернет (портал госуслуг)" > Через интернет (портал госуслуг)&nbsp;<br>
												<input type="checkbox" id="question6_2_4_clinic" value="Через информационные терминалы в поликлинике" > Через информационные терминалы в поликлинике&nbsp;<br>
												Другое(напишиете)...&nbsp;<input type="text" class="length" id="question6_2_5_clinic"> 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">7.	Можно ли в вашей поликлинике получить по телефону справочную информацию о предоставляемых медицинских услугах, работе специалистов и т.д. (одинответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question7" >
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">8.1.	Всегда ли в своей поликлинике вы можете своевременно получить медицинскую помощь: Участкового терапевта (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question8_1" >
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет</option>
									      </select>
									    </div><br><br>
									</div>       
									
									 <div  class="wrap-hv">
										<div><p class="hv">8.2.	Всегда ли в своей поликлинике вы можете своевременно получить медицинскую помощь: Врача-специалиста (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question8_2" >
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">9.1.	При последнем посещении через какой период времени после записи вы смогли попасть на прием к участковому терапевту (одни ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question9_1" >
									      	<option value=""></option>
									        <option>В тот же день</option>
									        <option>На следующий день</option>
									        <option>В течение 2 - 7 дней</option>
									        <option>Более чем через неделю</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">9.2.	При последнем посещении через какой период времени после записи вы смогли попасть на прием к врачу-специалисту (одни ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question9_2" >
									      	<option value=""></option>
									        <option>В тот же день</option>
									        <option>На следующий день</option>
									        <option>В течение 2 - 7 дней</option>
									        <option>Более чем через неделю</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">10.	Возникали ли у вас проблемы с вызовом врача на дом? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question10" >
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет</option>
									        <option>Мне не приходилось вызывать врача на дом</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">11.	Сколько в среднем вам приходится ожидать приема врача в очереди перед кабинетом? (одни ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question11" >
									      	<option value=""></option>
									        <option>До 5 минут</option>
									        <option>10 - 15 минут</option>
									        <option>15 - 30 минут</option>
									        <option>Более 30 минут</option>
									        <option>Более 1 часа</option>
									      </select>
									    </div><br><br>
									</div>
									<div  class="wrap-hv">
										<div><p class="hv">12.	Насколько вы удовлетворены качеством бесплатной медицинской помощи, получаемой в поликлинике? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question12_clinic" >
											<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">13.	Приходилось ли вам сталкиваться с проблемами при получении направления в другие медицинские организации для консультации, дополнительного обследования? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question13" >
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет</option>
									        <option>Мне не приходилось получать подобное направление</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">14.	Как вы считаете, достаточно ли внимания уделяют врачи вашей поликлиники профилактике заболеваний? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question14" >
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет</option>
									        <option>Затрудняюсь, ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">15.	Приходилось ли вам проходить в своей поликлинике диспансеризацию? (одинответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question15" onclick="testclic()">
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет (к вопросу 18)</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv del15">
										<div><p class="hv">16.	Когда вы проходили диспансеризацию последний раз? (напишите)</p></div>
									    <div class="col-xs-4">
									      <input type="text" style="width:500px;" id="question16" >
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv del15">
										<div><p class="hv">17.	Что вы можете сказать о своем последнем опыте прохождения диспансеризации? (один ответ)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question17" >
									      	<option value=""></option>
									        <option>Диспансеризацию прошел(ла) быстро, т.к. все было хорошо организовано</option>
									        <option>Диспансеризацию прошел(ла) быстро, т.к. врачи были недостаточновнимательны и относились ко всему формально</option>
									        <option>Диспансеризация заняла много времени, т.к. приходилось подолгу ждатьприема врачей</option>
									        <option>Другое (напишите)</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">18.	Как  вы считаете, учитывают ли врачи ваше мнение, назначая вам лечение?(один ответ)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question18" >
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">19.	Если у вас возникают вопросы по поводу назначенных вам медицинских Препаратов, процедур, анализов, обследований и т.п., всегда ли врачи разъясняют необходимость назначений? (один ответ)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question19" >
									      	<option value=""></option>
									        <option>Да, всегда</option>
									        <option>Чаще да, чем нет</option>
									        <option>Чаще нет, чем да</option>
									        <option>Нет</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">20.1.	Оцените уровень вашей удовлетворенности следующими характеристиками работы поликлиники: Техническим состоянием, ремонтом помещений (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question20_1_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">20.2.	Оцените уровень вашей удовлетворенности следующими характеристиками работы поликлиники: Организацией мест ожидания приема перед кабинетами (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question20_2_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">20.3.	Оцените уровень вашей удовлетворенности следующими характеристиками работы поликлиники: Чистотой, санитарно-гигиеническими условиями (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question20_3_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">20.4.	Оцените уровень вашей удовлетворенности следующими характеристиками работы поликлиники: Оснащенностью современным медицинским оборудованием (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question20_4_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">20.5.	Оцените уровень вашей удовлетворенности следующими характеристиками работы поликлиники: Организацией работы регистратуры (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question20_5_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">20.6.	Оцените уровень вашей удовлетворенности следующими характеристиками работы поликлиники: Организацией записи на прием к врачу (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question20_6_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">20.7.	Оцените уровень вашей удовлетворенности следующими характеристиками работы поликлиники: Временем ожидания приема врача (перед кабинетом) (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question20_7_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">20.8.	Оцените уровень вашей удовлетворенности следующими характеристиками работы поликлиники: Сроками ожидания медицинских услуг после записи (перед кабинетом) (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question20_8_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">20.9.	Оцените уровень вашей удовлетворенности следующими характеристиками работы поликлиники: Доступностью необходимых лабораторных исследований/анализов (перед кабинетом) (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question20_9_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">20.10.	Оцените уровень вашей удовлетворенности следующими характеристиками работы поликлиники: Доступностью диагностических исследований (ЭКГ, УЗИ и т.д.) (перед кабинетом) (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question20_10_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">20.11.	Оцените уровень вашей удовлетворенности следующими характеристиками работы поликлиники: Доступностью мед.помощи терапевта (перед кабинетом) (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question20_11_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">20.12.	Оцените уровень вашей удовлетворенности следующими характеристиками работы поликлиники: Доступностью мед.помощи врачей-специалистов (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question20_12_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">20.13.	Оцените уровень вашей удовлетворенности следующими характеристиками работы поликлиники: Квалификацией врачей (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question20_13_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">20.14.	Оцените уровень вашей удовлетворенности следующими характеристиками работы поликлиники: Отношением врачей и медсестер к пациентам (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question20_14_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">20.15.	Оцените уровень вашей удовлетворенности следующими характеристиками работы поликлиники: Работой врачей в поликлинике (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question20_15_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">20.16.	Оцените уровень вашей удовлетворенности следующими характеристиками работы поликлиники: Комплексом предоставляемых медицинских услуг (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question20_16_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									 <div  class="wrap-hv">
										<div><p class="hv">20.17.	Оцените уровень вашей удовлетворенности следующими характеристиками работы поликлиники: Результатами лечения, обследования, реабилитации (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question20_17_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">21.	Приходилось ли вам лично (для себя) за последние 3 месяца обращаться к услугам скорой медицинской помощи? (один ответ)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question21" onclick="testclic()">
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет (к вопросу 23)</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv del21">
										<div><p class="hv">22.	Насколько вы удовлетворены качеством оказанной вам скорой медицинской помощи? (один ответ)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question22_clinic" >
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем нет</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">23.	Знаете ли вы свои права как застрахованного в системе обязательного медицинского страхования? (один ответ)</p></div>
									    <div class="col-xs-4">
									    <select class="form-control input-sm" id="question23" >
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Не в полной мере</option>
									        <option>Нет</option>
									      </select>
									    </div><br><br>
									</div>
									
									
								 	<div  class="wrap-hv" style="height: 265px;">
										<div><p class="hv">24.	Из каких источников вы узнали о своих правах? (возможно несколько вариантов ответа)</p></div>
									    <div class="col-xs-4 validquest24" style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="question24_1_clinic"  value="От медицинских работников" > От медицинских работников&nbsp;<br>
												<input type="checkbox" id="question24_2_clinic" value="От сотрудников страховой компании" > От сотрудников страховой компании&nbsp;<br>
												<input type="checkbox" id="question24_3_clinic" value="От сотрудников Фонда ОМС" > От сотрудников Фонда ОМС&nbsp;<br>
												<input type="checkbox" id="question24_4_clinic" value="От знакомых/родственников" > От знакомых/родственников&nbsp;<br>
												<input type="checkbox" id="question24_5_clinic" value="из средств массовой информации" > из средств массовой информации&nbsp;<br>
												<input type="checkbox" id="question24_6_clinic" value="из информации для населения в медицинских организациях (стенды, брошюры,листовки)" > из информации для населения в медицинских организациях (стенды, брошюры,листовки)&nbsp;<br>
												<input type="checkbox" id="question24_7_clinic" value="из сети интернет" > из сети интернет&nbsp;<br>
												<input type="checkbox" id="question24_8_clinic" value="Я не знаю своих прав" > Я не знаю своих прав&nbsp;<br>
												<input type="checkbox" id="question24_9_clinic" value="Затрудняюсь ответить" > Затрудняюсь ответить&nbsp;<br>
												Другое(напишиете)...&nbsp;<input type="text" class="length" id="question24_10_clinic" > 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">25.1	Знаете ли вы, что системе обязательного медицинского страхования вы имеете право на: Выбор мед организации</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question25_1_clinic" >
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>     
									
									<div  class="wrap-hv">
										<div><p class="hv">25.2	Знаете ли вы, что системе обязательного медицинского страхования вы имеете право на: Выбор страховой компании</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question25_2_clinic" >
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>     
									
									<div  class="wrap-hv">
										<div><p class="hv">25.3	Знаете ли вы, что системе обязательного медицинского страхования вы имеете право на: Выбор врача (с учетом его согласия)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question25_3_clinic" >
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">25.4	Знаете ли вы, что системе обязательного медицинского страхования вы имеете право на: Получение полной информации о состоянии собственного здоровья</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question25_4_clinic" >
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>          
									
									<div  class="wrap-hv">
										<div><p class="hv">25.5	Знаете ли вы, что системе обязательного медицинского страхования вы имеете право на: Сохранение в тайне информации о состоянии своего здоровья, факте обращения за мед.помощью</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question25_5_clinic" >
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>          
									
									<div  class="wrap-hv">
										<div><p class="hv">25.6	Знаете ли вы, что системе обязательного медицинского страхования вы имеете право на: Отказ от медицинского вмешательства</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question25_6_clinic" >
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">25.7	Знаете ли вы, что системе обязательного медицинского страхования вы имеете право на: Получение бесплатных лекарств при обращении за скорой и стационарной помощью</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question25_7_clinic" >
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">25.8	Знаете ли вы, что системе обязательного медицинского страхования вы имеете право на: Получение бесплатной мед.помощи как в поликлинике, так и на дому</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question25_8_clinic" >
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">25.9	Знаете ли вы, что системе обязательного медицинского страхования вы имеете право на: Получение бесплатной восстановительной помощи и реабилитации</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question25_9_clinic" >
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">25.10	Знаете ли вы, что системе обязательного медицинского страхования вы имеете право на: Получение бесплатной мед.помощи за пределами региона, в котором Вы проживаете</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question25_10_clinic" >
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">25.11	Знаете ли вы, что системе обязательного медицинского страхования вы имеете право на: Защиту своих прав в случае их нарушения</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question25_11_clinic" >
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv" style="height: 215px;">
										<div><p class="hv">26.	Если вы считаете, что ваши права в системе ОМС нарушены, куда выпредпочитаете обратиться за помощью? (возможно несколько вариантов ответа)</p></div>
									    <div class="col-xs-4 validquest26" style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="question26_1_clinic"  value="Администрация медицинской организации" > Администрация медицинской организации&nbsp;<br>
												<input type="checkbox" id="question26_2_clinic" value="Страховая компания, выдавшая полис ОМС" > Страховая компания, выдавшая полис ОМС&nbsp;<br>
												<input type="checkbox" id="question26_3_clinic" value="Фонд обязательного медицинского страхования" > Фонд обязательного медицинского страхования&nbsp;<br>
												<input type="checkbox" id="question26_4_clinic" value="Органы управления здравоохранением" > Органы управления здравоохранением&nbsp;<br>
												<input type="checkbox" id="question26_5_clinic" value="Гражданский суд" > Гражданский суд&nbsp;<br>
												<input type="checkbox" id="question26_6_clinic" value="Затрудняюсь ответить" > Затрудняюсь ответить&nbsp;<br>
												Другое(напишиете)...&nbsp;<input type="text" class="length" id="question26_7_clinic" > 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">27	Пользовались ли вы правом выбора/смены лечащего врача? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question27" onclick="testclic()" >
									      	<option value=""></option>
									        <option>Да (к вопросу 29)</option>
									        <option>Хотел(а), но не смог(ла) (к вопросу 28)</option>
									        <option>Нет, не было необходимости (к вопросу 30)</option>
									        <option>Нет, не знал(а), что это возможно</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  id="quest28"class="wrap-hv del29" style="height: 180px;" onclick="testclic()">
										<div><p class="hv">28.	Что вам помешало сменить врача? (возможно несколько вариантов ответа)</p></div>
									    <div class="col-xs-4 validquest28" style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="question28_1_clinic"  value="Не знал(а), куда обратиться" > Не знал(а), куда обратиться&nbsp;<br>
												<input type="checkbox" id="question28_2_clinic" value="Решил(а), что пытаться бесполезно" > Решил(а), что пытаться бесполезно&nbsp;<br>
												<input type="checkbox" id="question28_3_clinic" value="Побоялся(лась) огласки" > Побоялся(лась) огласки&nbsp;<br>
												<input type="checkbox" id="question28_4_clinic" value="Не хотел(а) портить отношения с врачом" > Не хотел(а) портить отношения с врачом&nbsp;<br>
												Мне отказали (напишите причину)...&nbsp;<input class="length" type="text" id="question28_5_clinic" ><br>
									<!-- 			Другое(напишиете)...&nbsp;<input type="text" class="length" style="margin-top:10px;" id="question28_6_clinic" >  --> 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv del30" style="height: 245px;" onclick="testclic()">
										<div><p class="hv">29.	Почему вы сменили врача? (возможно несколько вариантов ответа)</p></div>
									    <div class="col-xs-4 validquest29" style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="question29_1_clinic"  value="Врачом оказана некачественная медицинская помощь" > Врачом оказана некачественная медицинская помощь&nbsp;<br>
												<input type="checkbox" id="question29_2_clinic" value="Врачом разглашена конфиденциальная информация о состоянии здоровья" > Врачом разглашена конфиденциальная информация о состоянии здоровья&nbsp;<br>
												<input type="checkbox" id="question29_3_clinic" value="Врачом не были назначены необходимые диагностические процедуры" > Врачом не были назначены необходимые диагностические процедуры&nbsp;<br>
												<input type="checkbox" id="question29_4_clinic" value="Врачом не было назначено необходимое лечение" > Врачом не было назначено необходимое лечение&nbsp;<br>
												<input type="checkbox" id="question29_5_clinic" value="Врач не дал направление на обследование в другую медицинскую организацию" > Врач не дал направление на обследование в другую медицинскую организацию&nbsp;<br>
												<input type="checkbox" id="question29_6_clinic" value="Врач  пытался  получить деньги за те услуги, которые должны быть оказаны бесплатно" > Врач  пытался  получить деньги за те услуги, которые должны быть оказаны бесплатно&nbsp;<br>
												<input type="checkbox" id="question29_7_clinic" value="Врач вел себя грубо, безразлично, невежливо" > Врач вел себя грубо, безразлично, невежливо&nbsp;<br>
												Другое(напишиете)...&nbsp;<input type="text" class="length"  id="question29_8_clinic" > 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">30.	Пользовались ли вы правом выбора/смены поликлиники? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question30" onclick="testclic()" >
									      	<option value=""></option>
									        <option>Да (к вопросу 32)</option>
									        <option>Хотел(а), но не смог(ла) (к вопросу 31)</option>
									        <option>Нет, не было необходимости (к вопросу 33)</option>
									        <option>Нет, не знал(а), что это возможно</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv del31" style="height: 140px;" id="quest31" onclick="testclic()">
										<div><p class="hv">31.	Что вам помешало поменять поликлинику? (возможно несколько вариантовответа)</p></div>
									    <div class="col-xs-4 validquest31" style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="question31_1_clinic"  value="Не знал(а), куда обратиться" > Не знал(а), куда обратиться&nbsp;<br>
												<input type="checkbox" id="question31_2_clinic" value="Решил(а), что пытаться бесполезно" > Решил(а), что пытаться бесполезно&nbsp;<br>
												Мне отказали (напишите причину)...&nbsp;<input type="text"  class="length" id="question31_3_clinic" ><br>
									<!-- 			Другое(напишиете)...&nbsp;<input type="text"  class="length" style="margin-top:10px;" id="question31_4_clinic" >  --> 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hvm del32" style="height: 200px;" >
										<div><p class="hv">32.	Почему вы поменяли поликлинику? (возможно несколько вариантов ответа)</p></div>
									    <div class="col-xs-4 validquest32" style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="question32_1_clinic"  value="в связи с переездом на новое место жительства" > в связи с переездом на новое место жительства&nbsp;<br>
												<input type="checkbox" id="question32_2_clinic" value="из-за неудобного режима работы" > из-за неудобного режима работы&nbsp;<br>
												<input type="checkbox" id="question32_3_clinic" value="из-за плохих санитарно-гигиенических условий" > из-за плохих санитарно-гигиенических условий&nbsp;<br>
												<input type="checkbox" id="question32_4_clinic" value="в  связи  с  недостаточным  спектром  медицинских  услуг  (анализы, узи, флюорография, рентген и т.д.)" > в  связи  с  недостаточным  спектром  медицинских  услуг  (анализы, узи, флюорография, рентген и т.д.)&nbsp;<br>
												<input type="checkbox" id="question32_5_clinic" value="из-за недостаточно квалифицированного медицинского персонала" > из-за недостаточно квалифицированного медицинского персонала&nbsp;<br>
												Другое(напишиете)...&nbsp;<input type="text" class="length" id="question32_6_clinic" > 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">33.	Пациент, застрахованный по ОМС, имеет право получать бесплатную медицинскую помощь на всей территории РФ, в том числе за пределами постоянного места жительства. Приходилось ли вам пользоваться этим правом?(один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question33"  onclick="testclic()">
									      	<option value=""></option>
									        <option>Да, я получал(а) бесплатную медицинскую помощь на других территориях РФ по полису ОМС (к вопросу 35)</option>
									        <option>Пытался(лась), но  мне  было отказано в бесплатной медицинской помощи на другой территории РФ</option>
									        <option>Нет, не приходилось (к вопросу 35)</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv del34">
										<div><p class="hv">34.	Почему вам отказали? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question34" >
									      	<option value=""></option>
									        <option>В  медицинской  организации, которой  я хотел(а) лечиться, слишком много прикрепленного населения</option>
									        <option>Из-за отсутствия местной регистрации</option>
									        <option>Другое (напишите)</option>
									      </select>
									    </div><br><br>
									</div>
									
									
									<div  class="wrap-hv ">
										<div><p class="hv">35.	За последний год приходилось ли вам использовать личные денежные средства при обследовании и лечении в поликлинике? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question35" onclick="testclic()">
									      	<option value=""></option>
									        <option>Не приходилось (к вопросу 37)</option>
									        <option>иногда, с заключением договора на оказание платных медицинских услуг</option>
									        <option>иногда, но без договора на оказание платных медицинских услуг</option>
									        <option>Очень часто, с заключением договора на оказание платных медицинскихуслуг</option>
									        <option>Очень часто,но без договора на оказание платных медицинских услуг</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv del36">
										<div><p class="hv">36.	Какую сумму вы потратили? (напишите)</p></div>
									    <div class="col-xs-8">
									    	&nbsp;<input style="width: 500px " type="text" id="question36" >
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">37.	Случалось ли вам когда-нибудь благодарить медицинских работников замедицинскую помощь?(один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question37" onclick="testclic()">
									      	<option value=""></option>
									        <option>Да, это происходит довольно часто</option>
									        <option>Да, иногда случается</option>
									        <option>Нет, никогда не приходилось к (вопросу 39)</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv del38">
										<div><p class="hv">38.	Кто выступал инициатором такой "благодарности"?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question38" >
									      	<option value=""></option>
									        <option>Я сам(а)</option>
									        <option>Медицинский работник</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">39.	Пол респондента:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="sexSecondLevelClinic" title="Введите пол">
									      	<option value=""></option>
									        <option>Мужской</option>
									        <option>Женский</option>
									      </select>
									    </div><br><br>
									 </div>   
								    
								    <div  class="wrap-hv">
										<div><p class="hv">40.	Возраст респондента (лет):</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="ageSecondLevelClinic"  title="Введите возраст" onclick="testclic()">
									      	<option value=""></option>
									      	<c:forEach var="ag" items="${listage}">
									        <option>${ag.value}</option>
									        </c:forEach>
									      </select>
									    </div><br><br>
									</div>    
									
									<div  class="wrap-hv del40">
										<div><p class="hv">41.	Ваше образование:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question41" title="Введите пол">
									      	<option value=""></option>
									        <option>Неполное среднее</option>
									        <option>Среднее</option>
									        <option>Среднее специальное</option>
									        <option>Неполное высшее</option>
									        <option>Высшее, в т.ч. ученая степень</option>
									      </select>
									    </div><br><br>
									 </div> 
									 
									 <div  class="wrap-hv del40">
										<div><p class="hv">42.	Ваше социальное положение</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question42" >
									      	<option value=""></option>
									        <option>Предприниматель</option>
									        <option>Руководитель</option>
									        <option>Служащий</option>
									        <option>итр, специалист</option>
									        <option>Научный работник, преподаватель, учитель</option>
									        <option>Рабочий</option>
									        <option>Пенсионер</option>
									        <option>Домохозяйка</option>
									        <option>Учащийся</option>
									        <option>Безработный</option>
									        <option>Другое (напишите)</option>
									      </select>
									    </div><br><br>
									 </div> 
									 
									 <div  class="wrap-hv del40">
										<div><p class="hv">43.	Каков среднемесячный доход вашей семьи на одного человека?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question43">
									      	<option value=""></option>
									        <option>Менее 10000 рублей</option>
									        <option>10 - 15000 рублей</option>
									        <option>15 - 20000 рублей</option>
									        <option>20 - 25000 рублей</option>
									        <option>25 - 30000 рублей</option>
									        <option>Свыше 30000 рублей</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									 </div> 
								    
								<input type="hidden" id="polzovatelClinicSecondLevel" value="${principal.username}"/>
								<input type="hidden" id="idClinicSecondLevel" value=""/>
								
								<div class="modal-footer"><div class="errorSecondClinic" style="display:none; margin-bottom: 15px; color:red;"><h4>В анкете все поля обязательны.<br>Заполните все поля.</h4></div> 
							 	<button type="button" id="cancelCSL" class="btn btn-primary" data-dismiss="modal">Отмена</button> 
								<button  class="btn btn-success renamebtn"  onclick='secondlevelclinic("${principal.username}")'>Добавить анкету</button> 
								</div>
							</div>
						</div>
					</div>
		</div>	
		</div>	
<!-- конец Добавить запись (модальное окно) -->

<!-- Добавить запись (модальное окно второго уровня ДС) -->

					
					<div class="modal fade" id="myModal1secondlevel" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
						<div class="modal-dialog modal-lg">
							<div class="modal-content">
								<div class="modal-header backgrheader">
<!--  									<button type="button btn-primary" class="close"
										data-dismiss="modal" aria-hidden="true">&times;</button>-->
										
									<h3 class="modal-title">Добавить анкету второго уровня</h3>
									<p>Добавление анкеты  дневного стационара</p>

								</div>
					<div  id="formDSSL" >			
								<div class="modal-body backgr">
									<div  class="wrap-hv">
										<div><p class="hv">Укажите медицинское учреждение где проходил опрос</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="moSecondleveldaystacionar" title="Введите лечебное учреждение">
									        <option value=""></option>
									        <c:forEach var="ls" items="${listmo}">
									        <option>${ls.value}</option>
									        </c:forEach>
									      </select>
									    </div><br><br>
								    </div>
								    
								    <div  class="wrap-hv">
										<div><p class="hv">Укажите дату проведения опроса в данном мед учреждении</p></div>
									    <div class="col-xs-4">
									      <input  class="form-control"  aria-describedby="sizing-addon3" id="datePartOneDayStacsecondlevel" name="dataRespDSSL" placeholder="">
									    </div><br><br>
									</div>    
								    								
									<div  class="wrap-hv" >
										<div><p class="hv">1. По какой причине вы госпитализированы в дневной стационар? (один ответ)</p></div>
									    <div class="col-xs-4">
									    <table class="optdrtable">
									    <tr>
									        <td>
											    <select class="form-control input-sm optdrselect" id="questionDS1">
											      	<option value=""></option>
											        <option>Лечение</option>
											        <option>Обследование</option>
											        <option>Реабилитация</option>
											        <option>Другое (напишите)</option>
											      </select> &nbsp;
									      		<input type="text" class="optdrinput" id="questionDS1dr"> 
											 </td>
										</tr>
										</table>	      
									    </div><br><br>
									</div> 
									
									<div  class="wrap-hv" >
										<div><p class="hv">2. В каком дневном стационаре вы проходите лечение? (один ответ)</p></div>
									    <div class="col-xs-4">
									    <table class="optdrtable">
									    <tr>
									        <td>
											    <select class="form-control input-sm optdrselect" id="questionDS2">
											      	<option value=""></option>
											        <option>Терапевтическом</option>
											        <option>Гинекологическом</option>
											        <option>Хирургическом</option>
											        <option>Восстановительного лечения</option>
											        <option>Другое (напишите)</option>
											      </select> &nbsp;
									      		<input type="text" class="optdrinput" id="questionDS2dr"> 
											 </td>
										</tr>
										</table>	      
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv" >
										<div><p class="hv">3. На базе какой медицинской организации находится ваш дневной стационар?(один ответ)</p></div>
									    <div class="col-xs-4">
									    <table class="optdrtable">
									    <tr>
									        <td>
											    <select class="form-control input-sm optdrselect" id="questionDS3">
											      	<option value=""></option>
											        <option>Поликлиники</option>
											        <option>Стационара (больницы)</option>
											        <option>Другое (напишите)</option>
											      </select> &nbsp;
									      		<input type="text" class="optdrinput" id="questionDS3dr"> 
											 </td>
										</tr>
										</table>	      
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv" style="height: 80px;">
										<div><p class="hv">4. Сколько времени вы ожидали места в дневном стационаре? (один ответ)</p></div>
									    <div class="col-xs-4">
											    <select class="form-control input-sm" id="questionDS4">
											      	<option value=""></option>
											        <option>Сутки</option>
											        <option>До 1-ой недели</option>
											        <option>До 2-х недель</option>
											        <option>До 3-х недель</option>
											        <option>Месяц и более</option>
											      </select> &nbsp;
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv" style="height: 80px;">
										<div><p class="hv">5. Как  часто  вы  лечились  в  дневном  стационаре за последний год? (одинответ)</p></div>
									    <div class="col-xs-4">
											    <select class="form-control input-sm" id="questionDS5">
											      	<option value=""></option>
											        <option>1 раз</option>
											        <option>2 раза</option>
											        <option>3 раза</option>
											        <option>Более 3 раз</option>
											      </select> &nbsp;
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv" style="height: 100px;">
										<div><p class="hv">6. Если бы вам предложили выбор между лечением в дневном стационаре и госпитализацией в стационар, что бы вы выбрали? (один ответ)</p></div>
									    <div class="col-xs-4">
											    <select class="form-control input-sm" id="questionDS6">
											      	<option value=""></option>
											        <option>Лечение в дневном стационаре</option>
											        <option>Госпитализацию в стационар</option>
											        <option>Затрудняюсь ответить</option>
											      </select> &nbsp;
									    </div><br><br>
									</div>    
		 						    
								    <div  class="wrap-hv" style="height: 80px;">
										<div><p class="hv">7. Насколько  вы  удовлетворены  качеством медицинской помощи, получаемой в дневном стационаре? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question7sec2">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
									    
								    <div  class="wrap-hv">
										<div><p class="hv">8. Как вы считаете, учитывал ли лечащий врач ваше мнение, назначая лечение? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question8sec1">
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет	</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
								    </div>
								    
								    <div  class="wrap-hv" style="height: 100px;">
										<div><p class="hv">9. Если у вас возникали вопросы по поводу назначенных вам медицинских препаратов, процедур, анализов, обследований, всегда ли лечащий врач разъяснял необходимость назначений? (один ответ)</p></div>
									    <div class="col-xs-4">
											    <select class="form-control input-sm" id="questionDS9">
											      	<option value=""></option>
											        <option>Да, всегда</option>
											        <option>Чаще да, чем нет</option>
											        <option>Чаще нет, чем да</option>
											        <option>Нет</option>
											        <option>Затрудняюсь ответить</option>
											      </select> &nbsp;
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">10.1  Оцените уровень вашей удовлетворенности следующими характеристиками работы дневного стационара: Техническим состоянием, ремонтом помещений, площадью помещений (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question10_1sec2">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
									
									<div  class="wrap-hv">
										<div><p class="hv">10.2  Оцените уровень вашей удовлетворенности следующими характеристиками работы дневного стационара: Комфортностью мест пребывания пациентов (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question10_2sec2">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
								    <div  class="wrap-hv">
										<div><p class="hv">10.3  Оцените уровень вашей удовлетворенности следующими характеристиками работы дневного стационара: Чистотой, санитарно-гигиеническими условиями (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question10_3sec2">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
								    
								    <div  class="wrap-hv">
										<div><p class="hv">10.4  Оцените уровень вашей удовлетворенности следующими характеристиками работы дневного стационара: Комплексом предоставляемых медицинских услуг (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question10_4sec2">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
								    
								    <div  class="wrap-hv">
										<div><p class="hv">10.5  Оцените уровень вашей удовлетворенности следующими характеристиками работы дневного стационара: Оснащенностью современным медицинским оборудованием (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question10_5sec2">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
								    
								    <div  class="wrap-hv">
										<div><p class="hv">10.6  Оцените уровень вашей удовлетворенности следующими характеристиками работы дневного стационара: Оснащенностью медикаментами и расходными материалами (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question10_6sec2">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">10.7  Оцените уровень вашей удовлетворенности следующими характеристиками работы дневного стационара: Обеспеченностью врачами (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question10_7sec2">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">10.8  Оцените уровень вашей удовлетворенности следующими характеристиками работы дневного стационара: Обеспеченностью средним и младшим медперсоналом (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question10_8sec2">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">10.9  Оцените уровень вашей удовлетворенности следующими характеристиками работы дневного стационара: Квалификацией врачей (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question10_9sec2">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">10.10  Оцените уровень вашей удовлетворенности следующими характеристиками работы дневного стационара: Отношением врачей к пациентам (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question10_10sec2">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">10.11  Оцените уровень вашей удовлетворенности следующими характеристиками работы дневного стационара: Отношением медсестер к пациентам (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question10_11sec2">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">10.12  Оцените уровень вашей удовлетворенности следующими характеристиками работы дневного стационара: Отношением Работой вспомогательных служб (лаборатория, рентген-кабинет, физиотерапевтический кабинет и т.д.) (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question10_12sec2">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">10.13  Оцените уровень вашей удовлетворенности следующими характеристиками работы дневного стационара: Результатами лечения, обследования, реабилитации (лаборатория, рентген-кабинет, физиотерапевтический кабинет и т.д.) (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question10_13sec2">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">10.14  Оцените уровень вашей удовлетворенности следующими характеристиками работы дневного стационара: Работой лечащего врача (лаборатория, рентген-кабинет, физиотерапевтический кабинет и т.д.) (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question10_14sec2">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">11. Приходилось  ли вам лично (для себя) за последние 3 месяца обращаться к услугам скорой медицинской помощи? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question11sec1" onclick="dsslvalidlev2()">
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет к (вопросу 13)</option>
									      </select>
									    </div><br><br>
								    </div>
								    
								    <div  class="wrap-hv deldssl12">
										<div><p class="hv">12  Насколько вы удовлетворены качеством оказанной вам скорой медицинской помощи? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question12sec2">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">13. Знаете ли вы свои права как застрахованного в системе обязательного медицинского страхования? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question13sec1">
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет</option>
									        <option>Не в полной мере</option>
									      </select>
									    </div><br><br>
								    </div>
								    
								    <div  class="wrap-hv" style="height: 260px;" >
										<div><p class="hv">14.	Из каких источников вы узнали о своих правах? (возможно нескольковариантов ответа)</p></div>
									    <div class="col-xs-4 validquestdssl14" style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="questionDS14many_1"  value="От медицинских работников" > От медицинских работников&nbsp;<br>
												<input type="checkbox" id="questionDS14many_2"  value="От сотрудников страховой компании" > От сотрудников страховой компании&nbsp;<br>
												<input type="checkbox" id="questionDS14many_3"  value="От сотрудников Фонда ОМС" > От сотрудников Фонда ОМС&nbsp;<br>
												<input type="checkbox" id="questionDS14many_4"  value="От знакомых/родственников" > От знакомых/родственников&nbsp;<br>
												<input type="checkbox" id="questionDS14many_5"  value="из средств массовой информации" > из средств массовой информации&nbsp;<br>
												<input type="checkbox" id="questionDS14many_6"  value="из информации для населения в медицинских организациях (стенды, брошюры,листовки)" > из информации для населения в медицинских организациях (стенды, брошюры,листовки)&nbsp;<br>
												<input type="checkbox" id="questionDS14many_7"  value="из сети интернет" > из сети интернет&nbsp;<br>
												<input type="checkbox" id="questionDS14many_8"  value="Я не знаю своих прав" > Я не знаю своих прав&nbsp;<br>
												<input type="checkbox" id="questionDS14many_9"  value="Затрудняюсь ответить" > Затрудняюсь ответить&nbsp;<br>
												Из других источников (напишите)...&nbsp;<input type="text" class="length" id="questionDS14many_10" > 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
								    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">15.1	Знаете ли вы, что в системе обязательного медицинского страхования вы имеете право на: Выбор медицинской организации (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question15_1_clinic">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал(а)</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">15.2	Знаете ли вы, что в системе обязательного медицинского страхования вы имеете право на: Выбор страховой компании (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question15_2_clinic">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал(а)</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
									
									<div  class="wrap-hv">
										<div><p class="hv">15.3	Знаете ли вы, что в системе обязательного медицинского страхования вы имеете право на: Выбор врача (с учетом его согласия) (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question15_3_clinic">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал(а)</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">15.4	Знаете ли вы, что в системе обязательного медицинского страхования вы имеете право на: Получение полной информации о состоянии собственного здоровья (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question15_4_clinic">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал(а)</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">15.5	Знаете ли вы, что в системе обязательного медицинского страхования вы имеете право на: Сохранение в тайне информации о состоянии своего здоровья, факте обращения за медицинской помощью (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question15_5_clinic">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал(а)</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">15.6	Знаете ли вы, что в системе обязательного медицинского страхования вы имеете право на: Отказ от медицинского вмешательства (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question15_6_clinic">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал(а)</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">15.7	Знаете ли вы, что в системе обязательного медицинского страхования вы имеете право на: Получение бесплатных лекарств при обращении за скорой и стационарной помощью (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question15_7_clinic">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал(а)</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">15.8	Знаете ли вы, что в системе обязательного медицинского страхования вы имеете право на: Получение бесплатной мед.помощи как в поликлинике, так и на дому (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question15_8_clinic">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал(а)</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">15.9	Знаете ли вы, что в системе обязательного медицинского страхования вы имеете право на: Получение бесплатной восстановительной помощи и реабилитации (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question15_9_clinic">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал(а)</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">15.10	Знаете ли вы, что в системе обязательного медицинского страхования вы имеете право на: Получение бесплатной мед.помощи за пределами региона, в котором Вы проживаете (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question15_10_clinic">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал(а)</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">15.11	Знаете ли вы, что в системе обязательного медицинского страхования вы имеете право на: Защиту своих прав в случае их нарушения (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question15_11_clinic">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал(а)</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
									
									<div  class="wrap-hv" style="height: 210px;" >
										<div><p class="hv">16.	Если вы считаете, что ваши права в  системе ОМС нарушены, куда вы предпочитаете обратиться за помощью? (возможно несколько вариантов ответа)</p></div>
									    <div class="col-xs-4 validquestdssl16" style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="questionDS16many_1"  value="Администрация медицинской организации" > Администрация медицинской организации&nbsp;<br>
												<input type="checkbox" id="questionDS16many_2"  value="Страховая компания, выдавшая полис ОМС" > Страховая компания, выдавшая полис ОМС&nbsp;<br>
												<input type="checkbox" id="questionDS16many_3"  value="Фонд обязательного медицинского страхования" > Фонд обязательного медицинского страхования&nbsp;<br>
												<input type="checkbox" id="questionDS16many_4"  value="Органы управления здравоохранением" > Органы управления здравоохранением&nbsp;<br>
												<input type="checkbox" id="questionDS16many_5"  value="Гражданский суд" > Гражданский суд&nbsp;<br>
												<input type="checkbox" id="questionDS16many_6"  value="Затрудняюсь ответить" > Затрудняюсь ответить&nbsp;<br>
												Другое  (напишите)...&nbsp;<input type="text" class="length" id="questionDS16many_7" > 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">17. Пользовались ли вы правом выбора/смены лечащего врача? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionDS17"  onclick="dsslvalidlev2()">
									      	<option value=""></option>
									        <option>Да (к вопросу 19)</option>
									        <option>Хотел(а), но не смог(ла) (к вопросу 18)</option>
									        <option>Нет, не было необходимости (к вопросу 20)</option>
									        <option>Нет, не знал(а), что это возможно</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv deldssl18" style="height: 150px;" >
										<div><p class="hv">18.	Что вам помешало сменить врача? (возможно несколько вариантов ответа)</p></div>
									    <div class="col-xs-4 validquestdssl18" style="width: 800px;">
									      <table onclick="dsslvalidlev2()">
									      <tr>
											<td>
												<input type="checkbox" id="questionDS18many_1"  value="Не знал(а), куда обратиться" > Не знал(а), куда обратиться&nbsp;<br>
												<input type="checkbox" id="questionDS18many_2"  value="Решил(а), что пытаться бесполезно" > Решил(а), что пытаться бесполезно&nbsp;<br>
												<input type="checkbox" id="questionDS18many_3"  value="Побоялся(лась) огласки" > Побоялся(лась) огласки&nbsp;<br>
												<input type="checkbox" id="questionDS18many_4"  value="Не хотел(а) портить отношения с врачом" > Не хотел(а) портить отношения с врачом&nbsp;<br>
												 Другое  (напишите)&nbsp;<input type="text" class="length" id="questionDS18many_5" > 
												<!-- Другое  (напишите)&nbsp;<input type="text" class="length" id="questionDS18many_6" > --> 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv deldssl19" style="height: 220px;">
										<div><p class="hv">19.	Почему вы сменили врача? (возможно несколько вариантов ответа)</p></div>
									    <div class="col-xs-4 validquestdssl19" style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="questionDS19many_1"  value="Врачом оказана некачественная медицинская помощь" > Врачом оказана некачественная медицинская помощь&nbsp;<br>
												<input type="checkbox" id="questionDS19many_2"  value="Врачом разглашена конфиденциальная информация о состоянии здоровья" > Врачом разглашена конфиденциальная информация о состоянии здоровья&nbsp;<br>
												<input type="checkbox" id="questionDS19many_3"  value="Врачом не были назначены необходимые диагностические процедуры" > Врачом не были назначены необходимые диагностические процедуры&nbsp;<br>
												<input type="checkbox" id="questionDS19many_4"  value="Врачом не было назначено необходимое лечение" > Врачом не было назначено необходимое лечение&nbsp;<br>
												<input type="checkbox" id="questionDS19many_5"  value="Врач не дал направление на обследование в другую медицинскую организацию" > Врач не дал направление на обследование в другую медицинскую организацию&nbsp;<br>
												<input type="checkbox" id="questionDS19many_6"  value="Врач  пытался  получить деньги за те услуги, которые должны быть оказаны бесплатно" > Врач  пытался  получить деньги за те услуги, которые должны быть оказаны бесплатно&nbsp;<br>
												<input type="checkbox" id="questionDS19many_7"  value="Врач вел себя грубо, безразлично, невежливо" > Врач вел себя грубо, безразлично, невежливо&nbsp;<br>
												Другое  (напишите)&nbsp;<input type="text" class="length" id="questionDS19many_8" > 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
								    
								    <div  class="wrap-hv">
										<div><p class="hv">20. Пользовались  ли вы правом выбора/смены медицинской организации? (одинответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionDS20" onclick="dsslvalidlev2()">
									      	<option value=""></option>
									        <option>Да (к вопросу 22)</option>
									        <option>Хотел(а), но не смог(ла) (к вопросу 21)</option>
									        <option>Нет, не было необходимости (к вопросу 23)</option>
									        <option>Нет, не знал(а), что это возможно</option>
									      </select>
									    </div><br><br>
									</div>
								    
								    <div  class="wrap-hv deldssl21" style="height: 120px;" >
										<div><p class="hv">21.	Что вам помешало поменять медицинскую организацию? (возможно нескольковариантов ответа)</p></div>
									    <div class="col-xs-4 validquestdssl21" style="width: 800px;">
									      <table onclick="dsslvalidlev2()">
									      <tr>
											<td>
												<input type="checkbox" id="questionDS21many_1"  value="Не знал(а), куда обратиться" > Не знал(а), куда обратиться&nbsp;<br>
												<input type="checkbox" id="questionDS21many_2"  value="Решил(а), что пытаться бесполезно" > Решил(а), что пытаться бесполезно&nbsp;<br>
												Мне отказали (напишите причину)&nbsp;<input type="text" class="length" id="questionDS21many_3" >
												<!-- Другое  (напишите)&nbsp;<input type="text" class="length" id="questionDS21many_4" > --> 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
								    
								    <div  class="wrap-hv deldssl22" style="height: 190px;" >
										<div><p class="hv">22.	Почему вы поменяли медицинскую организацию? (возможно  нескольковариантов ответа)</p></div>
									    <div class="col-xs-4 validquestdssl22" style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="questionDS22many_1"  value="В связи с переездом на новое место жительства" > В связи с переездом на новое место жительства&nbsp;<br>
												<input type="checkbox" id="questionDS22many_2"  value="из-за неудобного режима работы" > из-за неудобного режима работы&nbsp;<br>
												<input type="checkbox" id="questionDS22many_3"  value="из-за плохих санитарно-гигиенических условий" > Из-за плохих санитарно-гигиенических условий&nbsp;<br>
												<input type="checkbox" id="questionDS22many_4"  value="В связи с недостаточным спектром медицинских услуг (анализы, узи, ФЛГ, рентген и др)" > В связи с недостаточным спектром медицинских услуг (анализы, узи, ФЛГ, рентген и др)&nbsp;<br>
												<input type="checkbox" id="questionDS22many_5"  value="из-за недостаточно квалифицированного медицинского персонала" > из-за недостаточно квалифицированного медицинского персонала&nbsp;<br>
												Другое  (напишите)&nbsp;<input type="text" class="length" id="questionDS22many_6" > 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">23. Пациент, застрахованный по ОМС, имеет право получать бесплатную медицинскую помощь на всей территории РФ, в том числе за пределами постоянного места жительства. Приходилось ли вам пользоваться этим правом?(один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionDS23" onclick="dsslvalidlev2()">
									      	<option value=""></option>
									        <option>Да, я получал(а) бесплатную медицинскую помощь на других территориях РФпо полису ОМС (к вопросу 25)</option>
									        <option>Пытался(лась), но мне было отказано в бесплатной медицинской помощи надругой территории РФ</option>
									        <option>Нет, не приходилось (к вопросу 25)</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv deldssl24" style="height: 130px;" >
										<div><p class="hv">24.	Почему вам отказали? (возможно несколько вариантов ответа)</p></div>
									    <div class="col-xs-4 validquestdssl24" style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="questionDS24many_1"  value="В медицинской организации, в которой я хотел(а) лечиться, слишком многоприкрепленного населения" > В медицинской организации, в которой я хотел(а) лечиться, слишком многоприкрепленного населения&nbsp;<br>
												<input type="checkbox" id="questionDS24many_2"  value="из-за отсутствия местной регистрации" > из-за отсутствия местной регистрации&nbsp;<br>
												Другое  (напишите)&nbsp;<input type="text" class="length" id="questionDS24many_3" > 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
								    
								    <div  class="wrap-hv">
										<div><p class="hv">25.1	При последнем лечении/обследовании в дневном стационаре приходилось ли вам использовать личные денежные средства на: Приобретение лекарственных средств и изделий медицинского назначения (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question25_1">
									      	<option value=""></option>
									        <option>Да, часто</option>
									        <option>Да, иногда</option>
									        <option>Нет, не приходилось</option>
									        <option>Приходилось, с заключением договора о платном медицинском обслуживании</option>
									      </select>
									    </div><br><br>
									 </div>   
									 
									 <div  class="wrap-hv">
										<div><p class="hv">25.2	При последнем лечении/обследовании в дневном стационаре приходилось ли вам использовать личные денежные средства на: Диагностическое обследование (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question25_2">
									      	<option value=""></option>
									        <option>Да, часто</option>
									        <option>Да, иногда</option>
									        <option>Нет, не приходилось</option>
									        <option>Приходилось, с заключением договора о платном медицинском обслуживании</option>
									      </select>
									    </div><br><br>
									 </div>
									 
									 <div  class="wrap-hv">
										<div><p class="hv">25.3	При последнем лечении/обследовании в дневном стационаре приходилось ли вам использовать личные денежные средства на: Услуги медсестер, санитарок (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question25_3">
									      	<option value=""></option>
									        <option>Да, часто</option>
									        <option>Да, иногда</option>
									        <option>Нет, не приходилось</option>
									        <option>Приходилось, с заключением договора о платном медицинском обслуживании</option>
									      </select>
									    </div><br><br>
									 </div>
									 
									 <div  class="wrap-hv">
										<div><p class="hv">25.4	При последнем лечении/обследовании в дневном стационаре приходилось ли вам использовать личные денежные средства на: Медицинские манипуляции/операции (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question25_4">
									      	<option value=""></option>
									        <option>Да, часто</option>
									        <option>Да, иногда</option>
									        <option>Нет, не приходилось</option>
									        <option>Приходилось, с заключением договора о платном медицинском обслуживании</option>
									      </select>
									    </div><br><br>
									 </div>   
								    
								    <div  class="wrap-hv" style="height: 110px;">
										<div><p class="hv">25.5	При последнем лечении/обследовании в дневном стационаре приходилось ли вам использовать личные денежные средства на: Другое (напишите) (один ответ по каждой строке)</p></div>
									    <div class="col-xs-4">
									      <table>
									      <tr>
											<td>
												&nbsp;<input type="text" class="length" id="question25_5" > 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									 </div>   
									 
									 <div  class="wrap-hv" style="height: 90px;">
										<div><p class="hv">26.	Какую сумму вы потратили? (напишите)</p></div>
									    <div class="col-xs-4">
									      <table>
									      <tr>
											<td>
												&nbsp;<input type="text" class="length" id="questionDS26" > 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									 </div>   
								    
									   <div  class="wrap-hv">
											<div><p class="hv">27.	Случалось ли вам когда-нибудь благодарить медицинских работников замедицинскую помощь? (один ответ)</p></div>
										    <div class="col-xs-4">
										      <select class="form-control input-sm" id="questionDS27" onclick="dsslvalidlev2()">
										      	<option value=""></option>
										        <option>Да, это происходит довольно часто</option>
										        <option>Да, иногда случается</option>
										        <option>Нет, никогда не приходилось (к вопросу 29)</option>
										      </select>
										    </div><br><br>
										 </div> 
										 
										 <div  class="wrap-hv ssldel28">
											<div><p class="hv">28.	Кто выступал инициатором такой "благодарности"?</p></div>
										    <div class="col-xs-4">
										      <select class="form-control input-sm" id="questionDS28">
										      	<option value=""></option>
										        <option>Я сам(а)</option>
										        <option>Медицинский работник</option>
										      </select>
										    </div><br><br>
										 </div>  
								    
								    	<div  class="wrap-hv">
											<div><p class="hv">29.	Укажите пол</p></div>
										    <div class="col-xs-4">
										      <select class="form-control input-sm" id="sexSecondleveldaystacionar">
										      	<option value=""></option>
										        <option>Мужской</option>
										        <option>Женский</option>
										      </select>
										    </div><br><br>
										 </div>
										 
										 <div  class="wrap-hv">
										<div><p class="hv">30.	Возраст респондента (лет):</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="ageSecondleveldaystacionar" onclick="testclic()">
									      	<option value=""></option>
									      	<c:forEach var="ag" items="${listage}">
									        <option>${ag.value}</option>
									        </c:forEach>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv del30">
										<div><p class="hv">31.	Ваше образование:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionDS31" title="Введите пол">
									      	<option value=""></option>
									        <option>Неполное среднее</option>
									        <option>Среднее</option>
									        <option>Среднее специальное</option>
									        <option>Неполное высшее</option>
									        <option>Высшее, в т.ч. ученая степень</option>
									      </select>
									    </div><br><br>
									 </div> 
									 
									 <div  class="wrap-hv del30">
										<div><p class="hv">32.	Ваше социальное положение</p></div>
									    <div class="col-xs-4">
									    <table class="optdrtable">
									    <tr>
									        <td>
											    <select class="form-control input-sm optdrselect" id="questionDS32">
											        <option value=""></option>
											        <option>Предприниматель</option>
											        <option>Руководитель</option>
											        <option>Служащий</option>
											        <option>итр, специалист</option>
											        <option>Научный работник, преподаватель, учитель</option>
											        <option>Рабочий</option>
											        <option>Пенсионер</option>
											        <option>Домохозяйка</option>
											        <option>Учащийся</option>
											        <option>Безработный</option>
											        <option>Другое (напишите)</option>
											      </select> &nbsp;
									      		<input type="text" class="optdrinput" id="questionDS32dr"> 
											 </td>
										</tr>
										</table>	      
									    </div><br><br>
									    
									 </div> 
									 
									 <div  class="wrap-hv del30">
										<div><p class="hv">33.	Каков среднемесячный доход вашей семьи на одного человека?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionDS33">
									      	<option value=""></option>
									        <option>Менее 10000 рублей</option>
									        <option>10 - 15000 рублей</option>
									        <option>15 - 20000 рублей</option>
									        <option>20 - 25000 рублей</option>
									        <option>25 - 30000 рублей</option>
									        <option>Свыше 30000 рублей</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									 </div>
								    
								</div>
								<input type="hidden" id="polzSecondleveldaystacionar" value="${principal.username}"/>
								<input type="hidden" id="idDSSL" value=""/>
								
								<div class="modal-footer">
								<div class="errorDSSL" style="display:none; margin-bottom: 15px; color:red;"><h4>В анкете все поля обязательны.<br>Заполните все поля.</h4></div> 
								<button type="button" id="cancelDSSL" class="btn btn-primary" data-dismiss="modal">Отмена</button>
									<button  class="btn btn-success renamebtndssl"  onclick='secondlevelds("${principal.username}")'>Добавить анкету</button>
								</div>
							</div>
						</div>
					</div>
		</div>	
				
<!-- конец Добавить запись (модальное окно) -->



<!-- Добавить запись (модальное окно первого уровня дневного стационара) -->

					<div class="modal fade" id="myModal1" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
						<div class="modal-dialog modal-lg">
							<div class="modal-content">
								<div class="modal-header backgrheader">
									<button type="button btn-primary" class="close"
										data-dismiss="modal" aria-hidden="true">&times;</button>
									<h3 class="modal-title">Добавить анкету первого уровня</h3>
									<p>Добавление анкеты  дневного стационара</p>

								</div>
					<div  id="form2" >			
								<div class="modal-body backgr">
									<div  class="wrap-hv">
										<div><p class="hv">Укажите медицинское учреждение где проходил опрос</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="moDayStac" title="Введите лечебное учреждение">
									        <option value=""></option>
									        <c:forEach var="ls" items="${listmo}">
									        <option>${ls.value}</option>
									        </c:forEach>
									      </select>
									    </div><br><br>
								    </div>
								    
								    <div  class="wrap-hv">
										<div><p class="hv">Укажите дату проведения опроса в данном мед учреждении</p></div>
									    <div class="col-xs-4">
									      <input  class="form-control"  aria-describedby="sizing-addon3" id="datePartOneDayStac" name="dataRespDS" placeholder="">
									    </div><br><br>
									</div>    
								    								
									<p>1.	 Оцените уровень вашей удовлетворенности следующими характеристиками работы дневного стационара:</p>
									<div  class="wrap-hv">
										<div><p class="hv">1.1 Насколько Вы удовлетворены качеством бесплатной медицинской помощи, получаемой в дневном стационаре</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="qualityDaystac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
		 						    
								    <div  class="wrap-hv">
										<div><p class="hv">1.2 Техническим состоянием, ремонтом помещений, площадью помещений:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="rapairsDaystac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
									    
								    <div  class="wrap-hv">
										<div><p class="hv">1.3 Комфортностью мест пребывания пациентов:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="comfortDaystac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
								    </div>
								    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.4 Комплексом предоставляемых медицинских услуг:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="servicesDaystac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.5 Оснащенностью современным медицинским оборудованием:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="equipmentDaystac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									 </div>   
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.6 Обеспеченностью медикаментами и расходными материалами:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="medicineDaystac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
								    </div>
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.7 Работой вспомогательных служб (лаборатория, рентген-кабинет, физиотерапевтический кабинет и т.д.):</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="laboratoryDaystac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.8 Работой лечащего врача:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="therapistDaystac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									 </div>   

									<div  class="wrap-hv">
										<div><p class="hv">2.	Приходилось ли вам лично (для себя) за последние 3 месяца обращаться куслугам скорой медицинской помощи?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="ambulanceDaystac">
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет</option>
									      </select>
									    </div><br><br>
								   </div>   
								    
								    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">3.	На сколько вы удовлетворены качеством оказанной вам скорой медицинскойпомощи?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="qualityAmbulanceDaystac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
								    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">4.	Пол респондента:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="sexDaystac">
									      	<option value=""></option>
									        <option>Мужской</option>
									        <option>Женский</option>
									      </select>
									    </div><br><br>
									</div>    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">5.	Возраст респондента (лет):</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="ageDaystac">
									      	<option value=""></option>
									      	<c:forEach var="ag" items="${listage}">
									        <option>${ag.value}</option>
									        </c:forEach>
									      </select>
									    </div><br><br>
									</div>    
								    
								</div>
								<input type="hidden" id="polzovateldaystacionar" value="${principal.username}"/>
								<input type="hidden" id="idoneDayStac" value=""/>
								
								<div class="modal-footer"><div class="errorOneClinic" style="display:none; margin-bottom: 15px; color:red;"><h4>В анкете все поля обязательны.<br>Заполните все поля.</h4></div> 
								<button type="button" id="cancelOneDayStacionar" class="btn btn-primary" data-dismiss="modal">Отмена</button>
									<button  class="btn btn-success editonelev"  onclick='onedaystacionar("${principal.username}")'>Добавить анкету</button>
								</div>
							</div>
						</div>
					</div>
		</div>		
<!-- конец Добавить запись (модальное окно) -->



<!-- Добавить запись (модальное окно первого уровня Стационар) -->

					<div class="modal fade" id="myModal2" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static" >
						<div class="modal-dialog modal-lg">
							<div class="modal-content">
								<div class="modal-header backgrheader">
									<button type="button btn-primary" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
									<h3 class="modal-title">Добавить анкету первого уровня</h3>
									<p>Добавление анкеты  стационарной помощи</p>

								</div>
					<div id="form3" >			
								<div class="modal-body backgr">
									<div  class="wrap-hv">
										<div><p class="hv">Укажите медицинское учреждение где проходил опрос</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="moonestac">
									        <option value=""></option>
									        <c:forEach var="ls" items="${listmo}">
									        <option>${ls.value}</option>
									        </c:forEach>
									      </select>
									    </div><br><br>
									</div>    
								    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">Укажите дату проведения опроса в данном мед учреждении</p></div>
									    <div class="col-xs-4">
									      <input  class="form-control"  aria-describedby="sizing-addon3" id="datePartOneStac" name="dataonestac" placeholder="">
									    </div><br><br>
								   </div> 
								    								
									<p>1.	Оцените уровень  вашей удовлетворенности следующими характеристиками работы стационара:</p>
									<div  class="wrap-hv">
										<div><p class="hv">1.1 Насколько Вы удовлетворены качеством бесплатной медицинской помощи, получаемой в  стационаре</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="qualityStac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
		 						    
								    <div  class="wrap-hv">
										<div><p class="hv">1.2 Техническим состоянием, ремонтом помещений, площадью помещений:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="rapairsStac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.3 Комфортностью больничной палаты и мест пребывания пациентов:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="comfortStac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.4 Питанием:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="foodStac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.5 Оснащенностью современным мед. оборудованием:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="equipmentStac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.6 Обеспеченностью медикаментами и расходными материалами:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="medicineStac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									 </div>   
								    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.7 Сроками ожидания плановой госпитализации:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="termsStac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									 </div>   
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.8 Работой вспомогательных служб (лаборатория, рентген-кабинет, физиотерапевтический кабинет и т.д.):</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="laboratoryStac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									 </div>   
								    
								    <div  class="wrap-hv">
										<div><p class="hv">1.9 Работой лечащего врача:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="therapistStac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									 </div>   
								    
									<div  class="wrap-hv">
										<div><p class="hv">2.	Приходилось ли вам лично (для себя) за последние 3 месяца обращаться куслугам скорой медицинской помощи?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="ambulanceStac">
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет</option>
									      </select>
									    </div><br><br>
									</div>    
								    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">3.	На сколько вы удовлетворены качеством оказанной вам скорой медицинскойпомощи?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="qualityAmbulanceStac">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									 </div>   
								    
								    
								    <div  class="wrap-hv">
										<div><p class="hv">4.	Пол респондента:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="sexStac">
									      	<option value=""></option>
									        <option>Мужской</option>
									        <option>Женский</option>
									      </select>
									    </div><br><br>
									 </div>   
								    
								    <div  class="wrap-hv">
										<div><p class="hv">5.	Возраст респондента (лет):</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="ageStac">
									      	<option value=""></option>
									      	<c:forEach var="ag" items="${listage}">
									        <option>${ag.value}</option>
									        </c:forEach>
									      </select>
									    </div><br><br>
									 </div>   
								    
								</div>
								<input type="hidden" id="polzovatelonestac" value="${principal.username}"/>
								<input type="hidden" id="idoneStac" value=""/>
								
								<div class="modal-footer"><div class="errorOneClinic" style="display:none; margin-bottom: 15px; color:red;"><h4>В анкете все поля обязательны.<br>Заполните все поля.</h4></div> 
								<button type="button" id="cancelOneStac" class="btn btn-primary" data-dismiss="modal">Отмена</button>
									<button  class="btn btn-success editonelev"  onclick='onestacionar("${principal.username}")'>Добавить анкету</button>
								</div>
							</div>
						</div>
					</div>
		</div>		
<!-- конец Добавить запись (модальное окно) -->

<!-- Добавить запись (модальное окно второго уровня Стационар) -->

					
					<div class="modal fade" id="myModal2secondlevel" role="dialog"
						aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="static">
						<div class="modal-dialog modal-lg">
							<div class="modal-content">
								<div class="modal-header backgrheader">
<!--  									<button type="button btn-primary" class="close"
										data-dismiss="modal" aria-hidden="true">&times;</button>-->
									<h3 class="modal-title">Добавить анкету второго уровня</h3>
									<p>Добавление анкеты  стационарной помощи</p>

								</div>
					<div  id="formSSL" >			
								<div class="modal-body backgr">
									<div  class="wrap-hv">
										<div><p class="hv">Укажите медицинское учреждение где проходил опрос</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="moSLS" title="Введите лечебное учреждение">
									        <option value=""></option>
									        <c:forEach var="ls" items="${listmo}">
									        <option>${ls.value}</option>
									        </c:forEach>
									      </select>
									    </div><br><br>
								    </div>
								    
								    <div  class="wrap-hv">
										<div><p class="hv">Укажите дату проведения опроса в данном мед учреждении</p></div>
									    <div class="col-xs-4">
									      <input  class="form-control"  aria-describedby="sizing-addon3" id="datePartOneStacsecondlevel" name="dataRespSls" placeholder="">
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv" >
										<div><p class="hv">1. Каким образом вы были госпитализированы в стационар? (один ответ)</p></div>
									    <div class="col-xs-4">
									    <table class="optdrtable">
									    <tr>
									        <td>
											    <select class="form-control input-sm optdrselect" id="questionS1">
											      	<option value=""></option>
											        <option>В плановом порядке (по направлению поликлиники)</option>
											        <option>В срочном порядке (бригадой "скорой помощи")</option>
											        <option>Пришел(ла) сам(а)</option>
											        <option>Другое (напишите)</option>
											      </select> &nbsp;
									      		<input type="text" class="optdrinput" id="questionS1dr"> 
											 </td>
										</tr>
										</table>	      
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">2.	Сколько времени вы ожидали места в стационаре? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS2">
									      	<option value=""></option>
									        <option>Сутки</option>
									        <option>До 1 недели</option>
									        <option>До 2-х недель</option>
									        <option>До 3-х недель</option>
									        <option>Месяц и более</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv" style="height: 100px;">
										<div><p class="hv">3.	В каком отделении стационара вы проходите лечение?(напишите)</p></div>
									    <div class="col-xs-4">
									      <table>
									      <tr>
											<td>
												&nbsp;<input type="text" class="length" id="questionS3" > 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">4.	Как  часто  вы  лечились в стационаре за последний год? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS4">
									      	<option value=""></option>
									        <option>1 раз</option>
									        <option>2 раза</option>
									        <option>3 раза</option>
									        <option>Более 3 раз</option>
									      </select>
									    </div><br><br>
									</div>
								    
									<div  class="wrap-hv">
										<div><p class="hv">5.	Насколько вы  удовлетворены  качеством медицинской помощи, получаемой в стационаре? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS5sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
									
									<div  class="wrap-hv">
										<div><p class="hv">6.	Как вы считаете, учитывал ли лечащий врач ваше мнение, назначая лечение? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS6">
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
									
									<div  class="wrap-hv">
										<div><p class="hv">7.	Если у вас возникали вопросы по поводу назначенных вам медицинских препаратов, процедур, анализов, обследований, всегда ли лечащий врач разъяснял необходимость назначений? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS7">
									      	<option value=""></option>
									        <option>Да, всегда</option>
									        <option>Чаще да, чем нет</option>
									        <option>Чаще нет, чем да</option>
									        <option>Нет</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
									
									<div  class="wrap-hv">
										<div><p class="hv">8.	За время нахождения в стационаре осматривал ли Вас заведующий отделением?(один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS8">
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">9.1	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Техническим состоянием, ремонтом помещений, площадью помещений</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_1sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">9.2	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Комфортностью больничной палаты и мест пребывания пациентов</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_2sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">9.3	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Количеством пациентов, размещаемых в палате</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_3sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>		
									
									<div  class="wrap-hv">
										<div><p class="hv">9.4	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Чистотой, санитарно-гигиеническими условиями</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_4sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
									
									<div  class="wrap-hv">
										<div><p class="hv">9.5	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Комплексом предоставляемых медицинских услуг</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_5sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
									
									<div  class="wrap-hv">
										<div><p class="hv">9.6	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Питанием</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_6sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
									
									<div  class="wrap-hv">
										<div><p class="hv">9.7	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Оснащенностью современным мед.оборудованием</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_7sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
									
									<div  class="wrap-hv">
										<div><p class="hv">9.8	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Обеспеченностью медикаментами и расходными материалами</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_8sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
									
									<div  class="wrap-hv">
										<div><p class="hv">9.9	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Сроками ожидания плановой госпитализации</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_9sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
									
									<div  class="wrap-hv">
										<div><p class="hv">9.10	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Длительностью ожидания осмотра в приемном отделении</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_10sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
									
									<div  class="wrap-hv">
										<div><p class="hv">9.11	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Обеспеченностью врачами</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_11sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">9.12	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Обеспеченностью средним и младшим медперсоналом</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_12sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
									
									<div  class="wrap-hv">
										<div><p class="hv">9.13	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Квалификацией врачей</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_13sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
									
									<div  class="wrap-hv">
										<div><p class="hv">9.14	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Отношением врачей к пациентам</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_14sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
									
									<div  class="wrap-hv">
										<div><p class="hv">9.15	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Отношением медсестер к пациентам</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_15sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
									
									<div  class="wrap-hv">
										<div><p class="hv">9.16	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Частотой проведения врачебных обходов</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_16sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
													
													
									<div  class="wrap-hv">
										<div><p class="hv">9.17	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Работой вспомогательных служб (лаборатория, рентген-кабинет, физиотерапевтический кабинет и т.д.)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_17sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
									
									<div  class="wrap-hv">
										<div><p class="hv">9.18	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Результатами лечения, обследования</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_18sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
									
									<div  class="wrap-hv">
										<div><p class="hv">9.19	Оцените уровень вашей удовлетворенности следующими характеристиками работы стационара: Работой лечащего врача</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS9_19sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>			
									
									<div  class="wrap-hv">
										<div><p class="hv">10.	Приходилось  ли вам лично (для себя) за последние 3 месяца обращаться к услугам скорой медицинской помощи?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS10" onclick="sslvalidlev()">
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Нет (к вопросу 12)</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv ssldel11">
										<div><p class="hv">11.	Насколько вы удовлетворены качеством оказанной вам скорой медицинской помощи?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS11sec1">
									      	<option value=""></option>
									        <option>Удовлетворен(а)</option>
									        <option>Скорее удовлетворен(а), чем не удовлетворен(а)</option>
									        <option>Скорее не удовлетворен(а), чем удовлетворен(а)</option>
									        <option>Не удовлетворен(а)</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">12.	Знаете ли вы свои права как застрахованного в системе обязательного медицинского страхования?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS12">
									      	<option value=""></option>
									        <option>Да</option>
									        <option>Не в полной мере</option>
									        <option>Нет</option>
									      </select>
									    </div><br><br>
									</div>
									
									
								    <div  class="wrap-hv" style="height: 260px;" >
										<div><p class="hv">13.	Из каких источников вы узнали о своих правах? (возможно нескольковариантов ответа)</p></div>
									    <div class="col-xs-4 validquestS13" style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="questionS13many_1"  value="От медицинских работников" > От медицинских работников&nbsp;<br>
												<input type="checkbox" id="questionS13many_2"  value="От сотрудников страховой компании" > От сотрудников страховой компании&nbsp;<br>
												<input type="checkbox" id="questionS13many_3"  value="От сотрудников Фонда ОМС" > От сотрудников Фонда ОМС&nbsp;<br>
												<input type="checkbox" id="questionS13many_4"  value="От знакомых/родственников" > От знакомых/родственников&nbsp;<br>
												<input type="checkbox" id="questionS13many_5"  value="из средств массовой информации" > из средств массовой информации&nbsp;<br>
												<input type="checkbox" id="questionS13many_6"  value="из информации для населения в медицинских организациях (стенды, брошюры,листовки)" > из информации для населения в медицинских организациях (стенды, брошюры,листовки)&nbsp;<br>
												<input type="checkbox" id="questionS13many_7"  value="из сети интернет" > из сети интернет&nbsp;<br>
												<input type="checkbox" id="questionS13many_8"  value="Я не знаю своих прав" > Я не знаю своих прав&nbsp;<br>
												<input type="checkbox" id="questionS13many_9"  value="Затрудняюсь ответить" > Затрудняюсь ответить&nbsp;<br>
												Из других источников (напишите)...&nbsp;<input type="text" class="length" id="questionS13many_10" > 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>	    
									
									<div  class="wrap-hv">
										<div><p class="hv">14.1	Знаете  ли вы,  что в системе обязательного медицинского страхования вы имеете право на: Выбор медицинской организации</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question14_1sec2">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">14.2	Знаете  ли вы,  что в системе обязательного медицинского страхования вы имеете право на: Выбор страховой компании</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question14_2sec2">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">14.3	Знаете  ли вы,  что в системе обязательного медицинского страхования вы имеете право на: Выбор врача (с учетом его согласия)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question14_3sec2">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>	    
									
									<div  class="wrap-hv">
										<div><p class="hv">14.4	Знаете  ли вы,  что в системе обязательного медицинского страхования вы имеете право на: Получение полной информации о состоянии собственного здоровья</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question14_4sec2">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>	    
									
									<div  class="wrap-hv">
										<div><p class="hv">14.5	Знаете  ли вы,  что в системе обязательного медицинского страхования вы имеете право на: Сохранение в тайне информации о состоянии своего здоровья, факте обращения за медицинской помощью</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question14_5sec2">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>	    
									
									<div  class="wrap-hv">
										<div><p class="hv">14.6	Знаете  ли вы,  что в системе обязательного медицинского страхования вы имеете право на: Отказ от медицинского вмешательства</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question14_6sec2">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">14.7	Знаете  ли вы,  что в системе обязательного медицинского страхования вы имеете право на: Получение бесплатных лекарств при обращении за скорой и стационарной помощью</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question14_7sec2">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">14.8	Знаете  ли вы,  что в системе обязательного медицинского страхования вы имеете право на: Получение бесплатной мед.помощи как в поликлинике, так и на дому</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question14_8sec2">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">14.9	Знаете  ли вы,  что в системе обязательного медицинского страхования вы имеете право на: Получение бесплатной восстановительной помощи и реабилитации</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question14_9sec2">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">14.10	Знаете  ли вы,  что в системе обязательного медицинского страхования вы имеете право на: Получение бесплатной мед.помощи за пределами региона, в котором Вы проживаете</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question14_10sec2">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">14.11	Знаете  ли вы,  что в системе обязательного медицинского страхования вы имеете право на: Защиту своих прав в случае их нарушения</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question14_11sec2">
									      	<option value=""></option>
									        <option>Знаю</option>
									        <option>Что-то слышал</option>
									        <option>Не знаю</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									</div>	    
									
									<div  class="wrap-hv" style="height: 230px;" >
										<div><p class="hv">15.	Если вы считаете, что ваши права в  системе ОМС нарушены, куда вы предпочитаете обратиться за помощью? (возможно несколько вариантов ответа)</p></div>
									    <div class="col-xs-4 validquestS15" style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="questionS15many_1"  value="Администрация медицинской организации" > Администрация медицинской организации&nbsp;<br>
												<input type="checkbox" id="questionS15many_2"  value="Страховая компания, выдавшая полис ОМС" > Страховая компания, выдавшая полис ОМС&nbsp;<br>
												<input type="checkbox" id="questionS15many_3"  value="Фонд обязательного медицинского страхования" > Фонд обязательного медицинского страхования&nbsp;<br>
												<input type="checkbox" id="questionS15many_4"  value="Органы управления здравоохранением" > Органы управления здравоохранением&nbsp;<br>
												<input type="checkbox" id="questionS15many_5"  value="Гражданский суд" > Гражданский суд&nbsp;<br>
												<input type="checkbox" id="questionS15many_6"  value="Затрудняюсь ответить" > Затрудняюсь ответить&nbsp;<br>
												Другое напишите (напишите)...&nbsp;<input type="text" class="length" id="questionS15many_7" > 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>	  
									
									<div  class="wrap-hv" style="height: 70px;" >
										<div><p class="hv">16	Пользовались ли вы правом выбора/смены лечащего врача?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS16" onclick="sslvalidlev()">
									      	<option value=""></option>
									        <option>Да (к вопросу 18)</option>
									        <option>Хотел(а), но не смог(ла) (к вопросу 17)</option>
									        <option>Нет, не было необходимости (к вопросу 19)</option>
									        <option>Нет, не знал(а), что это возможно</option>
									      </select>
									    </div><br><br>
									</div>	    
									
									<div  class="wrap-hv delssl17" style="height: 170px;" >
										<div><p class="hv">17.	Что вам помешало сменить врача? (возможно несколько вариантов ответа)</p></div>
									    <div class="col-xs-4 validquestS17" style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="questionS17many_1"  value="Не знал(а), куда обратиться" > Не знал(а), куда обратиться&nbsp;<br>
												<input type="checkbox" id="questionS17many_2"  value="Решил(а), что пытаться бесполезно" > Решил(а), что пытаться бесполезно&nbsp;<br>
												<input type="checkbox" id="questionS17many_3"  value="Побоялся(лась) огласки" > Побоялся(лась) огласки&nbsp;<br>
												<input type="checkbox" id="questionS17many_4"  value="Не хотел(а) портить отношения с врачом" > Не хотел(а) портить отношения с врачом&nbsp;<br>
												Мне отказали (напишите причину) &nbsp;<input type="text" class="length" id="questionS17many_5" >
												<!-- Другое (напишите)  &nbsp;<input type="text" class="length" id="questionS17many_6" > --> 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>	   	    
									
									<div  class="wrap-hv delssl18" style="height: 230px;" >
										<div><p class="hv">18.	Почему вы сменили врача? (возможно несколько вариантов ответа)</p></div>
									    <div class="col-xs-4 validquestS18" style="width: 800px;">
									      <table onclick="sslvalidlev()">
									      <tr>
											<td>
												<input type="checkbox" id="questionS18many_1"  value="Врачом оказана некачественная медицинская помощь" > Врачом оказана некачественная медицинская помощь&nbsp;<br>
												<input type="checkbox" id="questionS18many_2"  value="Врачом разглашена конфиденциальная информация о состоянии здоровья" > Врачом разглашена конфиденциальная информация о состоянии здоровья&nbsp;<br>
												<input type="checkbox" id="questionS18many_3"  value="Врачом не были назначены необходимые диагностические процедуры" > Врачом не были назначены необходимые диагностические процедуры&nbsp;<br>
												<input type="checkbox" id="questionS18many_4"  value="Врачом не было назначено необходимое лечение" > Врачом не было назначено необходимое лечение&nbsp;<br>
												<input type="checkbox" id="questionS18many_5"  value="Врач не дал направление на обследование в другую медицинскую организацию" > Врач не дал направление на обследование в другую медицинскую организацию&nbsp;<br>
												<input type="checkbox" id="questionS18many_6"  value="Врач  пытался  получить деньги за те услуги, которые должны быть оказаны бесплатно" > Врач  пытался  получить деньги за те услуги, которые должны быть оказаныбесплатно&nbsp;<br>
												<input type="checkbox" id="questionS18many_7"  value="Врач вел себя грубо, безразлично, невежливо" > Врач вел себя грубо, безразлично, невежливо&nbsp;<br>
												Другое (напишите)  &nbsp;<input type="text" class="length" id="questionS18many_8" >
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv validquestS19">19	Пользовались  ли вы правом выбора/смены медицинской организации? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS19" onclick="sslvalidlev()">
									      	<option value=""></option>
									        <option>Да (к вопросу 21)</option>
									        <option>Хотел(а), но не смог(ла) (к вопросу 20)</option>
									        <option>Нет, не было необходимости (к вопросу 22)</option>
									        <option>Нет, не знал(а), что это возможно</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv validquestS20" style="height: 140px;" >
										<div><p class="hv">20.	Что вам помешало поменять медицинскую организацию? (возможно несколько вариантов ответа)</p></div>
									    <div class="col-xs-4" style="width: 800px;">
									      <table onclick="sslvalidlev()">
									      <tr>
											<td>
												<input type="checkbox" id="questionS20many_1"  value="Не знал(а), куда обратиться" > Не знал(а), куда обратиться&nbsp;<br>
												<input type="checkbox" id="questionS20many_2"  value="Решил(а), что пытаться бесполезно" > Решил(а), что пытаться бесполезно&nbsp;<br>
												Мне отказали (напишите причину либо другое)&nbsp;<input type="text" class="length" id="questionS20many_3" >
												<!-- Другое (напишите)  &nbsp;<input type="text" class="length" id="questionS20many_4" > -->
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv validquestS21" style="height: 200px;" >
										<div><p class="hv">21.	Почему вы поменяли медицинскую организацию? (возможно  несколько вариантов ответа)</p></div>
									    <div class="col-xs-4 " style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="questionS21many_1"  value="В связи с переездом на новое место жительства" >В связи с переездом на новое место жительства&nbsp;<br>
												<input type="checkbox" id="questionS21many_2"  value="из-за неудобного режима работы" >из-за неудобного режима работы&nbsp;<br>
												<input type="checkbox" id="questionS21many_3"  value="из-за плохих санитарно-гигиенических условий" >из-за плохих санитарно-гигиенических условий&nbsp;<br>
												<input type="checkbox" id="questionS21many_4"  value="В связи с недостаточным спектром медицинских услуг (анализы, узи,флг,рентген и т.п.)" > В связи  с  недостаточным  спектром  медицинских  услуг  (анализы, УЗИ,ФЛГ, рентген и т.п.)&nbsp;<br>
												<input type="checkbox" id="questionS21many_5"  value="из-за недостаточно квалифицированного медицинского персонала" >из-за недостаточно квалифицированного медицинского персонала&nbsp;<br>
												Другое (напишите)  &nbsp;<input type="text" class="length" id="questionS21many_6" >
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">22	Пациент, застрахованный по ОМС, имеет право получать бесплатную медицинскую помощь на всей территории РФ, в том числе за пределами постоянного места жительства. Приходилось ли вам пользоваться этим правом? (один ответ)</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS22" onclick="sslvalidlev()">
									      	<option value=""></option>
									        <option>Да, я получал(а) бесплатную медицинскую помощь на других территориях РФ по полису ОМС (к вопросу 24)</option>
									        <option>Пытался(лась), но мне было отказано в бесплатной медицинской помощи надругой территории РФ</option>
									        <option>Нет, не приходилось (к вопросу 24)</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv validquestS23" style="height: 130px;" >
										<div><p class="hv">23.	Почему вам отказали? (возможно несколько вариантов ответа)</p></div>
									    <div class="col-xs-4 " style="width: 800px;">
									      <table>
									      <tr>
											<td>
												<input type="checkbox" id="questionS23many_1"  value="В медицинской организации, в которой я хотел(а) лечиться, слишком многоприкрепленного населения" > В медицинской организации, в которой я хотел(а) лечиться, слишком многоприкрепленного населения&nbsp;<br>
												<input type="checkbox" id="questionS23many_2"  value="из-за отсутствия местной регистрации" >из-за отсутствия местной регистрации&nbsp;<br>
												Другое (напишите)  &nbsp;<input type="text" class="length" id="questionS23many_3" >
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">24.1	При последнем лечении/обследовании в стационаре приходилось ли вам использовать личные денежные средства на приобретение лекарственных средств и изделий медицинского назначения?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question24_1sec3">
									      	<option value=""></option>
									        <option>Да, часто</option>
									        <option>Да, иногда</option>
									        <option>Нет, не приходилось</option>
									        <option>Приходилось, с заключением договора о платном медицинском обслуживании</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">24.2	При последнем лечении/обследовании в стационаре приходилось ли вам использовать личные денежные средства на диагностическое обследование?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question24_2sec3">
									      	<option value=""></option>
									        <option>Да, часто</option>
									        <option>Да, иногда</option>
									        <option>Нет, не приходилось</option>
									        <option>Приходилось, с заключением договора о платном медицинском обслуживании</option>
									      </select>
									    </div><br><br>
									</div>
								    
								    <div  class="wrap-hv">
										<div><p class="hv">24.3	При последнем лечении/обследовании в стационаре приходилось ли вам использовать личные денежные средства на услуги медсестер, санитарок?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question24_3sec3">
									      	<option value=""></option>
									        <option>Да, часто</option>
									        <option>Да, иногда</option>
									        <option>Нет, не приходилось</option>
									        <option>Приходилось, с заключением договора о платном медицинском обслуживании</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">24.4	При последнем лечении/обследовании в стационаре приходилось ли вам использовать личные денежные средства на медицинские манипуляции/операции, включая услуги родовспоможения?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question24_4sec3">
									      	<option value=""></option>
									        <option>Да, часто</option>
									        <option>Да, иногда</option>
									        <option>Нет, не приходилось</option>
									        <option>Приходилось, с заключением договора о платном медицинском обслуживании</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv">
										<div><p class="hv">24.5	При последнем лечении/обследовании в стационаре приходилось ли вам использовать личные денежные средства на ...(напишите)?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="question24_5sec3">
									      	<option value=""></option>
									        <option>Да, часто</option>
									        <option>Да, иногда</option>
									        <option>Нет, не приходилось</option>
									        <option>Приходилось, с заключением договора о платном медицинском обслуживании</option>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv" style="height: 90px;">
										<div><p class="hv">25.	Какую сумму вы потратили? (напишите)</p></div>
									    <div class="col-xs-4">
									      <table>
									      <tr>
											<td>
												&nbsp;<input type="text" class="length" id="questionS25" > 
											</td>
										  </tr>
										  </table>
									    </div><br><br>
									 </div>   
									 
									 <div  class="wrap-hv">
											<div><p class="hv">26.	Случалось ли вам когда-нибудь благодарить медицинских работников замедицинскую помощь? (один ответ)</p></div>
										    <div class="col-xs-4">
										      <select class="form-control input-sm" id="questionS26" onclick="sslvalidlev()">
										      	<option value=""></option>
										        <option>Да, это происходит довольно часто</option>
										        <option>Да, иногда случается</option>
										        <option>Нет, никогда не приходилось (к вопросу 28)</option>
										      </select>
										    </div><br><br>
										 </div> 
										 
										 <div  class="wrap-hv sslvalid27">
											<div><p class="hv">27.	Кто выступал инициатором такой "благодарности"?</p></div>
										    <div class="col-xs-4">
										      <select class="form-control input-sm" id="questionS27">
										      	<option value=""></option>
										        <option>Я сам(а)</option>
										        <option>Медицинский работник</option>
										      </select>
										    </div><br><br>
										 </div>  
								    
								    	<div  class="wrap-hv">
											<div><p class="hv">28.	Укажите пол</p></div>
										    <div class="col-xs-4">
										      <select class="form-control input-sm" id="sexSls">
										      	<option value=""></option>
										        <option>Мужской</option>
										        <option>Женский</option>
										      </select>
										    </div><br><br>
										 </div>
										 
										 <div  class="wrap-hv">
										<div><p class="hv">29.	Возраст респондента (лет):</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="ageSls" onclick="testclic()">
									      	<option value=""></option>
									      	<c:forEach var="ag" items="${listage}">
									        <option>${ag.value}</option>
									        </c:forEach>
									      </select>
									    </div><br><br>
									</div>
									
									<div  class="wrap-hv del29">
										<div><p class="hv">30.	Ваше образование:</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS30">
									      	<option value=""></option>
									        <option>Неполное среднее</option>
									        <option>Среднее</option>
									        <option>Среднее специальное</option>
									        <option>Неполное высшее</option>
									        <option>Высшее, в т.ч. ученая степень</option>
									      </select>
									    </div><br><br>
									 </div> 
									 
									 <div  class="wrap-hv del29">
										<div><p class="hv">31.	Ваше социальное положение</p></div>
									    <div class="col-xs-4">
									    <table class="optdrtable">
									    <tr>
									        <td>
											    <select class="form-control input-sm optdrselect" id="questionS31">
											        <option value=""></option>
											        <option>Предприниматель</option>
											        <option>Руководитель</option>
											        <option>Служащий</option>
											        <option>итр, специалист</option>
											        <option>Научный работник, преподаватель, учитель</option>
											        <option>Рабочий</option>
											        <option>Пенсионер</option>
											        <option>Домохозяйка</option>
											        <option>Учащийся</option>
											        <option>Безработный</option>
											        <option>Другое (напишите)</option>
											      </select> &nbsp;
									      		<input type="text" class="optdrinput" id="questionS31dr"> 
											 </td>
										</tr>
										</table>	      
									    </div><br><br>
									    
									 </div> 
									 
									 <div  class="wrap-hv del29">
										<div><p class="hv">32.	Каков среднемесячный доход вашей семьи на одного человека?</p></div>
									    <div class="col-xs-4">
									      <select class="form-control input-sm" id="questionS32">
									      	<option value=""></option>
									        <option>Менее 10000 рублей</option>
									        <option>10 - 15000 рублей</option>
									        <option>15 - 20000 рублей</option>
									        <option>20 - 25000 рублей</option>
									        <option>25 - 30000 рублей</option>
									        <option>Свыше 30000 рублей</option>
									        <option>Затрудняюсь ответить</option>
									      </select>
									    </div><br><br>
									 </div>

								    
								</div>
								<input type="hidden" id="polzSecondlSls" value="${principal.username}"/>
								<input type="hidden" id="idSLS" value=""/>
								
								<div class="modal-footer">
								<div class="errorSLS" style="display:none; margin-bottom: 15px; color:red;"><h4>В анкете все поля обязательны.<br>Заполните все поля.</h4></div> 
								<button type="button" id="cancelSLS" class="btn btn-primary" data-dismiss="modal">Отмена</button>
									<button  class="btn btn-success renamebtnssl"  onclick='secondlevelsls("${principal.username}")'>Добавить анкету</button>
								</div>
							</div>
						</div>
					</div>
		</div>	
				
<!-- конец Добавить запись (модальное окно) -->  
  <script type="text/javascript">

  </script>
 <!--    <input onclick='responsiveVoice.speak("К представителям внесистемной оппозиции следует относиться как к предателям и врагам народа, считает Рамзан Кадыров. Своё мнение глава Чечни высказал на встрече с журналистами в Грозном в канун Дня российской печати.","Russian Female");' type='button' value='🔊 Play' /> --> 
<script src="${pageContext.request.contextPath}/resources/js/user/firstlevel.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/user/secondlevel.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/user/pressbtnfirslevel.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/user/pressbtnsecondlevel.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/user/other.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/user/reports.js"></script>
  
<!-- <script src="${pageContext.request.contextPath}/resources/js/annyang.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/user/recognaizervoice.js"></script>  
<script src="${pageContext.request.contextPath}/resources/js/ResponsiveVoice.js"></script> --> 
</body>

</html>
