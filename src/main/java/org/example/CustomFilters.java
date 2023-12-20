package org.example;

public class CustomFilters {
    public static int getMonth(String line){
        return Integer.parseInt(line.split("DOB=")[1].split("\\.")[1]);
    }
    public static String getFirstName(String line){
        return line.split(",")[0].split("=")[1];
    }
    public static String getLastName(String line){
        return line.split(",")[1].split("=")[1];
    }
}