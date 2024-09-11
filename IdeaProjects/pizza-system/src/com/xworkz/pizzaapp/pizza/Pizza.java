package com.xworkz.pizzaapp.pizza;

public class Pizza {

        private int id;
        private String name;
        private double price;
        private String topping;
        private String size;

        @Override
        public String toString() {
            return "Pizza-(Id=" + this.id + "," + "Name=" + this.name + "," +
                    "Price="+this.price+")";
        }

        @Override
        public int hashCode(){
            return id;
        }

        @Override
        public boolean equals(Object obj) {
            Pizza pizza = (Pizza) obj;
            if(this.id == pizza.id)
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

        public void setTopping(String topping) {
            this.topping = topping;
        }

        public void setSize(String size) {
            this.size = size;
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

        public String getTopping() {
            return topping;
        }

        public String getSize() {
            return size;
        }
}



