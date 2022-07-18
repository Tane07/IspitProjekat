package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage{

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    By textMyAccount = By.xpath("//*[@id='center_column']/h1");
    By signOutButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a");
    By buttonSignUp = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");

    public MyAccountPage verifyRegistration (String expectedText){
        String myAcc = readText(textMyAccount);
        assertStringEquals(myAcc, expectedText);
        return this;        
    }
    public MyAccountPage verifyLogin ( String expectedText) {
        String signOut = readText(signOutButtonBy);
        assertStringEquals(signOut, expectedText);
        return this;
    }        
    public MyAccountPage logOut(){
        click(signOutButtonBy);
        return this;
    }
    public MyAccountPage verifyLogOut ( String expectedText) {
        String signInButton = readText(buttonSignUp);
        assertStringEquals(signInButton, expectedText);
        return this;
    }

}