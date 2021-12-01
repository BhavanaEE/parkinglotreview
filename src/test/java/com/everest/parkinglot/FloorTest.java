package com.everest.parkinglot;

import com.everest.vehicle.Truck;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FloorTest {
    Floor floor=new Floor(3);
    Slot[] slots;
    @ParameterizedTest
    @ValueSource(ints = {0})
    void getSlotsAtIndexTest(int index){
        slots= floor.getSlots();
        Slot slot=slots[index];
        slot.vehicle=new Truck("reg_no","color");
        assertEquals(slot.vehicle.getRegistrationNumber(),"reg_no");
    }
}