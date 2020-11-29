package tekrarlar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Css {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Documents/selenium dependecies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in.com");
        WebElement email= driver.findElement(By.cssSelector("input.form-control"));
        email.sendKeys("testtechproed@gmail.com");
        WebElement password= driver.findElement(By.cssSelector("input#session_password"));
        password.sendKeys("Test1234!");
        WebElement signbtn=driver.findElement(By.name("commit"));
        signbtn.submit();




    }



}
