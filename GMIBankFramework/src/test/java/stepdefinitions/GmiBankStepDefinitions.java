package stepdefinitions;

import pages.GmiBankPage;
import gmibank.utilities.Driver;

public class GmiBankStepDefinitions {
    GmiBankPage gmiBankPage = new GmiBankPage();

    @Given("user go to {string}")
    public void user_go_to(String homepage) {
        Driver.getDriver().get(homepage);
    }
}