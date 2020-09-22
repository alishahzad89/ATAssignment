package main.java;

import java.util.Properties;

public class Configuration {
    String baseURL;
    public Configuration(Properties property){
        baseURL = property.getProperty("baseURL");
    }
    public String getBaseURL() {
        return baseURL;
    }
}
