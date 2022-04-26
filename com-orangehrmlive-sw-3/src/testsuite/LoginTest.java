package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        //Find userfield element
//        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
//        //Sending username to username field element
//        userName.sendKeys("Admin");
        sendTextToElement(By.xpath("//input[@id='txtUsername']"), "Admin");

        //Find password field element
//        WebElement passWord = driver.findElement(By.xpath("//input[@id='txtPassword']"));
//        //Sending password to password field element
//        passWord.sendKeys("admin123");
        sendTextToElement(By.xpath("//input[@id='txtPassword']"), "admin123");

        //Find login button and click on it
//        WebElement loginButton = driver.findElement(By.xpath("//input[@name='Submit']"));
//        loginButton.click();
        clickOnElement(By.xpath("//input[@name='Submit']"));

        //Verify welcome text
        //This is from requirement
        String expectedResult = "Welcome";

        //Find welcome text element and get the text
//        WebElement actualmsg = driver.findElement(By.xpath("//a[@id='welcome']"));
//       String actualResult = actualmsg.getText().substring(0, 7);//using substring to

        String actualmsg = getTextFromElement(By.xpath("//a[@id='welcome']"));
        String actual = actualmsg.substring(0, 7);

        //Validate actual and expected message
        Assert.assertEquals("Unable to navigate welcome page", expectedResult, actual);

    }
    @After
    public void teardown(){
        closeBrowser();
    }

}
