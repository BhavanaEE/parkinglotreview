package com.everest.parkinglot;

import com.everest.parkinglotstrategy.ParkByCarStrategy;
import com.everest.parkinglotstrategy.ParkingStrategy;
import com.everest.vehicle.Car;
import com.everest.vehicle.Vehicle;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    private String parkingId;
    private int noOfFloors=2;
    private int slotsInEachFloor=6;
    ParkingLot parkingLot;
    ParkingStrategy parkingStrategy;
    Vehicle vehicle;
    @BeforeEach
    public void setUp()
    {
        parkingLot = new ParkingLot("PR1234",2,6);
        vehicle=new Car("rrr","red");
        parkingStrategy=new ParkByCarStrategy();
    }

    @Test
    void checkNoOfFloorsTest(){
        int expected=parkingLot.getNoOfFloors();
        assertEquals(expected,noOfFloors);
    }

    @Test
    void checkSlotsInEachFloor(){
        int expected=parkingLot.getSlotsInEachFloor();
        assertEquals(expected,slotsInEachFloor);
    }

    @Test
    void testForCarParkUsingStrategy(){
        String expected=parkingStrategy.parkVehicle(vehicle,parkingLot);
        String actual="Parked vehicle. Ticket ID: PR1234_1_4";
        assertEquals(expected,actual);
    }

    @Test
    void testForUnParkVehicle(){
        String expected=parkingLot.unParkVehicle("PR1234_3_4",parkingLot);
        String actual="Invalid ticket";
        assertEquals(expected,actual);
    }

}