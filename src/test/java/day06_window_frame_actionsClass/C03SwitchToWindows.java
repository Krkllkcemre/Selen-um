package day06_window_frame_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C03SwitchToWindows extends TestBase
{
    @Test
    public void test01()
    {
        // amazon anasayfaya gidip, arama kutusunun erisilebilir oldugunu test edin
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(aramaKutusu.isEnabled());
        String amazonWindowHandleDegeri= driver.getWindowHandle();
        bekle(3);

        // yeni bir tab olarak wisequarter.com'a gidin

        /*önce yeni bir tab oluşturup
        driver'i o sayfaya geçirmeliyiz(switch)
         */

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wisequarter.com");

        // url'in wisequarter icerdigini test edin
        String expectedIcerik="wisequarter";
        String actualURL=driver.getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedIcerik));

        String wiseWindowHandleDegeri=driver.getWindowHandle();

        // amazon'un acik oldugu tab'a geri donup
        /*
                Daha önce açılmış biir window'a geçiş yapmak için
                O sayfanın windowHandele degerine ihtiyacımız var

                Testimiz böyle bir görevi içeriyarsa
                o sayfada iken windowHandle degerini alıp kayıt yapmalıyız
          */
        driver.switchTo().window(amazonWindowHandleDegeri);
        // Nutella icin arama yapin

        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        // Sonuclarin Nutella icerdigini test edin
        String actualsonucYazisi= driver
                .findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"))
                .getText();
        expectedIcerik="Nutella";
        Assert.assertTrue(actualsonucYazisi.contains(expectedIcerik));

        // yeni bir window olarak youtubecom'a gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https:/www.youtube.com");
        // Url'in youtube icerdigini test edin
        expectedIcerik="youtube";
        actualURL=driver.getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedIcerik));
        bekle(2);
        // wisequarter'in acik oldugu sayfaya donun
        driver.switchTo().window(wiseWindowHandleDegeri);
        // Title'in WiseQuarter icerdigini test edin
        expectedIcerik="Wise Quarter";
        String actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedIcerik));
        bekle(2);



    }

}
