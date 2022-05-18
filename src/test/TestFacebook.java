package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import static utilities.ValidationUtils.*;

public class TestFacebook {
    /*
    Go to https://www.facebook.com/
    Validate the title of the page is “Facebook - log in or sign up”
    Validate the URL of the page is “https://www.facebook.com/”
    Validate “facebook” logo is displayed
    Validate heading2 “Connect with friends and the world around you on Facebook.” is displayed
    Validate “Email or Phone Number” input box is displayed
    Validate “Password” input box is displayed
    Validate “Log In” button is displayed and enabled
    Validate “Forgot Password?” link is displayed
    Validate “Create New Account” button is displayed
     */

    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        // Validate the title of the page is “Facebook - log in or sign up”
        driver.get("https://www.facebook.com/");

        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)) System.out.println("Title validation is PASSED");
        else System.out.println("Title validation is FAILED!!!");

        //  Validate the URL of the page is “https://www.facebook.com/”

        driver.get("https://www.facebook.com/");

        String expectedTitle2 = "https://www.facebook.com/";
        String actualTitle2 = driver.getCurrentUrl();

        if(actualTitle2.equals(expectedTitle2)) System.out.println("URL validation is PASSED");
        else System.out.println("URL validation is FAILED!!!");

        // Validate “facebook” logo is displayed

        driver.get("https://www.facebook.com/");
        WebElement logo = driver.findElement(By.id("globalContainer"));

        if(logo.isDisplayed()) System.out.println("The logo validation is PASSED");
        else System.out.println("The log validation is FAILED!!!");

        // Validate heading2 “Connect with friends and the world around you on Facebook.” is displayed

        driver.get("https://www.facebook.com/");
        WebElement h2 = driver.findElement(By.className("_8eso"));

        if(h2.isDisplayed() && h2.getText().equals("Connect with friends and the world around you on Facebook.")) System.out.println("The heading2 validation is PASSED");
        else System.out.println("The heading2 validation is FAILED!!!");

        //  Validate “Email or Phone Number” input box is displayed

        driver.get("https://www.facebook.com/");
        WebElement inputBoxOfEmailOrPhone = driver.findElement(By.name("email"));
        if(inputBoxOfEmailOrPhone.isDisplayed()) System.out.println("Email or Phone Number validation is PASSED");
        else System.out.println("Email or Phone Number validation is FAILED!!!");

        // Validate “Password” input box is displayed
        driver.get("https://www.facebook.com/");

        WebElement password = driver.findElement(By.cssSelector("#passContainer"));
       if(password.isDisplayed()) System.out.println("Password validation is PASSED");
       else System.out.println("Password validation if FAILED!!!");

       // Validate “Log In” button is displayed and enabled
        driver.get("https://www.facebook.com/");

        WebElement logIn = driver.findElement(By.cssSelector("._6ltg"));
        if(logIn.isDisplayed() && logIn.isEnabled()) System.out.println("Log In validation is PASSED");
        else System.out.println("Log In validation if FAILED!!!");

        // Validate “Forgot Password?” link is displayed

        WebElement forgotPassword = driver.findElement(By.cssSelector("._6ltj"));

        if(forgotPassword.isDisplayed()) System.out.println("Forgot Password validation is PASSED");
        else System.out.println("Forgot Password is FAILED!!!");

        // Validate “Create New Account” button is displayed

        WebElement createNewAccount = driver.findElement(By.cssSelector("._6ltg"));

        if(createNewAccount.isDisplayed()) System.out.println("Create New Account button validation is PASSED");
        else System.out.println("Create New Account button validation is FAILED!!!");



        // OTHER WAY

        WebDriver driver2 = Driver.getDriver();


        try {
            // get the website
            driver.get("https://www.facebook.com/");

            String expectedTitle3 = "Facebook - log in or sign up";
            validateTitle(driver, expectedTitle);

            String expectedUrl = "https://www.facebook.com/";
            validateURL(driver, expectedUrl);

            /*
            xpath --> //tagName[@attributeName = 'attributeValue']
            css   --> tagName[attributeName = 'attributeValue']
             */
            //                         xpath -->   //img[@class = 'fb_logo _8ilh img']
            //                         css   -->     img[class = 'fb_logo _8ilh img']

//            WebElement fbLogo = driver.findElement(By.className("fb_logo"));
//            WebElement fbLogo = driver.findElement(By.cssSelector(".fb_logo"));
//            WebElement fbLogo = driver.findElement(By.xpath("//img[@class = 'fb_logo _8ilh img']"));
            WebElement fbLogo = driver.findElement(By.cssSelector("img[class = 'fb_logo _8ilh img']"));
            validateElementIsDisplayed(fbLogo, "Facebook logo");

//            WebElement fbHeading2 = driver.findElement(By.className("_8eso"));
            WebElement fbHeading2 = driver.findElement(By.cssSelector("._8eso"));
//            WebElement fbHeading2 = driver.findElement(By.xpath("//h2[@class='_8eso']"));
//            WebElement fbHeading2 = driver.findElement(By.cssSelector("h2[class='_8eso']"));
            validateElementIsDisplayed(fbHeading2, "Facebook header");

            WebElement inputEmailPhone = driver.findElement(By.id("email"));
            validateElementIsDisplayed(inputEmailPhone, "Email or phone number input box");

            WebElement inputPassword = driver.findElement(By.id("pass"));
            validateElementIsDisplayed(inputPassword, "Password input box");

            WebElement loginButton = driver.findElement(By.name("login"));
            validateElementIsDisplayedAndEnabled(loginButton, "Login button");

            WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot password?"));
            validateElementIsDisplayed(forgotPasswordLink, "Forgot password? link");

//            WebElement createNewAccountButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
            WebElement createNewAccountButton = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
            validateElementIsDisplayed(createNewAccountButton, "Create New Account button");



        } finally {
            Driver.quitDriver();
        }

    }
}
