package models;

public class Country {
    public static String name;
    public String countryCode;
    public int population;

    public String toString() {
        return countryCode + " " + name + " (" + population + ")";
    }
}

