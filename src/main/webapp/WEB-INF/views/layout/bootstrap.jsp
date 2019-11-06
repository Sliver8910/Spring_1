<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="${pageContext.request.contextPath}/">WebSiteName</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="${pageContext.request.contextPath}">Home</a></li>
				<li class=><a
					href="${pageContext.request.contextPath}/point/pointList.jsp">Point</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Page 1-1</a></li>
						<li><a href="#">Page 1-2</a></li>
						<li><a href="#">Page 1-3</a></li>
					</ul></li>
				<li><a
					href="${pageContext.request.contextPath}/notice/noticeList">Notice</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">

				<li><a
					href="${pageContext.request.contextPath}/member/memberMypage.jsp"><span
						class="glyphicon glyphicon-user"></span> My Page</a></li>
				<li><a
					href="${pageContext.request.contextPath}/member/memberLogout.jsp"><span
						class="glyphicon glyphicon-log-out"></span> Logout</a></li>

				<li><a
					href="${pageContext.request.contextPath}/member/memberJoin"><span
						class="glyphicon glyphicon-user"></span> Sign up</a></li>
				<li><a
					href="${pageContext.request.contextPath}/member/memberLogin"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>

			</ul>
		</div>
	</nav>



</body>
</html>