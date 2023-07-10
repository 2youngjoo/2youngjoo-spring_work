<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/home.jsp</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" />
<style>
	body {
	  background-image: url("${pageContext.request.contextPath }/resources/image/발레사진.jpeg");
	  background-size: cover;
	  background-repeat: no-repeat;
	  background-position: center 5%;
	  
	}	
</style>
</head>
<body>
	<div class="container">
		<div class="d-flex justify-content-end">
			<c:choose>
			<c:when test="${empty sessionScope.id }">
				<a href="${pageContext.request.contextPath }/users/loginform">로그인</a>/
				<a href="${pageContext.request.contextPath }/users/signup_form">회원가입</a>
			</c:when>
			<c:otherwise>
				<p>
					<a href="${pageContext.request.contextPath }/users/info">${id }</a> 로그인중...
					<a href="${pageContext.request.contextPath }/users/logout">로그아웃</a>
				</p>
			</c:otherwise>
		</c:choose>
		</div>
		
		<h1>JenaPalette</h1>
		<h2>저희 브랜드를 찾아 주셔서 감사합니다.</h2>
		<br />
		<h3>각 상품 목록</h3>
		<ul>
			<li><a href="${pageContext.request.contextPath }/image/list">여성용</a></li>
			<li><a href="${pageContext.request.contextPath }/image2/list">유아용</a></li>			
		</ul>
	</div>
</body>
</html>

