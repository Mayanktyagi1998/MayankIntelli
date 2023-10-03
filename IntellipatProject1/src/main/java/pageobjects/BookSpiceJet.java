package pageobjects;

import Resuable.Baseclass;
import org.openqa.selenium.By;

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
}
