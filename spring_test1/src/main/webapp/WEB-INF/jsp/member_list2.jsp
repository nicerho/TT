
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page
	import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!-- 배열의 값이 null일 경우 jsp에서 해당 html코드를 비활성호 시키는 방ㅂ버 -->
<%	String aa = null;
try{
List<ArrayList<String>> member_data = (List<ArrayList<String>>) request.getAttribute("md");
int many = member_data.size();
aa="ok";
} catch(Exception e ){
aa = (String)request.getAttribute("md");
}
%>
<%if(aa!=null){%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고리페</title>
</head>
<body>
	
	<br>
	<br>
	<form id="f" method="get" action="spring6ok.do"
		onsubmit="return idsearch()">
		검색 : <input type="text" name="search"><input type="submit"
			value="거무색">
	</form>
</body>
<%} %>
<script>
	var word = "ㅇㅇㅇ ㅇㅇㅇ ㅇㅇㅇ ㅇㅇㅇ ㅇㅇㅇㅇ ㅇㅇ ㅇ ㅇ";
	var word2 = word.replaceAll(" ", "");
	/*
	 trim() : 문자열 맨 앞과 맨 뒤의 공백만 제거
	 replace(a,b) : 문자열 내에서 첫번쨰 a를 b로 치환 
	 replaceAll(a,b) : 문자열 내의 모든 a를 b로 치환
	
	 */
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