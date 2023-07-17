<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/file/upload_form.jsp</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<h3>파일 업로드 폼 입니다.</h3>
		<form action="upload" method="post">
			<div class="mb-2">
				<label class="control-label" for="title">제목</label>
				<input class="form-control" type="text" name="title" id="title"/>
			</div>
			<div class="mb-2">
				<label class="control-label" for="myFile">첨부파일</label>
				<input class="form-control" type="file" name="myFile" id="myFile"/>
			</div>
			<button type="submit">업로드</button>
		</form>
	</div>
</body>
</html>