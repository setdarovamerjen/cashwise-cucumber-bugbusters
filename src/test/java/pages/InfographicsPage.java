package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InfographicsPage {
    public InfographicsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // on the right side of the Infographics page, there is a text field that contains
    // the text button "over the last 6 months"
    @FindBy(xpath = "(//button)[1]")
    public WebElement lastSixMonthsBtn;


    // on the right side of the Infographics page, there is a text field that contains
    // the text button "over the last 12 months"
    @FindBy(xpath = "(//button)[2]")
    public WebElement lastTwelveMonthsBtn;


    // in the middle of the Infographics page, there is a text button "for this month"
    @FindBy(xpath = "(//button)[3]")
    public WebElement forThisMonthBtn;


    // in the middle of the Infographics page, there is a text button "for this month"
    @FindBy(xpath = "(//button)[4]")
    public WebElement forThisYearBtn;


    // at the end of the Infographics page, there is a text field input that contains "from", which you
    // enter the date
    @FindBy(xpath = "(//input)[1]")
    public WebElement fromInputBtn;


    // at the end of the Infographics page, there is a text field input that contains "to", which you
    // enter the date
    @FindBy(xpath = "(//input)[2]")
    public WebElement ToInputBtn;


    // at the end of the Infographics page, there is a button that contains "from", near that picture button of a calendar
    @FindBy(xpath = "//button)[5]")
    public WebElement fromDateBtn;


    // at the end of the Infographics page, there is a button that contains "to", near that picture button of a calendar
    @FindBy(xpath = "//button)[6]")
    public WebElement toDateBtn;


    // at the end of the Inf, there is a button that cancels the data which were entered
    @FindBy(xpath = "(//button)[7]")
    public WebElement dataCancelBtn;


}


