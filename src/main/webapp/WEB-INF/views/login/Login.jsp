<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�α���â</title>
<script language="javascript"src="${pageContext.request.contextPath}/resources/js/javascript_login.js"charset="utf-8"></script>
</head>
<body>
	<form action="login_member" method="post" name="frm_login">
		<p>
			<input type="text" name="cId" size="20" placeholder="���̵�">
		</p>
		<p>
			<input type="password" name="cPwd" size="20" placeholder="��й�ȣ">
		</p>

		<input type="submit" value="�α���">&nbsp;&nbsp;&nbsp;
		<input type="button" value="ȸ������"  onclick="javascript:window.location.href='wantJoin'">

	</form>

</body>
</html>