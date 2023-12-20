package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/main/java/org/example/inputData.txt";
        String outputFileName = "src/main/java/org/example/outputData.txt";
        int targetMonth = 7;

        try {
            //Reading data from the file
            List<String> filteredData = Files.lines(Path.of(inputFileName))
                    .filter(line -> CustomFilters.getMonth(line) == targetMonth)
                    .map(line -> "FirstName: " + CustomFilters.getFirstName(line)+ ", LastName: " + CustomFilters.getLastName(line))
                    .sorted(Comparator.comparing(entry -> entry.split(",")[1])) // Sorted by last name
                    .collect(Collectors.toList());

            Files.write(Path.of(outputFileName), filteredData);
            System.out.println("Filtered and sorted data written to : " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
