package ua.lviv.iot.algo.part1.lab1;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class AnimalHomeManager
{
    public void addZoo(final Zoo zoo) {

    }

    public List<Zoo> findPlaceWithCapacityBiggerThan(List<Zoo> zooList) {
        return zooList.stream()
                .filter(zoo -> zoo.getCapacity() >= 50)
                .collect(Collectors.toList());
    }


    public List<Zoo> findPlaceWithWorkingHoursLessThan(List<Zoo> zooList) {
        return zooList.stream()
                .filter(zoo -> zoo.getWorkingHours() <= 9)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        Zoo zoo1 = new Zoo(50, 8, 50000.0);
        Zoo zoo2 = new Zoo(70, 10, 50000.0);

        AnimalShelter animalShelter1 = new AnimalShelter(150, 8, 30000.50);
        AnimalShelter animalShelter2 = new AnimalShelter(100, 8, 18000.50);

        Aquarium aquarium1 = new Aquarium(550, 8, 150000.50);
        Aquarium aquarium2 = new Aquarium(675, 8, 190000.75);

        List<Zoo> zooList = new ArrayList<>();
        zooList.add(zoo1);
        zooList.add(zoo2);

        List<AnimalShelter> animalShelterList = new ArrayList<>();
        animalShelterList.add(animalShelter1);
        animalShelterList.add(animalShelter2);

        List<Aquarium> aquariumList = new ArrayList<>();
        aquariumList.add(aquarium1);
        aquariumList.add(aquarium2);

        for (Zoo zoo : zooList) {
            System.out.println("Animal capacity in zoo is: " + zoo.getCapacity() + ". Working hours of " + zoo.getWorkingHours() +
                    ". Animal cost:" + zoo.getAnimalCarryCost());
        }
        for (AnimalShelter animalShelter : animalShelterList) {
            System.out.println("Animal capacity in animal shelter is: " + animalShelter.getCapacity() + ". Working hours of " + animalShelter.getWorkingHours() +
                    ". Animal cost:" + animalShelter.getAnimalCarryCost());
        }
        for (Aquarium aquarium : aquariumList) {
            System.out.println("Animal capacity in aquarium is: " + aquarium.getCapacity() + ". Working hours of " + aquarium.getWorkingHours() +
                    ". Animal cost:" + aquarium.getAnimalCarryCost());
        }
    }
}


