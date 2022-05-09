package hw6;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = ".//input[@id='login_email']")
    private WebElement emailField;

    @FindBy(xpath = ".//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = ".//button[@id='loginformsubmit']")
    private WebElement submitButton;



    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage sendKeysEmailField(){
        emailField.sendKeys("sprint44444@yandex.ru");
        return this;
    }
    public LoginPage sendKeysPasswordField(){
        passwordField.sendKeys("1");
        return this;
    }

    public LoginPage clickSubmitButton(){
        submitButton.click();
        return this;
    }

}


