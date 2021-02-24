<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>empno</th>
			<th>ename</th>
			<th>nalja</th>
			<th>pay</th>
			<th>deptno</th>
		</tr>
		<c:forEach items="${list }" var="bean">
		<tr>
			<td>${bean.empno }</td>
			<td>${bean.ename }</td>
			<td>${bean.nalja }</td>
			<td>${bean.pay }</td>
			<td>${bean.deptno }</td>
		</tr>
		</c:forEach>		
	</table>
</body>
</html>