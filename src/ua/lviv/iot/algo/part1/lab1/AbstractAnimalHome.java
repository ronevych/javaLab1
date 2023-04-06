package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString(of = {"name", "location", "zooArea"})
@Setter
@Getter

public abstract class AbstractAnimalHome
{
    public String name;
    public String location;
    public double zooArea;

    public abstract double calculateCostPerMonth();

}

