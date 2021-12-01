package com.everest.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    void getVehicleTypeTest() {
        assertEquals("CAR","CAR");
    }

    @Test
    void getRegistrationNumberTest() {
        assertEquals("KA_1_234","KA_1_234");
    }

    @Test
    void getColorTest() {
        assertEquals("white","white");
    }
}