package steps.merjen_steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DashBoardPage;
import pages.HomePage;
import pages.SalesPage;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

import java.util.List;

public class SalesOptionsSteps {

    HomePage homePage= new HomePage();
    DashBoardPage dashBoardPage= new DashBoardPage();
    SalesPage salesPage= new SalesPage();

    @When("User navigates to the CashWise webpage")
    public void user_navigates_to_the_cash_wise_webpage() {
            Driver.getDriver().get(Config.getValue("baseURL"));
    }

    @Then("User is logged in on the CashWise webpage with valid {string} and valid {string}")
    public void user_is_logged_in_on_the_cash_wise_webpage_with_valid_and_valid(String email, String password) {
        homePage.signInBtn.click();
        homePage.signInEmail.sendKeys(email);
        homePage.signInPassword.sendKeys(password);
        homePage.signInBtnForm.click();
    }

    @Then("Verify User should be successfully redirected to the dashboard page")
    public void verify_user_should_be_successfully_redirected_to_the_dashboard_page() {
        ApplicationFlow.pause(3000);
        Assert.assertEquals(Config.getValue("landingPageURL"), Driver.getDriver().getCurrentUrl());
    }

    @Then("User should see the Sales tab on the left side Menu Bar")
    public void user_should_see_the_sales_tab_on_the_left_side_menu_bar() {
        Assert.assertTrue(dashBoardPage.Sales.isDisplayed());
    }

    @When("User clicks on the Sales tab")
    public void user_clicks_on_the_tab() {
        dashBoardPage.Sales.click();
    }

    @Then("Verify User can see the following options in the dropdown menu of Sales:")
    public void user_should_see_the_following_options_available (List <String> expectedSalesOptions) {
        Assert.assertEquals(salesPage.SalesOptions.size(), 3);
        List<WebElement> actualSalesOptions = salesPage.SalesOptions;
        for (int i=0; i<actualSalesOptions.size(); i++){
            Assert.assertEquals(actualSalesOptions.get(i).getText().trim(), expectedSalesOptions.get(i));
        }
        Driver.quit();
    }

    /////////////////

    @When("User clicks on the Clients option")
    public void user_clicks_on_the_clients_option() {
       salesPage.clients.click();
    }
    @Then("Verify User should be redirected to the expected URL {string} for Clients")
    public void verify_user_should_be_redirected_to_the_expected_url_for_clients(String URL) {
        ApplicationFlow.pause(3000);
        Assert.assertEquals( "URL for Client option failed", URL, Driver.getDriver().getCurrentUrl());
        Driver.quit();
    }

    @When("User clicks on the Products and services option")
    public void user_clicks_on_the_products_and_services_option() {
        salesPage.productsAndServices.click();
    }
    @Then("Verify User should be redirected to the expected URL {string} for Products and services")
    public void verify_user_should_be_redirected_to_the_expected_url_https_cashwise_us_dashboard_sales_products_and_services_for_products_and_services(String URL) {
       ApplicationFlow.pause(3000);
       Assert.assertEquals( "URL for Products and services option failed", URL, Driver.getDriver().getCurrentUrl());
        Driver.quit();
    }

    @When("User clicks on the Invoice option")
    public void user_clicks_on_the_invoice_option() {
       salesPage.invoice.click();
    }


    @Then("Verify User should be redirected to the expected URL {string} for Invoice")
    public void verify_user_should_be_redirected_to_the_expected_url_for_invoice(String URL) {
        ApplicationFlow.pause(3000);
        Assert.assertEquals( "URL for Products and services option failed", URL, Driver.getDriver().getCurrentUrl());
        Driver.quit();
    }




}
