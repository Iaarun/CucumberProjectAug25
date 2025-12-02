package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
  // OR locators
    public   By userName= By.name("username");
    public   By password= By.name("password");
    public    By loginButton= By.xpath("//input[@type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(userName).sendKeys(username);
    }
    public void enterPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }




}
