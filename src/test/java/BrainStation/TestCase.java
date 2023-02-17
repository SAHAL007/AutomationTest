package BrainStation;

import org.testng.annotations.Test;

public class TestCase {
    Browser browser= new Browser();
    Pages pages;
    @Test
    public void gotoLoginPage(){
        browser.openChromeBrowser();
          pages = new Pages();
         pages.gotoLoginPage();


        System.out.println("ok");
    }

    @Test
    public void verifyLogIn(){
        pages.verifySignIn();
    }
    @Test
    public void userSelect(){
     pages.selectUser();
    }
    @Test
    public void  clickShare(){
        pages.shareBusSelect();
    }
    @Test
    public void tripInfo(){
        pages.tripDetails();
    }

    @Test

    public void membershipInfo(){
        pages.membershipInformation();
    }

    @Test

    public void closeBrowser(){
        browser.closeChrome();
    }

}
