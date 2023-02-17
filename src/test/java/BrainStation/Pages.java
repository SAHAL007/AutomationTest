package BrainStation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Pages extends BasePage {
    By loginButtonLocator = By.xpath("//*[text()='Sign in ']");
    By emailId = By.id("email");
    By passId = By.id("password");
    By signInLocator = By.xpath("//*[text()='Sign in']");
    By userSelector= By.className("p-dropdown-trigger");
    By selectSharelead= By.xpath("//*[text()='Sharelead']");
    By selectContinue= By.xpath("//*[text()='Continue']");
    By selectShareBus= By.xpath("//*[text()='Set up a Sharebus']");
    By formId= By.id("startPoint");
    By destinationId= By.id("destination");
    By departurePath= By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/form/div[1]/div[3]/div[1]/div[1]/div/div[1]/span/input");

    By departureTimePath= By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/form/div[1]/div[3]/div[1]/div[1]/div/div[2]/span/input");
    By returnDatePath = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/form/div[1]/div[3]/div[2]/div[1]/div/div[1]/span/input");

    By returnTimePath= By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/form/div[1]/div[3]/div[2]/div[1]/div/div[2]/span/input");

    By selectTripContinue=By.xpath("//*[text()='Continue']");

    By selectYes = By.xpath("//*[text()='Yes']");
    By dropdownClass = By.className("fi fi-chevron-down");
    By selectNtnui = By.className("//*[text()='NTNUI']");
    public Pages(){
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
        waitTime(10000);

        WebElement user =driver.findElement(userSelector);
        user.click();

        WebElement shareLead =driver.findElement(selectSharelead);
        shareLead.click();

        WebElement continueButton =driver.findElement(selectContinue);
        continueButton.click();


    }
    public void shareBusSelect(){
        waitTime(10000);

        WebElement setupShareBus =driver.findElement(selectShareBus);

        scrollToElement(setupShareBus);
        waitTime(2000);
        setupShareBus.click();
    }
    public void tripDetails(){
        waitTime(5000);

      WebElement from =driver.findElement(formId);
      from.clear();
      from.sendKeys("Oslo");
      waitTime(2000);

      from.sendKeys(Keys.DOWN);
      waitTime(2000);

      from.sendKeys(Keys.ENTER);
      waitTime(3000);

      WebElement destination =driver.findElement(destinationId);
      destination.sendKeys("Kolbotn");
      waitTime(2000);

      destination.sendKeys(Keys.DOWN);
        waitTime(2000);

      destination.sendKeys(Keys.ENTER);
      waitTime(2000);

      WebElement departure =driver.findElement(departurePath);
      departure.sendKeys("Saturday, 25.02.2023");
      waitTime(4000);

      WebElement departureTime =driver.findElement(departureTimePath);
      departureTime.clear();
      waitTime(4000);

      departureTime.sendKeys("15:15");
      waitTime(4000);

      WebElement returnDate =driver.findElement(returnDatePath);
      returnDate.sendKeys("Monday, 27.02.2023");
      waitTime(4000);

      WebElement returnTime =driver.findElement(returnTimePath);
      returnTime.clear();
      waitTime(4000);

      returnTime.sendKeys("15:15");

      //returnTime.click();
      waitTime(4000);

      WebElement tripContinue = driver.findElement(selectTripContinue);
      scrollToElement(tripContinue);
      waitTime(3000);
      tripContinue.click();


    }
    public void membershipInformation(){
        waitTime(5000);

        WebElement yesButton = driver.findElement(selectYes);
        scrollToElement(yesButton);
        waitTime(3000);
        yesButton.click();
        waitTime(2000);
        WebElement dropDown = driver.findElement(dropdownClass);
        dropDown.click();
        waitTime(3000);
        WebElement ntnui =driver.findElement(selectNtnui);
        ntnui.click();

    }
}
