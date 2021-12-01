package com.everest.parkinglotstrategy;

import com.everest.parkinglot.ParkingLot;
import com.everest.vehicle.Bike;
import com.everest.vehicle.Car;
import com.everest.vehicle.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkByBikeStrategyTest {
    ParkingStrategy parkingStrategy;
    Vehicle vehicle;
    ParkingLot parkingLot;
    @BeforeEach
    void setUp(){
        parkingLot=new ParkingLot("PR1234",2,6);
        vehicle=new Bike("MB_11_14_25_19","Black");
        parkingStrategy=new ParkByBikeStrategy();
    }
    @Test
    void checkIsVehicleParked() {
        String expected=parkingStrategy.parkVehicle(vehicle,parkingLot);
        String actual="Parked vehicle. Ticket ID: PR1234_1_2";
        assertEquals(expected,actual);
    }
}