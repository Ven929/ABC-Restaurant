<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View All Reservations</title>
    <link rel="stylesheet" href="./CSS/All.css"> <!-- Link to CSS file -->
</head>
<body>
    <header>
        <div class="header-content">
            <h1>View All Reservations</h1>
           
            <nav>
                <ul>
                    <li><a href="http://localhost:8090/Main/StaffDash.jsp">Back to Dashboard</a></li>
                </ul>
            </nav>
        </div>
    </header>

    <div class="container">
        <!-- Takeaway Reservations -->
        <section class="reservations-section">
            <h2>Takeaway Reservations</h2>
            <table>
                <thead>
                    <tr>
                        <th>User ID</th>
                        <th>Reservation Date</th>
                        <th>Contact</th>
                        <th>Reservation Time</th>
                        <th>Location</th>
                        <th>Table Type</th>
                        <th>Special Requests</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="user" items="${allUsers}">
                        <c:if test="${user.reservationType == 'Takeaway'}">
                            <tr>
                                <td>${user.id}</td>
                                <td>${user.reservationDate}</td>
                                <td>${user.contact}</td>
                                <td>${user.reservationTime}</td>
                                <td>${user.location}</td>
                                <td>${user.tableType}</td>
                                <td>${user.specialRequests}</td>
                            </tr>
                        </c:if>
                    </c:forEach>
                </tbody>
            </table>
        </section>

        <!-- Dine-in Reservations -->
        <section class="reservations-section">
            <h2>Dine-in Reservations</h2>
            <table>
                <thead>
                    <tr>
                        <th>User ID</th>
                        <th>Reservation Date</th>
                        <th>Contact</th>
                        <th>Reservation Time</th>
                        <th>Location</th>
                        <th>Table Type</th>
                        <th>Special Requests</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="user" items="${allUsers}">
                        <c:if test="${user.reservationType == 'Dine-in'}">
                            <tr>
                                <td>${user.id}</td>
                                <td>${user.reservationDate}</td>
                                <td>${user.contact}</td>
                                <td>${user.reservationTime}</td>
                                <td>${user.location}</td>
                                <td>${user.tableType}</td>
                                <td>${user.specialRequests}</td>
                            </tr>
                        </c:if>
                    </c:forEach>
                </tbody>
            </table>
        </section>
    </div>

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
