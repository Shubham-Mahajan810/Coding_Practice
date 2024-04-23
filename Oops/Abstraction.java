/**
 * Abstraction
 */

 // abstract class is not create the objeact but creat the refernce

abstract class Abstraction /*Vehical*/ {
 abstract void start();
 public static void main(String[] args) {
    Scotes ob1=new Scotes();
    ob1.start();
    Car ob=new Car();
    ob.start();
 }
}


class Car extends Abstraction/*Vehical*/{
    void start(){
        System.out.println("Start with key");
    }
}


class Scotes extends Abstraction/*Vehical*/{
    void start(){
        System.out.println("Start with kick ");
    }
    
}