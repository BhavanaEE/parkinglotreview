package com.everest.parkinglot;

import com.everest.vehicle.Car;
import com.everest.vehicle.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlotTest {
    Slot slot=new Slot();
    Vehicle vehicle=null;
    Vehicle typeOfVehicle(){
        vehicle=new Car("registrationNumber","color");
        return vehicle;
    }
    @Test
    void parkVehicleTest() {
        Vehicle vehicle1=typeOfVehicle();
        Vehicle actualVehicle=vehicle;
        assertEquals(vehicle1,actualVehicle);
    }

    @Test
    void unParkVehicleTest() {
        Vehicle actual=null;
        assertEquals(vehicle,actual);
    }

    @Test
    void isEmptyTest() {
        boolean isEmpty=slot.isEmpty();
        assertTrue(isEmpty);
    }
}