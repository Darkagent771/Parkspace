package com.parkingspace.parrkingspace.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ParkingSpace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int spaceId;
    private String location;
    private boolean isOccupied;

    public ParkingSpace(String location, boolean isOccupied)
    {
        this.location= location;
        this.isOccupied= isOccupied;
    }
    public String getlocation()
    {
        return location;
    }
    public boolean getisOccupied()
    {
        return isOccupied;
    }
}
