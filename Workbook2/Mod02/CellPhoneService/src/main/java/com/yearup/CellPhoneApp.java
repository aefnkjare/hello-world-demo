package com.yearup;

import java.awt.*;

public class CellPhoneApp {
    public static void main(String[] args){
        CellPhone myPhone = new CellPhone(
                1836483,
                "Samsung Galaxy",
                "298984342972",
                "2941732943",
                "Isaiah");

        CellPhone yourPhone = new CellPhone();
        yourPhone.setSerialNumber(27247142);
        yourPhone.setModel("iPhone 14");
        yourPhone.setCarrier("Verizon");
        yourPhone.setPhoneNumber("704-129-7882");
        yourPhone.setOwner("Laura");

//        yourPhone.display();
//
////        myPhone.dial(yourPhone.getPhoneNumber());
////
////        myPhone.dial(yourPhone);
//
        display(myPhone);
        display(yourPhone);

        myPhone.dial(yourPhone);

    }
    public static void display(CellPhone cellPhone){
        cellPhone.display();
    }
public void overload(){}
static class CellPhone {
    // Properties
    private long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // Constructors

    public CellPhone(long serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public void dial(String phoneNumber2) {
        System.out.println(this.owner + "'s phone is calling " + phoneNumber2);
    }

    public void dial(CellPhone cellPhone){
       dial(cellPhone.getPhoneNumber());
    }
    public void display(){
        System.out.println("Serial Number: " + this.serialNumber);
        System.out.println("Model: " + this.model);
        System.out.println("Carrier: " + this.carrier);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("Owner: " + this.owner);
    }
    public CellPhone(){}
///////////////need help finishing the dial method////////////
//    public void dial() {
//        this.dial() = this.dial();
//    }


    // Getters and Setters


    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

}
////////////////

//class Animal {
//    // Property
//    private String name;
//    private int numOfLegs;
//
//    // Constructor
//    public Animal(String name, int numOfLegs){
//        this.name = name;
//        this.numOfLegs = numOfLegs;
//    }
//
//
//    // Getter and Setters
//    public String getName(){
//        return this.name;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public int getNumOfLegs(){
//        return this.numOfLegs;
//    }
//    public void setNumOfLegs(int numOfLegs) {
//        this.numOfLegs = numOfLegs;
//    }