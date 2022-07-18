package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TshirtsPage extends BasePage {

    public TshirtsPage(WebDriver driver) {
        super(driver);
    }

    By tshirtsTextValidation = By.xpath("//*[@id='center_column']/h1/span[1]");
    By addToCartBy = By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span");
    By productsPictureBy = By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img");
    By productCartTextBy = By.xpath("//*[@id='layer_cart']/div[1]/div[1]/h2");
    By checkOutButtonBy = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");

    public TshirtsPage verifyTshitsPage(String expectedText){
        scrollDown2();
        String signOut = readText(tshirtsTextValidation);
        assertStringEquals(signOut, expectedText);
        return this; 
    }
    public void scrollDown2() {
    }
    public TshirtsPage putProductInCart(){
        WebElement ele = driver.findElement(productsPictureBy);
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        click(addToCartBy);
        return this;
    }
    public TshirtsPage verifyProductInCart(String expectedText){
        String productCart = readText(productCartTextBy);
        assertStringEquals(productCart, expectedText);
        return this; 
    }
    public TshirtsPage navigateToCheckOutPage(){
        click(checkOutButtonBy);
        return this;
    }
    
}