package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HepsiburadaPage {
    public HepsiburadaPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//div[@class='sf-OldMyAccount-MjrNQp_LLdAaN1g0xvSz sf-OldMyAccount-PXwq1OUkBqnJIa_AiSrJ sf-OldMyAccount-PwltpvPnXbB2agEKtsYd']")
    public WebElement girisYapMove;

    @FindBy (xpath = "//a[@id='login']")
    public WebElement girisYap;

    @FindBy (xpath = "//input[@id='txtUserName']")
    public WebElement eMailBox;

}
