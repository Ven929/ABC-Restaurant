<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Staff Login - ABC Restaurant</title>
    <link href="./CSS/StaffLogin.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="login-box">
            <h1>Staff Login</h1>
            <form onsubmit="return validateLogin()">
                <div class="textbox">
                    <input type="text" name="username" id="username" placeholder="Username" required>
                </div>
                <div class="textbox">
                    <input type="password" name="password" id="password" placeholder="Password" required>
                </div>
                <input type="submit" class="btn" value="Login">
            </form>
            <p>Login as <strong>staff</strong> with password <strong>123</strong>.</p>
        </div>
    </div>

    <script>
        function validateLogin() {
            var username = document.getElementById("username").value;
            var password = document.getElementById("password").value;

            if (username === "staff" && password === "123") {
                window.location.href = "http://localhost:8090/Main/StaffDash.jsp";
                return false; // Prevent form submission
            } else {
                alert("Invalid username or password!");
                return false;
            }
        }
    </script>
</body>
</html>
