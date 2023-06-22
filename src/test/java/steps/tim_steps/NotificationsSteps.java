package steps.tim_steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashBoardPage;

public class NotificationsSteps {

    DashBoardPage dashBoardPage = new DashBoardPage();
    @Then("User should see the {string} icon on the right side of the Header")
    public void user_should_see_the_icon_on_the_right_side_of_the_header(String string) {

    }

    @When("User clicks on the {string} icon")
    public void user_clicks_on_the_icon(String string) {

    }

    @Then("Verify User can see the following options in the {string} icon:")
    public void verify_user_can_see_the_following_options_in_the_icon(String string, io.cucumber.datatable.DataTable dataTable) {


    }
}