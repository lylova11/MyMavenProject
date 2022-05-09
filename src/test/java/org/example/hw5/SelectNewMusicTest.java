package org.example.hw5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class SelectNewMusicTest {

    static WebDriver driver;

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @BeforeEach
    void getPage() {
        driver.get("https://huddle.team/signup");
    }


    @Test
    void testDownloadApp() throws InterruptedException {
        driver.findElement(By.xpath(".//a[@title='Login here']")).click();
        driver.findElement(By.xpath(".//input[@id='login_email']")).sendKeys("sprint44444@yandex.ru");
        driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("1");
        driver.findElement(By.xpath(".//button[@id='loginformsubmit']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(".//a[@title='Edit']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(".//a[@href='#upgrades']")).click();
        Select dropdown = new Select(driver.findElement(By.xpath(".//select[@data-music-selector-for='conference_moh']")));
        dropdown.selectByVisibleText("Upward Spiral");
        driver.findElement(By.xpath(".//button[@title='Save Changes']")).click();
        Assertions.assertEquals("https://www.huddle.team/profile/settings?tab=upgrades", driver.getCurrentUrl());

    }
}