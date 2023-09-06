<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" name="viewport" content="width=device-width">
<title>page3</title>
</head>
<body>page3
<input type="button" value="창닫기" onclick="ddd()">
</body>
<script>
	var fdata = sessionStorage.getItem("time");
	var times = window.location.search.split("?days=");
	console.log(times[1]);
	function ddd(){
		self.close();
	}

	if (fdata == null) {
		alert("비정상적 접근")
		history.go(-1);
	}else{
		if(fdata!=times[1]){
			alert("비정상적 접근2")
		}
		
	}

</script>
</html>