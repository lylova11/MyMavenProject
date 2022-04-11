package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DownloadAppTest{
    public static void main( String[] args ) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
//      options.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://huddle.team");
        driver.manage().window().maximize();
        WebElement webElement1 = driver.findElement(By.xpath(".//a[@href='/downloads'][1]"));
        webElement1.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement webElement2 = driver.findElement(By.xpath(".//button[@class='btn btn-md margin-bottom-sm btn-blue ellipsis']"));
        webElement2.click();

    }
}