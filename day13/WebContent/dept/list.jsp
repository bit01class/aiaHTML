<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body>div{
		margin: 0px auto;
		padding: 0px;
	}
	#header{
		
	}
	#header>h1{
		background-image: url("../imgs/logo.png");
		background-repeat: no-repeat;
		text-indent: -999px;
	}
	#menu{
		overflow: hidden;
		background-color: gray;
	}
	#menu>ul{
		padding: 0px;
		width: 440px;
		list-style: none;
		margin: 0px auto;
	}
	#menu>ul>li{
		width: 100px;
		float: left;
		border-top: 2px solid darkgray;
		border-bottom: 2px solid darkgray;
		margin: 0px 5px;
	}
	#menu>ul>li>a{
		display: block;
		height: 30px;
		line-height: 30px;
		text-align: center;
		text-decoration: none;
		color:white;
	}
</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>


<script type="text/javascript">
 $(document).ready(function(){
 });   
    
</script>
</head>
<body>
<div>
	<div id="header">
		<h1>비트교육센터</h1>
	</div>
	<div id="menu">
		<ul>
			<li><a href="../">HOME</a></li>
			<li><a href="./list.html">DEPT</a></li>
			<li><a href="../emp/list.html">EMP</a></li>
			<li><a href="../login/login.html">LOGIN</a></li>
		</ul>
	</div>
	<div id="content">
		<h2>dept list</h2>
		<table>
			<thead>
				<tr>
					<th>deptno</th>
					<th>dname</th>
					<th>loc</th>
				</tr>
			</thead>
			<tbody>
			<%@ page import="java.util.*,com.bit.model.DeptDto" %>
			<%
				List<DeptDto> list=null;
				list=(List<DeptDto>)request.getAttribute("alist");
				for(DeptDto bean: list){
			%>
				<tr>
					<td><%=bean.getDeptno() %></td>
					<td><%=bean.getDname() %></td>
					<td><%=bean.getLoc() %></td>
				</tr>
			<%} %>
			</tbody>
		</table>
	</div>
	<div id="footer">
		Copyright &copy; 비트캠프 All rights reserved.
	</div>
</div>


</body>
</html>
