<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page session="false"%>
<!doctype html>
<html lang="ru">
<head>
<meta charset="utf-8">
<title>Вход</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
</head>

<body onload='document.f.j_username.focus();'>

	<div class="container">
	
	
		<form class="form-signin" name='f' action="<c:url value='j_spring_security_check' />" method='POST'>
			
			
				 <h3 class="form-signin-heading" >  <i class="fa fa-user text-primary">  Вход в систему</i></h3>
	        		<input type="text" class="form-control"  name="j_username"  placeholder="Логин">
	        		<input type="password" name="j_password" class="form-control" placeholder="Пароль">
	       		<br> 
	        		<button class="btn btn-group-sm btn-primary btn-block" id="enterLogin" name="submit" type="submit"><i class="fa fa-sign-in""></i> Вход</button>
				
				<c:if test="${not empty error}">
					<div class="alert alert-danger" style="width: 285px; margin: 0px auto;  margin-top:5px;" role="alert">
						${error}</div>
				</c:if>
			
		</form>
		
		
	
	</div> <!-- /container -->
</body>
</html>
