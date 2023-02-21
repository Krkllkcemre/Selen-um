package day02_webelements_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ImplcitlyWait
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        driver'ı bir web uygulamasına gönderdigimizde
        o sayfanın açılması, orada işlemleri yapmak için elementleri bulması...
        gibiişlemler zaman gerektire bilir

        implicitlywait butur zman isteyen işlemler için
        driver'in max. ne kadar bekleyecegini belirler

         */

    }
}
