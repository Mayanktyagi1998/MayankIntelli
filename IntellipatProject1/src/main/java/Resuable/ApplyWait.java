package Resuable;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Resuable.Baseclass.driver;

public class ApplyWait {
    public static void applyexplictwait()
    {
        WebDriverWait driverwait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
