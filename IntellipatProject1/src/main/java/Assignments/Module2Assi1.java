package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Module2Assi1 {
    public static void main (String args[]) throws InterruptedException {
        WebDriver driverChrome = new ChromeDriver();
        Thread.sleep(3000);
        WebDriver driverEdge = new EdgeDriver();
        Thread.sleep(3000);
        WebDriver driverFire = new FirefoxDriver();
        Thread.sleep(3000);

    }
}
