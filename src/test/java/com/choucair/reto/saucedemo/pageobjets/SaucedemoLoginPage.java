package com.choucair.reto.saucedemo.pageobjets;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://www.saucedemo.com/")

public class SaucedemoLoginPage extends PageObject {
    // Campo usuario
    @FindBy(id = "user-name")
    public WebElementFacade txtUsername;

    // Campo password
    @FindBy(id = "password")
    public WebElementFacade txtPassword;

    // Boton login
    @FindBy(id = "login-button")
    public WebElementFacade btnLogin;

    // Validación label home
    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    public WebElementFacade lblHome;


    public void ingresarDatos(String strUsuario, String strPass) {
        txtUsername.sendKeys(strUsuario);
        txtPassword.sendKeys(strPass);
        btnLogin.click();
    }

    public void verificaHome() {
        String label ="PRODUCTS";
        String strMensaje =lblHome.getText();
        assertThat(strMensaje, containsString(label));
    }


}
