<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>NeuroFleetX | AI-Driven Urban Mobility</title>
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

    /* Sign-in container */
    .signin-container {
      flex-grow: 1;
      display: flex;
      justify-content: center;
      align-items: center;
      padding: 20px;
    }

    .signin-box {
      background: rgba(255, 255, 255, 0.25);  /* light transparent */
      backdrop-filter: blur(12px);            /* frosted glass effect */
      -webkit-backdrop-filter: blur(12px);
      padding: 40px 30px;
      border-radius: 15px;
      box-shadow: 0 8px 25px rgba(0, 0, 0, 0.4);
      width: 100%;
      max-width: 380px;
      text-align: center;
      color: #ffffff;
      animation: fadeIn 1s ease-in-out;
    }

    .signin-box h2 {
      margin-bottom: 20px;
      font-size: 1.8rem;
      color: #ffdd57;
      text-shadow: 1px 1px 3px rgba(0,0,0,0.6);
    }

    .signin-box input {
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

    .signin-box input:focus {
      border: 1px solid #0078d7;
      box-shadow: 0 0 6px rgba(0, 120, 215, 0.6);
    }

    .signin-box button {
      width: 100%;
      padding: 12px;
      font-size: 1.1rem;
      border-radius: 6px;
      border: none;
      background: #0078d7;
      color: white;
      font-weight: bold;
      cursor: pointer;
      transition: background 0.3s;
    }

    .signin-box button:hover {
      background: #005fa3;
    }

    .signin-box p {
      margin-top: 15px;
      font-size: 0.9rem;
      color: #fff;
    }

    .signin-box p a {
      color: #ffdd57;
      text-decoration: none;
      font-weight: bold;
    }

    .signin-box p a:hover {
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

  <div class="signin-container">
    <div class="signin-box">
      <h2>Sign In</h2>
      <form action="login" method="post">
        <input type="text" name="username" placeholder="Enter Username" required>
        <input type="password" name="password" placeholder="Enter Password" required>
        <button type="submit">Login</button>
      </form>
      <p>Don't have an account? <a href="signup.jsp">Sign Up</a></p>
    </div>
  </div>

  <footer>
    <p>Explore more about <a href="https://infosysmysore.in/" target="_blank">Infosys</a>.</p>
  </footer>
</body>
</html>
