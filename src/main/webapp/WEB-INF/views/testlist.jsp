<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 리스트 출력</title>
</head>
<body>

 <table>
 	<thead>
 		<tr>
 			<th>번호</th>
 			<th>이름</th>
 			<th>제목</th>
 			<th>내용</th>
 			<th>조회수</th>
 			<th>작성일</th>
 		</tr>
 		
 	</thead>
 	
 	<tbody>
		<c:forEach items="${bList }" var="data"  >
 		<tr>
 			<td>${data.num}</td>
 			<td>${data.name}</td>
 			<td>${data.title}</td>
 			<td>${data.content}</td>
 			<td>${data.hit}</td>
 			<td>${data.writeDate}</td>
 		</tr>
 		</c:forEach>
 	</tbody>
 
 </table>

</body>
</html>