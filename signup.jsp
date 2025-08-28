<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>NeuroFleetX | Sign Up</title>
  <style>
    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background: url('https://miro.medium.com/1*JzWBiCRJsWsimUa0_FaClQ.jpeg') no-repeat center center fixed;
      background-size: cover;
      margin: 0;
      padding: 0;
      display: flex;
      flex-direction: column;
      min-height: 100vh;
      color: white;
    }

    header, footer {
      background-color: rgba(35, 47, 62, 0.9);
      padding: 15px 20px;
      display: flex;
      align-items: center;
      justify-content: space-between;
    }

    header .logo img {
      height: 50px;
    }

    header h1 {
      font-size: 1.4rem;
      margin: 0;
    }

    header nav a {
      color: white;
      margin-left: 15px;
      text-decoration: none;
      font-weight: bold;
      padding: 5px 10px;
      border-radius: 4px;
      transition: background 0.3s;
    }

    header nav a:hover {
      background: rgba(255, 255, 255, 0.2);
    }

    /* Signup container */
    .signup-container {
      flex-grow: 1;
      display: flex;
      justify-content: center;
      align-items: center;
      padding: 20px;
    }

    .signup-box {
      background: rgba(255, 255, 255, 0.25);
      backdrop-filter: blur(12px);
      -webkit-backdrop-filter: blur(12px);
      padding: 40px 30px;
      border-radius: 15px;
      box-shadow: 0 8px 25px rgba(0, 0, 0, 0.4);
      width: 100%;
      max-width: 400px;
      text-align: center;
      color: #ffffff;
      animation: fadeIn 1s ease-in-out;
    }

    .signup-box h2 {
      margin-bottom: 20px;
      font-size: 1.8rem;
      color: #ffdd57;
      text-shadow: 1px 1px 3px rgba(0,0,0,0.6);
    }

    .signup-box input {
      width: 100%;
      padding: 12px;
      margin: 10px 0;
      font-size: 1rem;
      border: none;
      border-radius: 6px;
      outline: none;
      background: rgba(255,255,255,0.8);
      color: #232f3e;
    }

    .signup-box input:focus {
      border: 1px solid #0078d7;
      box-shadow: 0 0 6px rgba(0, 120, 215, 0.6);
    }

    .signup-box button {
      width: 100%;
      padding: 12px;
      font-size: 1.1rem;
      border-radius: 6px;
      border: none;
      background: #28a745;
      color: white;
      font-weight: bold;
      cursor: pointer;
      transition: background 0.3s;
    }

    .signup-box button:hover {
      background: #218838;
    }

    .signup-box p {
      margin-top: 15px;
      font-size: 0.9rem;
      color: #fff;
    }

    .signup-box p a {
      color: #ffdd57;
      text-decoration: none;
      font-weight: bold;
    }

    .signup-box p a:hover {
      text-decoration: underline;
    }

    footer {
      justify-content: center;
      text-align: center;
      padding: 15px;
      font-size: 0.9rem;
    }

    footer a {
      color: #00aaff;
      text-decoration: none;
    }

    footer a:hover {
      text-decoration: underline;
    }

    @keyframes fadeIn {
      from { opacity: 0; transform: translateY(-20px); }
      to { opacity: 1; transform: translateY(0); }
    }
  </style>
</head>
<body>
  <header>
    <div class="logo">
      <img src="https://infosysmysore.in/wp-content/uploads/2020/03/Infosys-Mysore-Logo3.png.webp" alt="Infosys Mysore Logo">
    </div>
    <h1>NeuroFleetX – AI Urban Mobility</h1>
    <nav>
      <a href="index.jsp">Home</a>
    </nav>
  </header>

  <div class="signup-container">
    <div class="signup-box">
      <h2>Create Account</h2>
      <form action="register" method="post">
        <input type="text" name="fullname" placeholder="Full Name" required>
        <input type="email" name="email" placeholder="Email Address" required>
        <input type="text" name="username" placeholder="Choose Username" required>
        <input type="password" name="password" placeholder="Create Password" required>
        <input type="password" name="confirm_password" placeholder="Confirm Password" required>
        <button type="submit">Sign Up</button>
      </form>
      <p>Already have an account? <a href="signin.jsp">Sign In</a></p>
    </div>
  </div>

  <footer>
    <p>Explore more about <a href="https://infosysmysore.in/" target="_blank">Infosys</a>.</p>
  </footer>
</body>
</html>
