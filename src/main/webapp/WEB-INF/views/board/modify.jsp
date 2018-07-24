<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>수정하기</title>
</head>
<body>
<form action="modified" method="post">
<table width="300" border="1">
<tr>
<td>글 번호 ${modifyView.cNum}</td>
<input type="hidden" name="cNum" value="${modifyView.cNum}">
</tr>
<tr>
<td>작성자 ${modifyView.cNname}</td>
<input type="hidden" name="cNname" value="${modifyView.cNname}">
</tr>

<tr>
<td>제목 <input type="text" name="cTitle" value="${modifyView.cTitle}"></td>
</tr>
<tr>
<td><textarea name="cContent" rows="30" cols="50" >${modifyView.cContent}</textarea></td>
</tr>
</table>
<input type="submit" value="수정하기">
</form>
</body>
</html>