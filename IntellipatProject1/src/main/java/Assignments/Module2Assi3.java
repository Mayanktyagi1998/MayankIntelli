package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Module2Assi3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
