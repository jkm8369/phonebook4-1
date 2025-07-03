<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h1>주소록</h1>
		
		<h2>전화번호 리스트</h2>
		<p>전화번호 리스트 입니다.</p>
		
			
		
		<c:forEach items="${requestScope.personList}" var ="pList">
			<table border="1">
				<tbody>
					<tr>
						<td>이름(name)</td>
						<td>${pList.name}</td>
					<tr>
					<tr>
						<td>핸드폰(hp)</td>
						<td>${pList.hp}</td>
					<tr>
					<tr>
						<td>회사(company)</td>
						<td>${pList.company}</td>
					<tr>	
					<tr>
						<td>
							<a href="${pageContext.request.contextPath}/mform?no=${pList.personId}">
								[수정폼으로 이동]
							</a>		
						</td>
						<td>
							<a href="${pageContext.request.contextPath}/delete?no=${pList.personId}">
								[삭제] ${pList.personId}
							</a>
						</td>   <!-- 원래 버튼으로 해야된다 js필요 안배워서 a 태그로 구현 -->
					<tr>	
						
				</tbody>
			</table>  
			<br>
		</c:forEach>
		
		
		
		<a href="${pageContext.request.contextPath}/wform">등록폼 이동</a>
	
	</body>

</html>