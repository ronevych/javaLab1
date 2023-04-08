package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ZooTest {

    Zoo zoo;

    @BeforeEach
    void init(){
        zoo = new Zoo(5,8,150.0);
    }
    @Test
    void increaseCapacity() {
        Assertions.assertEquals(5 , zoo.getCapacity());
        zoo.increaseCapacity(100);
        Assertions.assertEquals( 105 , zoo.getCapacity());
    }

    @Test
    void splitArea() {
    }

    @Test
    void addNewRegion() {
    }

    @Test
    void calculateCostPerMonth() {
    }
}