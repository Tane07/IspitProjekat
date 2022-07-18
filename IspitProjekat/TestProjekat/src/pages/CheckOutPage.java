package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends BasePage {

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    By yourCheckOutBy = By.xpath("//*[@id='columns']/div[1]/span[2]");
    By totalProductsBy = By.xpath("//*[@id='total_product']");
    By totalShippingBy = By.xpath("//*[@id='total_shipping']");
    By totalBy = By.xpath("//*[@id='total_price_without_tax']");
    By taxBy = By.xpath("//*[@id='total_tax']");
    By totalPricePlusTaxBy = By.xpath("//*[@id='total_price']");




    public CheckOutPage verifyCheckOutPage(String expectedText){
        scrollDown2();
        String checkOutPage = readText(yourCheckOutBy);
        assertStringEquals(checkOutPage, expectedText);
        return this;
    }

    public void scrollDown2() {
    }

    public CheckOutPage matchingTotalProductsPrice(double expected){
        String totalProductsPrice = readText(totalProductsBy);
        double actual = convertStringtoDouble(totalProductsPrice);
        doubleCompare(expected, actual, 0.1);
        return this;
    }
    public void doubleCompare(double expected, double actual, double d) {
    }

    public double convertStringtoDouble(String totalProductsPrice) {
        return 0;
    }

    public CheckOutPage matchingShippingPrice(double expected){
        String totalShippingPrice = readText(totalShippingBy);
        double actual = convertStringtoDouble(totalShippingPrice);
        doubleCompare(expected, actual, 0.1);
        return this;
    }
    public CheckOutPage matchingTotalPrice(double expected){
        String totalPrice = readText(totalBy);
        double actual = convertStringtoDouble(totalPrice);
        doubleCompare(expected, actual, 0.1);
        return this;
    }
        public CheckOutPage matchingTax(double expected){
        String tax = readText(taxBy);
        double actual = convertStringtoDouble(tax);
        doubleCompare(expected, actual, 0.1);
        return this;
    }
    public CheckOutPage matchingTotalPricePlusTax(double expected){
        String totalPricePlusTax = readText(totalPricePlusTaxBy);
        double actual = convertStringtoDouble(totalPricePlusTax);
        doubleCompare(expected, actual, 0.1);
        return this;
    }
    
}