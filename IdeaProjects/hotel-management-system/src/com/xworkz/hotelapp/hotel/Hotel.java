package com.xworkz.hotelapp.hotel;

import com.xworkz.hotelapp.rooms.Rooms;

public class Hotel {
    public Rooms rooms;

    public int age;

    public boolean allow(Rooms rooms) {
        boolean isAllowed = false;
        if (age >= 20) {
            System.out.println("Age is within the allowed range..Book the Room");

            if (rooms != null) {
                this.rooms = rooms;
                this.rooms.roomsDetails();
                isAllowed = true;
                System.out.println("Room is issued..");

            } else System.out.println("Room Not Found");

        } else System.out.println("Age is not within the range");
        return isAllowed;
    }
}
