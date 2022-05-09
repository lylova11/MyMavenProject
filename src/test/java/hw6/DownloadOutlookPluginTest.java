package hw6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DownloadOutlookPluginTest extends AbstractTest {

    @Test
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
