package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentCarPage {
    public BlueRentCarPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement login;

    @FindBy (xpath = "//input[@id='formBasicEmail']")
    public WebElement emailBox;

    @FindBy (xpath = "//input[@id='formBasicPassword']")
    public WebElement passwordBox;
}
