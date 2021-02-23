<%@page import="com.bit.dept.model.DeptDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
	<thead>
		<tr>
			<th>deptno</th>
			<th>dname</th>
			<th>loc</th>
		</tr>
	</thead>
	<tbody>
	<%
	java.util.List<DeptDto> list;
	list=(java.util.List<DeptDto>)request.getAttribute("list");
	for(DeptDto bean:list){
	%>
		<tr>
			<td><%=bean.getDeptno() %></td>
			<td><%=bean.getDname() %></td>
			<td><%=bean.getLoc() %></td>
		</tr>
	<%
	}
	%>
	</tbody>
</table>
</body>
</html>






