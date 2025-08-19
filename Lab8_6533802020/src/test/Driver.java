package test;


import main.UniversalConverter;


public class Driver {

    public static void main(String[] args) {
        double originalValue = 10.0;
        double convertedValue;
        String selectedChoice = "Distance";
        String from = "kilometer";
        String to = "meter";

        UniversalConverter converter = new UniversalConverter();

        convertedValue = converter.convert(originalValue, selectedChoice, from, to);
        System.out.println(originalValue + " " + from + " = " + convertedValue + " " + to);
    }
}
