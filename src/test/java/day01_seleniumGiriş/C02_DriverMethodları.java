package day01_seleniumGiriş;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodları {
    public static void main(String[] args) throws InterruptedException {


        /*
        jar dosyalarını yükleyerek selenium'u kullanılır hale getirdik
        ancak herbir class'ın hangi browser ile calışmasını istiyorsak o browser
        ile ilgili driver'i class'da tanımlamamız lazım.

        ancak browser ile ilgili tercihimiz dogrultusunda
        ilgili ayarları yapmak için java'daki System Class'ından setProperty() kullanılır

        method'a 2 parametre ekleyecegiz
        1.parametre herkez için aynı: Webdriver.chrome.driver
        2. parametre bu driver'in dosya yolu herkesin bilgisayarında farklı olabilir
        windows bilgisayarlarda sonunda .exe yazılmalıdır
        mac'lerde .exe olmaz

      */


        System.getProperty("Webdriver.chrome.driver", "src/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //istenen sayfaya gitmek için

        driver.get("https://www.amazon.com.tr");
        Thread.sleep(3000);

        driver.close();
    }
}