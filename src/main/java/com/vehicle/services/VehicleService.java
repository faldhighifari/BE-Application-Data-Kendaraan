package com.vehicle.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.models.entities.Vehicle;
import com.vehicle.models.repos.VehicleRepo;

@Service
@Transactional
public class VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    public Vehicle save(Vehicle vehicle){
        return vehicleRepo.save(vehicle);
    }

    public Vehicle findOne(String nomor_registrasi_kendaraan){
        // return vehicleRepo.findById(nomor_registrasi_kendaraan).get();
        Optional<Vehicle> vehicle = vehicleRepo.findById(nomor_registrasi_kendaraan);
        if(!vehicle.isPresent()){
            return null;
        }
        return vehicle.get();
    }

    public Iterable<Vehicle> findAll(){
        return vehicleRepo.findAll();
    }

    public void removeOne(String nomor_registrasi_kendaraan){
        vehicleRepo.deleteById(nomor_registrasi_kendaraan);
    }

    // public List<Vehicle> findByName(String nama_pemilik){
    //     return vehicleRepo.findByNameContains(nama_pemilik);
    // }


   
}

