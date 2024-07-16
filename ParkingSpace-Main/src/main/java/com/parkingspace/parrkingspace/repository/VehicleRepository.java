package com.parkingspace.parrkingspace.repository;


import com.parkingspace.parrkingspace.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
