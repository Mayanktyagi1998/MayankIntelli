package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Module3Assi3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.switchTo().frame("login_page");
        driver.findElement(By.xpath("//div[@id='nortonimg1']//a[contains(text(),'Know')]/..//a[contains(text(),'Know')]")).click();
        ArrayList<String> win = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(win.get(0));
        Thread.sleep(4000);
        System.out.println(driver.getTitle());
        Thread.sleep(4000);
        driver.switchTo().window(win.get(1));
        Thread.sleep(4000);
        System.out.println(driver.getTitle());
        Thread.sleep(4000);
        driver.quit();

    }
}
