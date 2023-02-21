package day02_webelements_locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverManageMethodlari
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        Thread.sleep(3000);

        System.out.println(driver.manage().window().getSize());//(1050, 708)
        System.out.println(driver.manage().window().getPosition());//(10, 10)

        //ölçüleri ve konumu degiştirelim

        driver.manage().window().setSize(new Dimension(800,800));
        driver.manage().window().setPosition(new Point(40,100));
        System.out.println(driver.manage().window().getSize());//(800, 788)
        System.out.println(driver.manage().window().getPosition());//(40, 100)



        driver.close();

    }
}
