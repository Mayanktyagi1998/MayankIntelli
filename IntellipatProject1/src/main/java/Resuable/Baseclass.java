package Resuable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Baseclass {

    public static WebDriver driver;

    public static Properties prop;
    public static void invokeBrowser() throws IOException {

//   to provide file of the property file or other files we need fileinputstream
        FileInputStream fil = new FileInputStream(new File("src/main/resources/configuration/Utility.properties"));

        prop = new Properties();
        prop.load(fil);

        if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
        } else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        else
        {
            throw new InvalidArgumentException("Enter the correct browser name");
        }


        driver.navigate().to(prop.getProperty("testEnvo"));
        driver.manage().window().maximize();
    }
}
