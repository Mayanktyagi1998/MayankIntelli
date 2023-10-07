package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Module4Assi1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//form[@class='_9vtf']/child::div[5]/child::a[@id='u_0_0_WB']")).click();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("firstname")).sendKeys("Rahul");
        driver.findElement(By.name("lastname")).sendKeys("Kumar");
        driver.findElement(By.name("reg_email__")).sendKeys("9756324589");
        driver.findElement(By.name("reg_passwd__")).sendKeys("dcj2321");

        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByIndex(0);
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByIndex(11);
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByIndex(24);

        driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
    }
}
