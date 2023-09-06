<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	var data1 = "${pname}";
	var data2 = "${pcode}";
	if (data1 == "" || data2 == "") {
		alert("올바른 접근방식 x");
		history.go(-1);
	}
</script>
</head>
<body>
상품명 : ${pname}<br> 
코드명 : ${pcode}
</body>
</html>