package com.iv;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @org.junit.jupiter.api.Test
    void getValue() {
        House house = new House();

        house.setAddress("1276 OakDale drive");
        house.setCondition(1);
        house.setSquareFoot(1500);
        house.setLotSize(1000);

        double expected = house.getValue();

        //act
        double actual = 270250;

        // assert
        assertEquals(expected, actual);
    }

}