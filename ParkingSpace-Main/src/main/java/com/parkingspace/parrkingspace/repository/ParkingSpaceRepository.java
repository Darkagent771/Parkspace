package com.parkingspace.parrkingspace.repository;


import com.parkingspace.parrkingspace.entity.ParkingSpace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace, Integer> {
}
