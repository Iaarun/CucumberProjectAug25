package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

   By accountOverview= By.xpath("//h1[normalize-space()='Accounts Overview']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isAccountOverviewDisplayed(){
        return driver.findElement(accountOverview).isDisplayed();
    }
}
