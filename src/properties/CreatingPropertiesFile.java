//package properties;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Properties;
//public class CreatingPropertiesFile {
//    public static void main(String args[]) throws IOException {
//        Properties abcd = new Properties();
//        abcd.put("Device_name", "OnePlus7");
//        abcd.put("Android_version", "9");
//        abcd.put("Model", "GM1901");
//        abcd.put("CPU", "Snapdragon855");
//        String path = "/home/ratankesharwani/abc.properties";
//        FileOutputStream outputStream = new FileOutputStream(path);
//        abcd.store(outputStream, "This is a sample properties file");
//        System.out.println("Properties file created......");
//    }
//}