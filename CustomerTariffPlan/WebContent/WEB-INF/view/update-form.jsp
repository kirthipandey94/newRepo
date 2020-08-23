<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!Doctype html>
<html>
	<head>
		<title>Save Customer Tariff Plan</title>
		
		<link type="text/css" 
				rel="stylesheet"
				href="${pageContext.request.contextPath}/resources/css/style.css" />
		
		<link type="text/css" 
				rel="stylesheet"
				href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />
	</head>
	<body>
		<div id="wrapper">
			<div id="header">
				<h2>Customer Tariff Plan</h2>
			</div>
		</div>
		
		<div id="container">
			<h3>Save Customer Tariff Plan</h3>
			<h6 style="color:#ff0000";>Alert!!! you can only update price values....!!!!</h6>
			<form:form action="saveCustomer" modelAttribute="customerTariff" method="POST">
			
			<!-- so that the form knows which id it is referring to -->
			<form:hidden path="id" />
			
				<table>
					<tbody>
						<tr>
							<td><label>Tarrif Plan:</label></td>
							<td class="cannotUpdate"><form:input style="background-color:#cccccc;" path="tarrifPlan" readOnly="true" /></td>
						</tr>
						<tr>
							<td><label>Tarrif Id:</label></td>
							<td><form:input style="background-color:#cccccc;" path="tarrifId" readOnly="true"/></td>
						</tr>
						<tr>
							<td><label>Tarrif Price:</label></td>
							<td><form:input  path="tarrifPrice" /></td>
						</tr>
						<tr>
							<td><label>Sort Order:</label></td>
							<td><form:input style="background-color:#cccccc;" path="sortOrder" readOnly="true"/></td>
						</tr>
						
						<tr>
							<td><label></label></td>
							<td><input type="submit" value="Save" class="save" /></td>
						</tr>
						
					</tbody>
				</table>
				
			</form:form>
			
			<div style="clear; both;"></div>
			<p><a href="${pageContext.request.contextPath}/controller/allcustomers">Back to List</a></p>
			
		</div>
		
		
	</body>
</html>