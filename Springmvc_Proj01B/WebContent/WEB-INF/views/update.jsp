<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- private String lastName;

	private String email;
	//1 male, 0 female
	private Integer gender;
	
	private Department department; -->

	<form:form action="${pageContext.request.contextPath }/emp" 	method="post"  modelAttribute="employee">
		LastName:<form:input path="lastName" />

		<br />
Email:<form:input path="email" />
		<br />
Gender:<form:radiobuttons path="gender" items="${genders }"/>
	<br />	
	
Department:<form:select path="department.id" items="${depts }"
			itemLabel="departmentName" itemValue="id">
			

		</form:select>
		<br />
		<input type="submit"  value="add">
	</form:form>

	
	
	

	
	
	<br><br><br><br>
	
	<hr/>
	
	
	<h1> 添加员工</h1>

<form action="${pageContext.request.contextPath }/emp1" method="post">
LastName:<input type="text" name="lastName" /> <br>
Email:<input type="text" name="email" /><br>
Gender:<input type="radio" name="gender" value="0">女
		<input type="radio" name="gender" value="1">男<br>
Department:<%-- <select name="department.id">
					<c:forEach items="${depts }" var="dept">
						<option value="${dept.id }">${dept.departmentName }</option>
					</c:forEach>
				 </select> --%>

<select name="department.id">
			<c:forEach items="${depts }" var="dept">
				<option value="${dept.id }">${dept.departmentName }</option>

			</c:forEach>



		</select><br>
		<input type="submit"  value="add">

	</form>

</body>
</html>