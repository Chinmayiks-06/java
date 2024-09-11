package com.xworkz.laptop.laptop;

import com.xworkz.laptop.motherBoard.MotherBoard;

public class Laptop {
        public MotherBoard motherBoard;
        public long price;

        public boolean allow(MotherBoard motherBoard) {
            boolean isAllow = false;
            System.out.println("allow is started");
            if (price==100) {
                System.out.println("amount paid");
            }
            if (motherBoard!= null) {
                this.motherBoard=motherBoard;
                this.motherBoard.displayDetails();
                isAllow = true;
                System.out.println("U can By ur Laptop");
            } else
                System.out.println("EMI is not allow");

            System.out.println("allow is ended");
            return isAllow;
        }
    }

