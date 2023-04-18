package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AquariumTest {

    @Test
    void getHeaders() {
        Aquarium aquarium = new Aquarium(1000,12, 750.50);
        String actual = aquarium.getHeaders();
        Assertions.assertEquals("name, location, zooArea, capacity, workingHours, animalCarryCost", actual);
    }

    @Test
    void toCSV() {
        Aquarium aquarium = new Aquarium(1000,12, 750.50);
        String actual = aquarium.toCSV();
        Assertions.assertEquals("null, null, 0.000000, 1000, 12, 750.500000", actual);
    }
}