package com.xworkz.app.servlet;

import com.xworkz.app.dto.AeroplaneDto;
import com.xworkz.app.service.AeroplaneService;
import com.xworkz.app.service.AeroplanesericeImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/register",loadOnStartup = -26)
public class AeroplaneServlet extends HttpServlet {
    public AeroplaneServlet(){
        System.out.println("object is created");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method is started");
        String userName=req.getParameter("name");
        String email=req.getParameter("email");
                String phoneNumber=req.getParameter("phone");
                String origin=req.getParameter("origin");
                String destination=req.getParameter("destination");
            String travelDate=req.getParameter("travelDate");
            String flightClass=req.getParameter("flightclass");
            String numOfPassengers=req.getParameter("numOfPassengers");

        AeroplaneDto aeroplaneDto=new AeroplaneDto();
        aeroplaneDto.setUserName(userName);
        aeroplaneDto.setEmail(email);
        aeroplaneDto.setPhoneNumber(Long.parseLong(phoneNumber));
        aeroplaneDto.setOrigin(origin);
        aeroplaneDto.setDestination(destination);
        aeroplaneDto.setDate(travelDate);
        aeroplaneDto.setFlightClass(flightClass);
        aeroplaneDto.setNumberOfPassengers(Integer.parseInt(numOfPassengers));

        AeroplaneService aeroplaneService=new AeroplanesericeImpl();
     aeroplaneService.validateAndbookingDetails(aeroplaneDto);

        PrintWriter printWriter=resp.getWriter();
printWriter.write("Registered Successfully");

        System.out.println("doPost method is ended");


    }
}
