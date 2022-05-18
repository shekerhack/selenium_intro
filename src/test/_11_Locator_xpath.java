package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class _11_Locator_xpath {
    public static void main(String[] args) {
        /*
        Go to https://www.google.com/
        Validate the links below at the bottom-left of the page
        Advertising
        Business
        How Search works
         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");

        List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']//a")); // all 3 elements
        String[] expectedLinkTexts = {"Advertising", "Business", "How Search works"};

        for (int i = 0; i < 3; i++) {
            if(allLinks.get(i).isDisplayed() && allLinks.get(i).isEnabled() && allLinks.get(i).getText().equals(expectedLinkTexts[i]))
                System.out.println(expectedLinkTexts[i] + " link validation is PASSED");
            else System.out.println(expectedLinkTexts[i] + " link validation is FAILED");
        }

        Driver.quitDriver();

    }
}