package BrainStation;

import org.testng.annotations.Test;

public class TestCase {
    Browser browser= new Browser();
    LoginPage loginPage;
    @Test
    public void goToLoginPage(){
        browser.openChromeBrowser();
          loginPage = new LoginPage();
         loginPage.gotoLoginPage();


        System.out.println("ok");
    }

    @Test
    public void verifyLogIn(){
        loginPage.verifySignIn();
    }
    @Test
    public void userSelect(){
     loginPage.selectUser();
    }

}
