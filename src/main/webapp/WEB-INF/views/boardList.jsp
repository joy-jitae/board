<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<script>
		window.addEventListener('load', function(){
            var result = new Array();
            <c:forEach var="item" items="${list}">
            var obj = new Object();
            obj.boardNo="item.board_no"
            result.push(obj);
            </c:forEach>

            alert(JSON.stringify(result));
		});

	</script>
	<title>Home</title>
</head>
<body>
	<h1>Board List</h1>
	<a href="/goBoardInsert.do">글쓰기</a>
	<table border="1">
	<thead>
	<tr>
		<th>NO</th>
		<th>제목</th>
		<th>내용</th>
		<th>작성자</th>
		<th>등록일</th>
		<th>수정일</th>
	</tr>
	</thead>
	<tbody>
		<c:forEach var="item" items="${list}">
		<tr>
			<td>${item.board_no}</td>
			<td>${item.title}</td>
			<td>${item.content}</td>
			<td>${item.writer}</td>
			<td>${item.register_date}</td>
			<td>${item.update_date}</td>
		</tr>
		</c:forEach>
	</tbody>
	</table>
</body>
</html>
