package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public abstract class AbstractAnimalHome {
    public String name;
    public String location;
    public double zooArea;

    public abstract double calculateCostPerMonth();
    public String getHeaders (){
        return "name, location, zooArea";
    }
    public String toCSV(){
        return String.format("%s, %s, %f", name, location, zooArea);
    }

}

