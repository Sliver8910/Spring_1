<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="../layout/bootstrap.jsp" />
	<div class="container">
		<h2>Notice Insert Page</h2>
		<form action="./noticeWrite" method="post"> 
			<div class="form-group">
				<label for="title">Title : </label> <input type="text"
					class="form-control" id="title" name="title">
			</div>
			<div class="form-group">
				<label for="writer">Writer : </label> <input type="text"
					class="form-control" id="writer" name="writer">
			</div>
			<div class="form-group">
				<label for="contents">Contents:</label>
				<textarea class="form-control" rows="30" id="contents"
					name="contents"></textarea>
			</div>


			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>
</body>
</html>