package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Module5Assi2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath(" //input[@name='firstname']")).sendKeys("Rahul");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9756324589");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("dcj2321");

        Select day = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
        day.selectByIndex(0);
        Select month = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
        month.selectByIndex(11);
        Select year = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
        year.selectByIndex(24);

        driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();

    }

}

