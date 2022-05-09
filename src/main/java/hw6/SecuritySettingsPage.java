package hw6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class SecuritySettingsPage extends AbstractPage {

    @FindBy(xpath = ".//input[@name='resource_password']")
    private WebElement securityCodeField;

    @FindBy(xpath = ".//button[@title='Save Changes']")
    private WebElement saveChangesButton;


    public SecuritySettingsPage(WebDriver driver) {
        super(driver);
    }


    public SecuritySettingsPage sendKeysSecurityCodeField() throws InterruptedException {
        securityCodeField.clear();
        securityCodeField.sendKeys("123123");
        return this;
    }

    public SecuritySettingsPage clickSaveChangesButton(){
        saveChangesButton.click();
        return this;
    }




}
