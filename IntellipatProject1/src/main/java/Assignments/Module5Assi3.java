package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Module5Assi3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("")).sendKeys("Rahul");
        driver.findElement(By.xpath("")).sendKeys("Kumar");
        driver.findElement(By.xpath("")).sendKeys("9756324589");
        driver.findElement(By.xpath("")).sendKeys("dcj2321");

        Select day = new Select(driver.findElement(By.xpath("")));
        day.selectByIndex(0);
        Select month = new Select(driver.findElement(By.xpath("")));
        month.selectByIndex(11);
        Select year = new Select(driver.findElement(By.xpath("")));
        year.selectByIndex(24);

        driver.findElement(By.xpath("")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();

    }
}
