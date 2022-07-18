package tests;

import org.junit.Test;

import pages.CheckOutPage;
import pages.HomePage;
import pages.TshirtsPage;

public class CheckOutPageTests extends BaseTest {

    public HomePage homePage;
    public TshirtsPage tshirtsPage;
    public CheckOutPage checkOutPage;

    String TshirtsText = "T-SHIRTS ";
    String productInCartText = "Product successfully added to your shopping cart";
    String yourCheckOutText = "Your shopping cart";
    double totalProductsPriceText = 16.51;
    double totalShippingPrice = 2.00;
    double totalPrice = totalProductsPriceText + totalShippingPrice;
    double tax = 0.00;
    double totalPricePlusTax = totalPrice + tax;

    @Test
    public void tshirtsCartTest(){

        homePage = new HomePage(driver);
        tshirtsPage = new TshirtsPage(driver);
        checkOutPage = new CheckOutPage(driver);

        homePage.basePage();
        homePage.navigateToTshitsPage();
        tshirtsPage.verifyTshitsPage(TshirtsText);
        tshirtsPage.putProductInCart();
        tshirtsPage.verifyProductInCart(productInCartText);
        tshirtsPage.navigateToCheckOutPage();
        checkOutPage.verifyCheckOutPage(yourCheckOutText);
        checkOutPage.matchingTotalProductsPrice(totalProductsPriceText);
        checkOutPage.matchingShippingPrice(totalShippingPrice);
        checkOutPage.matchingTotalPrice(totalPrice);
        checkOutPage.matchingTax(tax);
        checkOutPage.matchingTotalPricePlusTax(totalPricePlusTax);



        try {
            Thread.sleep(3000); 
        }  catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }

}