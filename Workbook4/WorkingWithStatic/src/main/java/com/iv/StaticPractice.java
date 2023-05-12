package com.iv;

public class StaticPractice {
    public static void main(String[] args) {
        // Room, static variable and instance variable
        // numOfBeds, isClean
        // 5 instances rooms

        // RoomName, numOfBeds, isClean, (static)numOfHotelRooms

//        (static) numOfHotelRooms: 6
//        (static) roomsToClean: [ "room 101", "room 306", "PH4"]
//        (static method) markRoomToClean

        // Room 101, 3, false
        // Room 205, 2, true
        // Room 306, 1, false
        // Room 407, 2, true
        // Room PH1, 5, true
        // Room PH4, 7, false

        // Num of instance variable:

        Car car1 = new Car("Red");
        Car car2 = new Car("Blue");
        Car car3 = new Car("Periwinkle");
        Car car4 = new Car("Black");
    }
}
class Car{
    private String color;
    public static int numOfWheels = 4;

    public Car(String color){
        this.color = color;
    }
    public void customMethod(){
        System.out.println(this.color);
    }
}