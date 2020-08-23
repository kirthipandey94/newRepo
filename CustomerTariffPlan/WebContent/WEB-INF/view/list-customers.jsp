<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!Doctype html>
<html>
	<head>
		<title>ListCustomers</title>
		
		<!-- Reference to style sheet -->
		<link type="text/css" 
				rel="stylesheet"
				href="${pageContext.request.contextPath}/resources/css/style.css" />
	</head>
	
	<body>
	
		<div id="wrapper">
			<div id="header">
				<h2>CUSTOMER TARIFF PLAN DETAILS</h2>
			</div>
		</div>
		
		<div id="container">
			<div id="content">
			
			<!-- Button to save new customers -->
			<input type="button" value="Add Customer Tariff"
						onclick="window.location.href='showFormForAdd' ; return false" 
						class="add-button" />
			
			<!-- Table to display customer tariff details -->
				<table>
					<tr>
						<th>ID</th>
						<th>TARRIF_PLAN</th>
						<th>TARIFF_ID</th>
						<th>TARIFF_PRICE</th>
						<th>SORT_ORDER</th>
						<th>ACTION</th>
					</tr>
					
					<c:forEach var="tempCustomer" items="${customerTariff}">
					
					<!-- Update link with the customer ID -->
					<c:url var="updateLink" value="/controller/showFormForUpdate">
					<c:param name="id" value="${tempCustomer.id}" />
					</c:url>
					
					<!-- Delete link with Customer ID -->
					<c:url var="deleteLink" value="/controller/delete">
					<c:param name="id" value="${tempCustomer.id}" />
					</c:url>
					
						<tr>
							<td>${tempCustomer.id}</td>
							<td>${tempCustomer.tarrifPlan}</td>
							<td>${tempCustomer.tarrifId}</td>
							<td>${tempCustomer.tarrifPrice}</td>
							<td>${tempCustomer.sortOrder}</td>
							<td class="action">
								<a href="${updateLink}">Update</a>
								|
								<a href="${deleteLink}"
								onclick="if (!(confirm('Are you sure you want to delete this tariff plan?'))) return false">Delete</a>
							</td>
						</tr>
					</c:forEach>
					
				</table>
			</div>
		</div>
		
	</body>
	
</html>