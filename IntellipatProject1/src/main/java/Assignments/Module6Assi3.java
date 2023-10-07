package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Module6Assi3 {
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down the page by a specified number of pixels (e.g., 300)
        js.executeScript("window.scrollBy(0, 300)");

        Actions act = new Actions(driver);
        WebElement doubleclk = driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
        act.contextClick(doubleclk).build().perform();

        Thread.sleep(3000);

        driver.close();

    }

}
