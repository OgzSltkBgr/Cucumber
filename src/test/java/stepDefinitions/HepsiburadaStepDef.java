package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HepsiburadaPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class HepsiburadaStepDef {
    HepsiburadaPage hepsiburadaPage = new HepsiburadaPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("kullanici {string} sayfasina gider")
    public void kullaniciStringSayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("kullanici imleci giris yap butonu uzerine goturur")
    public void kullaniciImleciGirisYapButonuUzerineGoturur() {
        actions.moveToElement(hepsiburadaPage.girisYapMove).perform();
    }

    @Then("kullanici giris yap butonuna tiklar")
    public void kullaniciGirisYapButonunaTiklar() {
        hepsiburadaPage.girisYap.click();
    }

    @Then("kullanici eposta adresi girer")
    public void kullaniciEpostaAdresiGirer() {
        hepsiburadaPage.eMailBox.sendKeys(ConfigReader.getProperty("hepsiburadaEmail"));
        actions.sendKeys(Keys.ENTER).perform();
    }

    @Then("kullanici sifre girer")
    public void kullaniciSifreGirer() {
    }

    @And("kullanici giris yapildigini dogrular")
    public void kullaniciGirisYapildiginiDogrular() {
    }
}
