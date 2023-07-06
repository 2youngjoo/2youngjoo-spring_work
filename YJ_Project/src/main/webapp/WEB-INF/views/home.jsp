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

</style>
</head>
<body>
	<div class="container">
		<c:choose>
			<c:when test="${empty sessionScope.id }">
				<a href="${pageContext.request.contextPath }/users/loginform">로그인</a>
				<a href="${pageContext.request.contextPath }/users/signup_form">회원가입</a>
			</c:when>
			<c:otherwise>
				<p>
					<a href="${pageContext.request.contextPath }/users/info">${id }</a> 로그인중...
					<a href="${pageContext.request.contextPath }/users/logout">로그아웃</a>
				</p>
			</c:otherwise>
		</c:choose>
		
		<h1>JenaPalette</h1>
		<h2>저희 브랜드를 찾아 주셔서 감사합니다.</h2>
		<ul>
			<li><a href="${pageContext.request.contextPath }/image/list">상품 목록 보기</a></li>
		</ul>
	</div>
</body>
</html>

