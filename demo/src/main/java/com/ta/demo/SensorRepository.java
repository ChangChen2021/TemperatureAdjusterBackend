package com.ta.demo;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

// data access layer

public interface SensorRepository extends MongoRepository<Sensor, String>{
    // find sensor by external id
    List<Sensor> findSensorByExternalId(String externalId);
}
