package com.parkingspace.parrkingspace.repository;


import com.parkingspace.parrkingspace.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository  extends JpaRepository<Booking, Integer> {
}
