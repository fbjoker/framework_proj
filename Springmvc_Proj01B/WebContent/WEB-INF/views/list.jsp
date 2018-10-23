<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script >
$(function(){
	$(".del").click(function(){
		var confirm=window.confirm("是否删除");
		if(!confirm){
			return false;
		}
		
		 var href=this.href;
		$("form").attr("action",href).submit();
		
		
		return false;
		
	})
	
})


</script>


</head>
<body>
<form action=""  method="post">
<input  type="hidden" name="_method" value="DELETE">
</form>


<table align="center" border="1px" width="70%">
		<tr>
		<th>ID</th>
		<th>LastName</th>
		<th>Email</th>
		<th>Gender</th>
		<th>Department</th>
		<th>Edit</th>
		<th>Delete</th>
		</tr>
		<c:forEach items="${emps }" var="emp">
			<tr>
				<td>${emp.id }</td>
				<td>${emp.lastName }</td>
				<td>${emp.email }</td>
				<td>${emp.gender }</td>
				<td>${emp.department.departmentName }</td>
				<td><a  class="update" href="emp/${emp.id}"> Edit</a></td>
				<td><a class="del" href="emp/${emp.id}"> Delete</a></td>

			</tr>
		</c:forEach>

	</table>
	
	<span ><a href="${pageContext.request.contextPath }/emp"> 添加数据</a> </span>

</body>
</html>