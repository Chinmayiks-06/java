<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>NeuroFleetX | AI-Driven Urban Mobility</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background: url('https://images.unsplash.com/photo-1508051123996-69f8caf4891e?auto=format&fit=crop&w=1600&q=80') no-repeat center center fixed;
            background-size: cover;
            margin: 0;
            padding: 0;
            min-height: 100vh;
            display: flex;
            flex-direction: column;
        }

        /* HEADER */
        header {
            background-color: rgba(35, 47, 62, 0.95);
            color: white;
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 12px 20px;
            width: 100%;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.2);
        }

        header .logo img {
            height: 45px;
        }

        header h1 {
            margin: 0;
            font-size: 1.4rem;
            font-weight: bold;
            flex-grow: 1;
            text-align: center;
        }

        header nav {
            display: flex;
            gap: 15px;
        }

        header nav a {
            color: white;
            text-decoration: none;
            font-size: 0.95rem;
            font-weight: bold;
            padding: 6px 12px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        header nav a:hover {
            background-color: rgba(255, 255, 255, 0.2);
        }

        /* WELCOME SECTION */
        .welcome-container {
            text-align: center;
            margin: 30px auto 20px;
            color: #fff;
            max-width: 900px;
        }

        .welcome-container h1 {
            font-size: 2rem;
            text-shadow: 2px 2px 6px rgba(0,0,0,0.7);
            margin-bottom: 20px;
        }

        .welcome-container img {
            max-width: 100%;
            height: auto;
            max-height: 260px;
            border-radius: 12px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.3);
        }

        /* DASHBOARD */
        .dashboard {
            flex-grow: 1;
            padding: 20px;
            display: flex;
            justify-content: center;
        }

        .cards {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(180px, 1fr));
            gap: 20px;
            width: 100%;
            max-width: 1000px;
        }

        .card {
            background-color: rgba(255, 255, 255, 0.92);
            border-radius: 12px;
            padding: 20px;
            text-align: center;
            box-shadow: 0 4px 8px rgba(0,0,0,0.25);
            transition: transform 0.2s ease;
        }

        .card:hover {
            transform: translateY(-5px);
        }

        .card h3 {
            margin: 0 0 10px;
            font-size: 1.1rem;
            color: #232f3e;
        }

        .card p {
            font-size: 1.4rem;
            font-weight: bold;
            color: #0078d4;
        }

        /* FOOTER */
        footer {
            background-color: rgba(35, 47, 62, 0.95);
            color: white;
            text-align: center;
            padding: 12px 20px;
            width: 100%;
            box-shadow: 0 -4px 6px rgba(0, 0, 0, 0.2);
        }

        footer p {
            margin: 0;
            font-size: 0.95rem;
        }

        footer a {
            color: #00aaff;
            text-decoration: none;
            font-weight: bold;
        }

        footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <!-- HEADER -->
    <header>
        <div class="logo">
            <img src="https://infosysmysore.in/wp-content/uploads/2020/03/Infosys-Mysore-Logo3.png.webp" alt="Infosys Logo">
        </div>
        <h1>NeuroFleetX – AI Urban Mobility</h1>
        <nav>
            <a href="signin.jsp">Sign In</a>
            <a href="signup.jsp">Sign Up</a>
        </nav>
    </header>

    <!-- WELCOME SECTION -->
    <div class="welcome-container">
        <h1>Smarter Mobility for Smarter Cities 🚦</h1>
        <img src="https://img.freepik.com/premium-vector/smart-city-concept-modern-urban-technology_735449-11.jpg?w=900"
             alt="Urban Mobility Illustration">
    </div>

    <!-- DASHBOARD -->
    <div class="dashboard">
        <div class="cards">
            <div class="card">
                <h3>Total Vehicles</h3>
                <p>120</p>
            </div>
            <div class="card">
                <h3>Active Trips</h3>
                <p>45</p>
            </div>
            <div class="card">
                <h3>Fuel Efficiency</h3>
                <p>15 km/l</p>
            </div>
            <div class="card">
                <h3>AI Alerts</h3>
                <p>3</p>
            </div>
            <div class="card">
                <h3>Drivers</h3>
                <p>60</p>
            </div>
        </div>
    </div>

    <!-- FOOTER -->
    <footer>
        <p>Explore more about <a href="https://infosysmysore.in/" target="_blank">Infosys</a>. Learn and grow with the best resources available!</p>
    </footer>
</body>
</html>
