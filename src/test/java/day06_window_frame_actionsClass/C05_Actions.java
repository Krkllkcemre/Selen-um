package day06_window_frame_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.Set;

public class C05_Actions extends TestBase {
    @Test
    public void test01() {
        //2- https://the-internet.herokuapp.com/context_menu sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");
        //3- Cizili alan uzerinde sag click yapin
        Actions actions=new Actions(driver);
        WebElement cizgiliAlanElementi=driver.findElement(By.id("hot-spot"));

        actions.contextClick(cizgiliAlanElementi).perform();
        //4- Alert’te cikan yazinin “You selected a context menu” oldugunu test edin.
        String expectedAlertYazısı="You selected a context menu";
        String actualAlertYazısı=driver.switchTo().alert().getText();
        Assert.assertEquals(actualAlertYazısı,expectedAlertYazısı);
        //5- Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();
        //6- Elemental Selenium linkine tiklayalim
        String ilkSayfaWHD=driver.getWindowHandle();
        driver.findElement(By.linkText("Elemental Selenium")).click();

        Set<String>tumWHDSeti=driver.getWindowHandles();//[ilkSayfaWHD,ikinciWHD]
        String ikinciWHD="?";
        for (String each:tumWHDSeti
             ) {

            if (!each.equals(ilkSayfaWHD))
            {
                ikinciWHD=each;
            }
        }
        driver.switchTo().window(ikinciWHD);
        // 7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim
        String expectedYazı ="Elemental Selenium";
        String actualYazı=driver.findElement(By.tagName("h1")).getText();

        Assert.assertEquals(expectedYazı,actualYazı);

        bekle(3);

    }
}
