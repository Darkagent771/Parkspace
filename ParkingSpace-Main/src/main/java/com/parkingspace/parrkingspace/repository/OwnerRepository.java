package com.parkingspace.parrkingspace.repository;

import com.parkingspace.parrkingspace.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {

}
