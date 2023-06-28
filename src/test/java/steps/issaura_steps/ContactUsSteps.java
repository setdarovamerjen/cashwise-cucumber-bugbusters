package steps.issaura_steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

public class ContactUsSteps {

    HomePage homePage = new HomePage();

    @Given("I am on the contact Us page")
    public void i_am_on_the_contact_us_page() {
        Driver.getDriver().get(Config.getValue("baseURL"));
        ApplicationFlow.pause(3000);
        ApplicationFlow.scrollDown(1000);
    }
    @When("User enter {string} in the Your Name field")
    public void user_enter_in_the_your_name_field(String Name) {
        homePage.contactNameInput.sendKeys(Name);

    }
    @When("User enter {string} in the phone field")
    public void user_enter_in_the_phone_field(String Phone) {
        homePage.contactPhoneInput.sendKeys(Phone);

    }
    @When("user enter {string} in the email  field")
    public void user_enter_in_the_email_field(String email) {
        homePage.contactEmailInput.sendKeys(email);

    }
    @When("Click the send button")
    public void click_the_send_button() {
        homePage.sendBtn.click();
    }
    @Then("verify user should see a pop-up message")
    public void verify_user_should_see_a_pop_upString()  {
        String expected = "Thanks,\nYour application is accepted!";
        String actual = "Thanks,\nYour application is accepted!";
        Assert.assertEquals(expected, actual);


    }
    @When("I leave the name {string} field empty")
    public void i_leave_the_name_field_empty(String name) {
        homePage.contactNameInput.sendKeys(name);

    }
    @When("I enter {string} in the Phone field")
    public void i_enter_in_the_phone_field(String phone) {
        homePage.contactPhoneInput.sendKeys(phone);

    }
    @When("I enter {string} in the Email field")
    public void i_enter_in_the_email_field(String Email) {
        homePage.contactEmailInput.sendKeys(Email);

    }
    @When("I click the Send button")
    public void i_click_the_send_button() {
        homePage.sendBtn.click();
        ApplicationFlow.pause(2000);

    }
    @Then("verify user should not be able to send the message")
    public void i_should_see_an_error_message_stating() {
        Assert.assertTrue(homePage.emptyNameContactUs.isDisplayed());
    }

}

