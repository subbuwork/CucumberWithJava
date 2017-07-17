package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by subbu on 7/15/2017.
 */
public class PropertiesReader {

    Properties properties;
    public PropertiesReader(){
        try {
           properties = new Properties();
           properties.load(new FileInputStream("./resources/base.properties"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public String driver(String driverName){
        String value = properties.getProperty(driverName);
        return value;
    }

    public static void main(String args[]){

    }
}
