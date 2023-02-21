package day01_seleniumGiriş;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_DriverNavigateMethodları
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        // wisequarter anasayfaya gidin
        driver.get("https://www.wisequarter.com");
        // yeniden amazon anasayfaya gidin
        driver.navigate().back();
        // wisequarter anasayfaya donun
        driver.navigate().forward();
        // navigate().to(),   driver.get() ile ayni islemi yapar
        driver.navigate().to("https://www.youtube.com");

        driver.navigate().refresh();


    }
}
