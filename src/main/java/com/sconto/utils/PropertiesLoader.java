package com.sconto.utils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {
    private static final String propFile = "/test.properties";
    private PropertiesLoader() {

    }
    public static String loadProperty(String name) {
        Properties props = new Properties();
        try {
            props.load(PropertiesLoader.class.getResourceAsStream(propFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String value = "";
        if(name != null) {
            value = props.getProperty(name);
        }
        return value;
    }
}
