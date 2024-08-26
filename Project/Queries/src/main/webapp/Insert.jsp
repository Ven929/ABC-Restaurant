<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Edit Query Details</title>
    <link rel="stylesheet" href="./CSS/Inserting.css" />
   
  </head>
  <body>
         <header>
        <div class="header-content">
           <h1>Add New Quires</h1>
        </div>
    </header> 
      
    
    <div class="full">
      <form action="insert" method="post">
    
    <label for="queryCategory">Query Category</label> <br />
        <select id="queryCategory" name="queryCategory" required>
          <option value="service">Service</option>
          <option value="food">Food</option>
          <option value="reservations">Reservations</option>
        </select><br /><br />

        <label for="queryText">Query Text</label> <br />
        <textarea id="queryText" name="queryText" required></textarea><br /><br />

        <label for="submittedAt">Submitted At</label> <br />
        <input type="Time" id="submittedAt" name="submittedAt" required /><br /><br />

      
    
    
    <button type="submit">Add </button>
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
