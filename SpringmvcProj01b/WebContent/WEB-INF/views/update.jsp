<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:if test="${empty employee.id }" var="flag">
<h1>添加员工</h1>
</c:if>
<c:if test="${!flag}" >
<h1>修改员工</h1>


</c:if>

<form:form action="${pageContext.request.contextPath }/emp" method="post" modelAttribute="employee">
<c:if test="${!flag }">
			<form:hidden path="id"/>
			<input type="hidden" name="_method" value="PUT"/>
		</c:if>

		<%-- <c:if test="${!flag}">
			<input type="hidden" name="id" value="${employee.id }">
			<form:hidden path="id" />
			<input type="hidden" name="_method" value="PUT" />
		</c:if> --%>
姓名:<form:input path="lastName"/>
<br>
邮箱:<form:input path="email" />
<br>
性别:<form:radiobuttons path="gender" items="${genders}"  />
<br>
部门:<form:select path="department.id" items="${depts }" itemLabel="departmentName" itemValue="id" >


</form:select>

<br>
<c:if test="${flag }">
<input type="submit" value="添加">
</c:if>
<c:if test="${!flag }">
<input type="submit" value="修改">
</c:if>

</form:form>





</body>
</html>