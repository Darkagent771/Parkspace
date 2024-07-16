package com.parkingspace.parrkingspace.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;

    @ManyToOne
    @JoinColumn(name = "space_id")
    private ParkingSpace parkingSpace;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Booking (LocalDateTime startTime, LocalDateTime endTime)
    {
        this.startTime= startTime;
        this.endTime=endTime;
    
    }
    public LocalDateTime getstartTime()
    {
        return startTime;
    }

    public LocalDateTime getendTime()
    {
        return endTime;
    }
}
