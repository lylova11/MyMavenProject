package hw6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UpgradesPage extends AbstractPage {

    @FindBy(xpath = ".//select[@data-music-selector-for='conference_moh']")
    private WebElement customHoldMusicSelector;

    @FindBy(xpath = ".//button[@title='Save Changes']")
    private WebElement saveChangesButton;





    public UpgradesPage(WebDriver driver) {
        super(driver);
    }


    public UpgradesPage customHoldMusicSelector(){
        customHoldMusicSelector.click();
        Select dropdown = new Select(getDriver().findElement(By.xpath(".//select[@data-music-selector-for='conference_moh']")));
        dropdown.selectByVisibleText("Upward Spiral");
        return this;
    }

    public UpgradesPage clickSaveChangesButton(){
        saveChangesButton.click();
        return this;
    }




}