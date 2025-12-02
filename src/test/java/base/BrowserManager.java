package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserManager {
  //  WebDriver driver;
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static WebDriver getDriver() {
        WebDriver dr=  driver.get();
        if(dr==null){
            dr = new ChromeDriver();
            dr.manage().window().maximize();
         //   dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //not recommended
            dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
             driver.set(dr);
        }
        return dr;
    }

    public static void closeBrowser() {
        WebDriver dr = driver.get();
        if (dr != null) {
            try {
                dr.quit();
            } finally {
                driver.remove(); // important to avoid leaks in thread pools
            }
        }
    }
}
