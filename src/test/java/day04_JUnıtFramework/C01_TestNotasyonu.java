package day04_JUnıtFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TestNotasyonu
{
    /*
    Framework : Ortak çalışma çerçecesi

                Hangi dosyaları nerede oluşturacagımız belirler ve boylece toplu
                çalışmayı kolaylaştırır.

                Her framework, dosya duzeni oluşturmaanın yanında,
                işlerimizi kolaylaştıran yeni özellikler sunmuştur

                JUnit framework en temel test framework'udur.

                Bize kazandırdıgı en önemli özellik @Test Annotation (Notasyon)'dır

                @Test notasyonu sayesinde herbir method bagımsız olarak çalıştırılabilin
                bir TEST Method'u olur

                @Test notasyonu sayesinde istersek herbir test method'unu bagımsız
                çalıştırabildigimiz gibi  istenirse  class level'dan çalıştırıp
                tum testlerin çalışmasını saglayabiliriz

                JUnit framework'de test method'larının hangii sıra ile çalışacagını
                ÖNGÖREMEYEYİZ ve KONTROL EDEMEYİZ
     */
    @Test
    public void test01()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https:/www.wisequarter.com");

        driver.close();
    }
    @Test
    public void test02()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https:/www.youtube.com");

        driver.close();


    }
}
