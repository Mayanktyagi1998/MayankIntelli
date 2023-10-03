package Stepdefinationfile;

import Resuable.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import java.io.IOException;


public class Hooks {

            @Before() //This will execute before every method/scenario/action
    public void setup() throws IOException {
                System.out.println("Invoke browser");
                Baseclass.invokeBrowser();
            }
            @After()
    public void teardown()
            {
                System.out.println("Closed");
            }
}
