package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarmTest {

    @Test
    void getHeaders() {
        Farm farm = new Farm("Cow", 20.5);
        String actual = farm.getHeaders();
        Assertions.assertEquals("name, location, zooArea, animalType, dailyFoodCost", actual);
    }

    @Test
    void toCSV() {
        Farm farm = new Farm("Cow", 20.5);
        String actual = farm.toCSV();
        Assertions.assertEquals("null, null, 0.000000, Cow, 20.500000", actual);
    }
}