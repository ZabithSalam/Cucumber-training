package org.abiSystems;

import io.cucumber.java.After;
import org.abiSystems.Utils.PropertiesUtill;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;

    public static void initializeDriver(){
        Properties properties = PropertiesUtill.loadApplicationProperties();
        String url= properties.get("application.url").toString();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }


    public static void closeDriver(){
        driver.quit();
    }
}
