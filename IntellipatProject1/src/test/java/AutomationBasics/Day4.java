package AutomationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {
    public static void main(String[] args) throws InterruptedException {

                WebDriver driver = new ChromeDriver();
                driver.get("https://selenium-apps.doselect.in/change-text/");
                driver.findElement(By.id("bigger")).click();
                Thread.sleep(2000);
                driver.findElement(By.id("smaller")).click();
                Thread.sleep(2000);
                driver.findElement(By.id("reset")).click();

              //  driver.findElement(By.xpath("//class[@id='bigger'}]")).click();
              //  driver.findElement(By.xpath("//class[@id='smaller'}]")).click();
              //  driver.findElement(By.xpath("//class[@id='reset'}]")).click();


    }
}
