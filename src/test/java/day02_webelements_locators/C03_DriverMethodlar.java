package day02_webelements_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverMethodlar
{
    public static void main(String[] args)
    {
        //Yeni bir class olusturalim (Homework)
        //ChromeDriver kullanarak, facebook sayfasina gidin
        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https:/www.facebook.com");
        // ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify),
        // degilse dogru basligi yazdirin.
        String expectedtitle="facebook";
        String actualtitle=driver.getTitle();
        if (expectedtitle.equals(actualtitle))
        {
            System.out.println("facebook title testi PASSED" );
        }
        else
        {
            System.out.println("facebook title testi FAİLED " + "\n Gerçekleşen titlr" + actualtitle);
        }
        //Sayfa URL’inin “facebook” kelimesi
        // icermiyorsa “actual” URL’i yazdirin.

        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedtitle))
        {
            System.out.println("Facebook url testi PASSED");
        } else
        {
            System.out.println("Facebook url testi FAILED" +
                    "\nGerceklesen url : " + actualUrl );
        }


        // https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");
        // Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectediçerik="Walmart.com";
        String actualTitle=driver.getTitle();
        if (expectedtitle.contains(actualTitle))
        {
            System.out.println("Walmart title testi PASSED");
        }else{
            System.out.println("Walmart title testi FAILED");
        }

        // Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        // Sayfayi yenileyin
        driver.navigate().refresh();
        // Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        //Browseri  kapatin
        driver.close();
    }
}
