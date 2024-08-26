<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Staff Dashboard - ABC Restaurant</title>
    <link href="./CSS/StaffDashboard.css" rel="stylesheet">
</head>
<body>
    <!-- Header Section -->
    <header>
        <div class="logo">
            <h1>ABC Restaurant</h1>
        </div>
        <nav>
            <ul>
                <li><a href="StaffDash.jsp">Dashboard</a></li>
                <li><a href="Home.jsp">Home</a></li>
                <li><a href="Logout.jsp">Logout</a></li>
            </ul>
        </nav>
    </header>

    <!-- Staff Dashboard Section -->
    <div class="dashboard">
        <h2>Welcome to the Staff Dashboard</h2>
        <div class="nav-buttons">
            <a href="http://localhost:8090/Riservations/Home.jsp" class="nav-btn">View Reservations</a>
            <a href="http://localhost:8090/Queries/Home.jsp" class="nav-btn">Respond to Queries</a>
            <a href="http://localhost:8090/Payment/Home.jsp" class="nav-btn">Manage Payments</a>
        </div>
    </div>
<br></br><br></br><br></br><br></br><br></br><br></br>
    <!-- Footer Section -->
    <footer>
        <p>&copy; 2024 ABC Restaurant. All rights reserved.</p>
        <p>Contact us: info@abcrestaurant.lk | +94 77 123 4567</p>
    </footer>
</body>
</html>
