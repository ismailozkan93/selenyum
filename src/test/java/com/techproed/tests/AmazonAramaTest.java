package com.techproed.tests;

import com.techproed.pages.AmazonPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.TestBaseFinal;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonAramaTest extends TestBaseFinal {

   @Test
   public void AmazonTest() throws InterruptedException {
       extentTest=extentReports.createTest("Amazon Test","Amazon.com'da ürünismi arama testi");
       extentTest.info("Amazon.com a gidiyoruz");
               Driver.getDriver().get(ConfigurationReader.getProperty("amazon-link"));


       extentTest.info("nesne üretiyoruz.");
       AmazonPage amazonPage=new AmazonPage();

       extentTest.info("Arama butonuna"+ConfigurationReader.getProperty("aranilicak-kelime")+"yi yaz");
       amazonPage.aramaKutusu.sendKeys(ConfigurationReader.getProperty("aranilicak-kelime")+Keys.ENTER);

       extentTest.info("Sonuc bélèmèndeki yazilari aliyoruz.");
       String Yazilar= amazonPage.sonucBolumu.getText();

       extentTest.info("Assert islemi yapariz.");
       Assert.assertTrue(Yazilar.contains(ConfigurationReader.getProperty("aranilicak-kelime")));
       extentTest.info("Test passed");
   }
}
