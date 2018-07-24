<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script></script>
<title>게시글 보기</title>
</head>
<body>
	<table cellpading="0" cellspacing="0" border="1">
		<tr>
			<td colspan="2">글 번호 : ${contentview.cNum}</td>
		</tr>
		<tr>
			<td>작성자 : ${contentview.cNname }</td>
			<td><label>조회수 : </label>${contentview.cHit }</td>
		</tr>
		<tr>
			<td colspan="2"><label>제목 : </label>${contentview.cTitle}</td>
		</tr>
		<tr>
		<td colspan="2"><label>내용 : </label>${contentview.cContent}</td>
		</tr>
		
	</table>
	<br>
	<input type="button" name="goList" value="목록으로"
		onclick="javascript:window.location.href= 'board'"> &nbsp;&nbsp;&nbsp;
		<form action="modify" method="post">
		<input type="submit" name ="modify" value="수정" >
		<input type="hidden" name="cNum" value="${contentview.cNum}">
		</form>&nbsp;&nbsp;&nbsp;
		<form action="delete" method="post">
		<input type="submit" name="delete" value="삭제">
			<input type="hidden" name="cNum" value="${contentview.cNum}">
		</form>
</body>
</html>