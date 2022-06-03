package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {
    public AutomationExercisePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    public WebElement logoElementi;

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement loginSignUP;

    @FindBy (xpath="//*[text()='New User Signup!']")
    public WebElement newUserSignUpText;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement nameKutusu;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailKutusu;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement singUpButonu;

    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement enterAccountInformationText;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement radioButton;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement days;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement months;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement years;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement signUpForOurNewsletterTik;

    @FindBy(xpath = "//input[@id='optin']")
    public WebElement receiveSpecialTik;

    @FindBy (xpath = "//input[@id='first_name']")
    public WebElement firstNameKutusu;

    @FindBy (xpath = "//select[@id='country']")
    public WebElement country;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement stateKutusu;

    @FindBy (xpath = "(//button[@type='submit'])[1]")
    public  WebElement createAccountButonu;

    @FindBy (xpath = "//*[text()='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//a[text()='Continue']")
    public WebElement continueButonu;

    @FindBy(xpath="//*[text()=' Logged in as ']")
    public WebElement userProfil;

    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteAccount;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement deleteButonu;
}
