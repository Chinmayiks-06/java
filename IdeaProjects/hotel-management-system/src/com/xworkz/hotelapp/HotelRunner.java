package com.xworkz.hotelapp;

import com.xworkz.hotelapp.hotel.Hotel;
import com.xworkz.hotelapp.rooms.Rooms;

public class HotelRunner {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();
        hotel.age = 21;

        Rooms rooms = new Rooms();
        rooms.bookingId = 001;
        rooms.guestName = "Manasa K M";
        rooms.roomType = "Single";
        rooms.numberOfNights = 3;
        rooms.price = 4000.00;
        hotel.allow(rooms);
    }
}




