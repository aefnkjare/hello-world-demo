package com.iv;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
    public float getPrice() {
        String lcRoomType = this.roomType.toLowerCase();

        float roomPrice;
        if(lcRoomType.equals("king")){
            roomPrice = 139.00f;
        } else if (lcRoomType.equals("double")){
            roomPrice = 124.00f;
        } else {
            roomPrice = 139.00f;
        }


        if (this.isWeekend){
            return roomPrice * 1.1f;
        }else {
            return roomPrice;
        }
    }

    public float getReservationTotal() {
        float pricePerNight = this.getPrice();
        return pricePerNight * this.numberOfNights;
    }

}
