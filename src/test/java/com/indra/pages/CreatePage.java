package com.indra.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("https://advantageonlineshopping.com/#/register")

public class CreatePage extends PageObject {
    public CreatePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "menuUser")
    private WebElementFacade menuUser;

    @FindBy(xpath = "(//div[@class='login ng-scope']/a)[2]")
    private WebElementFacade newAccount;

    @FindBy(xpath = "//input[contains(@name,'usernameRegisterPage')]")
    private WebElementFacade Username;

    @FindBy(xpath = "//input[@name='emailRegisterPage']")
    private WebElementFacade email;

    @FindBy(name = "passwordRegisterPage")
    private WebElementFacade password;

    @FindBy(name = "confirm_passwordRegisterPage")
    private WebElementFacade passwordConfirm;

    @FindBy(name = "first_nameRegisterPage")
    private WebElementFacade firstName;

    @FindBy(name = "last_nameRegisterPage")
    private WebElementFacade lastName;

    @FindBy(name = "phone_numberRegisterPage")
    private WebElementFacade phoneNumber;

    @FindBy(name = "countryListboxRegisterPage")
    private WebElementFacade country;

    @FindBy(name = "addressRegisterPage")
    private WebElementFacade adress;

    @FindBy(xpath = "(//input[contains(@data-ng-model,'secModel')])[14]")
    private WebElementFacade state;

    @FindBy(name = "postal_codeRegisterPage")
    private WebElementFacade postalCode;

    @FindBy(xpath = "(//input[contains(@data-ng-model,'secModel')])[16]")
    private WebElementFacade agree;

    @FindBy(id = "register_btnundefined")
    private WebElementFacade registro;

    @FindBy(xpath = "//input[contains(@name,'cityRegisterPage')]")
    private WebElementFacade city;

    @FindBy(xpath = "/html/body/login-modal/div/div/div[3]")
    private WebElementFacade ventana;

    @FindBy(xpath = "/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/div[1]/div[2]/sec-view[2]/div/label")
    private WebElementFacade contrasenaInc;

    public WebElementFacade getContrasenaInc() {
        return contrasenaInc;
    }

    public WebElementFacade getMenuUser() {
        return menuUser;
    }

    public WebElementFacade getNewAccount() {
        return newAccount;
    }

    public WebElementFacade getUsername() {
        return Username;
    }

    public WebElementFacade getEmail() {
        return email;
    }

    public WebElementFacade getPassword() {
        return password;
    }

    public WebElementFacade getPasswordConfirm() {
        return passwordConfirm;
    }

    public WebElementFacade getFirstName() {
        return firstName;
    }

    public WebElementFacade getLastName() {
        return lastName;
    }

    public WebElementFacade getPhoneNumber() {
        return phoneNumber;
    }

    public WebElementFacade getCountry() {
        return country;
    }

    public WebElementFacade getAdress() {
        return adress;
    }

    public WebElementFacade getState() {
        return state;
    }

    public WebElementFacade getPostalCode() {
        return postalCode;
    }

    public WebElementFacade getAgree() {
        return agree;
    }

    public WebElementFacade getRegistro() {
        return registro;
    }

    public WebElementFacade getCity() {
        return city;
    }

    public WebElementFacade getVentana(){
        return ventana;
    }

    public void selectOptionFromDropDown(By by, String visibleText) {
        Select select = new Select(getDriver().findElement(by));
        select.selectByVisibleText(visibleText);
    }

    public void selectOptionFromDropDown(By by, int index) {
        Select select = new Select(getDriver().findElement(by));
        select.selectByIndex(index);
    }

}

