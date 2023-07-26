package steps.eldiyar_steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.DashBoardPage;
import pages.HomePage;
import pages.SalesPage;
import utilities.ApplicationFlow;
import utilities.Driver;

import java.util.List;

public class CreateInvoice {
    HomePage homePage= new HomePage();
    DashBoardPage dashBoardPage= new DashBoardPage();
    SalesPage salesPage= new SalesPage();

    @Then("user navigates to Sales dropdown menu on the left side of menu bar")
    public void userNavigatesToSalesDropdownMenuOnTheLeftSideOfMenuBar() {
       dashBoardPage.Sales.click();


    }
    @And("user clicks on Invoice")
    public void userClicksOnInvoice() {
        salesPage.invoice.click();
    }

    @And("verify that user is on invoice page {string}")
    public void verifyThatUserIsOnInvoicePage(String arg0) {
        Assert.assertEquals("https://cashwise.us/dashboard/sales/invoice/invoices", arg0);

    }



    @When("user navigates and clicks to Create invoice")
    public void userNavigatesAndClicksToCreateInvoice()
    {
        ApplicationFlow.pause(500);
        salesPage.createInvoiceBtn.click();
    }

    @And("user verifies invoice creation link {string}")
    public void userVerifiesInvoiceCreationLink(String arg0) {
        ApplicationFlow.pause(500);
        Assert.assertEquals("https://cashwise.us/dashboard/sales/invoice/create",arg0);
    }
    @And("user types in Invoice name {string}")
    public void user_types_in_invoice_name(String string) {
        ApplicationFlow.pause(500);
        salesPage.writeInvoiceNameInpt.sendKeys(string);

    }
    @Then("user types to Whom section {string}")
    public void user_types_to_whom_section(String string) {
        ApplicationFlow.pause(500);
        salesPage.writeToWhomInpt.sendKeys(string+ Keys.ENTER);
    }
    @And("user types a date for section Pay until {string}")
    public void user_types_a_date_for_section_pay_until(String string) {
        ApplicationFlow.pause(500);
        salesPage.payUntilDateInpt.click();
        salesPage.payUntilDateInpt.sendKeys(string);

    }
    @Then("user clicks to Select product and types {string} and press enter")
    public void user_clicks_to_select_product_and_types_and_press_enter(String string) {
        ApplicationFlow.pause(500);
        salesPage.selectProductBtn.click();
        salesPage.stringForProduct.click();
        ApplicationFlow.pause(2500);
        salesPage.saveBtnInvoice.click();
    }

    @Then("user lands on Invoice page and verifies created invoice")
    public void userLandsOnInvoicePageAndVerifiesCreatedInvoice() {

        ApplicationFlow.pause(2000);
        String invoiceNumb = salesPage.numberOfInv.getText().substring(6,9).trim();
        int invoiceNumbInt = Integer.parseInt(invoiceNumb);
        for (WebElement  element: salesPage.invoices){

            Assert.assertEquals(invoiceNumbInt,salesPage.invoices.size());
        }


    }

    @Then("user tries to enter button save")
    public void userTriesToEnterButtonSave() {
        ApplicationFlow.pause(500);
        String expectedUrl = "https://cashwise.us/dashboard/sales/invoice/create";
        Assert.assertEquals(expectedUrl, Driver.getDriver().getCurrentUrl());


    }
}
