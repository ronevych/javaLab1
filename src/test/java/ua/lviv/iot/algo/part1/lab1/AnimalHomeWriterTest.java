package ua.lviv.iot.algo.part1.lab1;

import com.google.common.io.Resources;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.hierarchical.Node;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.lang.String;

class AnimalHomeWriterTest {

    AnimalHomeWriter writer = new AnimalHomeWriter();

    @SneakyThrows
    @Test
    void testWriteToFile() {
        List<AbstractAnimalHome> houses = List.of(new Farm("cow", 25.0),
                new Aquarium(3,4,5),
                new Aquarium(1,2,5),
                new Farm("horse", 25858));

        writer.writeToFile( houses, "someFile.txt");

        URL url = Resources.getResource("expectedOutput/expectedCSV.txt");
        Path expetedFile = Path.of(url.toURI());

        String expected = Files.readString(expetedFile);

        String actual = Files.readString(Path.of("someFile.txt"));
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void TestWriteToFileOnEmptyHouses() {
        writer.writeToFileWithGrouping(emptyList(),"FileOnEmptyList.txt");
    }
    @Test
    void writeToFileWithGroupingFileExist() {
        writer.writeToFileWithGrouping(emptyList(),"FileOnEmptyList.txt");
    }

    @Test
    void writeToFileWithGroupingEmptyList() {
        List<AbstractAnimalHome> houses =singletonList(new Farm("cow", 3555));

        writer.writeToFile(houses, "someFile.txt");
        writer.writeToFile(houses, "someFile.txt");

    }

    @SneakyThrows
    @Test
    void testWriteToFileWithGrouping() {
        List<AbstractAnimalHome> houses = List.of(new Farm("cow", 25.0),
                new Aquarium(3,4,5),
                new Aquarium(1,2,5),
                new Farm("horse", 25858));

        writer.writeToFileWithGrouping( houses, "someFileForGrouping.txt");

        URL url = Resources.getResource("expectedOutput/expectedCSVGrouping.txt");
        Path expetedFile = Path.of(url.toURI());

        String expected = Files.readString(expetedFile);

        String actual = Files.readString(Path.of("someFileForGrouping.txt"));
        Assertions.assertEquals(expected,actual);
    }


}