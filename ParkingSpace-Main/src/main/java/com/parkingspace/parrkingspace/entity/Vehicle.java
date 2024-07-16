package com.parkingspace.parrkingspace.entity;

import jakarta.persistence.*;

@Entity
public class Vehicle {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehicleId;


    private String licensePlate;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public Vehicle(String licensePlate)
    {
        this.licensePlate=licensePlate;
    }
    
    public String getlicensePlate()
    {
        return licensePlate;
    }
}
