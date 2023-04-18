package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString (of = {"capacity", "workingHours", "animalCarryCost"})
@AllArgsConstructor
@NoArgsConstructor

public class Zoo extends AbstractAnimalHome {

    private static Zoo instance;
    private int capacity;
    private int workingHours;
    private double animalCarryCost;

    public void addZoo (Zoo zoo){

    }
    public int increaseCapacity(int count) {
        capacity += count;
        return capacity;
    }

    public double splitArea() {
        zooArea = zooArea / 2;
        return zooArea;
    }

    public double addNewRegion(double area) {
        zooArea += area;
        return zooArea;
    }


    @Override
    public double calculateCostPerMonth() {
        return animalCarryCost * 30;
    }
    public String getHeaders(){
        return super.getHeaders() + ", capacity, workingHours, animallCarryCost";
    }
    public String toCSV(){
        return String.format("%s, %d, %d, %f", super.toCSV(), capacity, workingHours, animalCarryCost);
    }
}