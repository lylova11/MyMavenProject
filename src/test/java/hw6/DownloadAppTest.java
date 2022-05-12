package hw6;
import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class DownloadAppTest extends AbstractTest {


    @Test
    @DisplayName("Download Windows Desktop App test")
    @Description("This test downloads Windows Desktop App from the Downloads page")
    @Link("https://www.huddle.team/downloads")
    @Issue("Jira Issue №125")
    @Severity(SeverityLevel.BLOCKER)
    void changeNameTest() throws InterruptedException {
        webDriver.get("https://huddle.team");
        LandingPage landingPage = new LandingPage(getWebDriver());
        landingPage.clickDownloadsButton();
        DownloadsPage downloadsPage = new DownloadsPage(getWebDriver());
        Thread.sleep(500);
        downloadsPage.downloadForWindowsButton();

        Assertions.assertEquals("https://www.huddle.team/downloads", webDriver.getCurrentUrl());
    }
}
