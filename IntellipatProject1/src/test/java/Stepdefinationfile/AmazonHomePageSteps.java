package Stepdefinationfile;


import Resuable.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageobjects.AmazonHomePage;
import pageobjects.SearchPage;

import java.util.ArrayList;
import java.util.List;


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
        } else {
            System.out.println("Not Match");
        }
    }

    @Given("user extracts the vlaue of from the category dropdown")
    public void userExtractsTheVlaueOfFromTheCategoryDropdown() {

        for (int i = 0; i < AmazonHomePage.getCatrgoryDropdownCount(); i++) {
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
        WebElement signInElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        act.clickAndHold(signInElement).build().perform();
        driver.findElement(By.linkText("Watchlist")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
        //when we use any method of action class we need to give build and perform
    }

    @Given("user drag and drop the box")
    public void userDragAndDropTheBox() {
        WebElement frameElement = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameElement);
        Actions action = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        action.dragAndDrop(source, target).build().perform();

        driver.switchTo().defaultContent();

    }

    @Given("user handels the table")
    public static String userHandelsTheTable() {
        WebElement ey = driver.findElement(By.xpath("//table[@class='infobox vcard']"));
        List<WebElement> columnElements = ey.findElements(By.tagName("th"));
        List<String> columnValues = new ArrayList<String>();

        for (WebElement k : columnElements) {
            columnValues.add(k.getText());
        }
        System.out.println(columnValues);


        List<String> rowValues = new ArrayList<String>();
        for (int i = 1; i < ey.findElements(By.tagName("td")).size(); i++) {
            rowValues.add(ey.findElements(By.tagName("td")).get(i).getText());
        }
        System.out.println(rowValues);

        WebElement secondTable = driver.findElement(By.xpath("//table[@class='wikitable']"));
        String secondvalue = secondTable.findElement(By.xpath("//table[@class='wikitable']//tr//th[4]")).getText();
        System.out.println(secondvalue);

        List<WebElement> a = secondTable.findElements(By.xpath("//table[@class='wikitable']//tr[4]//td"));

        for (WebElement b : a) {
            System.out.println(b.getText());
        }

        return secondvalue;
    }

        public static String columnCount(int coumnlIndex)
        {
            return driver.findElement(By.xpath("//table[@class='wikitable']//tr//td["+coumnlIndex+"]")).getText();
        }
        public static String rowCount(int rowIndex1,int coumnlIndex1)
        {
            return driver.findElement(By.xpath("//table[@class='wikitable']//tr["+rowIndex1+"]//td["+coumnlIndex1+"]")).getText();
        }


}





