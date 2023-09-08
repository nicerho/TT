
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page
	import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String aa = null;

List<ArrayList<String>> member_data = (List<ArrayList<String>>) request.getAttribute("md");
int many = member_data.size();
int total = (int)request.getAttribute("total"); // 전체 가입자 수
String part = (String) request.getAttribute("part");
String selected = null;

if (part != null &&part.equals("tel")) {
	selected = "selected";
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고리페</title>
</head>
<body>
	<p>
		회원가입 고객리스트 가입자수 :
		<%=total%>명
	</p>
	<table border="1" width="1000">
		<thead>
			<tr>
				<th width="5%">번호</th>
				<th width="20%">아이디</th>
				<th width="30%">이메일</th>
				<th width="20%">연락처</th>
				<th width="5%">나이</th>
				<th width="20%">가입일자</th>
			</tr>
		</thead>
		<tbody>
			<%
			if (member_data.get(0).get(1) == "null") {
			%>
			<tr align="center">
				<td colspan="6">내용찾기 불가</td>
			</tr>
			<%
			} else {
			for (int x = 0; x < many; x++) {
			%>
			<tr align="center">
				<td><%=total%></td>
				<td><%=member_data.get(x).get(1)%></td>
				<td><%=member_data.get(x).get(2)%></td>
				<td><%=member_data.get(x).get(3)%></td>
				<td><%=member_data.get(x).get(4)%></td>
				<td><%=member_data.get(x).get(5).substring(0, 10)%></td>
			</tr>
			<%
			}
			}
			%>

		</tbody>
	</table>
	<br>
	<br>
	<form id="f" method="get" action="spring6ok.do"
		onsubmit="return idsearch()">
		검색 : <select name="part">
			<option selected value="id">아이디</option>
			<option value="tel" <%=selected%>>연락처</option>
		</select> <input type="text" name="search"><input type="submit"
			value="거무색"> <input type="button" value="전체목록"
			onclick="ccc()">
	</form>
</body>
<script>
	var wd = window.location.search;
	var sh = wd.split("&search=");
	if (wd != "") {
		f.search.value = sh[1];
	} else {
		f.search.value = "";
	}

	function ccc() {

		location.href = "spring6ok.do";
		f.search.value = "";
	}
	function idsearch() {
		f.search.value = f.search.value.replaceAll(" ", "");
		if (f.search.value == "") {
			alert("error");
			return false;
		} else {
			return;
		}
	}
</script>
</html>