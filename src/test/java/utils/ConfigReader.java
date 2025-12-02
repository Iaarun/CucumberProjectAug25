package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public  class ConfigReader {
    private static Properties properties;

    public static void loadProperties(){
        if(properties==null){
            properties= new Properties();
            try{
                File file = new File("src/test/resources/config/config.properties");
                FileInputStream fis = new FileInputStream(file);
                properties.load(fis);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static String get(String key){
        loadProperties();
        return properties.getProperty(key);

    }

    public static String getURL(){
        return get("bankurl");
    }
}
