package pages;

import factory.DriverManager;
import org.openqa.selenium.By;

public class HomePage {

    private final By srchBar = By.name("search");



    public String getTitle(){
       return DriverManager.getDriver().getTitle();
    }
    public boolean isVisibleSrchBar(){
        return DriverManager.getDriver().findElement(srchBar).isDisplayed();
    }
    public void enterTextInSearchBar(String text){
        DriverManager.getDriver().findElement(srchBar).sendKeys(text);
    }
    public String getTextFromSrchBar(){
       return DriverManager.getDriver().findElement(srchBar).getText();
    }
}
