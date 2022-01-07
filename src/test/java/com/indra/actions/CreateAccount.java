package com.indra.actions;

import com.indra.models.CreateFormulary;
import com.indra.pages.CreatePage;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

@DefaultUrl("https://advantageonlineshopping.com/")
public class CreateAccount extends CreatePage {
    public CreateAccount(WebDriver driver) {
        super(driver);
    }

    public String contraseniaInicial;

    public void openNewAccount(){
        getMenuUser().click();
        getVentana().waitUntilVisible();
        clickOnCreate();
    }

    public void clickOnCreate(){
        WebElement newAccount = getDriver().findElement(By.xpath("(//div[@class='login ng-scope']/a)[2]"));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click()", newAccount);
    }

    public void fillRegistrationForm(CreateFormulary signIn)  {
        enter(signIn.getUsuario()).into(getUsername());
        enter(generateRandomMail()).into(getEmail());
        enter(signIn.getContrasenia()).into(getPassword());
        enter(signIn.getContrasenia2()).into(getPasswordConfirm());
        enter(signIn.getNombre()).into(getFirstName());
        enter(signIn.getApellido()).into(getLastName());
        enter(signIn.getTelefono()).into(getPhoneNumber());
        selectOptionFromDropDown(By.name("countryListboxRegisterPage"),signIn.getPais());
        enter(signIn.getCiudad()).into(getCity());
        enter(signIn.getDireccion()).into(getAdress());
        enter(signIn.getEstado()).into(getState());
        enter(signIn.getCodigoPostal()).into(getPostalCode());
    }

    public void clickOnCreateRecord(CreateFormulary sign_in){
        fillRegistrationForm(sign_in);
    }

    public void accept(){
        getAgree().click();
    }

    public void clickOnCreateAccount(){
        getRegistro().click();
    }

    public String generateRandomMail(){
        int numerous = (int)(Math.random()*10000+1);
         String randomMail=String.valueOf("natalia"+numerous+"@indra.com");
         return randomMail;
    }

    public String Item(){
        String itemcost=getContrasenaInc().getText();
        return itemcost;
    }
}
