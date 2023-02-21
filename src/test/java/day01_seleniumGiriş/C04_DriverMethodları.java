package day01_seleniumGiriş;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodları
{
    public static void main(String[] args)
    {


        System.setProperty("Webdriver.chorme.diver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wisequarter.com");

        System.out.println(driver.getWindowHandle());
        //CDwindow-FC8C80CC791537F9764BC95344EEA59F
        // her çalışmada farklı // CDwindow-CA5C444EC94F7E15595E7EF9D44542F5
        // getWindowHandle selenium tarafından her driver sayfası için uretilen
        // unique handle degerini döndürür
        // getWindowHandles()// ise test sırasında birden fazla sayfa açılmışsa
        //bir set olarak , tum sayfaların window hamdle degerlerini döndürür

        System.out.println(driver.getPageSource());// sayfa html  kodlarını gösterir

        // sayfa kodlari "2 hours weekly meeting with the team" iceriyor mu test edin
        String expectedIcerik = "2 hours weekly meeting with the team";
        String actualSayfaKodlari = driver.getPageSource();
        if (actualSayfaKodlari.contains(expectedIcerik)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        driver.quit();
        //close() ve quit() ikisi desayfa kapatmak için kullanılır
        // close() sadece bir sayfa kapatırken
        // quite() test sırasında açılan tum sayfaları kapatır

    }
}
