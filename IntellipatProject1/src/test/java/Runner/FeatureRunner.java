package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//to run program we need RunWith annotations
// provide argument as Cucumber.class to run cucumber file
@RunWith(Cucumber.class)

//map the feature file and step defination file
@CucumberOptions(
        //features is used to provide the path of feature file
        features = {"src/test/resources/featurefile"},
        glue = {"Stepdefinationfile"},
        tags = "@MouseAction",
        plugin = "pretty"

)
public class FeatureRunner {

}

