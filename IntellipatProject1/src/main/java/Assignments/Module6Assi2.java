package Assignments;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Module6Assi2 {
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
        act.doubleClick(doubleclk).build().perform();
        Thread.sleep(2000);

        Alert alrt = driver.switchTo().alert();
        alrt.accept();

    }
}
