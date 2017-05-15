package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String my_file_name = rd.readLine();
        FileInputStream stream = new FileInputStream(my_file_name);
        load(stream);
        rd.close();
        stream.close();



//        BufferedReader reader = new BufferedReader(new FileReader(my_file_name));
//        while (reader.ready())
//        {
//            String line = reader.readLine();
//            properties.put(line.split("=")[0], line.split("=")[1]);
//        }
//        reader.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prop = new Properties();
        prop.putAll(properties);
        prop.store(outputStream, null);


//        PrintWriter writer = new PrintWriter(outputStream);
//        for (Map.Entry<String, String> entry: properties.entrySet()) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            writer.println(key + "=" + value);
//        }
//        writer.close();
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prop = new Properties();
        prop.load(inputStream);
        Map pr = prop;
        properties.putAll(pr);



//        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//        while (reader.ready())
//        {
//            String line = reader.readLine();
//            properties.put(line.split("=")[0], line.split("=")[1]);
//        }
//        reader.close();
    }

    public static void main(String[] args) {

    }
}
