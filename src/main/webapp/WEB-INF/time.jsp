<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Time</title>
</head>
<body>
	<h1><c:out value ="${currentTime }"></c:out></h1>
	<a href ="/">Home</a>
	<script type="text/javascript">document.getElementById("time").onclick = alert("This is the time template");</script>

</body>
</html>