<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css" rel="stylesheet">
	#header{}
	#header>h1{
		width: 149px;
		height: 33px;
		background-image: url("imgs/logo.png");
		text-indent: -999px;
	}
	#header>form{
		width: 500px;
		float: right;
	}
</style>
<script type="text/javascript">
var form;
window.onload=function(){
	form=document.querySelector('#header>form');
	form.onsubmit=function(){
		var id=document.querySelector('#id').value;
		var pw=document.querySelector('#pw').value;
		var xhr=new XMLHttpRequest();
		xhr.onreadystatechange=function(){
			var msg=xhr.responseText;
			if(xhr.readyState==4 && xhr.status==200){
				form.outerHTML='<div>'+msg+'</div>';
				var div=document.querySelector('#header>div');
				console.log(div.innerText,div,form);
				if(div.innerText=='로그인 실패'){
					div.outerHTML=form.outerHTML;
				}
			}
		};
		xhr.open('get','ex05.jsp?id='+id+'&pw='+pw);
		xhr.send();
		return false;
	};
};
</script>
</head>
<body>
	<div id="header">
		<h1>비트교육센터</h1>
		<form action="ex05.jsp">
			<label for="id">id</label>
			<input type="text" id="id" name="id" />
			<label for="pw">pw</label>
			<input type="text" id="pw" name="pw" />
			<button type="submit">로그인</button>
		</form>
	</div>
</body>
</html>




