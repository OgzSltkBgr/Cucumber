package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MedunnaPage {
    public MedunnaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@data-icon='user']")
    public WebElement signInDD;

    @FindBy (xpath = "//*[@id='login-item']")
    public WebElement sigIn;

    @FindBy (xpath = "//*[@id='username']")
    public WebElement userName;

    @FindBy (xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement myPages;

    @FindBy (xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointments;

    @FindBy (xpath = "//*[text()='Edit']")
    public WebElement edit;

    @FindBy (xpath = "//*[@id='appointment-id']")
    public WebElement appointmentId;

    @FindBy (xpath = "//*[@id='appointment-startDate']")
    public WebElement appointmentStartDateTime;

    @FindBy (xpath = "//*[@id='appointment-endDate']")
    public WebElement appointmentEndDateTime;

    @FindBy (xpath = "//*[@id='appointment-anamnesis']")
    public WebElement appointmentAnamnesis;

    @FindBy (xpath = "//*[@id='appointment-treatment']")
    public WebElement appointmentTreatment;

    @FindBy (xpath = "//*[@id='appointment-diagnosis']")
    public WebElement appointmentDiagnosis;

    @FindBy (xpath = "//*[@id='appointment-prescription']")
    public WebElement appointmentPrescription;

    @FindBy (xpath = "//*[@id='prescriptionLabel']")
    public WebElement descriptionBaslik;

    @FindBy (xpath = "//*[@id='appointment-description']")
    public WebElement appointmentDescription;

    @FindBy (xpath = "//*[@id='save-entity']")
    public WebElement appointmentSave;

    @FindBy (xpath = "//*[text()='The Appointment is updated with identifier 302324']")
    public WebElement appointmentUpdateMessage;

    @FindBy (xpath = "(//tbody/tr/td)[1]")
    public WebElement hastaId;

    @FindBy (xpath = "(//tbody/tr/td)[2]")
    public WebElement hastaStartDateTime;

    @FindBy (xpath = "(//tbody/tr/td)[3]")
    public WebElement hastaEndDateTime;

    @FindBy (xpath = "(//tbody/tr/td)[4]")
    public WebElement hastaStatus;

    @FindBy (xpath = "(//tbody/tr/td)[12]")
    public WebElement hastaPhysician;

    @FindBy (xpath = "//div[@class='invalid-feedback']")
    public WebElement fieldRequiredMessage;

    @FindBy(xpath = "//*[@id='appointment-status']")
    public WebElement appointmentStatusDD;

    @FindBy(xpath = "//*[@id='appointment-status']")
    public List<WebElement> appointmentStatusList;

    @FindBy (xpath = "//input[@id='fromDate']")
    public WebElement appointmentFrom;

    @FindBy (xpath = "//input[@id='toDate']")
    public WebElement appointmentTo;

}
