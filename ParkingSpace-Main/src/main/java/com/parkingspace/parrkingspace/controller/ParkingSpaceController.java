package com.parkingspace.parrkingspace.controller;


import com.parkingspace.parrkingspace.entity.ParkingSpace;
import com.parkingspace.parrkingspace.service.ParkingSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parkingspaces")
public class ParkingSpaceController {

    @Autowired
    private ParkingSpaceService parkingSpaceService;

    @GetMapping
    public List<ParkingSpace> getAllParkingSpaces() {
        return parkingSpaceService.getAllParkingSpaces();
    }

    @GetMapping("/{id}")
    public ParkingSpace getParkingSpaceById(@PathVariable int id) {
        return parkingSpaceService.getParkingSpaceById(id);
    }

    @PostMapping
    public ParkingSpace saveParkingSpace(@RequestBody ParkingSpace parkingSpace) {
        return parkingSpaceService.saveParkingSpace(parkingSpace);
    }

    @DeleteMapping("/{id}")
    public void deleteParkingSpace(@PathVariable int id) {
        parkingSpaceService.deleteParkingSpace(id);
    }
}
