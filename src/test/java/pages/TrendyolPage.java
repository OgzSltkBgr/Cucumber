package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TrendyolPage {
    public TrendyolPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h3[text()=\"En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da\"]")
    public WebElement trendyolLink;

    @FindBy (xpath = "//*[@data-testid='suggestion']")
    public WebElement trendyolSearchBox;

    @FindBy (xpath = "//*[@class='dscrptn']")
    public WebElement trendyolSonucYazisiWE;

    @FindBy (xpath = "//*[@id='onetrust-accept-btn-handler']")
    public WebElement trendyolCerezKabul;

    @FindBy (xpath = "(//*[@class='link-text'])[1]")
    public WebElement girisYapButonu;

    @FindBy (xpath = "//*[@id='onetrust-accept-btn-handler']")
    public WebElement cerez;

    @FindBy (xpath = "//*[@id='login-email']")
    public WebElement eposta;

    @FindBy (xpath = "//*[@id='login-password-input']")
    public WebElement sifre;

    @FindBy (xpath = "(//*[@class='tab-link'])[8]")
    public WebElement elektronikBaslik;

    @FindBy (xpath = "//*[.='Bilgisayar & Tablet']")
    public WebElement bilgisayarTablet;

    @FindBy (xpath = "//div[text()='Bilgisayar']")
    public WebElement bilgisayar;

    @FindBy (xpath = "(//div[@class='chckbox'])[5]")
    public WebElement appleCheckBox;

    @FindBy (xpath = "(//div[@class='fltr-cntnr-ttl-area'])[2]")
    public WebElement markaKategori;

    @FindBy (xpath = "(//div[@class='image-overlay-body'])[1]")
    public WebElement ilkUrun;

    @FindBy (xpath = "//*[@style='position: relative;']")
    public WebElement urunResmi;

    @FindBy (xpath = "//h1[@class='pr-new-br']")
    public WebElement zoomDogrulama;

    @FindBy (xpath = "//div[@class='product-slide']")
    public List<WebElement> urunFotolariList;

    @FindBy (xpath = "//div[@class='add-to-basket-button-text']")
    public WebElement sepeteEkle;

    @FindBy (xpath = "(//p[text()='Sepetim'])[1]")
    public WebElement sepetim;

    @FindBy (xpath = "//span[text()='Sepeti Onayla']")
    public WebElement sepetiOnayla;

    @FindBy (xpath = "(//i[@class='i-radio-selected'])[1]")
    public WebElement testAdresiRadioButton;

    @FindBy (xpath = "//*[text()='Anladım']")
    public WebElement anladim;

    @FindBy (xpath = "//*[text()='Kaydet ve Devam Et']")
    public WebElement kaydetDevamEt;

    @FindBy (xpath = "//*[text()='Ödeme Seçenekleri']")
    public WebElement odemeSecenekleri;
    @FindBy (xpath = "//*[@id='payment-fragment']")
    public WebElement iframeKart;

    @FindBy (xpath = "(//*[@id='card-number'])[1]")
    public WebElement kartBilgileri;

    @FindBy (xpath = "//*[text()='Lütfen belirtilen alanları kontrol ediniz.']")
    public WebElement uyari;

    @FindBy (xpath = "//div[@class='p-checkout-summary']")
    public WebElement siparisOzeti;

}
