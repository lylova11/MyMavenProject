package hw6;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;



public class SignUpPage extends AbstractPage {

    @FindBy(xpath = ".//a[@title='Login here']")
    private WebElement logInButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }


    public SignUpPage clicklogInButton(){
        logInButton.click();
        return this;
    }

}
