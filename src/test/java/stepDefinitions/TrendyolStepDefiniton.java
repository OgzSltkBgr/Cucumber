package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import pages.TrendyolPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TrendyolStepDefiniton {
   /* TrendyolPage trendyolPage = new TrendyolPage();
    GooglePage googlePage = new GooglePage();
    int urunSayisiTrendyol;
    String titleTrendyol;

    @Then("trendyol'u aratiniz")
    public void trendyolUAratiniz() {
        googlePage.googleSearchBox.sendKeys("Trendyol", Keys.ENTER);
    }
    @And("trendyol linkini bulup siteye gidiniz")
    public void trendyolLinkiniBulupSiteyeGidiniz() {
        trendyolPage.trendyolLink.click();
        trendyolPage.trendyolCerezKabul.click();
    }
    @Then("makas aratiniz")
    public void makasAratiniz() {
        trendyolPage.trendyolSearchBox.sendKeys("makas",Keys.ENTER);
        titleTrendyol=Driver.getDriver().getTitle();
    }

    @And("toplam urun sayisini aliniz")
    public void toplamUrunSayisiniAliniz() {
        String sonucSayisi=trendyolPage.trendyolSonucYazisiWE.getText();
        String [] sonucSayisiArr= sonucSayisi.split(" ");
        urunSayisiTrendyol= Integer.parseInt(sonucSayisiArr[3]);
    }*/
}
