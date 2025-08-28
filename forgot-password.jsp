<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forgot Password</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .forgot-password-container {
            background: #fff;
            padding: 20px 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            width: 300px;
            text-align: center;
        }

        .forgot-password-container h1 {
            margin-bottom: 20px;
            font-size: 1.8rem;
            color: #333;
        }

        .forgot-password-container input[type="email"],
        .forgot-password-container input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 1rem;
        }

        .forgot-password-container button {
            width: 100%;
            padding: 10px;
            background-color: #ff5722;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 1rem;
            cursor: pointer;
            margin-top: 10px;
        }

        .forgot-password-container button:hover {
            background-color: #e64a19;
        }

        .forgot-password-container .back-button {
            margin-top: 20px;
            background-color: #6c757d;
            width: 100%;
        }

        .forgot-password-container .back-button:hover {
            background-color: #565e64;
        }
    </style>
</head>
<body>
    <div class="forgot-password-container">
        <h1>Forgot Password</h1>
        <form action="password" method="post">
            <input type="email" name="email" placeholder="Enter your email" required>
            <input type="password" name="password" placeholder="Enter new password" required>
            <input type="password" name="confirmPassword" placeholder="Confirm new password" required>
            <button type="submit">Reset Password</button>
        </form>
        <button class="back-button" onclick="window.location.href='index.jsp'">Back</button>
    </div>
</body>
</html>
