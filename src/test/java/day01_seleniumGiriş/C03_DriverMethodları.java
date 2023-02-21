package day01_seleniumGiriş;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodları
{
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //amazon sayfasına gidin
        driver.get("https://www.amazon.com.tr");

        //gittiginiz sayfadaki title ve url'i yazdırın
        System.out.println("URL = " + driver.getCurrentUrl());
        //URL = https://www.amazon.com.tr/

        System.out.println(driver.getTitle());
        //Amazon.com.tr: Elektronik, bilgisayar, akıllı telefon, kitap, oyuncak, yapı market, ev, mutfak, oyun konsolları ürünleri ve daha fazlası için internet alışveriş sitesi

        // amazon anasayfaya gittiginizi test edin
        // Test expected result ile actual result'in karşılaştırılmasıdır
        // örnegin url= driver.getCurenturl();

        String expectediçerik="amazon";
        String actualURL=driver.getCurrentUrl();
        if (actualURL.contains(expectediçerik))
        {
            System.out.println("Test PASSED");
        }
        else {
            System.out.println("Test FAILED");
        }
        Thread.sleep(3000);

        driver.close();
}}
