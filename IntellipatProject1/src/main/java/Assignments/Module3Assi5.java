package Assignments;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module3Assi5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.navigate().to("https://www.selenium.dev");
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        driver.close();

    }
}
