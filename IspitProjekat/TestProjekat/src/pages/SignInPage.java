package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignInPage extends BasePage {
    
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    By createAnAccountBy = By.xpath("//*[@id='SubmitCreate']/span");
    By emailBy = By.xpath("//*[@id='email_create']");
    By loginEmailBy = By.xpath("//*[@id='email']");
    By loginPasswordBy = By.xpath("//*[@id='passwd']");
    By signInButtonBy = By.xpath("//*[@id='SubmitLogin']/span");
    By signOutButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a");
    


    public SignInPage verifySignInNavigation(){
        assertElementVisible(createAnAccountBy);
        return this;
    }
    public SignInPage emailInput(String emailText){
        writeText(emailBy, emailText);
        click(createAnAccountBy);
        return this;
    }
    public SignInPage login (String emailText, String password){
        writeText(loginEmailBy, emailText);
        writeText(loginPasswordBy, password);
        click(signInButtonBy);
        return this;
    }

    
}