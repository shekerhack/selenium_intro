package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidationUtils {

    public static void validateTitle(WebDriver driver, String expectedTitle) {
        if (driver.getTitle().equals(expectedTitle)) System.out.println("Title is VALIDATED");
        else throw new RuntimeException("Title is NOT VALIDATED\n" +
                "Expected title: \"" + expectedTitle + "\" | Actual Title: \"" + driver.getTitle() + "\"");
    }

    public static void validateURL(WebDriver driver, String expectedUrl) {
        if (driver.getCurrentUrl().equals(expectedUrl)) System.out.println("URL is VALIDATED");
        else throw new RuntimeException("Url is NOT VALIDATED\n" +
                "Expected Url: \"" + expectedUrl + "\" | Actual Url: \"" + driver.getCurrentUrl() + "\"");
    }

    public static void validateElementIsDisplayed(WebElement element) {
        if (element.isDisplayed()) System.out.println("Element is DISPLAYED");
        else throw new RuntimeException("Element is NOT DISPLAYED");
    }

    public static void validateElementIsDisplayed(WebElement element, String elementName) {
        if (element.isDisplayed()) System.out.println(elementName + " is DISPLAYED");
        else throw new RuntimeException(elementName + " is NOT DISPLAYED");
    }

    public static void validateElementIsEnabled(WebElement element) {
        if (element.isEnabled()) System.out.println("Element is ENABLED");
        else throw new RuntimeException("Element is NOT ENABLED");
    }

    public static void validateElementIsEnabled(WebElement element, String elementName) {
        if (element.isEnabled()) System.out.println(elementName + " is ENABLED");
        else throw new RuntimeException(elementName + " is NOT ENABLED");
    }

    public static void validateElementIsDisplayedAndEnabled(WebElement element) {
        validateElementIsDisplayed(element);
        validateElementIsEnabled(element);
    }

    public static void validateElementIsDisplayedAndEnabled(WebElement element, String elementName) {
        validateElementIsDisplayed(element, elementName);
        validateElementIsEnabled(element, elementName);
    }


}