package steps.marlen_steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.SalesPage_Marlen;
import utilities.ApplicationFlow;
import utilities.Driver;

public class ArchiveSteps {

    SalesPage_Marlen salesPage_marlen = new SalesPage_Marlen();
    @When("user clicks on choose all and archives all")
    public void user_clicks_on_choose_all_and_archives_all() {
        salesPage_marlen.chooseAllClients.click();
        salesPage_marlen.archiveButton.click();
        Driver.getDriver().navigate().refresh();

        String amountOfClients = salesPage_marlen.activeCategorieButton.getText();
        String amountOfClientsFormatted = "";
        for(int i = 0; i < amountOfClients.length(); i++){
            if(Character.isDigit(amountOfClients.charAt(i))){
                amountOfClientsFormatted += amountOfClients.charAt(i);
            }
        }
        int amount = Integer.parseInt(amountOfClientsFormatted);
        ApplicationFlow.pause(1000);
        System.out.println(amount);
    }
    @Then("user should not see any clients on Active clients page")
    public void user_should_not_see_any_clients_on_active_clients_page() {
        Assert.assertTrue(salesPage_marlen.activeCategorieButton.isDisplayed());
    }
}
