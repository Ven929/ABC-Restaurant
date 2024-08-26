<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login - ABC Restaurant</title>
    <link href="CSS/AdminLogin.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="login-box">
            <h1>Admin Login</h1>
            <form onsubmit="return validateLogin()">
                <div class="textbox">
                    <input type="text" name="username" id="username" placeholder="Username" required>
                </div>
                <div class="textbox">
                    <input type="password" name="password" id="password" placeholder="Password" required>
                </div>
                <input type="submit" class="btn" value="Login">
            </form>
            <p>Login as <strong>admin</strong> with password <strong>admin123</strong>.</p>
        </div>
    </div>

    <script>
        function validateLogin() {
            var username = document.getElementById("username").value;
            var password = document.getElementById("password").value;

            if (username === "admin" && password === "123") {
                window.location.href = "Home.jsp";
                return false; // Prevent form submission
            } else {
                alert("Invalid username or password!");
                return false;
            }
        }
    </script>
</body>
</html>
