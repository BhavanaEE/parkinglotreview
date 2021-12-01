package com.everest.displaystrategy;

import com.everest.display.Display;
import com.everest.parkinglot.ParkingLot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DisplayCarStrategyTest {
    Display display;
    ParkingLot parkingLot;
    DisplayCarStrategy displayCarStrategy;
    @BeforeEach
    void setUp(){
        display=new Display();
        parkingLot=new ParkingLot("PR1234",2,6);
        displayCarStrategy=new DisplayCarStrategy();
    }
    @Test
    void checkDisplayFreeCount() {
        ArrayList<ArrayList<Integer>> expected=display.display(parkingLot,3,parkingLot.getSlotsInEachFloor());
         int actual=3;
         int floorNumber=0;
         assertEquals(expected.get(floorNumber).size(),actual);
    }
    @Test
    void checkDisplayFreeSlots() {
        ArrayList<ArrayList<Integer>> expected=display.display(parkingLot,3,parkingLot.getSlotsInEachFloor());
        ArrayList<Integer> actual=new ArrayList<Integer>(Arrays.asList(4,5,6));
        int floorNumber=0;
        assertEquals(expected.get(floorNumber),actual);
    }

    @Test
    void checkDisplayOccupiedSlots() {
        ArrayList<ArrayList<Integer>> expected=display.displayOccupied(parkingLot,3,parkingLot.getSlotsInEachFloor());
        ArrayList<Integer> actual=new ArrayList<Integer>(Arrays.asList());
        int floorNumber=0;
        assertEquals(expected.get(floorNumber),actual);
    }

}