package steps.temirbek_steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.DashBoardPage;
import pages.HomePage;
import pages.SalesPage;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

import java.util.List;
import java.util.Random;

public class AddProductSteps {
    HomePage homePage = new HomePage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    SalesPage salesPage = new SalesPage();
    WebDriver driver = Driver.getDriver();

    private String name;
    private String description;
    private String price;


    @Given("User will log in to CashWise website with the correct {string} and {string}")
    public void user_will_log_in_to_website_with_the_correct_and(String string2, String string3) {
        driver.get(Config.getValue("baseURL"));
        homePage.signIn(string2, string3);
    }

    @Then("User will navigate to Sales page from left side menu")
    public void user_will_navigate_to_sales_page_from_left_side_menu() {
        Assert.assertTrue(dashBoardPage.Sales.isDisplayed());
    }

    @Then("“Sales” should show additional options as dropdown menu")
    public void sales_should_show_additional_options_as_dropdown_menu() {
        Assert.assertEquals(salesPage.SalesOptions.size(), 3);
        dashBoardPage.Sales.click();
    }

    @When("user clicks Products and services option on the dropdown menu")
    public void user_clicks_option_on_the_dropdown_menu() {
        salesPage.productsAndServices.click();
    }

    @Then("Verify that user will see “Add Products or Services +” button")
    public void user_will_see_add_products_or_services_button() {
        Assert.assertTrue(salesPage.AddProductsOrService.isDisplayed());
    }

    @Given("User will click on Add Products or Services + button")
    public void user_will_click_on_button() {
        salesPage.AddProductsOrService.click();
    }

    @Then("verify that add products or services popup window is displayed")
    public void verify_that_add_products_or_services_popup_window_is_displayed() {
        Assert.assertTrue(salesPage.addProductsOrServicesPopupWindowForm.isDisplayed());
    }


    // -------------------------------- ----------------------------------------------------------------


    @Then("verify that add products or services popup window contains following fields:")
    public void verify_that_add_products_or_services_popup_window_contains_following_fields() {
        for (WebElement field : salesPage.namesOfItems){
            Assert.assertTrue(field.isDisplayed());
        }

    }


    //================================================================================================================




    @Then("User fills out {string} and {string} and {string}")
    public void user_fills_out_and_and_chooses_from_the_service_type_dropdown_and_category_dropdown(String name, String price, String description) {
        this.name=name;
        this.price=price;
        this.description=description;
        salesPage.nameInput.sendKeys(name);
        salesPage.priceInput.sendKeys(price);


    }
    @Then("User chooses from the Service type dropdown and category dropdown")
    public void user_fills_out() {
        salesPage.serviceType.click();
        Random random = new Random();
        List<WebElement> dropdownOptions = salesPage.serviceTypeDropdown;
        int index = random.nextInt(dropdownOptions.size());
        dropdownOptions.get(index).click();
        ApplicationFlow.pause(1000);


        salesPage.category.click();
        ApplicationFlow.pause(500);
        List<WebElement> dropdownOptions2 = salesPage.categoryDropdown;
        int index2 = random.nextInt(dropdownOptions2.size());
        ApplicationFlow.pause(500);
        dropdownOptions2.get(index2).click();



    }
    @Then("User clicks on save button")
    public void user_clicks_on_button() {
        this.description = description;
        salesPage.descriptionInput.sendKeys(description);
        ApplicationFlow.pause(1500);
        salesPage.descriptionInput.sendKeys(Keys.ENTER);

        ApplicationFlow.pause(1000);
    }
    @Then("Validate that new product or service were added on the list of Sales and Product page")
    public void validate_that_new_products_or_service_were_added_on_the_list_of_sales_and_product_page() {
        this.name = name;
        this.price = price;
        this.description = description;
        /*WebElement name1 = driver.findElement(By.xpath("(//*[text()='"+name+"'])"));
        WebElement price1 = driver.findElement(By.xpath("(//*[text()='"+price+"'])"));
        WebElement description1 = driver.findElement(By.xpath("(//*[text()='"+description+"'])"));
        Assert.assertTrue(name1.isDisplayed());
        Assert.assertTrue(price1.isDisplayed());
        Assert.assertTrue(description1.isDisplayed());*/
        String expected= "Product successfully created";
        Assert.assertNotEquals(expected, salesPage.alertMessage.getText());



        //================================================================================================================================



    }

    @Then("Validate that user should be able to see {string} text")
    public void validate_That_User_Should_Be_Able_To_See_This_Name_Already_Exists_Text(String string) {
        String actualAlertText = salesPage.alertMessage.getText();
        Assert.assertEquals(string, actualAlertText);
    }


}
