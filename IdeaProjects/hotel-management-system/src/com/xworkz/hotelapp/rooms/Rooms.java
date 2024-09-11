package com.xworkz.hotelapp.rooms;

public class Rooms {

        public int bookingId;
        public String guestName;
        public String roomType;
        public int numberOfNights;
        public double price;

        public void roomsDetails() {
            System.out.println("The Room Booking Id is:" + this.bookingId);
            System.out.println("The Name of the Guests is:" + this.guestName);
            System.out.println("Type of the room is:" + this.roomType);
            System.out.println("Number of nights:" + this.numberOfNights);
            System.out.println("Price of the room is:" + this.price);
        }
    }

