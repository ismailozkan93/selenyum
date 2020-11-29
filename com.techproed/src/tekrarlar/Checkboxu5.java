package tekrarlar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxu5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Documents/selenium dependecies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement check1= driver.findElement(By.name("checkbox 1"));
        System.out.println(check1.isSelected());

    }
}
