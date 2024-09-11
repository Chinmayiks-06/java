package com.xworkz.laptop;

import com.xworkz.laptop.laptop.Laptop;
import com.xworkz.laptop.motherBoard.MotherBoard;

public class LaptopRunner {

        public static void main(String arg[]) {
            Laptop laptop= new Laptop();
            laptop.price = 1000;

            MotherBoard motherBoard = new MotherBoard();
            motherBoard.brand="HP";
            motherBoard. modelName="HPLaptop";
            motherBoard. screenSize=15.6f;
            motherBoard.hardDiskSize=512;
            motherBoard. isSold=false;
            motherBoard.laptopIssueDate="13/06/2024";

            laptop.allow(motherBoard);
        }
    }

