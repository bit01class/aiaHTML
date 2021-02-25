<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="../js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(function(){
		body.hide().show(3000);
	});
</script>
<title>Insert title here</title>
</head>
<body>
<%@ include file="/template/menu.jspf" %>
	<h2>DEPT TABLE</h2>
	<table>
		<thead>
			<tr>
				<th>deptno</th>
				<th>dname</th>
				<th>loc</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list }" var="bean">
			<tr>
				<td>${bean.deptno }</td>
				<td>${bean.dname }</td>
				<td>${bean.loc }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
<%@ include file="/template/footer.jspf" %>
</body>
</html>








