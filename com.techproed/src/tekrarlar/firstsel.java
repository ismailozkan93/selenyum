package tekrarlar;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstsel {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Documents/selenium dependecies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.navigate().to("http://www.amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();

    }
    }
