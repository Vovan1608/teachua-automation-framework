package com.zevovan.framework.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties PROPERTIES = new Properties();

    static {
        try (InputStream input =
                     ConfigReader.class.getClassLoader()
                             .getResourceAsStream("config.properties")) {

            if(input == null) {
                throw new RuntimeException("Could not find file config.properties!");
            }

            PROPERTIES.load(input);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }

    public static long getLongProperty(String key) {
        return Long.parseLong(PROPERTIES.getProperty(key));
    }
}
