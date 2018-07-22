<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script language="javascript"src="${pageContext.request.contextPath}/resources/js/joinMember.js"charset="utf-8"></script>
<title>회원가입</title>
</head>
<body>
<form action="join" method="post" name="join_frm">
<p>아이디 <input type="text"  name="cId" size ="20">&nbsp;&nbsp;<input type="button" value="중복확인" onclick="checkid()"></p>
<p>이름 <input type="text" name="cName" size="20"></p>
<p>비밀번호 <input type="password" name="cPwd" size="20"></p>

<p>닉네임 <input type="text" name="cNname" size="20">&nbsp;&nbsp;<input type="button" value="중복확인"onclick=""></p>
<p>이메일 <input type="text" name="cEmail" size="20">&nbsp;<select name="eMailaddress">
<option>선 택</option>
<option value="@daum.net">@daum.net</option>
<option value="@naver.com">@naver.com</option>
<option value="@gmail.com">@gmail.com</option>
</select></p>
<input type="submit" value="가입" >&nbsp;&nbsp;&nbsp;
<input type="reset" value="재작성">
</form>

</body>
</html>