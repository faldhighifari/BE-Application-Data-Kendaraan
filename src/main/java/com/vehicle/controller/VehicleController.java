package com.vehicle.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.dto.ResponseData;
import com.vehicle.models.entities.Vehicle;
import com.vehicle.services.VehicleService;

@RestController
@RequestMapping("/api/vehicles")
@CrossOrigin(origins = "*")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;
    
    @PostMapping
    public ResponseEntity<ResponseData<Vehicle>> create(@Valid @RequestBody Vehicle vehicle, Errors errors){

        ResponseData<Vehicle> responseData = new ResponseData<>();

        if(errors.hasErrors()){
            for(ObjectError error : errors.getAllErrors()) {
                responseData.getMessage().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }

        responseData.setStatus(true);
        responseData.setPayload(vehicleService.save(vehicle));
        return ResponseEntity.ok(responseData);
    }

    @GetMapping
    public Iterable<Vehicle> findAll(){
        return vehicleService.findAll();
    }

    @GetMapping("/{id}")
    public Vehicle findOne(@PathVariable("id") String id){
        return vehicleService.findOne(id);
    }

    @PatchMapping
    public Vehicle update(@RequestBody Vehicle vehicle){
        return vehicleService.save(vehicle);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") String id){
        vehicleService.removeOne(id);
    }

    

}
