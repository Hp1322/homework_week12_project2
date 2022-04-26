package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //Find forgot password link and click on it
        clickOnElement(By.linkText("Forgot your password?"));

        //Verify the text forgot your password
        //This is from requirement
        String expectedText = "Forgot Your Password?";

        //Find forgot your password text element and get the text
        String actualText = getTextFromElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));

        //Validate actual and expected text
        Assert.assertEquals("Unable to navigate on forgot password page", expectedText, actualText);

    }
    @After
    public void tearDown(){
        closeBrowser();
    }


}
