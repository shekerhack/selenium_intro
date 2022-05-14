package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {
    /*
    TEST CASE
    1. Go to "https://www.apple.com/"
    2. Validate the title of the page is displayed as "Apple"
     */
    public static void main(String[] args) {
        //1. Set up driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\IdeaProjects\\selenium_intro\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Instantiate a Chrome Browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //2. Validation
        driver.get("https://www.apple.com/");

        String expectedTitle = "Apple"; // from requirement
        String actualTitle = driver.getTitle(); // from application under development

        if(actualTitle.equals(expectedTitle)) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED!!!");

        //3. Quit driver
        Thread.sleep(3000);
        driver.quit();

    }
}
