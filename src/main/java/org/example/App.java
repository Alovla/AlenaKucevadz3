package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


      WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();

        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.skyscanner.ru/");
        WebElement webElement = driver.findElement(By.xpath("//div[@class='HeaderTab_HeaderTab__mzg36'][2]//a[@id='skhot']"));
webElement.click();


        driver.get("https://www.skyscanner.ru/hotels?na=1&sd=2021-12-12&ed=2021-12-13");
        WebElement webElement1 = driver.findElement(By.xpath("//div[@class='HeaderTab_HeaderTab__mzg36']//a[@id='airli']"));
        webElement1.click();


        driver.get("https://www.skyscanner.ru/");
        WebElement webElement2 = driver.findElement(By.xpath("//div[@class=\"HeaderTab_HeaderTab__mzg36\"][3]"));
        webElement2.click();


        driver.get("https://www.skyscanner.ru/");
        WebElement webElement3 = driver.findElement(By.xpath("//span[@id='authentication-link']"));
        webElement3.click();
        driver.quit();
    }
}
