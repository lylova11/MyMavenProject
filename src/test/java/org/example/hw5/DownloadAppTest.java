package org.example.hw5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DownloadAppTest {

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
    void getPage(){
        driver.get("https://huddle.team");
    }


    @Test
    void testDownloadApp() throws InterruptedException {
        driver.findElement(By.xpath(".//a[@href='/downloads'][1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(".//button[@class='btn btn-md margin-bottom-sm btn-blue ellipsis']")).click();

    }





}
