<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/guest/updateform.jsp</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1>방명록 수정 폼 입니다.</h1>
		<form action="${pageContext.request.contextPath }/guest/update" method="post">
			<div class="mb-3">
				<label class="form-label" for="num">번호</label>
				<input class="form-control" type="text" name="num" value="${dto.num }">
			</div>
			<div class="mb-3">
				<label class="form-label" for="writer">작성자</label>
				<input class="form-control" type="text" name="writer" id="writer" value="${dto.writer }">
			</div>
			<div class="mb-3">
				<label class="form-label" for="content">내용</label>
				<textarea class="form-control" name="content" placeholder="내용 입력..." id="content" cols="30" rows="10"></textarea>
			</div>
			<div class="mb-3">
				<label class="form-label" for="pwd">비밀번호</label>
				<input class="form-control" type="password" name="pwd" id="pwd" placeholder="비밀번호 입력...">
			</div>
			<button type="submit">수정확인</button>
			<button type="submit">취소</button>
		</form>
	</div>	
</body>
</html>

