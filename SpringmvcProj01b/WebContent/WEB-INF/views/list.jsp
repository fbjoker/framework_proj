<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
$(function(){
	
	$(".del").click(function(){
			var con= window.confirm("是否确实删除");
		if(!con){
			return false;
		}
		var href= this.href;
		
		$("form").attr("action",href).submit();
		
		
		
		
		
		return false;
		
	});
	
});



</script>

</head>
<body>
<form action="" method="post">
<input type="hidden" name="_method" value="DELETE">

</form>

<div style="align-content: center;">
<h1>显示所有员工</h1>
<table border="1px">
<tr>
<th>1</th>
<th>2</th>
<th>3</th>
<th>4</th>
<th>5</th>
<th>6</th>



</tr>



<c:forEach items="${emps }" var="emp">
	<tr>
	<td>${emp.id }</td>
	<td>${emp.lastName }</td>
	<td>${emp.email }</td>
	<td>${emp.gender==0?"女":"男" }</td>
	<td>${emp.department.departmentName }</td>
	
	<td><a href="emp/${emp.id }"> EDIT</a></td>
	<td><a class="del" href="emp/${emp.id }"> DELETE</a></td>
	
	</tr>



</c:forEach>

</table>

<a href="emp">添加员工</a>


</div>
</body>
</html>