<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" name="viewport" content="width=device-width">
<title>page2</title>
</head>
<body>
	<input type="button" value="click" onclick="abc()">
</body>
<script>
	var data = "";
	var today = "";
	function t(){
		today = Date.now();
		data = sessionStorage.setItem("time", today);
		console.log(today);
	}
	t();
	function abc() {
		window.open("./index3.jsp?=day"+today,"","");
		location.href = "./login.html"
		
	}
</script>
</html>