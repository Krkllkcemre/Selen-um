package practive01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class ornek01 extends TestBase
{

    @Test
    public void test01()
    {
        //go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");


//    fill the firstname
        WebElement ısım= driver.findElement(By.xpath("//input[@name='firstname']"));
        ısım.sendKeys("wise"+ Keys.ENTER);

        bekle(2);
//        fill the lastname
        WebElement soyAd= driver.findElement(By.xpath("//input[@name='lastname']"));
        soyAd.sendKeys("quarter"+Keys.ENTER);
        bekle(2);
//        check the gender
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();
        bekle(2);
//        check the experience
        driver.findElement(By.id("exp-3")).click();
        bekle(2);
//        fill the date
        WebElement dateBox=driver.findElement(By.xpath("//input[@id='datepicker']"));
        dateBox.sendKeys("2023-02-20"+Keys.ENTER);
        bekle(2);
//        choose your profession -> Automation Tester
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        bekle(2);
//        choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        bekle(2);
//        choose your continent -> Antartica
        WebElement ddm=driver.findElement(By.xpath("//select[@name='continents']"));
        Select select=new Select(ddm);
        select.selectByVisibleText ("Antartica");
        bekle(2);
//        choose your command  -> Browser Commands
        WebElement ddm1=driver.findElement(By.id("selenium_commands"));
        Select select1=new Select(ddm1);
        select1.selectByIndex(0);
        System.out.println(select1.getOptions());
        bekle(2);
//        click submit button
        driver.findElement(By.xpath("//button[text()='Button']")).click();
        bekle(2);
//


    }





}
