package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage {
    
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    By textPersonalInfo = By.xpath("//*[@id='account-creation_form']/div[1]/h3");
    By firstNameBy = By.xpath("//*[@id='customer_firstname']");  
    By lastNameBy = By.xpath("//*[@id='customer_lastname']");
    By passwordBy = By.xpath("//*[@id='passwd']");    
    By addressFirstNameBy = By.xpath("//*[@id='firstname']");
    By addressLastNameBy = By.xpath("//*[@id='lastname']");
    By addressBy = By.xpath("//*[@id='address1']");
    By cityBy = By.xpath("//*[@id='city']");
    By drpState = By.xpath("//*[@id='id_state']");
    By mobileBy = By.xpath("//*[@id='phone_mobile']");
    By registerButton = By.xpath("//*[@id='submitAccount']/span");
    By zipPostalCode = By.xpath("//*[@id='postcode']");


    public RegistrationPage verifyRegistrationPage(String expectedText){
        String personalInfo = readText(textPersonalInfo);
        assertStringEquals(personalInfo, expectedText);
        return this;        
    }
    public RegistrationPage firstNameInput(String firstNameText){
        writeText(firstNameBy, firstNameText);
        return this;
    }
    public RegistrationPage lastNameInput(String lastNameText){
        writeText(lastNameBy, lastNameText);
        return this;
    }
    public RegistrationPage passwordInput(String password){
        writeText(passwordBy, password);
        return this;
    }
    public RegistrationPage addressFirstName(String firstNameText){
        writeText(addressFirstNameBy, firstNameText);
        return this;
    }
    public RegistrationPage addressLastName(String lastNameText){
        writeText(addressLastNameBy, lastNameText);
        return this;
    }
    public RegistrationPage addressInput(String addressText){
        writeText(addressBy, addressText);
        return this;
    }
    public RegistrationPage cityInput(String cityText){
        writeText(cityBy, cityText);
        return this;
    }
    public RegistrationPage selectState(){
        Select state = new Select(driver.findElement(drpState));
        state.selectByVisibleText("Texas");
        return this;
    }
public RegistrationPage zipPostalCodeInput(String ZipPostalCodeText){
    writeText(zipPostalCode, ZipPostalCodeText);
    return this;
}

    public RegistrationPage mobileInput(String mobileNumberText){
        writeText(mobileBy, mobileNumberText);
        return this;
    }
    public RegistrationPage submitRegistration(){
        click(registerButton);
        return this;
    }
}