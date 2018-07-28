<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script language="javascript"src="${pageContext.request.contextPath}/resources/js/board.js"charset="utf-8"></script>
<title>게시판</title>
</head>
<body>
<p><%= session.getAttribute("Nick") %>님 안녕하세요.^^&nbsp;&nbsp; <a href="logout">로그아웃</a></p>
<form action="write" method="post" name="frm_board">
<input type="hidden" name="cNname" value=" <%= session.getAttribute("Ncik") %>">

<table width="1350" cellpading="0" cellspacing="0" border="1">
<tr>
<td width="5" align="center">글번호</td>
<td width="200" align="center">제목</td>
<td width="50" align="center">작성자</td>
<td width="25" align="center">조회수</td>
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
<div class="box-footer">
<div class="text-center">
<c:if test ="${pageMaker.prev}">
<a href="board${pageMaker.makeSearch(pageMaker.startPage -1)}">이전</a>
</c:if>
<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var = "idx">
<a href="board${pageMaker.makeSearch(idx)}">${idx}</a>
</c:forEach>
<c:if test="${pageMaker.next && pageMaker.prev}">
<a href="board${pageMaker.makeSearch(pageMaker.endPage+1) }">다음</a>
</c:if>
</div>
</div>
</form>
<br>
<form action="board" method="get">
<select class="form-control"name="searchType" >
<option value="n" <c:out value="${searchCriteria.searchType == null ? 'selected' :' ' }"/>>선택 </option>
<option value="title" <c:out value="${searchCriteria.searchType eq 'title' ? 'selected' : ' ' }"/>>제목</option>
<option value="content" <c:out value="${searchCriteria.searchType eq 'content' ? 'selected' : ' ' }"/>>내용</option>
<option value="cNname" <c:out value="${searchCriteria.searchType eq 'cNname' ? 'selected' : ' ' }"/>>작성자</option>
</select>
<input type="text" name="keyword" id="KeywordInput" value = "${searchType.keyword}" placeholder="검색어">
<input type="submit"  value="검색">
</form>
<p><span style="float:right"><input type="button" value="글쓰기" onclick="boardWrite()"></span></p>
</body>
</html>