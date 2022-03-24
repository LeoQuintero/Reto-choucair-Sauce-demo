package com.choucair.reto.saucedemo.steps;

import com.choucair.reto.saucedemo.pageobjets.RealizarCompraPage;
import net.thucydides.core.annotations.Step;

public class RealizarCompraSteps {

    RealizarCompraPage realizarCompraPage;

    @Step
    public void loginSaucedemo(String strUsuario, String strPass) {
        realizarCompraPage.open();
    }


}
