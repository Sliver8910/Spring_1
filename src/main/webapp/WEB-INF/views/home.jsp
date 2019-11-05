<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Home</title>
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
	<c:import url="./layout/bootstrap.jsp" />
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
	<a href="./test">Go Test</a>
	<a href="./notice/noticeList">NoticeList</a>
	<img alt="" src="./resources/images/131131.jpg">
</body>
</html>
