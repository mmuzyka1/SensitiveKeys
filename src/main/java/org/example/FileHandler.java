package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileHandler {

    public static Properties loadFile() {

        Properties properties = null;
        try (InputStream configFile = ClassLoader.getSystemClassLoader().getResourceAsStream("mapData.properties")) {
            properties = new Properties();
            properties.load(configFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static HashMap<String, String> convertPropertiesToMap(Properties testData) {
        Map step1 = testData;
        Map<String, String> step2 = (Map<String, String>) step1;
        return new HashMap<>(step2);
    }
}
