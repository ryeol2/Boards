<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script language="javascript"src="${pageContext.request.contextPath}/resources/js/joinMember.js"charset="utf-8"></script>
<title>ȸ������</title>
</head>
<body>
<form action="join" method="post" name="join_frm">
<p>���̵� <input type="text"  name="cId" size ="20">&nbsp;&nbsp;<input type="button" value="�ߺ�Ȯ��" onclick="checkid()"></p>
<p>�̸� <input type="text" name="cName" size="20"></p>
<p>��й�ȣ <input type="password" name="cPwd" size="20"></p>

<p>�г��� <input type="text" name="cNname" size="20">&nbsp;&nbsp;<input type="button" value="�ߺ�Ȯ��"onclick=""></p>
<p>�̸��� <input type="text" name="cEmail" size="20">&nbsp;<select name="eMailaddress">
<option>�� ��</option>
<option value="@daum.net">@daum.net</option>
<option value="@naver.com">@naver.com</option>
<option value="@gmail.com">@gmail.com</option>
</select></p>
<input type="submit" value="����" >&nbsp;&nbsp;&nbsp;
<input type="reset" value="���ۼ�">
</form>

</body>
</html>