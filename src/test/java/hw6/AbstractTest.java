package hw6;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;
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
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        options.setPageLoadTimeout(Duration.ofSeconds(10));
    }

//    @AfterAll
//    public static void exit(){
//
//        if(webDriver !=null) webDriver.quit();
//    }

    public WebDriver getWebDriver(){
        return this.webDriver;
    }

}
