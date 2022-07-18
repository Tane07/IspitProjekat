package tests;

import org.junit.Test;

import pages.HomePage;
import pages.MyAccountPage;
import pages.RegistrationPage;
import pages.SignInPage;

public class RegistrationPageTests extends BaseTest {
    
    public HomePage homePage;
    public SignInPage signInPage;
    public RegistrationPage registrationPage;
    public MyAccountPage myAccountPage;

    String emailText = "srdjanomatori@gmail.com";
    String textPersonalInfo = "YOUR PERSONAL INFORMATION";
    String firstNameText = "Srdjan";
    String lastNameText = "Sutuljic";
    String password = "Code23";
    String addressText = "Dzona Kenedija 10E";
    String cityText = "Beograd";
    String mobileNumberText = "0649098767";
    String ZipPostalCodeText = "11070";
    String textMyAccount = "MY ACCOUNT";

   

    @Test
    public void verifyRegistrationPage(){
 
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        registrationPage = new RegistrationPage(driver);
        myAccountPage = new MyAccountPage(driver);
        
        homePage.basePage();
        homePage.signUpButton();
        signInPage.scrollDown();
        signInPage.emailInput(emailText);
        registrationPage.verifyRegistrationPage(textPersonalInfo);
        registrationPage.firstNameInput(firstNameText);
        registrationPage.lastNameInput(lastNameText);
        registrationPage.passwordInput(password);
        registrationPage.addressInput(addressText);
        registrationPage.cityInput(cityText);
        registrationPage.selectState();
        registrationPage.zipPostalCodeInput(ZipPostalCodeText);
        registrationPage.mobileInput(mobileNumberText);
        registrationPage.submitRegistration();
        myAccountPage.verifyRegistration(textMyAccount);
        
        try {
            Thread.sleep(3000); 
        }  catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

}