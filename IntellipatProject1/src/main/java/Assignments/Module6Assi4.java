package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Module6Assi4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
        driver.manage().window().maximize();
       // WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all']"));
        Actions dragSlider = new Actions(driver);
        WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all']"));
        dragSlider.dragAndDropBy(slider,300,0).perform();
    }

}
