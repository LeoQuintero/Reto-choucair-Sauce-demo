package com.choucair.reto.saucedemo.steps;

import com.choucair.reto.saucedemo.pageobjets.SaucedemoLoginPage;
import net.thucydides.core.annotations.Step;



public class RealizarCompraSteps {
    SaucedemoLoginPage saucedemoLoginPage;

    @Step
    public void loginSaucedemo(String strUsuario, String strPass) {
//        1. Abrir el navegador
        saucedemoLoginPage.open();
//        2. Ingresar usuario standard_user
//        3. Ingresar clave secret_sauce
//        4. Click en el botón LOGIN
        saucedemoLoginPage.ingresarDatos(strUsuario, strPass);
//        5. Verificar la Autentificación (label en home)
        saucedemoLoginPage.verificaHome();




    }


}
