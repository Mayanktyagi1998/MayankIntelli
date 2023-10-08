
package pageobjects;

import Resuable.Baseclass;
import org.openqa.selenium.By;

public class SalesforceLoginPage extends Baseclass {
//PAGE OBJECT MODEL
    public static void enterUsername(String username)
    {
    // driver.findElement(By.id("username")).sendKeys(username);
        //child to parent  ex - //input[@id='username']/parent::div[1]
        //parent to child ex - //div[@id='username_container']/child::input[1]
     driver.findElement(By.xpath("//div[@id='username_container']/child::input[1]")).sendKeys(username);
    }
    public static void enterPassword(String password) {
     driver.findElement(By.name("pw")).sendKeys(password);

    }
    public static void clickOnLoginButton() throws InterruptedException {
     driver.findElement(By.id("Login")).click();
     Thread.sleep(3000);
    }

     public static String geterrorMessage()
     {
         return driver.findElement(By.xpath("//div[@id='error']")).getText();
     }

}
