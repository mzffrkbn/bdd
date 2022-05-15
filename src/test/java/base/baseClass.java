package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {

    public static WebDriver driver;

    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver","src/test/Driver/chromedriver2");
        driver = new ChromeDriver();
        return driver;
    }

    public static void closeDriver(){
        //driver.quit();
        //driver=null;
    }


}
