package org.anisht.springwar;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test {
    public static void main (String[] args) throws Exception{
        readProps();
    }

    public static void readProps() throws IOException {
        Properties prop;
        try (InputStream resourceAsStream = Test.class.getClassLoader().getResourceAsStream("application.properties")) {
            prop = new Properties();
            prop.load(resourceAsStream);
        }
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("last-name"));
    }
}
