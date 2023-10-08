package pageobjects;

import Resuable.ApplyWait;
import Resuable.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookSpiceJet extends Baseclass {

    public static void clickfromdropdown() {
        driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
    }

    public static void selectValueFromDropDown(int ulIndex, int liIndex) {
        //driver.findElement(By.xpath("//div[@id ='dropdownGroup1']/descendant::ul[1]/li[1]")).click();
        driver.findElement(By.xpath("//div[@id='dropdownGroup1']/descendant::ul[" + ulIndex + "]/child::li[" + liIndex + "]")).click();
    }

    public static void selectValueFromDropDown2(int ulIndex2, int liIndex2) {
        //driver.findElement(By.xpath("//div[@id ='dropdownGroup1']/descendant::ul[1]/li[1]")).click();
        driver.findElement(By.xpath("//div[@id='dropdownGroup2']/descendant::ul[" + ulIndex2 + "]/child::li[" + liIndex2 + "]")).click();
    }

    public static void clickSerach()
    {
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
    }
    public static void clickcurrency()
    {
        try{
        driver.findElement(By.cssSelector("//a[contains(normalize-space(text()),'ency Converter')]")).click();
    }
        catch(TimeoutException s)
        {
           WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
           wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("//a[contains(normalize-space(text()),'ency Converter')]")));
            driver.findElement(By.cssSelector("//a[contains(normalize-space(text()),'ency Converter')]")).click();
        }
    }

}
