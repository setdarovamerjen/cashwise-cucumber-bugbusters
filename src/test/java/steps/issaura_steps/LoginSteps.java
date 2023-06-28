package steps.issaura_steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

public class LoginSteps {

    HomePage homepage = new HomePage();



    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(Config.getValue("baseURL"));
        ApplicationFlow.pause(2000);
        homepage.signInBtn.click();
    }


    @When("user enters Email {string}")
    public void user_enters_email(String Email) {
        homepage.signInEmail.sendKeys(Email);

    }


    @When("user enters Password {string}")
    public void user_enters_password(String Password) {
        homepage.signInPassword.sendKeys(Password);

    }


    @Then("user click Sign in button")
    public void user_click_on_the_login_page() {
        homepage.signInBtnForm.click();

    }


    @Then("user must be Login")
    public void user_must_be_login() {
        ApplicationFlow.pause(3000);
        Assert.assertEquals(Config.getValue("landingPageURL"), Driver.getDriver().getCurrentUrl());
    }


    @When("user enter the valid email {string}")
    public void user_enter_the_valid_email(String email) {
        homepage.signInEmail.sendKeys(email);

    }

    @When("user leave the password {string} field empty")
    public void user_leave_the_password_field_empty(String password) {
        homepage.signInPassword.sendKeys(password);

    }

    @When("click on the Sign In button")
    public void click_on_the_sign_in_button() {
        homepage.signInBtnForm.click();
        ApplicationFlow.pause(3000);

    }

    @Then("I should see an error message like {string}")
    public void iShouldSeeAnErrorMessageLike(String arg0) {
        Assert.assertTrue(homepage.fillOutPasswordDis.isDisplayed());
    }


    @When("I enter an invalid email {string}")
    public void i_enter_an_invalid_email(String email) {
        homepage.signInEmail.sendKeys(email);

    }

    @When("User enters valid Password {string}")
    public void user_enters_valid_password(String password) {
        homepage.signInPassword.sendKeys(password);

    }

    @When("click on the Login button")
    public void click_on_the_Login_button() {
        homepage.signInBtn.click();
        ApplicationFlow.pause(2000);

    }


    @Then("I should see an error message stating \"Please enter a valid email address.\"")
    public void a_validation_error_message_should_be_displayed_for_please_enter_a_valid_email_address() {
        Assert.assertTrue(homepage.InvalidEmail.isDisplayed());

    }
}
