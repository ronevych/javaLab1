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

public class Aquarium extends AbstractAnimalHome
{
    private int capacity;
    private int workingHours;
    private double animalCarryCost;

    @Override
    public double calculateCostPerMonth()
    {
        return animalCarryCost * 30;
    }
    public String getHeaders(){
        return super.getHeaders() + ", capacity, workingHours, animalCarryCost";
    }
    public String toCSV(){
        return  String.format("%s, %d, %d, %f", super.toCSV(), capacity, workingHours, animalCarryCost);
    }
}
