package com.crm.step_definitions;

import com.crm.utilities.Driver;
//import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(){
        Driver.get().manage().window().fullscreen();
        
    }

    @AfterStep
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach (screenshot,"image/png","screenshot");
        }
    }
    @AfterClass
    public void tearDown(){
        Driver.get().quit();
    }


}
