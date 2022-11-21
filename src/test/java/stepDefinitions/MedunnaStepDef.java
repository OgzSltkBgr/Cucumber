package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.junit.internal.RealSystem;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

public class MedunnaStepDef {
    MedunnaPage medunnaPage = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Doktor {string} sayfasina gider")
    public void doktorSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Doktor sign in butonuna basar")
    public void doktorSignInButonunaBasar() {
        medunnaPage.signInDD.click();
        medunnaPage.sigIn.click();
    }

    @Then("Doktor kullanici adi ve sifre girerek siteye giris yapar")
    public void doktorKullaniciAdiVeSifreGirerekSiteyeGirisYapar() {
        medunnaPage.userName.sendKeys(ConfigReader.getProperty("doktorUsername"));
        medunnaPage.password.sendKeys(ConfigReader.getProperty("doktorPassword"), Keys.ENTER);
    }

    @Then("Doktor My Pages butonuna tiklar")
    public void doktorMyPagesButonunaTiklar() {
        medunnaPage.myPages.click();
    }

    @Then("Doktor My Appointments butonuna tiklar")
    public void doktorMyAppointmentsButonunaTiklar() {
        medunnaPage.myAppointments.click();
    }

    @Then("Doktor Apponintments sayfasinda edit butonuna tiklar")
    public void doktorApponintmentsSayfasindaEditButonunaTiklar() {
        ReusableMethods.jsExecutorScrool(medunnaPage.myPages);
        medunnaPage.edit.click();
    }

    @Then("Doktor id, Start DateTime, End DateTime ve Status un bilgileri oldugunu dogrular")
    public void doktorIdStartDateTimeEndDateTimeVeStatusUnBilgileriOldugunuDogrular() {
        Assert.assertTrue(medunnaPage.appointmentId.isDisplayed());
        Assert.assertTrue(medunnaPage.appointmentStartDateTime.isDisplayed());
        Assert.assertTrue(medunnaPage.appointmentEndDateTime.isDisplayed());

    }

    @Then("Doktor anemnesis, treatment, diagnosis alanlarini doldurur")
    public void doktorAnemnesisTreatmentDiagnosisAlanlariniDoldurur() {
        medunnaPage.appointmentAnamnesis.clear();
        medunnaPage.appointmentAnamnesis.sendKeys("Gecmis rahatsizligi bulunmamakta");
        medunnaPage.appointmentTreatment.clear();
        medunnaPage.appointmentTreatment.sendKeys("gozluk + Goz damlasi");
        medunnaPage.appointmentDiagnosis.clear();
        medunnaPage.appointmentDiagnosis.sendKeys("0.50 Astigmat");
    }

    @Then("Doktor Prescription ve Description alanlarini gerekli ise doldurur")
    public void doktorPrescriptionVeDescriptionAlanlariniGerekliIseDoldurur() {
        medunnaPage.appointmentPrescription.clear();
        medunnaPage.appointmentPrescription.sendKeys("0.50 Astigmat gozluk, aqua goz damlasi gunde 5 damla");
        actions.sendKeys(Keys.TAB).perform();
    }

    @Then("Doktor save butonuna tiklar")
    public void doktorSaveButonunaTiklar() {
        ReusableMethods.jsExecutorScrool(medunnaPage.appointmentDiagnosis);
        ReusableMethods.waitFor(2);
        medunnaPage.appointmentSave.click();
        ReusableMethods.waitForVisibility(medunnaPage.edit,10);
    }

    @And("Doktor {string} mesajini dogrular")
    public void doktorMesajiniDogrular(String message) {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(medunnaPage.appointmentUpdateMessage.isDisplayed());
    }


    @Then("Doktor hasta id sinin oldugunu dogrular")
    public void doktorHastaIdSininOldugunuDogrular() {
        //System.out.println("medunnaPage.hastaId = " + medunnaPage.hastaId.getText());
        Assert.assertTrue(medunnaPage.hastaId.isDisplayed());
    }

    @Then("Doktor hastaya ait start date time oldugunu dogrular")
    public void doktorHastayaAitStartDateTimeOldugunuDogrular() {
        Assert.assertTrue(medunnaPage.hastaStartDateTime.isDisplayed());
    }

    @Then("Doktor hastaya ait end date time oldugunu dogrular")
    public void doktorHastayaAitEndDateTimeOldugunuDogrular() {
        Assert.assertTrue(medunnaPage.hastaEndDateTime.isDisplayed());
    }

    @Then("Doktor hastaya ait statusun oldugunu dogrular")
    public void doktorHastayaAitStatusnOldugunuDogrular() {
        Assert.assertTrue(medunnaPage.hastaStatus.isDisplayed());
    }

