package stepDef;

import base.BrowserManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;
import utils.WaitUtils;

import java.time.Duration;

public class LoginStepDef {
 //   private static final String URL = "https://parabank.parasoft.com/parabank/index.htm";
    WebDriver driver= BrowserManager.getDriver();
    LoginPage loginPage= new LoginPage(driver);
    HomePage homePage= new HomePage(driver);
    WaitUtils waitUtils= new WaitUtils(driver);

    @Given("User is on parabank login page")
    public void userIsOnOrangeHRMLoginPage() {
        driver.get(ConfigReader.getURL());
    }

    @When("User logs in with username {string} and password {string}")
    public void userLogsInWithUsernameAndPassword(String username, String password) {

//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
//            driver.findElement(By.name("username")).sendKeys(username);
//
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
//            driver.findElement(By.name("password")).sendKeys(password);
//            driver.findElement(By.xpath("//input[@type='submit']")).click();
        waitUtils.waitForVisibility(driver.findElement(loginPage.userName));
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    @Then("User should be redirected to the Dashboard")
    public void userShouldBeRedirectedToTheDashboard() {
      /*  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));
        WebElement dashBoard=  driver.findElement(By.xpath("//h6[text()='Dashboard']"));
        Assert.assertTrue(dashBoard.isDisplayed()); */
       Assert.assertTrue(homePage.isAccountOverviewDisplayed());

    }
}
