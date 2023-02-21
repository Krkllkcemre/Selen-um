package day06_window_frame_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

public class C04_SwitchToWindow extends TestBase
{
    @Test
    public void test01()
    {
       //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement ilkSayfaYazıElementi=driver.findElement(By.tagName("h3"));
        String expektedYazı="Opening a new window";
        String actualYazı =ilkSayfaYazıElementi.getText();
        Assert.assertEquals(expektedYazı,actualYazı);
        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String expektedTitle="The Internet";
        String actualTitle =driver.getTitle();
        Assert.assertEquals(expektedTitle,actualTitle);
        bekle(2);
        //● Click Here butonuna basın.
        driver.findElement(By.linkText("Click Here")).click();
        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        expektedTitle="New Window";
        actualTitle =driver.getTitle();
        Assert.assertEquals(expektedTitle,actualTitle);
        bekle(2);
        /*
            Eger SwitchToNewWindow() method'u kullanılırsa
            driver yeni acılan sayfaya geçiş yapar

            Ancak bu method kullanılmadan
            bir link tıklandıgından bir link taklandıgında yeni bir sayfa açılıyorsa
            driver yeni sayfaya geçiş yapamaz

            bizim yeni acılan sayfanın
            windowHandle degerini bulup
            driver'i o sayfaya geçirmemiz GEREKLİDİR

         */

        Set<String>tuSayfanınWindowHandeldegeri= driver.getWindowHandles();
        System.out.println("ilk sayfa WHD");
        Assert.assertEquals(expektedTitle,actualTitle);

        //● Sayfadaki textin “New Window” olduğunu doğrulayın.
        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.
    }
}
