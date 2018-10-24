<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Person list</title>
</head>
<body>
	<c:forEach items="${personList}" var="p">
		
			<div class="spittleMessage">
				<c:out value="${p.lastName}" />
			</div>
			<div>
				<span class="spittleTime"><c:out value="${p.age}" /></span>
				<span class="spittleLocation"> (<c:out
						value="${p.address}" />, <c:out
						value="${p.salary}" />)
				</span>
			</div>
		
	</c:forEach>
</body>
</html>