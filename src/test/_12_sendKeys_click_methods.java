package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _12_sendKeys_click_methods {
    public static void main(String[] args) {
        /*
        Go to https://www.wikipedia.org/
        Search for “Tesla”
        Validate the main title of the page is “Tesla”
        NOTE: Use xpath or cssSelector to locate the web elements
         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.wikipedia.org/");

        WebElement searchInputBox = driver.findElement(By.cssSelector("#searchInput"));
        //WebElement searchButton = driver.findElement(By.cssSelector(".pure-button"));

        searchInputBox.sendKeys("Tesla" + Keys.RETURN); //
        //searchButton.click();

        WebElement mainHeading = driver.findElement(By.cssSelector("#firstHeading"));

        if(mainHeading.getText().equals("Tesla")) System.out.println("Main title validation is PASSED");
        else System.out.println("Main title validation is FAILED");

        Driver.quitDriver();
    }
}
