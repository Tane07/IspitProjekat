package tests;


import org.junit.Test;

import pages.HomePage;
import pages.MyAccountPage;
import pages.RegistrationPage;
import pages.SignInPage;

public class SignInPageTests extends BaseTest {

    public HomePage homePage; 
    public SignInPage signInPage;
    public RegistrationPage registrationPage;
    public MyAccountPage myAccountPage;

    
    String emailText = "stefan.fekete@yahoo.ca";
    String password = "12345";
    String signOutButton = "Sign out";
    String textPersonalInfo = "YOUR PERSONAL INFORMATION";

    @Test
    public void proceedToRegistrationPage(){

        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        registrationPage = new RegistrationPage(driver);
        myAccountPage = new MyAccountPage(driver);
        

        homePage.basePage();
        homePage.signUpButton();
        signInPage.scrollDown();
        signInPage.emailInput(emailText);
        registrationPage.verifyRegistrationPage(textPersonalInfo);
        

        try {
            Thread.sleep(3000); 
        }  catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }
    @Test
    public void login(){

        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        myAccountPage = new MyAccountPage(driver);

        homePage.basePage();
        homePage.signUpButton();
        signInPage.scrollDown();
        signInPage.login(emailText, password);
        myAccountPage.verifyLogin(signOutButton);


        try {
            Thread.sleep(3000); 
        }  catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }

}