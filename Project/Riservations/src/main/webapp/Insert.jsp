<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Make Your Reservation.</title>
    <link rel="stylesheet" href="./CSS/InsertRiservations.css" />
</head>
<body>
    <h1>Make You Riservation..</h1>
    <div class="full">
        <form action="insert" method="post">
            <label for="reservationType">Reservation Type</label> <br />
            <select id="reservationType" name="reservationType" required>
                <option value="Takeaway">Takeaway</option>
                <option value="Dine-in">Dine-in</option>
            </select><br /><br />

            <label for="reservationDate">Reservation Date</label> <br />
            <input type="date" id="reservationDate" name="reservationDate" required /><br /><br />

            <label for="contact">Contact</label> <br />
            <input type="text" id="contact" name="contact" pattern="[0-9]{10}" required /><br /><br />

            <label for="reservationTime">Reservation Time</label> <br />
            <input type="time" id="reservationTime" name="reservationTime" required /><br /><br />

            <label for="location">Location</label> <br />
            <input type="text" id="location" name="location" required /><br /><br />

            <label for="tableType">Table Type</label> <br />
            <input type="text" id="tableType" name="tableType" required /><br /><br />

            <label for="specialRequests">Special Requests</label> <br />
            <textarea id="specialRequests" name="specialRequests"></textarea><br /><br />

            <button type="submit">Add</button>
        </form>
    </div>
    <br><br><br>
    <footer class="footer">
        <div class="footer-content">
            <p>&copy; 2023 Your Company Name. All rights reserved.</p>
            <ul class="footer-links">
                <li><a href="#">Privacy Policy</a></li>
                <li><a href="#">Terms of Service</a></li>
            </ul>
        </div>
    </footer>
</body>
</html>
