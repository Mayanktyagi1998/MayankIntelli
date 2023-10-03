package Stepdefinationfile;

import io.cucumber.java.en.Given;
import pageobjects.BookSpiceJet;

public class BookSpiceJetSteps {
    @Given("user select the value FROM from the dropdown")
    public void userselectthevalueFROMfromthedropdown() {
        BookSpiceJet.clickfromdropdown();
        BookSpiceJet.selectValueFromDropDown(2, 4);
        BookSpiceJet.selectValueFromDropDown2(1, 1);
    }
}
