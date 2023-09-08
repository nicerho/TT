<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
List<ArrayList<String>> product_data = (List<ArrayList<String>>) request.getAttribute("pd");
int many = product_data.size();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="f" method="get" action="product_list.do">
		<table border="1">
			<thead>
				<tr>
					<th width="10%">번호</th>
					<th width="20%">상품코드</th>
					<th width="40%">상품명</th>
					<th width="20%">상품가격</th>
					<th width="10%">수정</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (int x = 0; x < many; x++) {
				%>
				<tr align="center">
					<td><%=product_data.get(x).get(0)%></td>
					<td><%=product_data.get(x).get(1)%></td>
					<td><%=product_data.get(x).get(2)%></td>
					<td><%=product_data.get(x).get(3)%></td>
					<td></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</form>
</body>
</html>