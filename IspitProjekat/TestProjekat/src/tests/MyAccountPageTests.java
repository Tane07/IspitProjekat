package tests;

import org.junit.Test;

import pages.HomePage;
import pages.MyAccountPage;
import pages.SignInPage;

public class MyAccountPageTests extends BaseTest {
    
    public HomePage homePage;
    public SignInPage signInPage;
    public MyAccountPage myAccountPage;

    String emailText = "stefan.fekete@yahoo.ca";
    String password = "12345";
    String signInButton = "Sign in";

    @Test
    public void verifyLogOut(){
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        myAccountPage = new MyAccountPage(driver);

        homePage.basePage();
        homePage.signUpButton();
        signInPage.scrollDown();
        signInPage.login(emailText, password);
        myAccountPage.logOut();
        myAccountPage.verifyLogOut(signInButton);

        try {
            Thread.sleep(3000); 
        }  catch (InterruptedException exception) {
            exception.printStackTrace();
        }    
    }

}