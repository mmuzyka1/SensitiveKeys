package org.example;

import java.util.Map;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        Properties testData = FileHandler.loadFile();
        Map<String, String> properties = FileHandler.convertPropertiesToMap(testData);
        String[] sensitiveKeys = {"login", "password", "birthDate", "wife", "url"};
        Printer.printMapProperties(properties, sensitiveKeys);
    }
}
