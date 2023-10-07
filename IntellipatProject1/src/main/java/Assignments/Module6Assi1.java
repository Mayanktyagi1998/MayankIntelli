package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class Module6Assi1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.className("_30XB9F")).click();


        Thread.sleep(2000);

        Actions hover = new Actions(driver);
        WebElement fashion = driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
        hover.clickAndHold(fashion).build().perform();

        Thread.sleep(2000);

        WebElement  womenfootwear = driver.findElement(By.linkText("Women Footwear"));
        hover.clickAndHold(womenfootwear).build().perform();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Women Casual Shoes")).click();

        Thread.sleep(2000);

        driver.close();

    }
}


