package hw6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserInfoPage extends AbstractPage {

    @FindBy(xpath = ".//input[@name='first_name']")
    private WebElement firstNameField;

    @FindBy(xpath = ".//input[@name='last_name']")
    private WebElement lastNameField;

    @FindBy(xpath = ".//button[@title='Save Changes']")
    private WebElement saveChangesButton;

    @FindBy(xpath = ".//a[@href='#security-settings']")
    private WebElement securityTab;

    @FindBy(xpath = ".//a[@href='#upgrades']")
    private WebElement upgradesTab;



    public UserInfoPage(WebDriver driver) {
        super(driver);
    }


    public UserInfoPage sendKeysFirstNameField(){
        firstNameField.clear();
        firstNameField.sendKeys("NewName");
        return this;
    }

    public UserInfoPage sendKeysLastNameField(){
        lastNameField.clear();
        lastNameField.sendKeys("NewLastName");
        return this;
    }

    public UserInfoPage clickSaveChangesButton(){
        saveChangesButton.click();
        return this;
    }

    public UserInfoPage clickSecurityTab(){
        securityTab.click();
        return this;
    }
    public UserInfoPage clickUpgradesTab(){
        upgradesTab.click();
        return this;
    }

}
