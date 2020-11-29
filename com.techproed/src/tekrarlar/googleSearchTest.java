package tekrarlar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchTest {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Documents/selenium dependecies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement arama= driver.findElement(By.name("q"));
        arama.sendKeys("city bike"+ Keys.ENTER);

        WebElement sonucsayi= driver.findElement(By.id("result-stats"));
        System.out.println(sonucsayi.getText());
        WebElement shopping= driver.findElement(By.partialLinkText("Shopping")) ;
        shopping.click();

        WebElement img= driver.findElement(By.xpath("//img[@class='TL92Hc']"));
        img.click();
}}
