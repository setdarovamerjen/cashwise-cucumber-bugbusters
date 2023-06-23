package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DashBoardPage {
    public DashBoardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

///////////////////////////////////////////////LEFT SIDE TABS/////////////////////////////////////////////
    //Infographics
    @FindBy (id = "active")
    public WebElement Infographics;

    //Sales
    @FindBy (id = "panel1a-header")
    public WebElement Sales;

    //Expenses
    @FindBy (xpath = "//div[.='Expenses']")
    public WebElement Expenses;

    //Reports
    @FindBy (xpath = "//div[.='Reports']")
    public WebElement Reports;

    //All left side tabs as a List of WebElem [Infographics, Sales, Expenses, Reports ]
    @FindBy(xpath ="//div[@role='button'] | //a[@id='active']")
    public List<WebElement> leftSideMenu;

    //Language
    @FindBy (xpath = "//aside/div//p")
    public WebElement language;

    //Language options[ENGLISH, RUSSIAN]
    @FindBy (xpath = "//div/ul[@role='menu']/li")
    public List<WebElement> optionsOfLanguage;

    /////////////////////////////////////////--HEADER OF DASHBOARD--////////////////////////////////////////////////////

    //Notification icon
    @FindBy (xpath = "//header[@id='header']/div/p/span")
    public WebElement notificationIconBtn;
    // expiredNotificationBtn
    @FindBy(xpath = "(//ul)[2]/div/div/div[1]//button")
    public List<WebElement> notificationOptions;
    //expiredBtn
    @FindBy(xpath = "(//div/button)[9]")
    public WebElement expiredBtn;
    //remindersBtn
    @FindBy(xpath = "(//div/button)[10]")
    public WebElement remindersBtn;
    //requests
    @FindBy(xpath = "(//div/button)[11]")
    public WebElement requestsBtn;


    /////////////////////////////////////////--ACCOUNT SETTINGS--///////////////////////////////////////////////////////

    //Account settings dropdown [with name of the business owner]
    @FindBy (xpath = "//header[@id='header']/div/p[contains(text(),'')]")
    public WebElement AccountSettingsDropdown;  //near Notification Icon

    // WebElements inside Account settings dropdown, appears when you click Account settings dropdown
    //Create Account
    @FindBy (xpath = "//ul/div/button")
    public WebElement createAccountBtn;

    //Profile
    @FindBy (xpath = "//div/ul/li[.='Profile']")
    public WebElement profile;

    //LogOut
    @FindBy (xpath = "//div/ul/li[.='Log out']")
    public WebElement LogOutBtn;

    //When you click logOut Pop-up window WebElements
    //Whole PopUp window
    @FindBy (xpath = "//div[@class='MuiBox-root css-18gj56f']")
    public WebElement logOutPopUpWindow;

    //Cancel LogOut
    @FindBy (xpath = "//div/button[.='Cancel']")
    public WebElement cancelLogOutPopUp;

    // LogOut Button
    @FindBy (xpath = "//div/button[.='Log out']")
    public WebElement confirmLogOutPopUp;











}
