<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">

$(function(){
	$("#getjson").click(function(){
		$.ajax({
		

				url : "getJson",
				type : "POST",
				dataType : "json",

				success : function(data) {
					var html="<tr><th>ID</th>	<th>LastName</th><th>Email</th><th>Gender</th><th>DeptName</th>			</tr>";
					$("#tab").html(html);
					
					
					
					for( var i=0 ; i<data.length;i++){
						var emp=data[i];
						html +="<tr>";
						
						html +="<td>"+emp.id+"</td>";
						html +="<td>"+emp.lastName+"</td>";
						html +="<td>"+emp.emial+"</td>";
						html +="<td>"+emp.gender+"</td>";
						html +="<td>"+emp.department.departmentName+"</td>";
						
						
						html +="</tr>";
					}
					 $("#tab").html(html); 
				}

			});

			return false;

		});

	});
</script>


</head>
<body>




<a id="getjson" href="getJson">点击获取Jason</a>
<a href="getEmployee">点击获取Employee</a>



<div id="div1">
<table id="tab" border="1px">


</table>


</div>


</body>
</html>