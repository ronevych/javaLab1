package ua.lviv.iot.algo.part1.lab1;

import com.google.common.base.Charsets;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnimalHomeWriter {
    public void writeToFile (List<AbstractAnimalHome> animalHomes, String fileName){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            animalHomes.stream()
                    .map(AbstractAnimalHome::toCSV)
                    .map(a-> a +"\r\n")
                    .forEach( a-> {
                        try {
                            writer.write(a);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void writeToFileWithGrouping(List<AbstractAnimalHome> animalHomes, String fileName){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            Map<String, List<AbstractAnimalHome>> homesByHeaders = animalHomes.stream()
                    .collect(Collectors.groupingBy(AbstractAnimalHome::getHeaders));
            homesByHeaders.forEach((headers, homes) -> {
                try {
                    writer.write(headers + "\r\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                homes.stream()
                        .map(AbstractAnimalHome::toCSV)
                        .map(a-> a +"\r\n")
                        .forEach(str -> {
                            try {
                                writer.write(str);
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        });
            });
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        List <String> list = new ArrayList<String>();
        File file = new File("emptyList.txt");
        try{
            FileWriter writer = new FileWriter(file);
            for(String str : list) {
                writer.write(str);
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
