package hw6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountInfoPage extends AbstractPage {

    @FindBy(xpath = ".//a[@title='Edit']")
    private WebElement editButton;

    public AccountInfoPage(WebDriver driver) {
        super(driver);
    }


    public AccountInfoPage clickEditButton() {
        editButton.click();
        return this;
    }
}