package com.choucair.reto.saucedemo.pageobjets;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class SaucedemoCheckoutPage extends PageObject {
    @FindBy(id = "checkout")
    public WebElementFacade checkout;

    public void darClickCheckout() {
        checkout.click();
    }
}
