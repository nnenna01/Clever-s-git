package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewtoursRegisterPage extends BasePages{
    public NewtoursRegisterPage(WebDriver driver){
        super(driver);
    }
    @FindBy(id="email")
    private WebElement userNameLocator;
    @FindBy(css="input[name='password'] ")
    private WebElement passwordLocator;
    @FindBy(css=" input[name='confirmPassword'] ")
    private WebElement confirmPasswordLocator;
    @FindBy(xpath = "//select[@name='country'] ")
    private WebElement countryNameLocator;
    @FindBy(xpath = "//input[@name='submit'] ")
    private WebElement submitButtonLocator;

    // Methoods to perform action on the element

    public void enterUserName(String username){
        userNameLocator.sendKeys(username);
    }
    public void  enterPassword(String password){
        passwordLocator.sendKeys(password);
    }
    public void  enterConfirmPassword(String password){
        confirmPasswordLocator.clear();
        confirmPasswordLocator.sendKeys(password);
    }
    public void clickOnSubmitButton(){
        submitButtonLocator.click();
    }
    public void selectCountry(String countryName){
        Select select = new  Select(countryNameLocator);
        select.selectByVisibleText(countryName);
    }
}
