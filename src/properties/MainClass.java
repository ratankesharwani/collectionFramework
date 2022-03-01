package properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class MainClass {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String path = "/home/ratankesharwani/abc.properties";
        FileInputStream fis= new FileInputStream(path);
        properties.load(fis);
        System.out.println(properties);
        System.out.println(properties.getProperty("CPU"));
        properties.setProperty("nag","100000");
        FileOutputStream fos = new FileOutputStream(path);
        properties.store(fos,"Updated  by Ratan");
    }
}
