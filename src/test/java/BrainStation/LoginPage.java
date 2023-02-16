package BrainStation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class LoginPage extends BasePage {
    By loginButtonLocator = By.xpath("//*[text()='Sign in ']");
    By emailId = By.id("email");
    By passId = By.id("password");
    By signInLocator = By.xpath("//*[text()='Sign in']");
    By userSelector= By.className("p-dropdown-trigger");
    By selectSharelead= By.xpath("//*[text()='Sharelead']");
    By selectContinue= By.xpath("//*[text()='Continue']");

    public LoginPage(){
        super();
    }
    public void gotoLoginPage(){
        driver.get("https://test.sharebus.co/");
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
        waitTime(3000);

    }
    public void verifySignIn(){
        WebElement email =driver.findElement(emailId);
        email.sendKeys("brainstation23@yopmail.com");

        WebElement password =driver.findElement(passId);
        password.sendKeys("Pass@1234");
        WebElement signIn =driver.findElement(signInLocator);
        signIn.click();


    }
    public void selectUser(){
        waitTime(5000);
        WebElement user =driver.findElement(userSelector);
        user.click();

        WebElement shareLead =driver.findElement(selectSharelead);
        shareLead.click();

        WebElement continueButton =driver.findElement(selectContinue);
        continueButton.click();


    }
}
