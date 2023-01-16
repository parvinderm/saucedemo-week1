package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class FireFoxTest {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/";  //storing base url
        System.setProperty("webdriver.firefox.driver","src/drivers/geckodriver.exe");   //Setting webdriver
        WebDriver driver = new EdgeDriver();  //Creating object for the Edge browser
        driver.get(baseurl);    //method to invoke url
        driver.manage().window().maximize();  //maximising the windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //timeout session
        String title = driver.getTitle();  //Storing title
        System.out.println("The ptitle of the page :"+ title);  //Printing title in the console
        String url = driver.getCurrentUrl();  //Storing Url
        System.out.println("Current URL :"+url);  //getting URL
        String source = driver.getPageSource();  //Storing page source
        System.out.println("Page source : "+ source);  //Printing page source in console
        WebElement userNameField = driver.findElement(By.name("user-name"));   //Storing username field
        userNameField.sendKeys("standard_user");  //Sending keys to username field
        WebElement passwordField = driver.findElement(By.name("password"));   //Storing password field
        passwordField.sendKeys("secret_sauce");   //Sending keys to password field
//        driver.close();  //driver to close the browser
    }
}
