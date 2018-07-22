<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>게시판 글쓰기</title>
</head>
<body>
<form action="Write" method="post">
<p><label>작성자 : <%=(String) session.getAttribute("Nick") %></label></p>
<input type="hidden" name="cNname" value="<%=(String) session.getAttribute("Nick")%>">
<p>제목<input type="text" name="cTitle" size="50"></p>
<p>내용 <textarea rows="30" cols="50" name="cContent"></textarea></p>
<input type="submit" value="등록">

</form>
</body>
</html>