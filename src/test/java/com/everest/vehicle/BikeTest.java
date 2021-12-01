package com.everest.vehicle;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    Bike bike=new Bike("reg_no","color");
    @Test
    void getVehicleTypeTest() {
        String vehicle_type= bike.getVehicleType();
        assertEquals(vehicle_type,"BIKE");
    }

    @Test
    void getRegistrationNumberTest() {
        String registrationNumber=bike.getRegistrationNumber();
        assertEquals(registrationNumber,"reg_no");
    }

    @Test
    void getColorTest() {
        String color=bike.getColor();
        assertEquals(color,"color");
    }
}