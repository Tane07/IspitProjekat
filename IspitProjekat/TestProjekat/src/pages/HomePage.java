package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {
    
    public HomePage(WebDriver driver) {
        super(driver);
    }

    String baseURL = "http://automationpractice.com/index.php";
    By numberOfProductsPopularBy = By.cssSelector("ul#homefeatured>li");
    By buttonBestSellersBy = By.xpath("//*[@id='home-page-tabs']/li[2]/a");
    By numberOfProductsBestSellersBy = By.cssSelector("ul#blockbestsellers>li");
    By buttonSignUp = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");
    By TshitsBy = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");

    public HomePage basePage(){
        driver.get(baseURL);
        return this;
    }    
    public HomePage validateNumberOfProductsPopular(int expectedNumberOfProducts){
        int actualNumberOFProducts = locateElements(numberOfProductsPopularBy).size();
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOFProducts);
        return this;
    }
    public HomePage validateNumberOfProductsBestSeller(int expectedNumberOfProducts){
        int actualNumberOFProducts = locateElements(numberOfProductsBestSellersBy).size();
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOFProducts);
        return this;
    }
    public HomePage switchOnBestSellers(){
        click(buttonBestSellersBy);
        return this;
    }
    public HomePage signUpButton(){
        click(buttonSignUp);
        return this;
    }
    public HomePage navigateToTshitsPage(){
        click(TshitsBy);
        return this;
    }
    public void scrollDown() {
    }
       
}
