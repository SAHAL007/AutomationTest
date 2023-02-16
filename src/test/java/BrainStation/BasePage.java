package BrainStation;

import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;
    public BasePage(){
        this.driver = Browser.getDriver();
    }
    public void waitTime(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

