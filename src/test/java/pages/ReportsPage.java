package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ReportsPage {

    public ReportsPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//div/li)[3]")
    public WebElement ReportsPageBtn;

    //////////////TRANSACTIONS////////////////////////////////////////
    // transaction button
    @FindBy(xpath = "//*[.='Transactions']")
    public WebElement transactionBtn;
    //From Input Web element
    @FindBy(xpath = "(//div/input)[1]")
    public WebElement inputFrom;
    // From Web element Button
    @FindBy(xpath = "(//div/button)[4]")
    public WebElement inputFromBtn;
    //To input Web element

    @FindBy(xpath = "(//div/input)[2]")
    public WebElement inputTo;
    //To Web element button
    @FindBy(xpath = "(//div/button)[5]")
    public WebElement inputToBtn;


    //AllStatusesDropdown

    @FindBy(xpath = "(//div/input)[3]")
    public WebElement allStatusesDropdown;
    //By default allStatuses DropdownOption
    @FindBy(xpath = "(//div/ul/li)[1]")
    public WebElement allStatusesDropdownOption;
    //income DropdownOption
    @FindBy(xpath = "(//div/ul/li)[2]")
    public WebElement incomeAllStatusesDropdownOption;
    //expenses DropdownOption
    @FindBy(xpath = "(//div/ul/li)[3]")
    public WebElement expenseAllStatusesDropdownOption;

    //Payment type// NEED TO FINISH//////////////////////
    @FindBy(xpath = "(//div/input)[4]")
    public WebElement paymentTypeDropdown;
    //All categories///////////////////////////
    @FindBy(xpath = "(//div/input)[5]")
    public WebElement allCategories;
    //All option
    @FindBy(xpath = "//div/ul/li")
    public WebElement allOption;

    //////////////////////BUTTONS////////////////////////

    //add income button
    @FindBy(xpath = "(//div/input)[1]")
    public WebElement addIncomeBtn;
    //add expenses button
    @FindBy(xpath = "(//div/input)[2]")
    public WebElement addExpenseBtn;
    // clear button
    @FindBy(xpath = "(//div/input)[6]")
    public WebElement clearBtn;
    /////////////////////////////Report chart //////////////////////////////////////////////
    // Report chart button
    @FindBy(xpath = "//*[.='Report chart']")
    public WebElement reportChartBtn;
    // payment methods
    @FindBy(xpath = "(//div/button)[1]")
    public WebElement paymentMethodsOption;
    //income category option
    @FindBy(xpath = "(//div/button)[2]")
    public WebElement incomeCategoryOption;
    //expense category option
    @FindBy(xpath = "(//div/button)[3]")
    public WebElement expenseCategoryOption;
    //create new option
    @FindBy(xpath = "(//div/button)[4]")
    public WebElement createNewOption;
/////////////////////////Add Income Option//////////////////////////////////////////////
@FindBy(xpath = "(//div/input)[6]")
public WebElement paymentDateInput;


}



