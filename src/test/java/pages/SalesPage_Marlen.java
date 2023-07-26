package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SalesPage_Marlen {

    public SalesPage_Marlen(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(
            xpath = "(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-column css-1wkwmmc'])[1]/a"
    )
    public List<WebElement> SalesOptions;
    @FindBy(
            xpath = "//div/a[@id='active']"
    )
    public WebElement clients;
    @FindBy(
            xpath = "//div/button[.='Add client']"
    )
    public WebElement addClientBtn;
    @FindBy(
            xpath = "//div/button[.='Import from XLS']"
    )
    public WebElement clientsImportFromXLSBtn;
    @FindBy(
            xpath = "//input[@name='name']"
    )
    public WebElement searchForClientInput;
    @FindBy(
            xpath = "//a[.='Products and services']"
    )
    public WebElement productsAndServices;
    @FindBy(
            xpath = "//button[.='Add products or service']"
    )
    public WebElement AddProductsOrService;
    @FindBy(
            xpath = "//a[.='Invoice']"
    )
    public WebElement invoice;
    @FindBy(
            xpath = "//button[.='Create invoice']"
    )
    public WebElement createInvoiceBtn;
    @FindBy(
            xpath = "((//div[@class=' css-ackcql'])[2])//input"
    )
    public WebElement clientTagInput;
    @FindBy(
            name = "company_name"
    )
    public WebElement companyNameInput;
    @FindBy(
            name = "client_name"
    )
    public WebElement clientNameInput;
    @FindBy(
            name = "email"
    )
    public WebElement emailInput;
    @FindBy(
            name = "phone_number"
    )
    public WebElement pNumberInput;
    @FindBy(
            name = "address"
    )
    public WebElement addressInput;
    @FindBy(
            xpath = "//tbody/tr"
    )
    public List<WebElement> tableOfClients;
    @FindBy(
            xpath = "//button[@type='submit']"
    )
    public WebElement submitButton;


    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement chooseAllClients;

    @FindBy(xpath = "//button[.='Archive']")
    public WebElement archiveButton;

    @FindBy(xpath = "//*[contains(text(), 'Active ')]")
    public WebElement activeCategorieButton;
}
