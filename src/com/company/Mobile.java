package com.company;

public class Mobile {

    String name;
    double price =1500;
    double  qty =3;
    double total= price * qty;

    public Mobile() {

        System.out.println("Good Morning Wonderful People!");

    }
    public Mobile(String name){

       String nameofphone = this.name= name;
        System.out.println("I want a "+ " " + name);
    }
     public Mobile ( double price, double qty) {

       System.out.println("This price is"+ " "+ price+ " "+ "for one");
       System.out.println("How many do you want?" + " " + qty);
     }

     public static double sum(){
        double price= 1500 ;
        double qty = 3;
        double total = price * qty;
         System.out.println("Your total come out to"+ " "+ total);
        return total;
     }

     public static void main(String [] args){
        Mobile welcome = new Mobile();
        Mobile type = new Mobile("Iphone");
        Mobile amount = new Mobile(1500, 3);
        Mobile.sum();
     }
}
