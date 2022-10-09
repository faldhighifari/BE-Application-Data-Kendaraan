package com.vehicle.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vehicle.models.entities.Vehicle;

public interface VehicleRepo extends CrudRepository<Vehicle,String> {
    // List<Vehicle> findByNameContains(String nama_pemilik);
}
