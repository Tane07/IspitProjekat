package tests;

import org.junit.Test;


import pages.HomePage;
import pages.SignInPage;


public class HomePageTests extends BaseTest {
    
    public HomePage homePage;
    public SignInPage signInPage;

    int numberOfAllProductsPopular = 7;
    int numberOfAllProductsBestSeller = 7;
    


    @Test
    public void openingSiteTest(){

        homePage = new HomePage(driver);

        homePage.basePage();
             try {
             Thread.sleep(3000); 
         }  catch (InterruptedException exception) {
             exception.printStackTrace();
         }
    }
    @Test
    public void checkNumberOfProductsPopular() {

        homePage = new HomePage(driver);
        
        homePage.basePage();
        homePage.scrollDown();
        homePage.validateNumberOfProductsPopular(numberOfAllProductsPopular);

        try {
            Thread.sleep(3000); 
        }  catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
    @Test
    public void checkNumberOfProductsBestSeller() {

        homePage = new HomePage(driver);
        
        homePage.basePage();
        homePage.scrollDown();
        homePage.switchOnBestSellers();
        homePage.validateNumberOfProductsBestSeller(numberOfAllProductsBestSeller);
        
            try {
            Thread.sleep(3000); 
        }   catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }
    @Test
    public void navigateToSingUpPage() {

        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);

        homePage.basePage();
        homePage.signUpButton();
        homePage.scrollDown();
        signInPage.verifySignInNavigation();


        
        try {
            Thread.sleep(3000); 
        }   catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}