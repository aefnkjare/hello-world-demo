package com.yearup;

public class CellPhoneApp {
    public static void main(String[] args){

    }
}

class CellPhone {
    //Properties
    private long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // Constructors

    public CellPhone(long serialNumber,String model,String carrier,String phoneNumber, String owner){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    // Getters and Setters
    public long getSerialNumber(){
        return this.serialNumber;
    }
    public void setSerialNumber(long serialNumber){
        this.serialNumber = serialNumber;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getCarrier(){
        return this.carrier;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getOwner(){
        return this.owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
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