package hw6;
import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class DownloadOutlookPluginTest extends AbstractTest {

    @Test
    @DisplayName("Download Outlook Plugin test")
    @Description("This test downloads Outlook Plugin from the Downloads page")
    @Link("https://www.huddle.team/downloads")
    @Issue("Jira Issue №126")
    @Severity(SeverityLevel.NORMAL)
    void changeNameTest() throws InterruptedException {
        webDriver.get("https://huddle.team");
        LandingPage landingPage = new LandingPage(getWebDriver());
        landingPage.clickDownloadsButton();
        DownloadsPage downloadsPage = new DownloadsPage(getWebDriver());
        Thread.sleep(500);
        downloadsPage.downloadOutlookPlugin();

        Assertions.assertEquals("https://www.huddle.team/downloads", webDriver.getCurrentUrl());
    }
}
