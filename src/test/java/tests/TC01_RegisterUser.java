package tests;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_RegisterUser {
    // 1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully
    //4. Click on 'Signup / Login' button
    //5. Verify 'New User Signup!' is visible
    //6. Enter name and email address
    //7. Click 'Signup' button
    //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
    //9. Fill details: Title, Name, Email, Password, Date of birth
    //10. Select checkbox 'Sign up for our newsletter!'
    //11. Select checkbox 'Receive special offers from our partners!'
    //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    //13. Click 'Create Account button'
    //14. Verify that 'ACCOUNT CREATED!' is visible
    //15. Click 'Continue' button
    //16. Verify that 'Logged in as username' is visible
    //17. Click 'Delete Account' button
    //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

    AutomationExercisePage exercisePage = new AutomationExercisePage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    Select select;

    @Test
    public void test01() throws InterruptedException {
        // 1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("siteUrl"));
        //3. Verify that home page is visible successfully
        Assert.assertTrue(exercisePage.logoElementi.isDisplayed());
        //4. Click on 'Signup / Login' button
        exercisePage.loginSignUP.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //5. Verify 'New User Signup!' is visible
        Assert.assertTrue(exercisePage.newUserSignUpText.isDisplayed());
        //6. Enter name and email address
        exercisePage.nameKutusu.sendKeys(faker.name().name());
        exercisePage.emailKutusu.sendKeys(faker.internet().emailAddress());
        //7. Click 'Signup' button
        exercisePage.singUpButonu.click();
        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        Thread.sleep(1000);
        Assert.assertTrue(exercisePage.enterAccountInformationText.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        //9. Fill details: Title, Name, Email, Password, Date of birth
        //10. Select checkbox 'Sign up for our newsletter!'
        //11. Select checkbox 'Receive special offers from our partners!'
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        //13. Click 'Create Account button'
        Thread.sleep(1000);
        actions.click(exercisePage.radioButton).click()
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .perform();
        select = new Select(exercisePage.days);
        select.selectByVisibleText("12");
        select = new Select(exercisePage.months);
        select.selectByVisibleText("May");
        select = new Select(exercisePage.years);
        select.selectByVisibleText("1990");
        Thread.sleep(1000);
        exercisePage.signUpForOurNewsletterTik.click();
        exercisePage.receiveSpecialTik.click();
        actions.click(exercisePage.firstNameKutusu)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().catchPhrase())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().streetAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        Thread.sleep(1000);
        select = new Select(exercisePage.country);
        select.selectByVisibleText("United States");
        actions.click(exercisePage.stateKutusu)
                .sendKeys(faker.address().state())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .perform();
        Thread.sleep(1000);
        exercisePage.createAccountButonu.click();
        //14. Verify that 'ACCOUNT CREATED!' is visible
        Assert.assertTrue(exercisePage.accountCreatedText.isDisplayed());
        //15. Click 'Continue' button
        exercisePage.continueButonu.click();
        //16. Verify that 'Logged in as username' is visible
        Assert.assertTrue(exercisePage.userProfil.isDisplayed());
        //17. Click 'Delete Account' button
        exercisePage.deleteAccount.click();
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        //exercisePage.deleteButonu.click();
        // Bu son basamakta site calısmiyor.
    }
}
