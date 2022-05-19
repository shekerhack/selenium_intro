package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.nio.file.WatchEvent;

public class _13_Form_Exercise{
    /*
    Go to https://www.techglobalschool.com/
    Scroll down to the bottom of the page

    Validate the Subscribe form
    Validate "Subscribe" heading2 with its text
    Validate "Stay up to date!" paragraph with its text
    Validate "Enter your first name" input box with its placeholder
    Validate "Enter your last name" input box with its placeholder
    Validate "Add your email" input box with its placeholder
    Validate "SUBSCRIBE" button with its text
 */
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.techglobalschool.com/");

       WebElement formHeader = driver.findElement(By.xpath("//div[@id='comp-keehv7pd1']//span/span"));
       WebElement formDescription = driver.findElement(By.xpath("//span[text()='Stay up to date!']"));
       WebElement firstNameInputBox = driver.findElement(By.xpath("input_comp-khwayxk9"));
       WebElement lastNameInputBox = driver.findElement(By.xpath("input_comp-khwaz4h2"));
       WebElement emailNameInputBox = driver.findElement(By.xpath("input_comp-khwb0zsz"));
       WebElement subscribeButton = driver.findElement(By.xpath("//span[text()='SUBSCRIBE']/.."));

        System.out.println(formHeader.getText().equals("Subscribe") ? "Form header validation PASSED" : "Form header validation FAILED");
        System.out.println(formDescription.getText().equals("Stay up to date!") ? "Form desc validation PASSED" : "Form desc validation FAILED");
        System.out.println(firstNameInputBox.getAttribute("placeholder").equals("Enter your first name") ? "First name input box validation PASSED" : "First name input box validation FAILED");
        System.out.println(lastNameInputBox.getAttribute("placeholder").equals("Enter your last name") ? "Last name input box validation PASSED" : "Last name input box validation FAILED");
        System.out.println(emailNameInputBox.getAttribute("placeholder").equals("Add your email") ? "Email input box validation PASSED" : "Email input box validation FAILED");
        System.out.println(subscribeButton.isDisplayed() && subscribeButton.isEnabled() && subscribeButton.getText().equals("SUBSCRIBE") ? "Subscribe button validation PASSED" : "Subscribe button validation FAILED");



        Driver.quitDriver();

    }

}
