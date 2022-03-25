package com.choucair.reto.saucedemo.pageobjets;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

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


    public void ingresarDatos(String strUsuario, String strPass) {
        txtUsername.sendKeys(strUsuario);
        txtPassword.sendKeys(strPass);
        btnLogin.click();
    }

    public void verificaHome() {
    }
}
