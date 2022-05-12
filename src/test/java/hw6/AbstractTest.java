package hw6;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AbstractTest {
    static WebDriver webDriver;

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        options.setPageLoadTimeout(Duration.ofSeconds(10));


        }

    @AfterEach
    public void checkBrowser () {
        List<LogEntry> allLogRows = getWebDriver().manage().logs().get(LogType.BROWSER).getAll();
        if (!allLogRows.isEmpty()) {

            if (allLogRows.size() > 0) {
                allLogRows.forEach(logEntry -> {
                    System.out.println(logEntry.getMessage());
                });
            }
        }
    }
        @AfterAll
    public static void exit(){

        if(webDriver !=null) webDriver.quit();
    }
    public WebDriver getWebDriver () {
        return this.webDriver;
    }
}