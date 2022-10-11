package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YoutubePage {
    public YoutubePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//input[@id='search']")
    public WebElement youtubeSearchBox;

    @FindBy (xpath = "(//*[text()='Neşet Ertaş-Cahildim Dünyanın Rengine Kandım'])[1]")
    public WebElement ikinciSarki;

    @FindBy (xpath = "(//*[@class='style-scope ytd-compact-video-renderer'])[1]")
    public WebElement onerilenIlkSarki;

    @FindBy (xpath = "//*[@class='ytp-fullscreen-button ytp-button']")
    public WebElement fullScreen;

    @FindBy (xpath = "//div[text()='Reklamları Atla']")
    public WebElement reklamlariAtla;

    @FindBy (xpath = "(//*[@class='video-stream html5-main-video'])[1]")
    public WebElement musicScreen;

}
