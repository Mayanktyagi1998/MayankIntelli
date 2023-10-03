package Stepdefinationfile;


import Resuable.ReadExcel;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import pageobjects.SalesforceLoginPage;

import java.io.IOException;

//Step defination
public class SalesforceLoginSteps {

    @When("user enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String a, String b) throws IOException {
        SalesforceLoginPage.enterUsername(ReadExcel.getDataFromExcel("LoginDetails", 0, 0));
        SalesforceLoginPage.enterPassword(ReadExcel.getDataFromExcel("LoginDetails", 1, 0));
    }
    @And("user clicks on login button")
    public void userClicksOnLoginButton(){
        SalesforceLoginPage.clickOnLoginButton();
    }

    @Then("user validated the error message")
    public void userValidatedTheErrorMessage() {
        if (SalesforceLoginPage.geterrorMessage().equals("Please check your username and password. If you still can't log in, contact your Salesforce administrator."))
        {
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }
    }
}



