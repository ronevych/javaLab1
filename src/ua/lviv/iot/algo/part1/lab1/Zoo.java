package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Zoo {

    private static Zoo instance;
    private String name;
    private String location;
    private Double zooArea;
    private int capacity;


    public static Zoo getInstance() {
        if (instance == null) instance = new Zoo();
        return instance;
    }

    public static void main(String[] args) {
        Zoo[] zoos = {new Zoo(),
                new Zoo("Medenyc`kyi", "Medenychi", 300.0, 500),
                getInstance(),
                getInstance()
        };
       /* int i = 0;
        while (i < zoos.length) {
            System.out.println(zoos[i]);
            i++;
        }*/
        for (Zoo Zoo:zoos){
            System.out.println(Zoo);
        }
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
}
