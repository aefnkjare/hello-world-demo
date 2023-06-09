package com.iv;

import com.iv.amenities.Amenity;
import com.iv.amenities.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Hotel {
    private String name;
    private ArrayList<Amenity> amenities;
    private ArrayList<Floor> floors;
    public Hotel(){
        this.floors = new ArrayList<>();
        this.amenities = new ArrayList<>(
                Arrays.asList(new Restaurant("Default"))
        );
    }
    public void addFloor(){
        this.floors.add(new Floor());
    }
    public ArrayList<Floor> getFloor(){
        return this.floors;
    }
}
