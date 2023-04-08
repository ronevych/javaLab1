package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString(of = {"animalType", "dailyFoodCost"})

public class Farm extends AbstractAnimalHome {
    private String animalType;
    private double dailyFoodCost;


    @Override
    public double calculateCostPerMonth() {
        return dailyFoodCost * 30;
    }
}
