package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Module4Assi5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();



        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Robin");
        Thread.sleep(2000);

        WebElement printFirstName =driver.findElement(By.name("firstname"));
        printFirstName.clear();
        Thread.sleep(2000);

        printFirstName.sendKeys("Robin");
        Thread.sleep(2000);

        String name = printFirstName.getAttribute("value");
        System.out.println(name);
        Thread.sleep(2000);

        driver.quit();

    }

    }


