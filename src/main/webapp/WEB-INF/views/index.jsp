<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Index</title>
<link href="css/style_index.css" rel="stylesheet" />
</head>
<body>
	<jsp:include page="include/menu.jsp"></jsp:include>
	<!-- �ӽ� �� ��ũ (���߿� �������) -->
	<a href="/login_form">�α��� �� �̵�</a>
	<br>
	<a href="/signup_form">ȸ������ �� �̵�</a>
	<br>
	
</body>
</html>