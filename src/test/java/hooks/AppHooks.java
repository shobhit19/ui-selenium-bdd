package hooks;

import factory.Driver;
import factory.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AppHooks {

    @Before(order=0)
    public void launchBrowser(){
        Driver.initDriver();
    }

    @After(order=0)
    public void quitBrowser(){
        Driver.quitDriver();
    }
    @After(order=1)
    public void tearDown(Scenario scenario){
        String screenshotName = scenario.getName().replaceAll(" ","_");
        byte[] sourcePath=((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(sourcePath,"image/png",screenshotName);
    }
}
