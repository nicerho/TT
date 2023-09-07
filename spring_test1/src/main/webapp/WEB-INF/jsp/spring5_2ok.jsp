<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="app" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<app:set var="delete" value="${person_delete} "></app:set>
	<p>고객 리스트
	<p>
	<p>탈퇴 인원 수 : ${delete}
	<p>
		<!-- 
			:set var 변수명을 생성해서 값을 받는 형태
			:forEach 배열 반속시킬 때 사용
			:if 조건문생성 조건은 test="" 로 정의
			varStatus : 순차번호, 배열의 첫번재 값, 마지막 값 , 갯수 
		 -->
		<app:set var="ea" value="${fn:length(person_list)}"></app:set>
	<p>가입자수 : ${ea}명
	<p>
	<ul>
		<app:forEach var="username" items="${person_list}" varStatus="st">
			<app:if test="${username!='ㅇㅅㅅ'}">
				<li>번호 : ${person_ea} 이름 : ${username}</li>
				<app:set var="person_ea" value="${ea-1} "></app:set>
			</app:if>
		</app:forEach>
		<!-- for문  -->
		<app:forEach var="w" begin="1" end="5" step="1" >
		${w}
		</app:forEach>
		
	</ul>
</body>
</html>