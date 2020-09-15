package com.company;

public class Car {

    String name;
    double qty;
    double price;
    double total;

    public Car(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public Car(){
        System.out.println("Hello Everyone, how can I help you?");
    }

    public Car(double price, int qty) {
        price = 45000;
        qty = 2;
        this.price = price;
        System.out.println("This is the price for a new car" + " " +this.price);
        this.qty = qty;
        System.out.println(this.qty+ " " + "Is how many you want?");

    }
    public static double sum(){
        double price= 45000;
        double qty = 2;
        double total = price * qty;
        System.out.println("Your total is "+ " " + total);
        return total;
    }

    public static void main(String[] arg) {
        Car type = new Car("New car");
        Car Greetings = new Car();
        Car amount = new Car(45000, 2);
        Car.sum();

    }


}

