<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.net.URLDecoder"%>
<html>
<head>
<style>
body {
	background: url("img/01.jpg") repeat fixed center;
}
.shallow{
	width: 400px;
	height: 250px;
	padding: 5px 2px;
	background-color: rgba(255, 255, 255, 0.1);
}
.deep{
	width: 400px;
	height: 250px;
	padding: 5px 2px;
	background-color: rgba(255, 255, 255, 0.5);
}
.changetrue{
	display: inline-block;
	height: 50px;
	width: 205;
	background-color: rgba(0, 0, 0, 0.5);
	padding-top:5px;
}
.changefalse{
	display: inline-block;
	height: 50px;
	width: 195;
	background-color: rgba(0, 0, 0, 0.2);
}
</style>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById("id").focus();
	}
	function $(id) {
		return document.getElementById(id);
	}
	function slogincheck() {
		if (form.ID.value == "") {
			alert("学号不能为空，请输入用户名！");
			form.ID.focus();
			return false;
		} else if (form.identify.value == "") {
			alert("身份证号不能为空，请输入用户名！");
			form.identify.focus();
			return false;
		} else if (form.name.value == "") {
			alert("名字不能为空，请输入用户名！");
			form.name.focus();
			return false;
		} else {
			$("login").action = "s_loginServlet";
		}
		return true;
	}
	function tlogincheck() {
		if (form.username.value == "") {
			alert("用户名不能为空，请输入用户名！");
			form.id.focus();
			return false;
		} else if (form.password.value == "") {
			alert("名字不能为空，请输入用户名！");
			form.name1.focus();
			return false;
		} else {
			$("login").action = "t_loginServlet";
		}
	}
	function changediv(i) {
		if (i === 0) {
			$("small").classList.remove("changetrue");
			$("small").classList.add("changefalse");
			$("big").classList.remove("changefalse");
			$("big").classList.add("changetrue");
			$("student").style.display = "block";
			$("t_student").style.display = "block";
			$("teacher").style.display = "none";
			$("t_teacher").style.display = "none";
		} else {
			$("big").classList.remove("changetrue");
			$("big").classList.add("changefalse");
			$("small").classList.remove("changefalse");
			$("small").classList.add("changetrue");
			$("student").style.display = "none";
			$("t_student").style.display = "none";
			$("teacher").style.display = "block";
			$("t_teacher").style.display = "block";
		}
	}
	function changedeep(){
		$("main").classList.remove("shallow");
		$("main").classList.add("deep");
	}
	function changeshallow(){
		$("main").classList.remove("deep");
		$("main").classList.add("shallow");
	}
	
</script>
<meta charset="utf-8">
<title>学生登录</title>
</head>
<body style="padding-top: 160px;">
	<center>
		<!-- <input type="button" name="sel" onclick="changediv(0)" value="学生登录" />
		&nbsp;&nbsp; <input type="button" name="adm" onclick="changediv(1)"
			value="教师登录" /> -->
			<div class="changetrue" id="big" onmouseover="changediv(0)"><center><h3>学生登录</h3></center></div>
			<div class="changefalse" id="small" onmouseover="changediv(1)"><center><h3>教师登录</h3></center></div>
	<div id="main" class="shallow" onmouseover="changedeep()" onmouseout="changeshallow()">
		<form action="s_loginServlet" method="post" name="form" id="login">
			<center>
				<div style="display: block;" id="t_student">
					<h1>学生登录</h1>
				</div>
				<div style="display: none;" id="t_teacher">
					<h1>教师登录</h1>
				</div>
				<div style="display: block;" id="student">
					 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学号: <input
						type="text" id="ID" name="ID" autocomplete="off" /><br /> <br />
					身份证号: <input type="text" name="identify" id="identify"
						autocomplete="off" /><br /> <br />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;姓名:<input
						type="text" name="name" id="name" autocomplete="off" /><br /> <br />
					<input type="submit" value="登录" onclick="return slogincheck()" />
				</div>
				<div style="display: none;" id="teacher">
					 用户名: <input type="text" id="username" name="username"
						autocomplete="off" /><br /> <br /> &nbsp;&nbsp;&nbsp;&nbsp;密码: <input
						type="text" name="password" id="password" autocomplete="off" /><br />
					<br /><br /><br /> <input type="submit" value="登录"
						onclick="return tlogincheck()"/><br />
				</div>
			</center>
		</form>
	</div>
	</center>
</body>
</html>