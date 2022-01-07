package com.indra.steps_definitions;

import com.indra.actions.CreateAccount;
import com.indra.models.CreateFormulary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CreateSteps {
    @Managed
    WebDriver driver;
    CreateAccount createAccount = new CreateAccount(driver);

    //-------------primer scenario----------------------//
    @Given("^el usuario se encuentra en la opcion Create Account$")
    public void elUsuarioSeEncuentraEnLaOpcionCreateAccount() {
        createAccount.open();
        createAccount.openNewAccount();
    }

    @When("^el usuario completa el formulario$")
    public void elUsuarioCompletaElFormulario(List<CreateFormulary> createFormularies) {
        createAccount.clickOnCreateRecord(createFormularies.get(0));
    }

    @When("^el usuario aceptar las politicas de privacidad de la pagina$")
    public void elUsuarioAceptarLasPoliticasDePrivacidadDeLaPagina() {
        createAccount.accept();
    }

    @Then("^el sistema deberia realizar el registro$")
    public void elSistemaDeberiaRealizarElRegistro() throws InterruptedException {
        createAccount.clickOnCreateAccount();
    }

    //-------------segundo scenario----------------------//
    @Given("^el usuario se encuentra en Create Account$")
    public void elUsuarioSeEncuentraEnCreateAccount() {
        createAccount.open();
        createAccount.openNewAccount();
    }

    @When("^el usuario llena el formulario$")
    public void elUsuarioLlenaElFormulario(List<CreateFormulary> createFormularies) {
        createAccount.clickOnCreateRecord(createFormularies.get(0));
    }


    @Then("^el sistema deberia no realizar el registro$")
    public void elSistemaDeberiaNoRealizarElRegistro() {
        createAccount.getRegistro().isEnabled();
    }

    //-------------tercer scenario----------------------//
    @Given("^el usuario se encuentra en el Create Account$")
    public void el_usuario_se_encuentra_en_el_Create_Account() {
        createAccount.open();
        createAccount.openNewAccount();
    }

    @When("^el usuario llena el formulario con contrasenas que no coindicen$")
    public void el_usuario_llena_el_formulario_con_contrasenas_que_no_coindicen(List<CreateFormulary> createFormularies) {
        createAccount.clickOnCreateRecord(createFormularies.get(0));
    }

    @When("^el usuario aceptar politicas de privacidad de la pagina$")
    public void el_usuario_aceptar_politicas_de_privacidad_de_la_pagina() {
        createAccount.accept();
    }

    @Then("^el sistema deberia no realizar registro$")
    public void el_sistema_deberia_no_realizar_registro() {
        createAccount.contraseniaInicial = createAccount.Item();
        createAccount.getRegistro().isEnabled();
    }

}
