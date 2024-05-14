package factory;

import enums.ConfigProperties;
import org.openqa.selenium.WebDriver;
import util.PropertyUtils;

import java.util.Objects;

public class Driver {

    private static WebDriver driver;



    public static void initDriver(){
        if(Objects.isNull(DriverManager.getDriver())){
            DriverManager.setDriver(DriverFactory.getDriver(PropertyUtils.getValue(ConfigProperties.BROWSER)));
            DriverManager.getDriver().get(PropertyUtils.getValue(ConfigProperties.URL));
        }
    }
    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
