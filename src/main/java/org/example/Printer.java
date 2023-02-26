package org.example;

import java.util.Arrays;
import java.util.Map;

public class Printer {

    public static void printMapProperties(Map<String, String> mapToPrint, String[] sensitiveKeys) {
        for (Map.Entry<String, String> entry : mapToPrint.entrySet()) {
            if (!Arrays.stream(sensitiveKeys).toList().contains(entry.getKey())) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            } else {
                System.out.println(entry.getKey() + " = " + "*".repeat(entry.getValue().length()));
            }
        }
    }
}
