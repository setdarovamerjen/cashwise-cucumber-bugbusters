package steps.tim_steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DashBoardPage;
import pages.HomePage;

import java.util.List;

public class NotificationsSteps {

    HomePage homePage = new HomePage();
    DashBoardPage dashBoardPage = new DashBoardPage();

    @Then("User should see the Notifications icon on the right side of the Header")
    public void user_should_see_the_icon_on_the_right_side_of_the_header() {
        dashBoardPage.notificationIconBtn.isDisplayed();
    }

    @When("User clicks on the Notifications icon")
    public void user_clicks_on_the_icon() {
        dashBoardPage.notificationIconBtn.click();
    }
    @Then("Verify User can see the following options in the notifications icon")
    public void verify_user_can_see_the_following_options_in_the_notifications_icon(io.cucumber.datatable.DataTable dataTable) {

        List<String> expectedNotificationsOptions = dataTable.asList();
        Assert.assertTrue(dashBoardPage.notificationOptions.size() == 3);
        for (int i = 0; i < expectedNotificationsOptions.size(); i++) {
            Assert.assertTrue(dashBoardPage.notificationOptions.get(i).getText().trim().contains(expectedNotificationsOptions.get(i)));

        }

    }
}