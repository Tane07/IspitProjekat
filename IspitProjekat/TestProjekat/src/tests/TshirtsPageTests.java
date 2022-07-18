package tests;

import org.junit.Test;

import pages.HomePage;
import pages.TshirtsPage;

public class TshirtsPageTests extends BaseTest {
    
    public HomePage homePage;
    public TshirtsPage tshirtsPage;

    String TshirtsText = "T-SHIRTS ";
    String productInCartText = "Product successfully added to your shopping cart";


    @Test
    public void tshirtsCartTest(){

        homePage = new HomePage(driver);
        tshirtsPage = new TshirtsPage(driver);

        homePage.basePage();
        homePage.navigateToTshitsPage();
        tshirtsPage.verifyTshitsPage(TshirtsText);
        tshirtsPage.putProductInCart();
        tshirtsPage.verifyProductInCart(productInCartText);

        try {
            Thread.sleep(3000); 
        }  catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }

}