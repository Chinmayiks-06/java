package com.xworkz.laptop.motherBoard;

public class MotherBoard {
        public  String brand;
        public String modelName;
        public float screenSize;
        public int hardDiskSize;
        public  long price;
        public  boolean isSold;
        public  String laptopIssueDate;

        public void displayDetails(){
            System.out.println("Brand : "+this.brand);
            System.out.println("ModelName : "+this.modelName);
            System.out.println("ScreenSize : "+this.screenSize);
            System.out.println("HardDiskSize : "+this.hardDiskSize);
            System.out.println("Is product delivered : "+this.isSold );
            System.out.println("Laptop Issue Date : "+this.laptopIssueDate);

        }
    }

