package com.company;

public class Computer {
    String name;
    double qty;
    double price;
    double total=0;

    public static void welcome(){
        System.out.println("Hello everyone welcome to Best Buy");
    }

    public Computer(){
        String name = "Mac Pro";
        System.out.println("What are looking for todsy?"+ " "+ name);
    }

    public Computer(double price, double qty) {

        System.out.println("Mac Pro cost around"+ " "+ price);
        System.out.println("I will take " + " " +qty);
    }
    public static double sum(){
        double price = 2400;
        double qty = 2;
        double total = price * qty;
        System.out.println("Your total will be " + " "+ total);
        return total;
    }
    public static void main (String [] args){
        Computer.welcome();
        Computer brand = new Computer();
        Computer information = new Computer(2400, 2);
        Computer.sum();


    }
}




