package day01_seleniumGiriş;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_DriverManageMethodlari
{
    public static void main(String[] args)
    {
        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("Maximize size : "+ driver.manage().window().getSize());//Maximize size : (1382, 744)
        System.out.println("Maximize position : " +driver.manage().window().getPosition());
        driver.manage().window().fullscreen();
        System.out.println("fullscreen size : "+driver.manage().window().getSize());
        System.out.println("fullscreen position : "+driver.manage().window().getPosition());
    }
}
