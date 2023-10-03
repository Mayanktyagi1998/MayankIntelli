package Stepdefinationfile;


import Resuable.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pageobjects.AmazonHomePage;
import pageobjects.SearchPage;


public class AmazonHomePageSteps extends Baseclass {


    @Given("user enters the {string} and click on search icon")
    public void userEntersTheAndClickOnSearchIcon(String productName) {
        AmazonHomePage.enterProductName(productName);
        AmazonHomePage.clickSearchButton();
    }

    @Given("user enters the {string} and click on search Button")
    public void userEntersTheAndClickOnSearchButton(String Product) {
        AmazonHomePage.enterProductName(Product);
        AmazonHomePage.clickSearchButton();
    }

    @Then("Validate title of page")
    public void validateTitleOfPage() {
        if (SearchPage.getTitleOfPage().equals("Amazon.in :iphone")) {
            System.out.println("Match");
        }
        else
            {
                System.out.println("Not Match");
            }
        }

    @Given("user extracts the vlaue of from the category dropdown")
    public void userExtractsTheVlaueOfFromTheCategoryDropdown()
    {

        for(int i= 0;i<AmazonHomePage.getCatrgoryDropdownCount();i++)
        {
            //this will print all the values which are present in category element
           String value = AmazonHomePage.getDropdownvalues(i);
           System.out.println(value);
        }
    }

    @Given("user select value from the categorydropdown")
    public void userSelectValueFromTheCategorydropdown() {

     AmazonHomePage.selectValueByIndex(2);

    }

    @Given("user select the babywishlist by mouse Action")
    public void userSelectTheBabywishlistByMouseAction() {

        Actions act = new Actions(driver);
        WebElement signInElement =  driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        act.clickAndHold(signInElement).build().perform();
        driver.findElement(By.linkText("Watchlist")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
        //when we use any method of action class we need to give build and perform
    }

    @Given("user drag and drop the box")
    public void userDragAndDropTheBox()
    {
        WebElement frameElement = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameElement);
        Actions action = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        action.dragAndDrop(source,target).build().perform();

        driver.switchTo().defaultContent();

    }
}




