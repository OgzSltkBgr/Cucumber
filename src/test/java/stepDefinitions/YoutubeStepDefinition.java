package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.YoutubePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class YoutubeStepDefinition {
    YoutubePage youtubePage=new YoutubePage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String youtubeUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(youtubeUrl));
    }

    @Then("search box a dinlemek istedigi {string} adini yazar")
    public void searchBoxADinlemekIstedigiAdiniYazar(String sarki) {
       youtubePage.youtubeSearchBox.sendKeys(ConfigReader.getProperty(sarki));
       ReusableMethods.waitFor(1);
       youtubePage.youtubeSearchBox.sendKeys(Keys.ENTER);
    }
    @Then("acilan sayfada cikan ikinci klibe tiklar")
    public void acilanSayfadaCikanIkinciKlibeTiklar() {
        youtubePage.ikinciSarki.click();
    }

    @Then("reklamlari atlar")
    public void reklamlariAtlar() {
        youtubePage.reklamlariAtla.click();
    }

    @Then("tam ekran yapar")
    public void tamEkranYapar() {
        ReusableMethods.waitFor(1);
        youtubePage.fullScreen.click();
    }

    @Then("calinmasi istenen {string} kadar sarki dinler")
    public void calinmasiIstenenKadarSarkiDinler(String sure) {
        int istenenSure = Integer.parseInt(ConfigReader.getProperty(sure));
        ReusableMethods.waitFor(istenenSure);
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ESCAPE);
        ReusableMethods.waitFor(1);
    }

    @Then("sag tarafta onerilen sarkilardan ilkine tiklar")
    public void sagTaraftaOnerilenSarkilardanIlkineTiklar() {
        youtubePage.onerilenIlkSarki.click();
    }
    @Then("reklam cikarsa reklamlari atlar")
    public void reklamCikarsaReklamlariAtlar() {
        if (!youtubePage.musicScreen.isDisplayed()){
            youtubePage.reklamlariAtla.click();
        }
    }
    @Then("tam ekran yapar ve calinmasi istenen {string} kadar sarki dinler")
    public void tamEkranYaparVeCalinmasiIstenenKadarSarkiDinler(String sure) {
        youtubePage.reklamlariAtla.click();
        int istenenSure = Integer.parseInt(ConfigReader.getProperty(sure));
        ReusableMethods.waitFor(istenenSure);
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.ESCAPE);
        ReusableMethods.waitFor(2);
    }

    @Then("youtube ana sayfa ya gider")
    public void youtubeAnaSayfaYaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));
    }

    @And("anasayfada oldugunu dogrular")
    public void anasayfadaOldugunuDogrular() {
        Assert.assertEquals("YouTube",Driver.getDriver().getTitle());
    }

    @And("pencereyi kapatir")
    public void pencereyiKapatir() {
        Driver.closeDriver();
    }
}
