package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {

    public static void main(String[] args) {
       String baseurl = "https://www.saucedemo.com/";  //storing base url
        System .setProperty("webdriver.edgedriver.driver","src/drivers/msedgedriver.exe"); //setting webdriver
        WebDriver driver = new EdgeDriver();  //Creating object od edge webdriver
        driver.get(baseurl);  //method to invoke url
        driver.manage().window().maximize();  //maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //timeout session
        String title = driver.getTitle();  //Storing title
        System.out.println("The title of the page : "+ title);  //Printing title in console
        String url = driver.getCurrentUrl();   //Storing URL
        System.out.println("Current Url :"+ url);  //getting url
        String source = driver.getPageSource();   //Storing page source
        System.out.println("Page source :"+ source);    //Printing page souce in console
        WebElement userNameField = driver.findElement(By.name("user-name"));  //Storing username
        userNameField.sendKeys("standard_user");     //Sending keys to username field
        WebElement passwordField = driver.findElement(By.name("password")); //Storing password field
        passwordField.sendKeys("secret_sauce");    //Seding keys to password field


    }
}
