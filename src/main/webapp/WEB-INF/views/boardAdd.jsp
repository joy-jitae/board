<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<script src="http://code.jquery.com/jquery-latest.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title>Home</title>
<script>
	// $(document).ready(function () {
	// 	$("btnSave").click(function () {
	// 		document.form1.submit();
    //     })
    // })
	function test(){
	    debugger;
        document.form1.submit();
	}
</script>
</head>
<body>
	<h1>Board List</h1>
	<table border="1">
		<form name="form1" action="/insertBoardInfo.do">
			<tr>
				제목
			</tr>
			<td>
				<input name="title" width="100px">
			</td>
			<tr>
				작성자
			</tr>
			<td>
				<input name="writer" width="100px">
			</td>
			<tr>
				내용
			</tr>
			<td>
				<<input name="content" type="text" width="1000px" >
			</td>

			<div>
				<button type="button" id="btnSave" onclick="javascript:test();">확인</button>
			</div>
		</form>
	</table>
</body>
</html>
