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

public class AnimalShelter extends AbstractAnimalHome
{
    private int capacity;
    private int workingHours;
    private double animalCarryCost;

    @Override
    public double calculateCostPerMonth()
    {
        return 0;
    }
}
