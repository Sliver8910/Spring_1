<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/servlet_3_jsp/css/notice_all.css" rel="stylesheet">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<c:import url="../layout/bootstrap.jsp" />
	<div class="container">
		<h2>Notice Update Page</h2>
		<form action="./noticeUpdate.notice" method="post">
		<input type="text" name = "num" value="${dto.num}" hidden="" readonly="readonly">
			<div class="form-group">
				<label for="title">Title : </label> <input type="text"
					class="form-control" id="title" value="${dto.title}" name="title">
			</div>
			<div class="form-group">
				<label for="writer">Writer : </label> <input type="text"
					class="form-control" id="writer" readonly="readonly" value="${dto.writer}" name="writer">
			</div>
			<div class="form-group">
				<label for="contents">Contents:</label>
				
				<textarea class="form-control" rows="30" id="contents"
					name="contents"  >${dto.contents}</textarea>
			</div>

			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>

</body>
</html>