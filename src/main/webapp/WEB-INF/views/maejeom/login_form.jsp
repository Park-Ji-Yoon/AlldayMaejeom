<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���ϸ��� - �α���</title>
<link href="css/style_login.css" rel="stylesheet"/>
</head>
<body>
	<form method="post" action="login">
		<h3>�α���</h3>
		���̵� : <input type="text" name="userid"><br>
		��й�ȣ : <input type="password" name="passwd"><br>
		<button type="submit">Ȯ��</button>
	</form>
</body>
</html>