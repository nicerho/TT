<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
List<String> list = (ArrayList<String>)request.getAttribute("person_list");

%>
<!-- Controller Attribute 사용시  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>고객명 리스트
	<p>
	<ul>
	<%
	int x = 0;
	while(x<list.size()){
		out.print("<li>"+list.get(x)+"</li>");
		x++;
	}
	%>
	</ul>
</body>
</html>