package com.nudt.Facade.pageMaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author ：HuiZhang
 * @date ：Created in 2021/11/25 9:30
 * @description：
 * @modified By：
 * @version:
 */
public class Database {
    private Database(){}

    public static Properties getProperties(String daName){
        String fileName = daName + ".txt";
        String filePath = "C:\\Users\\HuiZhang\\Desktop\\IDEAWORKSPACE\\DesignPattern\\src\\com\\nudt\\Facade\\" + fileName;
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(filePath));
        } catch (IOException e) {
            System.out.printf("%s is not found\n",fileName);
        }
        return properties;
    }
}
