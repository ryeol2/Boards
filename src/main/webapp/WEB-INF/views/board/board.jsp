<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script language="javascript"src="${pageContext.request.contextPath}/resources/js/board.js"charset="utf-8"></script>
<title>�Խ���</title>
</head>
<body>
<p><%= session.getAttribute("Nick") %>�� �ȳ��ϼ���.^^&nbsp;&nbsp; <a href="logout">�α׾ƿ�</a></p>
<form action="write" method="post" name="frm_board">
<input type="hidden" name="cNname" value=" <%= session.getAttribute("Ncik") %>">

<table width="1350" cellpading="0" cellspacing="0" border="1">
<tr>
<td width="5" align="center">�۹�ȣ</td>
<td width="200" align="center">����</td>
<td width="50" align="center">�ۼ���</td>
<td width="25" align="center">��ȸ��</td>
</tr>
<c:forEach items="${blist }" var="board">
<tr>
<td align="center">${board.cNum}</td>
<td><a href="contentView?cNum=${board.cNum}">${board.cTitle }</a></td>
<td align="center"> ${board.cNname }</td>
<td align="center"> ${board.cHit}</td>
</tr>
</c:forEach>

</table>
<br>
<p><span style="float:right"><input type="button" value="�۾���" onclick="boardWrite()"></span></p>
</form>
</body>
</html>