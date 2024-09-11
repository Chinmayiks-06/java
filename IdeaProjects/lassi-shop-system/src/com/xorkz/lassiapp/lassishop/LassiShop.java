package com.xorkz.lassiapp.lassishop;

public class LassiShop {

        private int id;
        private String name;
        private double price;
        private String quantity;
        private String flavors;

        @Override
        public String toString() {
            return "LassiShop{" +
                    "id=" + this.id +
                    ", name=" + this.name +
                    ", price=" + this.price +
                    ", quantity=" + this.quantity +
                    ", flavors=" + this.flavors +
                    "}";
        }

        @Override
        public int hashCode(){
            return id;
        }

        @Override
        public boolean equals(Object obj) {
            LassiShop lassiShop = (LassiShop) obj;
            if (this.id == lassiShop.id)
                return true;

            return false;
        }

        public void setId(int id){
            this.id=id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public void setFlavors(String flavors) {
            this.flavors = flavors;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public String getQuantity() {
            return quantity;
        }

        public String getFlavors() {
            return flavors;
        }
    }
