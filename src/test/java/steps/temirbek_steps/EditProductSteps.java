package steps.temirbek_steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.DashBoardPage;
import pages.HomePage;
import pages.SalesPage;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

import java.util.List;
import java.util.Random;


public class EditProductSteps {

    HomePage homePage = new HomePage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    SalesPage salesPage = new SalesPage();

    @Given("I am on the Products and Services page")
    public void i_am_on_the_Products_and_Services_page() {
        Driver.getDriver().get(Config.getValue("baseURL"));
        homePage.signIn(Config.getValue("email"), Config.getValue("password"));
        dashBoardPage.Sales.click();
        salesPage.productsAndServices.click();
    }
    @When("I locate an existing product or service to edit")
    public void i_locate_an_existing_product_or_service_to_edit() {
        List<WebElement> listOfEditIcons = salesPage.editIconList;
        Random random = new Random();
        int index = random.nextInt(listOfEditIcons.size());
        listOfEditIcons.get(index).click();
        ApplicationFlow.pause(1000);
    }
    @Then("all editable fields should be displayed correctly")
    public void all_editable_fields_should_be_displayed_correctly() {

    }
    @When("I modify the necessary fields")
    public void i_modify_the_necessary_fields() {

    }
    @When("I save the changes")
    public void i_save_the_changes() {
        salesPage.saveButton2.click();
    }
    @Then("the edited product or service should be updated in the database")
    public void the_edited_product_or_service_should_be_updated_in_the_database() {

    }
    @Then("the changes should be reflected accurately on the Products and Services page")
    public void the_changes_should_be_reflected_accurately_on_the_Products_and_Services_page() {
    }

}
