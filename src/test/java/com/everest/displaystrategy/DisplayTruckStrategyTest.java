package com.everest.displaystrategy;

import com.everest.display.Display;
import com.everest.parkinglot.ParkingLot;
import com.everest.parkinglot.Slot;
import com.everest.vehicle.Bike;
import com.everest.vehicle.Truck;
import com.everest.vehicle.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DisplayTruckStrategyTest {
    Display display;
    ParkingLot parkingLot;
    Slot slot;
    Vehicle vehicle;
    @BeforeEach
    void setUp(){
        display=new Display();
        parkingLot=new ParkingLot("PR1234",2,6);
        slot=new Slot();
        vehicle=new Truck("MB_1114","white");
    }
    @Test
    void checkDisplayFreeCountForTruck() {
        ArrayList<ArrayList<Integer>> expected=display.display(parkingLot,0,1);
        int actual=1;
        int floorNumber=0;
        assertEquals(expected.get(floorNumber).size(),actual);
    }
    @Test
    void checkDisplayFreeSlotsForTruck() {
        parkingLot.parkVehicle(vehicle,parkingLot);
        ArrayList<ArrayList<Integer>> expected=display.display(parkingLot,0,1);
        ArrayList<Integer> actual=new ArrayList<Integer>(Arrays.asList());
        int floorNumber=0;
        assertEquals(expected.get(floorNumber),actual);
    }

    @Test
    void checkDisplayOccupiedSlotsForTruck() {
        parkingLot.parkVehicle(vehicle,parkingLot);
        ArrayList<ArrayList<Integer>> expected=display.displayOccupied(parkingLot,0,1);
        ArrayList<Integer> actual=new ArrayList<Integer>(Arrays.asList(1));
        int floorNumber=0;
        assertEquals(expected.get(floorNumber),actual);
    }

}