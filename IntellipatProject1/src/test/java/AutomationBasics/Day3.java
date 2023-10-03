package AutomationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
       // driver.get("https://login.salesforce.com/?locale=in");
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        /*driver.findElement(By.id("username")).sendKeys("Mayank");
        driver.findElement(By.id("password")).sendKeys("Mayank1234");
        driver.findElement(By.name("Login")).click();*/
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mayank");

    }
}
