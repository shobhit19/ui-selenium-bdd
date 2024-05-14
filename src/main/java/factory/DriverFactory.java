package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public final class DriverFactory {

    private DriverFactory(){}


    private static final Supplier<WebDriver> CHROME = ()-> {
//        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    };
    private static final Supplier<WebDriver> EDGE = ()->{
//        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    };
    private static final Supplier<WebDriver> FIREFOX = ()-> {
//        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    };

    private static final Map<String,Supplier<WebDriver>> MAP = new HashMap<>();

    static{
        MAP.put("chrome",CHROME);
        MAP.put("firefox",FIREFOX);
        MAP.put("edge",EDGE);
    }

    public static WebDriver getDriver(String browser){
        return MAP.get(browser).get();
    }
}
