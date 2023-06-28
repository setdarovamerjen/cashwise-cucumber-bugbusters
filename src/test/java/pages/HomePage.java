package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


    public class HomePage {

        public HomePage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        // Language dropdown on the right side
        @FindBy(xpath = "//div[@class = 'App']/div[1]/div[1]/div[2]/div")
        public WebElement languageDropdown;

        // Options from language button. Appears only when you click Language dropdown button. Returns list of WebElem.
        @FindBy(xpath = "//div/ul/li")
        public List<WebElement> optionsFromLanguageDropdown;

        /////////////////////////////////////////////---SIGN IN---/////////////////////////////////////////////////////
        //SignIn button
        @FindBy(xpath = "//button[1]")
        public WebElement signInBtn;

        //
        //Inside SignIn
        // Email
        @FindBy(xpath = "(//input[@name='email'])[2]")
        public WebElement signInEmail;

        //Password
        @FindBy(name = "password")
        public WebElement signInPassword;

        //SignIn
        @FindBy(xpath = "(//button[@type='submit'])[2]")
        public WebElement signInBtnForm;

        //SignIn action
        public void signIn(String email, String password) {
            signInBtn.click();
            signInEmail.sendKeys(email);
            signInPassword.sendKeys(password);
            signInBtnForm.click();
        }
/////////////////////////////////////////////--SIGN UP--////////////////////////////////////////////////////////

        //First SignUp button
        @FindBy(xpath = "//button[2]")
        public WebElement signUpBtnFirst;

        //Second SignUp button
        @FindBy(xpath = "(//button[.='Sign up'])[2]")
        public WebElement signUpBtnSecond;

        //Inside SignUp----1st Step---
        //Email
        @FindBy(xpath = "(//input[@name='email'])[2]")
        public WebElement signUpEmail;

        //Password
        @FindBy(xpath = "//input[@name='password']")
        public WebElement signUpPassword;

        //Confirm the password
        @FindBy(xpath = "//input[@name='repeat_password']")
        public WebElement signUpConfirmPassword;

        @FindBy(xpath = "(//*[text()='Passwords do not match!']) ")
        public WebElement WrongPassword;

        //Continue button
        @FindBy(xpath = "//button[.='Continue']")
        public WebElement signUpContinueBtn;


        @FindBy(xpath = "(//*[text()='Please enter a valid email address'])")
        public WebElement InvalidEmail;

        //Inside SignUp----2nd Step---
        //Your name
        @FindBy(xpath = "//input[@name='first_name']")
        public WebElement signUpName;


        // ---------------------------------

        @FindBy(xpath = "(//label)[4][@data-shrink='true']")
        public WebElement fillOutPasswordDis;
        //---------------------------------

        //Your surname
        @FindBy(xpath = "//input[@name='last_name']")
        public WebElement signUpLastName;

        //Name of your business
        @FindBy(xpath = "//input[@name='company_name']")
        public WebElement signUpBusinessName;

        //Area of your business Dropdown
        @FindBy(xpath = "//div[@id='mui-component-select-business_area_id']")
        public WebElement signUpBusinessAreaDropdown;

        //All Options from Business dropdown. Appears only when you click business area dropdown. Returns List of WebElem.
        @FindBy(xpath = "//div/ul/li")
        public List<WebElement> optionsFromBusinessAreaDropdown;

        //Address
        @FindBy(xpath = "//input[@name='address']")
        public WebElement signUpAddress;

        //Select currency dropdown
        @FindBy(xpath = "//div[@id='mui-component-select-currency']")
        public WebElement signUpCurrencyDropdown;

        //Options from currency dropdown. Appears only when you click currency dropdown. Returns List of WebElem.
        @FindBy(xpath = "//div/ul/li")
        public List<WebElement> optionsFromCurrency;

        //SignUp
        @FindBy(xpath = "(//button[@type='submit'])[2]")
        public WebElement signUpBtnForm;

////////////////////////////////////////////---CONTACT US----/////////////////////////////////////////////////////

        //Your name
        @FindBy(name = "name")
        public WebElement contactNameInput;

        //Phone number
        @FindBy(name = "phone")
        public WebElement contactPhoneInput;

        //Email
        @FindBy(name = "email")
        public WebElement contactEmailInput;

        //Send button
        @FindBy(xpath = "//button[@type='submit']")
        public WebElement sendBtn;

        // Pop-up message when user successfully contacted.
        @FindBy(xpath = "//div[@type='MINI']//h2")
        public WebElement contactSubmittedPopup;


        // empty name in contact us

        @FindBy(xpath = "(//input)[1][@aria-invalid='true']")
        public WebElement emptyNameContactUs;
    }
