package steps.issaura_steps;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

import java.util.List;

    public class SignUPSteps {

        WebDriver driver = Driver.getDriver();

        HomePage homePage;

        Faker faker= new Faker();
        String password;



        @Given("user is on cashWise Website")
        public void user_is_on_cash_wise_website() {
            homePage = new HomePage();
            driver.get(Config.getValue("baseURL"));
            Assert.assertEquals("Cashwise", driver.getTitle());
            ApplicationFlow.pause(2000);

        }
        @When("the user enters a valid email")
        public void the_user_enters_a_valid_email() {
            homePage.signUpBtnFirst.click();
            homePage.signUpEmail.sendKeys(faker.internet().emailAddress());

        }

        @When("user enters password")
        public void user_enters_password() {
            password = faker.internet().password();
            homePage.signUpPassword.sendKeys(password);

        }

        @When("users confirm password")
        public void users_confirm_password() {
            homePage.signUpConfirmPassword.sendKeys(password);ApplicationFlow.pause(2000);

        }

        @When("the user click on continue button")
        public void the_user_click_on_continue_button() {
            homePage.signUpContinueBtn.click();

        }

        @Then("verify the second steps {string},{string},{string},{string},{string}")
        public void verify_the_second_steps_name(String name, String surname, String nameOfBusiness, String ab, String address) {
            homePage.signUpName.sendKeys(name);
            homePage.signUpLastName.sendKeys(surname);
            homePage.signUpBusinessName.sendKeys(nameOfBusiness);
            homePage.signUpBusinessAreaDropdown.click();
            List<WebElement> optionsFromBusinessAreaDropdown = homePage.optionsFromBusinessAreaDropdown;
            optionsFromBusinessAreaDropdown.get(2).click();
            homePage.signUpAddress.sendKeys(address);
            homePage.signUpCurrencyDropdown.click();
            List<WebElement> optionsFromCurrency = homePage.optionsFromCurrency;
            optionsFromCurrency.get(0).click();
            homePage.signUpBtnForm.click();
            String expectedURL = "https://cashwise.us/dashboard/infographics";
           //ApplicationFlow.pause(15000);
            //Assert.assertEquals(expectedURL,driver.getCurrentUrl());

        }

    }

