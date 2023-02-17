package BrainStation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    public static WebDriver driver;

    public void openChromeBrowser() {
        System.out.println("hello");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void closeChrome() {
        driver.close();

    }
    public static WebDriver getDriver(){
        return driver;

    }

}
