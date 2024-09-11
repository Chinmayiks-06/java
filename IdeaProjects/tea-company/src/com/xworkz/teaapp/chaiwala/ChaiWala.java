package com.xworkz.teaapp.chaiwala;

public class ChaiWala {

    private int id;
    private String chaiName;
    private double price;
    private String qauntity;

    @Override
    public String toString() {
        return "ChaiWala{" +
                "id=" + this.id +
                ", chaiName=" + this.chaiName +
                ", price=" + this.price +
                ", qauntity=" + this.qauntity +
                "}";
    }

    @Override
    public int hashCode(){
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        ChaiWala chaiWala = (ChaiWala) obj;
        if (this.id == chaiWala.id)
            return true;

        return false;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setChaiName(String chaiName) {
        this.chaiName = chaiName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQauntity(String qauntity) {
        this.qauntity = qauntity;
    }

    public int getId() {
        return id;
    }

    public String getChaiName() {
        return chaiName;
    }

    public double getPrice() {
        return price;
    }

    public String getQauntity() {
        return qauntity;
    }
}
