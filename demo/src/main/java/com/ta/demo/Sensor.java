package com.ta.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Sensor{
    @Id
    private String id;
    private String externalId;
    private String name;
    private Integer temperature;
    private Integer numberOfPeople;
    public Sensor(String name, String externalId, Integer temperature, Integer numberOfPeople) {
        this.name = name;
        this.externalId = externalId;
        this.temperature = temperature;
        this.numberOfPeople = numberOfPeople;
    }
}