package com.company;


public class Pizza {

    String name;
    double qty;
    double price;
    double total = 0;

    public Pizza(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public Pizza(){
        System.out.println("Hello Everyone, how can I help you?");
    }

    public Pizza(double price, int qty) {
        price = 20.99;
        qty = 10;
        this.price = price;
        System.out.println("This is the price for a large pizza" + " " +this.price);
        this.qty = qty;
        System.out.println(this.qty+ " " + "Is how many you want?");

    }
    public static double total(){
        double price= 20.99;
        double qty = 3;
        double total = price * qty;
        System.out.println("Your total is "+ " " + total);
        return total;
    }

    public static void main(String[] arg) {
        Pizza obj = new Pizza("Pizza HUt");
        Pizza pj = new Pizza();
        Pizza pq = new Pizza(20.99, 10);
        Pizza.total();

    }


}
