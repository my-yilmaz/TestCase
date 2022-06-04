package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage2;
import utilities.ConfigReader;
import utilities.Driver;

public class TC03_NegatifLoginTest {
    AutomationExercisePage2 exercisePage2=new AutomationExercisePage2();
    @Test
    public void test01() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("siteUrl"));
        //3. Verify that home page is visible successfully
        Assert.assertTrue(exercisePage2.logoElementi.isDisplayed());
        //4. Click on 'Signup / Login' button
        exercisePage2.loginSignUP.click();
        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(exercisePage2.logintoYourAcoountText.isDisplayed());
        //6. Enter incorrect email address and password
        exercisePage2.emailBox.sendKeys(ConfigReader.getProperty("wrongMail"));
        exercisePage2.passwordBox.sendKeys(ConfigReader.getProperty("wrongPassword"));
        //7. Click 'login' button
        exercisePage2.loginButonu.click();
        //8. Verify error 'Your email or password is incorrect!' is visible
        Assert.assertTrue(exercisePage2.yanlisMailveSifreGirildiYazisi.isDisplayed());
        Driver.closeDriver();
    }
}
