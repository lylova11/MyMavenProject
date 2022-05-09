package hw6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadsPage extends AbstractPage {

    @FindBy(xpath = ".//button[@class='btn btn-md margin-bottom-sm btn-blue ellipsis']")
    private WebElement downloadForWindowsButton;


    @FindBy(xpath = ".//button[@title='Download Outlook Plug-in']")
    private WebElement downloadOutlookPlugin;


    public DownloadsPage(WebDriver driver) {
        super(driver);
    }


    public DownloadsPage downloadForWindowsButton() {
        downloadForWindowsButton.click();
        return this;
    }

    public DownloadsPage downloadOutlookPlugin() {
        downloadOutlookPlugin.click();
        return this;
    }

}
