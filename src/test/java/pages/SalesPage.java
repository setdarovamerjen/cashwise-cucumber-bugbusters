package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SalesPage {

    public SalesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Sales options, returns List of WebElem
    @FindBy (xpath = "(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-column css-1wkwmmc'])[1]/a")
    public List<WebElement> SalesOptions;

    ///////////////////////////////////////--Clients--/////////////////////////////////////////
    //Clients option of Sales,  appears only when you click Sales
    @FindBy (xpath = "//div/a[@id='active']")
    public WebElement clients;

    //Add client button
    @FindBy (xpath = "//div/button[.='Add client']")
    public WebElement addClientBtn;

    //Import from XLS
    @FindBy (xpath = "//div/button[.='Import from XLS']")
    public WebElement clientsImportFromXLSBtn;

    //Search for client name input
    @FindBy (xpath = "//input[@name='name']")
    public WebElement searchForClientInput;

    ///////////////////////////////////////--PRODUCTS AND SERVICES--/////////////////////////////////////////
    //Products and services option of Sales,  appears only when you click Sales
    @FindBy (xpath = "//a[.='Products and services']")
    public WebElement productsAndServices;

    //Add products or service
    @FindBy (xpath = "//button[.='Add products or service']")
    public WebElement AddProductsOrService;

    ///////////////////////////////////////--INVOICE--/////////////////////////////////////////
    //Invoice option of Sales,  appears only when you click Sales
    @FindBy (xpath = "//a[.='Invoice']")
    public WebElement invoice;

    //Create invoice button
    @FindBy (xpath = "//button[.='Create invoice']")
    public WebElement createInvoiceBtn;

    @FindBy(xpath = "//input[@name = 'invoice_title']")
    public WebElement writeInvoiceNameInpt;
    @FindBy(xpath = "//input[@id = 'react-select-5-input']")
    public WebElement writeToWhomInpt;

    @FindBy(xpath = "(//input[@placeholder = 'dd.mm.yy'])[2]")
    public WebElement payUntilDateInpt;
    @FindBy(xpath = "//button[@class = 'MuiButton-root MuiButton-BORDERED MuiButton-BORDEREDPrimary MuiButton-sizeMedium MuiButton-BORDEREDSizeMedium MuiButtonBase-root css-g7im2v']")
    public WebElement selectProductBtn;

    @FindBy(xpath = "//p[.='koma']")
    public WebElement stringForProduct;

    @FindBy(xpath = "//button[.='Save']")
    public WebElement saveBtnInvoice;

    @FindBy(xpath = "//button[.='Accept payment']/../../..")
    public List<WebElement> invoices;

    @FindBy(xpath = "//div[@class = 'sc-hAZoDl bmWOLM']")
    public WebElement numberOfInv;


}
