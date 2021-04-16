package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GmiBankPage {
    public GmiBankPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
