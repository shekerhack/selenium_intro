package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {

    /*
    TEST CASE
    1. Go to "https://www.apple.com/"
    2. Validate the URL of the page is displayed as "https://www.apple.com/"

    NOTE:
    driver.getCurrentUrl(); // this line returns the URL of the current page as a String
     */

    public static void main(String[] args) {
        //1. Set up driver
        WebDriver driver = Driver.getDriver();

        //2. Validation
        driver.get("https://www.apple.com/");

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.apple.com/";

        if(actualURL.equals(expectedURL)) System.out.println("URL validation PASSED");
        else System.out.println("URL validation failed");

        //3. Quite driver
        Driver.quitDriver();

    }
}
