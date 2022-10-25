package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BlueRentCarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class BlueRentCarStepDef {
    BlueRentCarPage blueRentCarPage = new BlueRentCarPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("kullanici {string} ana sayfasinda")
    public void kullaniciAnaSayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSure) {
        try {
            Thread.sleep(istenenSure*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @And("kullanici {string} yazisi gorunene kadar bekler")
    public void kullaniciYazisiGoruneneKadarBekler(String locate) {
        //
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(blueRentCarPage.login));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        blueRentCarPage.login.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        blueRentCarPage.emailBox.sendKeys("gecersizgmail.com");
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        blueRentCarPage.passwordBox.sendKeys("gecersizPassword");
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        actions.sendKeys(Keys.ENTER).perform();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(blueRentCarPage.login.isDisplayed());
    }



}
