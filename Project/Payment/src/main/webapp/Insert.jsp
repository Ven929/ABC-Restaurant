<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Payment Information</title>
    <link href="./CSS/Inserting.css" rel="stylesheet">
</head>
<body>
    <header>
        <div class="header-content">
            <h1>Add Payment Information</h1>
        </div>
    </header>

    <div class="container">
        <form action="insert" method="post">
            <div class="form-group">
                <label for="payerName">Payer Name</label>
                <input type="text" id="payerName" name="payerName" required>
            </div>

            <div class="form-group">
                <label for="paymentType">Payment Type</label>
                <select id="paymentType" name="paymentType" required>
                    <option value="Credit">Credit</option>
                    <option value="Debit">Debit</option>
                    <option value="Cash">Cash</option>
                </select>
            </div>

            <div class="form-group">
                <label for="paymentMethod">Payment Method</label>
                <select id="paymentMethod" name="paymentMethod" required>
                    <option value="Card">Card</option>
                    <option value="Bank Transfer">Bank Transfer</option>
                    <option value="Cash">Cash</option>
                </select>
            </div>

            <div class="form-group">
                <label for="paymentAmount">Payment Amount</label>
                <input type="text" id="paymentAmount" name="paymentAmount" required>
            </div>

            <button type="submit" class="submit-btn">Submit Payment</button>
        </form>
    </div>
    <br></br><br></br>

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
