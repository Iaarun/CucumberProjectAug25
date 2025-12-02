package hooks;

import base.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        BrowserManager.getDriver();
    }

    @After
    public void tearDown(){
        BrowserManager.closeBrowser();
    }

}
