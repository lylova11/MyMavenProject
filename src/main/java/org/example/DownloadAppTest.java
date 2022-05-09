package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DownloadAppTest{
    public static void main( String[] args ) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://huddle.team");

        driver.findElement(By.xpath(".//a[@href='/downloads'][1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(".//button[@class='btn btn-md margin-bottom-sm btn-blue ellipsis']")).click();



//        WebElement webElement1 = driver.findElement(By.xpath(".//a[@href='/downloads'][1]"));
//        webElement1.click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        WebElement webElement2 = driver.findElement(By.xpath(".//button[@class='btn btn-md margin-bottom-sm btn-blue ellipsis']"));
//        webElement2.click();

    }
}
