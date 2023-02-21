package day02_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_FindElements
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // amazon anasayfaya gidin
        driver.get("https:/www.amazon.com");

        // arama kutusuna java yazip aratin
        WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
        element.sendKeys("java");
        element.submit();
        // arama sonuclarinda cikan resimlerdeki yazilari yazdirin
        List<WebElement>aramasonuclarıElementList=driver.findElements(By.className("sg-col-inner"));
        System.out.println(aramasonuclarıElementList.size());
        // 76

        // bu 76 elementi yazdiralim
        int elementNo =1;

        for (WebElement eachElement: aramasonuclarıElementList
             ) {
            System.out.println(elementNo + " ----" + eachElement.getText());

            elementNo++;
            
        }



        Thread.sleep(3000);
        driver.close();


    }
}
