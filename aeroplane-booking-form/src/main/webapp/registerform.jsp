<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Flight Booking Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to bottom, #1e90ff, #87ceeb);
            color: #333;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }
        .form-container {
            background: #fff;
            padding: 20px 40px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
            width: 90%;
            max-width: 400px;
        }
        .form-container h2 {
            text-align: center;
            color: #1e90ff;
            margin-bottom: 20px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }
        .form-group input, .form-group select {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }
        .form-group input:focus, .form-group select:focus {
            border-color: #1e90ff;
            outline: none;
        }
        .submit-btn, .cancel-btn {
            width: 100%;
            padding: 10px;
            font-size: 18px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background 0.3s ease;
            margin-top: 10px;
        }
        .submit-btn {
            background: #1e90ff;
            color: #fff;
        }
        .submit-btn:hover {
            background: #1c86ee;
        }
        .cancel-btn {
            background: #ff4d4d;
            color: #fff;
        }
        .cancel-btn:hover {
            background: #ff1a1a;
        }
        .form-container p {
            text-align: center;
            margin-top: 10px;
            font-size: 14px;
            color: #777;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Flight Booking Form</h2>
        <form action="register" method="post">
            <!-- Passenger Details -->
            <div class="form-group">
                <label for="full-name">Full Name</label>
                <input type="text" id="full-name" name="name" placeholder="Enter your full name" required>
            </div>
            <div class="form-group">
                <label for="email">Email Address</label>
                <input type="email" id="email" name="email" placeholder="Enter your email" required>
            </div>
            <div class="form-group">
                <label for="phone">Phone Number</label>
                <input type="tel" id="phone" name="phone" placeholder="Enter your phone number" required>
            </div>

            <!-- Flight Details -->
            <div class="form-group">
                <label for="origin">Origin</label>
                <input type="text" id="origin" name="origin" placeholder="Enter departure city or airport" required>
            </div>
            <div class="form-group">
                <label for="destination">Destination</label>
                <input type="text" id="destination" name="destination" placeholder="Enter destination city or airport" required>
            </div>
            <div class="form-group">
                <label for="travel-date">Travel Date</label>
                <input type="date" id="travel-date" name="travelDate" required>
            </div>
            <div class="form-group">
                <label for="flight-class">Flight Class</label>
                <select id="flight-class" name="flightclass" required>
                    <option value="" disabled selected>Select class</option>
                    <option value="Economy">Economy</option>
                    <option value="Business">Business</option>
                    <option value="First">First</option>
                </select>
            </div>

            <!-- Additional Options -->
            <div class="form-group">
                <label for="number-of-passengers">Number of Passengers</label>
                <input type="number" id="number-of-passengers" name="numOfPassengers" min="1" max="10" value="1" required>
            </div>

            <button type="submit" class="submit-btn">Book Flight</button>
            <button type="button" class="cancel-btn">Cancel Flight</button>
        </form>
        <p>All fields are required</p>
    </div>
</body>
</html>
