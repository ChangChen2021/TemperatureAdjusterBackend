package com.ta.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

// API Layer

@RestController
@RequestMapping(path = "api/v1/sensor")
@AllArgsConstructor
public class SensorController {
    
    private final SensorService sensorService;

    @GetMapping
    public List<Sensor> fetchAllSensors() {
        return sensorService.getAllSensors();
    }
    // find all sensors by external id
    @GetMapping(path = "/{externalId}")
    public List<Sensor> fetchAllSensorsByExternalId(@PathVariable String externalId) {      
        return sensorService.getAllSensorsByExternalId(externalId);
    }

    // add sensor to database
    @PostMapping(path = "/add")
    public Sensor creatSensor(@RequestBody Sensor sensor) {
        return sensorService.addSensor(sensor);
    }

    // update sensor in database
    @PutMapping(path = "/update")
    public Sensor updateSensor(@RequestBody Sensor sensor) {
        return sensorService.updateSensor(sensor);
    }

    // delete sensor from database
    @DeleteMapping(path = "/delete/{id}")
    public void deleteSensor(@PathVariable String id) {
        sensorService.deleteSensor(id);
    }

}
