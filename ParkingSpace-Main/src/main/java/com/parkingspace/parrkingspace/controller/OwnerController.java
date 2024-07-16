package com.parkingspace.parrkingspace.controller;

import com.parkingspace.parrkingspace.entity.Owner;
import com.parkingspace.parrkingspace.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/getAll")
    public List<Owner> getAllOwners() {
        return ownerService.getAllOwners();
    }

    @GetMapping("/getOwnerById/{id}")
    public Owner getOwnerById(@PathVariable int id) {
        return ownerService.getOwnerById(id);
    }

    @PostMapping("/save")
    public Owner saveOwner(@RequestBody Owner owner) {
        return ownerService.saveOwner(owner);
    }

    @DeleteMapping("deleteById/{id}")
    public void deleteOwner(@PathVariable int id) {
        ownerService.deleteOwner(id);
    }
}
