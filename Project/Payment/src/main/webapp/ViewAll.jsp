<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View All Payment Details</title>
    <link rel="stylesheet" href="./CSS/All.css" />
</head>
<body>
    <header>
        <div class="header-content">
            <h1>All Payment Records</h1>
           <nav>
                <ul>
                    <li><a href="http://localhost:8090/Main/StaffDash.jsp">Back to Dashboard</a></li>
                </ul>
            </nav>
        </div>
    </header>

    <div class="container">
        <table class="styled-table">
            <thead>
                <tr>
                    <th>User ID</th>
                    <th>Payer Name</th>
                    <th>Payment Type</th>
                    <th>Payment Method</th>
                    <th>Payment Amount</th>
                   
                </tr>
            </thead>
            <tbody>
                <c:forEach var="user" items="${userList}">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.payerName}</td>
                        <td>${user.paymentType}</td>
                        <td>${user.paymentMethod}</td>
                        <td>${user.paymentAmount}</td>
                        <td>
                            <div class="action-buttons">
                                <form action="http://localhost:8090/Inventory/Update.jsp" method="post" style="display:inline;">
                                    <input type="hidden" name="id" value="${user.id}" />
                                    <input type="hidden" name="payerName" value="${user.payerName}" />
                                    <input type="hidden" name="paymentType" value="${user.paymentType}" />
                                    <input type="hidden" name="paymentMethod" value="${user.paymentMethod}" />
                                    <input type="hidden" name="paymentAmount" value="${user.paymentAmount}" />
                                   
                                </form>
                                <form action="http://localhost:8090/Inventory/Delete.jsp" method="post" style="display:inline;">
                                    <input type="hidden" name="id" value="${user.id}" />
                                    <input type="hidden" name="payerName" value="${user.payerName}" />
                                    <input type="hidden" name="paymentType" value="${user.paymentType}" />
                                    <input type="hidden" name="paymentMethod" value="${user.paymentMethod}" />
                                    <input type="hidden" name="paymentAmount" value="${user.paymentAmount}" />
                                    
                                </form>
                            </div>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
<br></br><br></br><br></br><br></br>
    <footer class="footer">
        <div class="footer-content">
            <p>&copy; 2024 ABC Restaurant. All rights reserved.</p>
            <ul class="footer-links">
                <li><a href="#">Privacy Policy</a></li>
                <li><a href="#">Terms of Service</a></li>
            </ul>
        </div>
    </footer>
</body>
</html>
