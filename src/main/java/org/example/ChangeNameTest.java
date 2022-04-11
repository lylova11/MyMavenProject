package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class ChangeNameTest {
    public static void main( String[] args ) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
//        options.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://huddle.team/signup");
        driver.manage().window().maximize();


        WebElement webElement1 = driver.findElement(By.xpath(".//a[@title='Login here']"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.xpath(".//input[@id='login_email']"));
        webElement2.click();
        webElement2.sendKeys("sprint444@yandex.ru");
        WebElement webElement3 = driver.findElement(By.xpath(".//input[@id='password']"));
        webElement3.click();
        webElement3.sendKeys("1");
        WebElement webElement4 = driver.findElement(By.xpath(".//button[@id='loginformsubmit']"));
        webElement4.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement webElement5 = driver.findElement(By.xpath(".//a[@title='Edit']"));
        webElement5.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement webElement6 = driver.findElement(By.xpath(".//input[@name='first_name']"));
        webElement6.clear();
        webElement6.sendKeys("NewName");
        WebElement webElement7 = driver.findElement(By.name("last_name"));
        webElement7.clear();
        webElement7.sendKeys("NewLastName");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement webElement8 = driver.findElement(By.xpath(".//button[@title='Save Changes']"));
        webElement8.click();


    }
}
