package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module5Assi5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();

        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("Brother");

        Thread.sleep(2000);

        prompt.accept();

        System.out.println(driver.findElement(By.id("demo")).getText());

        Thread.sleep(2000);

        driver.close();
    }
}
