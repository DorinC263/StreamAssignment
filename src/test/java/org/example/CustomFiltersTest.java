package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomFiltersTest {

    @Test
    public void testGetMonth() {
        String line = "FirstName=Mihai,LastName=Cristian,DOB=12.06.2000;";
        int month = CustomFilters.getMonth(line);
        org.junit.jupiter.api.Assertions.assertEquals(6, month);
    }

    @Test
    public void testGetFirstName() {
        String line = "FirstName=Mihai,LastName=Cristian,DOB=12.06.2000;";
        String firstName = CustomFilters.getFirstName(line);
        org.junit.jupiter.api.Assertions.assertEquals("Mihai", firstName);
    }

    @Test
    public void testGetLastName() {
        String line = "FirstName=Mihai,LastName=Cristian,DOB=12.06.2000;";
        String lastName = CustomFilters.getLastName(line);
        org.junit.jupiter.api.Assertions.assertEquals("Cristian", lastName);
    }
}