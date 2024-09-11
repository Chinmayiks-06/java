package com.xworkz.asianpaintsapp.asianpaints;

public class AsianPaints {

        private int id;
        private String color;
        private String type;
        private double price;
        private String quantity;

        @Override
        public String toString() {
            return "AsianPaints{" +
                    "id=" + this.id +
                    ", color=" + this.color +
                    ", type=" + this.type +
                    ", price=" + this.price +
                    ", quantity=" + this.quantity +
                    "}";
        }

        @Override
        public int hashCode(){
            return id;
        }

        @Override
        public boolean equals(Object obj) {
            //down String
            AsianPaints asianPaints = (AsianPaints) obj;
            if (this.id == asianPaints.id)
                return true;

            return false;
        }

        public void setId(int id){
            this.id=id;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public int getId() {
            return id;
        }

        public String getColor() {
            return color;
        }

        public String getType() {
            return type;
        }

        public double getPrice() {
            return price;
        }

        public String getQuantity() {
            return quantity;
        }
}
