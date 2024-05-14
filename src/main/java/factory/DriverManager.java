package factory;

import org.openqa.selenium.WebDriver;

public final class DriverManager {


    private DriverManager(){}

    private static ThreadLocal<WebDriver> thDriver = new ThreadLocal<>();

    public static void setDriver(WebDriver driver){
        thDriver.set(driver);
    }

    public static WebDriver getDriver(){
        return thDriver.get();
    }

    public static void unload(){
        thDriver.remove();
    }
}
