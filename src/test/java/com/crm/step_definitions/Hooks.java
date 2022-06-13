package com.crm.step_definitions;

import com.crm.pages.CompanyPage;
import com.crm.utilities.Driver;
import io.cucumber.java.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import junit.extensions.TestSetup;


public class Hooks {

    @Before
    public void setUpTest(){
        Driver.get().manage().window().fullscreen();
        
    }

    @After
    public void tearDownTest(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach (screenshot,"image/png","screenshot");
        }
    }

    @AfterAll
    public static void tearDown(){
        Driver.closeDriver();
    }

}
