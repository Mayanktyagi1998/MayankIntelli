package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Module4Assi2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("sView1:r1:0:email::content")).sendKeys("okok3421@xyz.com");
        Thread.sleep(1000);
        driver.findElement(By.id("sView1:r1:0:password::content")).sendKeys("RobinHood@4321");
        Thread.sleep(1000);
        driver.findElement(By.id("sView1:r1:0:retypePassword::content")).sendKeys("RobinHood@4321");
        Thread.sleep(1000);
        Select country = new Select(driver.findElement(By.id("sView1:r1:0:country::content")));
        country.selectByIndex(1);
        Thread.sleep(1000);
        driver.findElement(By.id("sView1:r1:0:firstName::content")).sendKeys("Jhon");
        Thread.sleep(1000);
        driver.findElement(By.id("sView1:r1:0:lastName::content")).sendKeys("Trappey");
        Thread.sleep(1000);
        driver.findElement(By.id("sView1:r1:0:jobTitle::content")).sendKeys("Analyst");
        Thread.sleep(1000);
        driver.findElement(By.id("sView1:r1:0:workPhone::content")).sendKeys("7298372837");
        Thread.sleep(1000);
        driver.findElement(By.id("sView1:r1:0:companyName::content")).sendKeys("BookandBake");
        Thread.sleep(1000);
        driver.findElement(By.id("sView1:r1:0:address1::content")).sendKeys("Trunk Road ");
        Thread.sleep(1000);
        driver.findElement(By.id("sView1:r1:0:city::content")).sendKeys("Noida");
        Thread.sleep(1000);
        Select state = new Select(driver.findElement(By.id("sView1:r1:0:state::content")));
        state.selectByIndex(1);
        Thread.sleep(1000);
        driver.findElement(By.id("sView1:r1:0:postalCode::content")).sendKeys("275683");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Create Account']")).click();
    }

}
