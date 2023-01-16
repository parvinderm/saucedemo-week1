package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {

    public static void main(String[] args) {
         String baseurl = "https://www.saucedemo.com/";  //Storing base url
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe"); //setting webdriver
        WebDriver driver = new ChromeDriver(); //Creating object for chrome webdriver
        driver.get(baseurl);  //method to invoke url
        driver.manage().window().maximize();  //maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   //timeout session
        String title = driver.getTitle();  //Storing title
        System.out.println("The title of the page :"+title);  //Printing title in console
        String url = driver.getCurrentUrl();  //Storing url
        System.out.println("Current URL :"+url);   //getting url
        String source = driver.getPageSource();  //Storing pagesource
        System.out.println("Page source :"+source);  //Printing the source in console
        WebElement userNameField = driver.findElement(By.name("user-name"));  //Storing username field
        userNameField.sendKeys("standard_user");   //Sending keys to username field
        WebElement passwordField = driver.findElement(By.name("password"));  //Storing password field
        passwordField.sendKeys("secret_sauce");   //sendkeys to password field
        driver.close();
    }

}
