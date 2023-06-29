package steps.marlen_steps;


import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.CashWiseHomePage_Marlen;
import pages.DashBoardPage;
import pages.SalesPage;
import pages.SalesPage_Marlen;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

public class ClientButtonSteps {

    DashBoardPage dashBoardPage = new DashBoardPage();
    SalesPage_Marlen salesPage_marlen = new SalesPage_Marlen();
    Faker faker = new Faker();
    String email = faker.internet().emailAddress();

    CashWiseHomePage_Marlen cashWiseHomePageMarlen = new CashWiseHomePage_Marlen();



    @Given("user is on Cashwise main page, user will see sign in button")
    public void user_is_on_cashwise_main_page_user_will_see_sign_in_button() {
        Driver.getDriver().get(Config.getValue("baseURL"));
    }
    @When("user clicks sign in button")
    public void user_clicks_sign_in_button() {
       cashWiseHomePageMarlen.signInButton.click();
    }
    @Then("user enters correct credentials and presses sign in")
    public void user_enters_correct_credentials_and_presses_sign_in() {
        cashWiseHomePageMarlen.signIn(Config.getValue("marlenEmail"), Config.getValue("marlenPassword"));
    }
    @Then("user is on dashboard page and clicks on {string} button")
    public void user_is_on_dashboard_page_and_clicks_on_button(String string) {
        ApplicationFlow.pause(1000);
        dashBoardPage.Sales.click();
    }
    @Then("user clicks on {string} button on top right corner")
    public void user_clicks_on_button_on_top_right_corner(String string) {
        salesPage_marlen.addClientBtn.click();
        ApplicationFlow.pause(1000);
    }


    // First Scenario
    @When("user fills out all the fields and clicks {string} button")
    public void user_fills_out_all_the_fields_and_clicks_button(String string) {
        salesPage_marlen.clientTagInput.click();
        salesPage_marlen.clientTagInput.sendKeys("Business" + Keys.ENTER);
        salesPage_marlen.companyNameInput.sendKeys("Monsters INC");
        salesPage_marlen.clientNameInput.sendKeys(faker.name().fullName());
        salesPage_marlen.emailInput.sendKeys(email);
        salesPage_marlen.pNumberInput.sendKeys(faker.phoneNumber().subscriberNumber(10));
        salesPage_marlen.addressInput.sendKeys(faker.address().streetAddress());
        salesPage_marlen.submitButton.click();
    }

    @Then("user must see added Client on Client page. first")
    public void user_must_see_added_client_on_client_page_first() {
        ApplicationFlow.pause(1000);
        String email1 = Driver.getDriver().findElement(By.xpath("//tbody/tr["+(salesPage_marlen.tableOfClients.size())+"]/td[6]")).getText();
        ApplicationFlow.pause(1000);
        Assert.assertEquals("not equal" ,email1,email);
    }


    // Second scenario

    @When("user fills out all the fields except first field and clicks {string} button")
    public void user_fills_out_all_the_fields_except_first_field_and_clicks_button(String string) {
        salesPage_marlen.companyNameInput.sendKeys("Monsters INC");
        salesPage_marlen.clientNameInput.sendKeys("Mike Wasd");
        salesPage_marlen.emailInput.sendKeys(faker.internet().emailAddress());
        salesPage_marlen.pNumberInput.sendKeys(faker.phoneNumber().subscriberNumber(10));
        salesPage_marlen.addressInput.sendKeys("123 Baker St");
        salesPage_marlen.submitButton.click();
    }

    @Then("user must not be able to see added Client on Client page. second")
    public void user_must_not_be_able_to_see_added_client_on_client_page_second() {
        Assert.assertNotEquals("Error: Client was added" ,Config.getValue("salesPageURL"), Driver.getDriver().getCurrentUrl());
    }



    // Third Scenario

    @When("user fills out all required fields and clicks {string} button")
    public void user_fills_out_all_required_fields_and_clicks_button(String string) {

        salesPage_marlen.clientNameInput.sendKeys("Mike Wasd");
        salesPage_marlen.emailInput.sendKeys(faker.internet().emailAddress());
        salesPage_marlen.pNumberInput.sendKeys(faker.phoneNumber().subscriberNumber(10));
        salesPage_marlen.submitButton.click();
    }

    @Then("user must not see added Client on Client page. third")
    public void user_must_not_see_added_client_on_client_page_third() {
        Assert.assertNotEquals("Error: Client was added" ,Config.getValue("salesPageURL"), Driver.getDriver().getCurrentUrl());
    }


    // Fourth Scenario

    @When("user fills out all not required fields and presses {string} button")
    public void user_fills_out_all_not_required_fields_and_presses_button(String string) {
        salesPage_marlen.clientTagInput.click();
        salesPage_marlen.clientTagInput.sendKeys("Business" + Keys.ENTER);
        salesPage_marlen.companyNameInput.sendKeys("Monsters INC");
        salesPage_marlen.addressInput.sendKeys("123 Baker St");
        salesPage_marlen.submitButton.click();
    }
    @Then("user should not be able to add Client on Client page. fourth")
    public void user_should_not_be_able_to_add_client_on_client_page_fourth() {
        Assert.assertNotEquals("Error: Client was added" ,Config.getValue("salesPageURL"), Driver.getDriver().getCurrentUrl());
    }

    // Fifth Scenario

    @When("user fills out all the fields and presses {string} button")
    public void user_fills_out_all_the_fields_and_presses_button(String string) {
        salesPage_marlen.clientTagInput.click();
        salesPage_marlen.clientTagInput.sendKeys("Business" + Keys.ENTER);
        salesPage_marlen.companyNameInput.sendKeys("Monsters INC");
        salesPage_marlen.clientNameInput.sendKeys(faker.name().fullName());
        salesPage_marlen.emailInput.sendKeys(faker.harryPotter().spell());
        salesPage_marlen.pNumberInput.sendKeys(faker.phoneNumber().subscriberNumber(10));
        salesPage_marlen.addressInput.sendKeys(faker.address().streetAddress());
        salesPage_marlen.submitButton.click();
    }
    @Then("user should not be able to add Client on Client page. fifth")
    public void user_should_not_be_able_to_add_client_on_client_page_fifth() {
        Assert.assertNotEquals("Error: Client was added" ,Config.getValue("salesPageURL"), Driver.getDriver().getCurrentUrl());
    }



}
