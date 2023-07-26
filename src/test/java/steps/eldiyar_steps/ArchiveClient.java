package steps.eldiyar_steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DashBoardPage;
import pages.HomePage;
import pages.SalesPage;
import utilities.ApplicationFlow;

public class ArchiveClient {
    HomePage homePage= new HomePage();
    DashBoardPage dashBoardPage= new DashBoardPage();
    SalesPage salesPage= new SalesPage();

    @Then("user selects client and press archive button")
    public void user_selects_client_and_press_archive_button() {
        salesPage.checkBoxInClients.click();
        salesPage.archiveBtn.click();


    }
    @Then("verify the archived folder")
    public void verify_the_archived_folder() {
        String clientNumb= salesPage.archivedFolder.getText().substring(10,11).trim();
        int clienteNumbInt = Integer.parseInt(clientNumb);

        salesPage.archivedFolder.click();

        ApplicationFlow.pause(1500); //there is a bug, when clicking on Archive folder page will not navigate to archive folder but just will be white background
        salesPage.activeFolder.click();
    }


    @When("user tries clicks archive button without selecting archived button")
    public void user_tries_clicks_archive_button_without_selecting_archived_button() {



    }


}
