package com.everest.displaystrategy;

import com.everest.display.Display;
import com.everest.parkinglot.ParkingLot;
import com.everest.parkinglot.Slot;
import com.everest.vehicle.Bike;
import com.everest.vehicle.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DisplayBikeStrategyTest {
    Display display;
    ParkingLot parkingLot;
    Slot slot;
    Vehicle vehicle;
    @BeforeEach
    void setUp(){
        display=new Display();
        parkingLot=new ParkingLot("PR1234",2,6);
        slot=new Slot();
        vehicle=new Bike("MB_1114","white");
    }
    @Test
    void checkDisplayFreeCountForBike() {
        ArrayList<ArrayList<Integer>> expected=display.display(parkingLot,1,3);
        int actual=2;
        int floorNumber=0;
        assertEquals(expected.get(floorNumber).size(),actual);
    }
    @Test
    void checkDisplayFreeSlotsForBike() {
        ArrayList<ArrayList<Integer>> expected=display.display(parkingLot,1,3);
        ArrayList<Integer> actual=new ArrayList<Integer>(Arrays.asList(2,3));
        int floorNumber=0;
        assertEquals(expected.get(floorNumber),actual);
    }

    @Test
    void checkDisplayOccupiedSlotsForBike() {
        parkingLot.parkVehicle(vehicle,parkingLot);
        ArrayList<ArrayList<Integer>> expected=display.displayOccupied(parkingLot,1,3);
        ArrayList<Integer> actual=new ArrayList<Integer>(Arrays.asList(2));
        int floorNumber=0;
        assertEquals(expected.get(floorNumber),actual);
    }
}