<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>




<!DOCTYPE html>
<html>
<head>
    <title>Register - ABC Restaurant</title>
    <link rel="stylesheet" type="text/css" href="./CSS/RegisterUser.css">
</head>
<body>

    <!-- Header Section -->
    <header>
        <div class="logo">
            <h1>ABC Restaurant</h1>
        </div>
        <nav>
            <ul>
                <li><a href="Home.jsp">Home</a></li>
                <li><a href="Gallery.jsp">Gallery</a></li>
                <li><a href="Register.jsp">Register</a></li>
                <li><a href="Contact.jsp">Contact</a></li>
            </ul>
        </nav>
    </header>

    <!-- Registration Form Section -->
    <section id="register">
        <h2>Create Your Account</h2>
        <form action="insert" method="post">
            <label for="username">Username</label>
            <input type="text" id="username" name="uid" required>

            <label for="email">Email</label>
            <input type="email" id="email" name="email" required>

            <label for="password">Password</label>
            <input type="password" id="password" name="psw" required>

            

            <button type="submit">Register</button>
        </form>
        <p>Already have an account? <a href="Login.jsp">Login here</a>.</p>
    </section>

    <!-- Footer Section -->
    <footer>
        <p>&copy; 2024 ABC Restaurant. All rights reserved.</p>
        <p>Contact us: info@abcrestaurant.lk | +94 77 123 4567</p>
    </footer>

</body>
</html>

