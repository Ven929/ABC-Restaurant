<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reservation Home - ABC Restaurant</title>
    <link rel="stylesheet" type="text/css" href="./CSS/RiservationHom.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">

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

    <!-- Reservation Information Section -->
    <div class="reservation-info">
        <h2>Exclusive Offers and Discounts</h2>
        <p>Enjoy up to 20% off on all dine-in reservations made this month. Special offers for group bookings!</p>

        <h2>Rates and Availability</h2>
        <p>Check out our competitive rates for dine-in and takeaway options. Book your table in advance to ensure availability.</p>

        <!-- Gallery Section -->
        <h2>Our Facilities</h2>

        <!-- Search Option -->
        <div class="search-container">
            <input type="text" id="search-bar" placeholder="Search facilities..." onkeyup="filterGallery()">
        </div>

        <div class="gallery">
                        <div class="gallery-item">
                <img src="./CSS/3.jpg" alt="Dining Area">
                <p>Cozy Dining Area</p>
                <div class="rating">
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star-half-alt"></i>
                    <i class="fa fa-star-o"></i>
                </div>
            </div>

            <div class="gallery-item">
                <img src="./CSS/4.jpg" alt="Outdoor Seating">
                <p>Outdoor Seating</p>
 <div class="rating">
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star-half-alt"></i>
                    <i class="fa fa-star-o"></i>
                </div>
            </div>
            <div class="gallery-item">
                <img src="./CSS/2.jpg" alt="Special Event Setup">
                <p>Special Event Setup</p>
                <div class="rating">
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star-half-alt"></i>
                    <i class="fa fa-star-o"></i>
                </div>
            </div>
            <div class="gallery-item">
                <img src="./CSS/3.jpg" alt="Discounts">
                <p>Exclusive Discounts</p>
                 <div class="rating">
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star-half-alt"></i>
                    <i class="fa fa-star-o"></i>
                </div>
            </div>
            <div class="gallery-item">
                <img src="./CSS/4.jpg" alt="Group Booking Offers">
                <p>Group Booking Offers</p>
               <div class="rating">
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star"></i>
                    <i class="fa fa-star-half-alt"></i>
                    <i class="fa fa-star-o"></i>
                </div>
            </div>
        </div>

        <button class="reservation-btn" onclick="location.href='http://localhost:8090/Riservations/Insert.jsp'">Make a Reservation</button>
    
        <button class="reservation-btn" onclick="location.href='http://localhost:8090/Queries/Insert.jsp'">Submit Your Queries</button>
    </div>

    <!-- Footer Section -->
    <footer>
        <p>&copy; 2024 ABC Restaurant. All rights reserved.</p>
        <p>Contact us: info@abcrestaurant.lk | +94 77 123 4567</p>
    </footer>

    <script>
        function filterGallery() {
            const searchValue = document.getElementById('search-bar').value.toLowerCase();
            const galleryItems = document.querySelectorAll('.gallery-item');

            galleryItems.forEach(item => {
                const text = item.querySelector('p').textContent.toLowerCase();
                if (text.includes(searchValue)) {
                    item.style.display = 'block';
                } else {
                    item.style.display = 'none';
                }
            });
        }
    </script>
</body>
</html>
    