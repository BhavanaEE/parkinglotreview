package com.everest.parkinglotstrategy;

import com.everest.parkinglot.ParkingLot;
import com.everest.vehicle.Truck;
import com.everest.vehicle.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkByTruckStrategyTest {
    ParkingStrategy parkingStrategy;
    Vehicle vehicle;
    ParkingLot parkingLot;
    @BeforeEach
    void setUp(){
        parkingLot=new ParkingLot("PR1234",2,6);
        vehicle=new Truck("MB_11_14_25_19","Black");
        parkingStrategy=new ParkByTruckStrategy();
    }
    @Test
    void checkIsTruckParked() {
        String expected=parkingStrategy.parkVehicle(vehicle,parkingLot);
        String actual="Parked vehicle. Ticket ID: PR1234_1_1";
        assertEquals(expected,actual);
    }

}