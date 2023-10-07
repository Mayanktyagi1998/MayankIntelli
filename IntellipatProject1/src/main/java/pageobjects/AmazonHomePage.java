package pageobjects;

import Resuable.Baseclass;
import io.cucumber.messages.types.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomePage extends Baseclass {
   private static WebElement categoryElement = driver.findElement(By.id("searchDropdownBox"));
   private static Select selectcategory;
public static void enterProductName(String Product)
{
    driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys(Product);
}
public static void clickSearchButton()
{
    driver.findElement(By.id("nav-search-submit-button")).click();
}

public static void setCategoryElemenet()
{
    categoryElement = driver.findElement(By.id("searchDropdownBox"));
}
public static int getCatrgoryDropdownCount()
{
    setCategoryElemenet();
    return categoryElement.findElements(By.tagName("option")).size();

}
public static String getDropdownvalues(int i) //to get input from the user you should parametrized method.
{
    setCategoryElemenet();
    return categoryElement.findElements(By.tagName("option")).get(i).getText();
}
public static void selectValueByIndex(int index)
{
    selectMethod();
    selectcategory.selectByIndex(index);
}
public static void selectValueByVisibleText(String text){
    selectMethod();
    selectcategory.selectByVisibleText("text");
}
public static void selectValueByValue(String value)
{

    selectMethod();
    selectcategory.selectByValue("value");
}
public static void selectMethod()
{
    selectcategory = new Select(categoryElement);
}
}
