package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;

public class Hooks {

    @Before
    public void beforeScenario(){

    }
    @After
    public void afterScenario(){
        Driver.quit();
    }
}
