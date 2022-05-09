package hw6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends AbstractPage {

    @FindBy(xpath = ".//a[@href='/downloads'][1]")
    private WebElement downloadsButton;


    public LandingPage(WebDriver driver) {
        super(driver);
    }


    public LandingPage clickDownloadsButton() {
        downloadsButton.click();
        return this;
    }

}
