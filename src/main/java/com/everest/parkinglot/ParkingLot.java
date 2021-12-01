package com.everest.parkinglot;

import com.everest.parkinglotstrategy.*;
import com.everest.parkinglotstrategy.ParkByCarStrategy;
import com.everest.parkinglotstrategy.ParkByTruckStrategy;
import com.everest.parkinglotstrategy.ParkingStrategy;
import com.everest.vehicle.Vehicle;

public class ParkingLot {
    private String parkingId;
    private int noOfFloors;
    private int slotsInEachFloor;
    private Floor[] floors;
    ParkingStrategy parkingStrategy;

    public ParkingLot(String parkingId, int noOfFloors, int slotsInEachFloor) {
        this.parkingId=parkingId;
        this.noOfFloors=noOfFloors;
        this.slotsInEachFloor=slotsInEachFloor;
        floors=new Floor[noOfFloors];
        for(int i=0;i<noOfFloors;i++){
            floors[i]=new Floor(slotsInEachFloor);
        }
    }

    public String parkVehicle(Vehicle vehicle, ParkingLot parkingLot) {
        parkingStrategy=getParkingLotStrategyFor(vehicle.getVehicleType());
        return parkingStrategy.parkVehicle(vehicle, parkingLot);
    }

    public String unParkVehicle(String ticketId,ParkingLot parkingLot){
        try {
            return parkingStrategy.unParkVehicle(ticketId,parkingLot);
        }
        catch (Exception e){
            return "Invalid ticket";
        }
    }

    public Floor getFloorAtIndex(int i){
        return this.floors[i];
    }

    public int getSlotsInEachFloor(){
        return this.slotsInEachFloor;
    }

    public int getNoOfFloors() {
        return this.noOfFloors;
    }
    private ParkingStrategy getParkingLotStrategyFor(String vehicleType) {
        switch (vehicleType){
            case "CAR":
                return new ParkByCarStrategy();

            case "BIKE":
                return new ParkByBikeStrategy();

            case "TRUCK":
                return new ParkByTruckStrategy();
        }
        return null;
    }
}
