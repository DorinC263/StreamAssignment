package org.example;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMainFunctionality() {
        String inputFileName = "src/test/resources/inputDataTest.txt";
        String outputFileName = "src/test/resources/outputDataTest.txt";
        int targetMonth = 6;

        Main.main(new String[]{inputFileName, outputFileName, String.valueOf(targetMonth)});

        try {
            List<String> lines = Files.readAllLines(Path.of(outputFileName));
            assertEquals("FirstName: Alexandra, LastName: Andrei", lines.get(0));
            assertEquals("FirstName: Paul, LastName: Craiu", lines.get(1));
            assertEquals("FirstName: Mihai, LastName: Cristian", lines.get(2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}