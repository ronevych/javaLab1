package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalShelterTest {

    @Test
    void getHeaders() {
        AnimalShelter shelter = new AnimalShelter(100,8,50);
        String actual = shelter.getHeaders();
        Assertions.assertEquals("name, location, zooArea, capacity, workingHours, animalCarryCost",actual);
    }

    @Test
    void toCSV() {
        AnimalShelter shelter = new AnimalShelter( 100,8, 50.0);
        String actual = shelter.toCSV();
        Assertions.assertEquals("null, null, 0.000000, 100, 8, 50.000000", actual);
    }
}