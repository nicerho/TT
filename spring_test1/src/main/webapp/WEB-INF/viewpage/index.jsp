<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>test</title>
</head>
<header>
<%@ include file="./top.jsp" %>
</header>
<body>
<%=request.getAttribute("name") %><br>

고객명 : ${name}
</body>
</html>