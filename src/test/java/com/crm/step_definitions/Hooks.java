package com.crm.step_definitions;

import com.crm.utilities.Driver;
//import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(){
     //   Driver.get().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Driver.get().manage().window().fullscreen();
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            //scenario.embed(screenshot,"image/png");
        }
      //  Driver.closeDriver();
    }

}