    @Then("Doktor physcian olarak kendi ismini dogrular")
    public void doktorPhyscianOlarakKendiIsminiDogrular() {
        Assert.assertTrue(medunnaPage.hastaPhysician.isDisplayed());
    }

    @Then("Doktor Create or Edit an Appointment sayfasinda Anamnesis e aciklama girer")
    public void doktorCreateOrEditAnAppointmentSayfasindaAnamnesisEAciklamaGirer() {
        medunnaPage.appointmentAnamnesis.clear();
        medunnaPage.appointmentAnamnesis.sendKeys("Gecmis rahatsizligi bulunmamakta");

    }

    @Then("Doktor Create or Edit an Appointment sayfasinda Treatment e aciklama girer")
    public void doktorCreateOrEditAnAppointmentSayfasindaTreatmentEAciklamaGirer() {
        medunnaPage.appointmentTreatment.clear();
        medunnaPage.appointmentTreatment.sendKeys("gozluk + Goz damlasi");

    }

    @Then("Doktor Create or Edit an Appointment sayfasinda Diagnosis e aciklama girer")
    public void doktorCreateOrEditAnAppointmentSayfasindaDiagnosisEAciklamaGirer() {
        medunnaPage.appointmentDiagnosis.clear();
        medunnaPage.appointmentDiagnosis.sendKeys("0.50 Astigmat");
        ReusableMethods.waitFor(1);
    }

    @Then("Doktor Create or Edit an Appointment sayfasinda prescription sekmesine tiklar, sonra sayfada bos bir alana tiklar")
    public void doktorCreateOrEditAnAppointmentSayfasindaPrescriptionSekmesineTiklarSonraSayfadaBosBirAlanaTiklar() {
        ReusableMethods.waitFor(1);
        medunnaPage.appointmentPrescription.clear();
        ReusableMethods.waitFor(1);
        medunnaPage.descriptionBaslik.click();
    }

    @Then("Doktor description ve sekmesine tiklar, sonra sayfada bos bir alana tiklar")
    public void doktorDescriptionVeSekmesineTiklarSonraSayfadaBosBirAlanaTiklar() {
        medunnaPage.appointmentDescription.click();
        medunnaPage.appointmentDescription.clear();
        medunnaPage.descriptionBaslik.click();
    }

    @Then("Doktor This field is required. uyarisinin olmadigini dogrular")
    public void doktorThisfieldisrequiredUyarisininOlmadiginiDogrular() {
        ReusableMethods.waitFor(3);
        Assert.assertFalse(medunnaPage.fieldRequiredMessage.isDisplayed());
    }

    @Then("Doktor Status menusu altinda Completed secer")
    public void doktorStatusMenusuAltindaCompletedSecer() throws IOException {
        ReusableMethods.waitFor(1);
        ReusableMethods.jsExecutorScrool(medunnaPage.myPages);
        Select select = new Select(medunnaPage.appointmentStatusDD);
        select.selectByVisibleText("COMPLETED");
        ReusableMethods.getScreenshot("US011 Status Completed Dogrulama");
        ReusableMethods.waitFor(1);
    }
    @Then("Doktor Status menusu altinda Pending secer")
    public void doktorStatusMenusuAltindaPendingSecer() throws IOException {
        Select select = new Select(medunnaPage.appointmentStatusDD);
        select.selectByVisibleText("PENDING");
        ReusableMethods.getScreenshot("US011 Status Pending");
        ReusableMethods.waitFor(1);
    }
    @Then("Doktor Status menusu altinda Cancelled secer")
    public void doktorStatusMenusuAltindaCanceledSecer() throws IOException {
        Select select = new Select(medunnaPage.appointmentStatusDD);
        select.selectByVisibleText("CANCELLED");
        ReusableMethods.getScreenshot("US01 Status Cancelled");
        ReusableMethods.waitFor(1);
    }

    @And("Doktor Appointments altinda from sekmesinin altinda tarih goruldugunu dogrular")
    public void doktorAppointmentsAltindaFromSekmesininAltindaTarihGoruldugunuDogrular() {
        Assert.assertTrue(medunnaPage.appointmentFrom.isDisplayed());
    }

    @And("Doktor Appointments altinda to sekmesinin altinda tarih goruldugunu dogrular")
    public void doktorAppointmentsAltindaToSekmesininAltindaTarihGoruldugunuDogrular() {
        Assert.assertTrue(medunnaPage.appointmentTo.isDisplayed());
    }
}
