package BrainStation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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

    By selectYes = By.xpath("//*[contains(@class,'text-start')]/*[text()='Yes']");
    By dropdownClass = By.cssSelector(".form-control.rounded");
    By selectNtnui = By.className("//*[text()='NTNUI']");
    By selectNeedTicket = By.xpath("//*[text()='Need tickets for yourself?']/following-sibling::div/*[text()='No']");
    By selectTicketDiscounts =By.xpath("//*[text()='Activate ticket discounts?']/following-sibling::div/*[text()='No']");
    By selectSharebus =By.xpath("//*[text()='Create Sharebus']");
    By selectPublish =By.xpath("//*[text()='Publish']");
    By selectTrip =By.cssSelector(".form-control.rounded.is-invalid");
    By selectCategory =By.xpath("//*[text()='Sport']");
    By selectPreview =By.xpath("//*[text()='Preview and publish']");
    By selectMyBus =By.xpath("//*[text()='My busses']");
    By selectMyTour =By.xpath("//*[text()='Tour']");
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
        waitTime(15000);

        WebElement yesButton = driver.findElement(selectYes);
//        scrollToElement(yesButton);
        yesButton.click();
        waitTime(2000);

        WebElement dropDown = driver.findElement(dropdownClass);
        dropDown.sendKeys("NTNUI");
        waitTime(3000);

        WebElement continueButton = driver.findElement(selectTripContinue);
        scrollToElement(continueButton);
        continueButton.click();
        waitTime(3000);

        WebElement needTicket =driver.findElement(selectNeedTicket);
        scrollToElement(needTicket);
        needTicket.click();
        waitTime(2000);

        WebElement needDiscount =driver.findElement(selectTicketDiscounts);
        scrollToElement(needDiscount);
        needDiscount.click();
        waitTime(2000);

        WebElement createSharebus =driver.findElement(selectSharebus);
        scrollToElement(createSharebus);
        createSharebus.click();
        waitTime(20000);

        WebElement publishButton =driver.findElement(selectPublish);
        scrollToElement(publishButton);
        publishButton.click();
        waitTime(12000);

        WebElement tripName =driver.findElement(selectTrip);
        tripName.sendKeys("Tour");
        waitTime(5000);

        WebElement category =driver.findElement(selectCategory);
        category.click();
        waitTime(5000);

        WebElement previewPublish =driver.findElement(selectPreview);
        scrollToElement(previewPublish);
        previewPublish.click();
        waitTime(10000);

        WebElement publishButton2 =driver.findElement(selectPublish);
        scrollToElement(publishButton2);
        publishButton2.click();
        waitTime(10000);


        WebElement myBusButton =driver.findElement(selectMyBus);
        scrollToElement(myBusButton);
        myBusButton.click();
        waitTime(10000);

        WebElement myTour =driver.findElement(selectMyTour);
        scrollToElement(myTour);
        if(myTour.isDisplayed()){
            System.out.println("The new Trip is displayed");
        }
        else {
            System.out.println("The new Trip is not displayed");
        }
        waitTime(2000);

    }
}
