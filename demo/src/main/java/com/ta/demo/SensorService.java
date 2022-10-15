package com.ta.demo;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

// business logic layer

@AllArgsConstructor
@Service
public class SensorService {

    private final SensorRepository sensorRepository;

    public List<Sensor> getAllSensors() {
        return sensorRepository.findAll();
    }
    // find all sensors by external_id
    public List<Sensor> getAllSensorsByExternalId(String external_id) {
        return sensorRepository.findSensorByExternalId(external_id);
    }

    // add sensor to database
    public Sensor addSensor(Sensor sensor) {
        return sensorRepository.insert(sensor);
    }

    // update sensor in database
    public Sensor updateSensor(Sensor sensor) {
        return sensorRepository.save(sensor);
    }
    // delete sensor from database by id
    public void deleteSensor(String id) {
        sensorRepository.deleteById(id);
    }
}
