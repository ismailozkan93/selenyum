package tekrarlar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Documents/selenium dependecies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in.com");
        WebElement username= driver.findElement(By.className("form-control"));
        username.sendKeys("testtechproed@gmail.com");
        WebElement sifre= driver.findElement(By.id("session_password"));
        sifre.sendKeys("Test1234!");
        WebElement btn= driver.findElement(By.xpath("//input[@type='submit']"));
        btn.click();
    }




}
