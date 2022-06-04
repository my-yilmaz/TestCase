package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage2 {
    public AutomationExercisePage2() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement loginSignUP;

    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    public WebElement logoElementi;

    @FindBy (xpath = "//*[text()='Login to your account']")
    public WebElement logintoYourAcoountText;

    @FindBy (xpath = "(//input[@type='email'])[1]")
    public WebElement emailBox;

    @FindBy (xpath = "(//input[@type='password'])[1]")
    public WebElement passwordBox;

    @FindBy (xpath = "(//button[@type='submit'])[1]")
    public WebElement loginButonu;


    @FindBy(xpath="//*[text()=' Logged in as ']")
    public WebElement userProfil;


}
