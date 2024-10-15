package com.abiSystems.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.abiSystems.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseClass {

    @Before
    public void setup(){
        initializeDriver();
    }


    @After
    public void close(){
        closeDriver();
    }
}
