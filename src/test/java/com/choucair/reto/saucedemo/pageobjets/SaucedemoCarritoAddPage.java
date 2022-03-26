package com.choucair.reto.saucedemo.pageobjets;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class SaucedemoCarritoAddPage extends PageObject {
    // boton add to Car producto sauce labs backpack
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElementFacade botonAddToCar;

    //   ícono Chopping cart
    @FindBy(xpath = "//*[@id='shopping_cart_container']/a")
    public WebElementFacade iconoCar;

//    // Label producto backpack
//    @FindBy(xpath =" //*[@id='item_4_title_link']/div")
//    public WebElementFacade labelBackpack;

    public void agregarProducto1AlCarrito() {
        botonAddToCar.click();
    }

    public void ingresarAlCarrito() {
        iconoCar.click();
    }

//    public void vericarProducto1() {
//        String label ="Sauce Labs Backpack";
//        String strMensaje =labelBackpack.getText();
//        assertThat(strMensaje, containsString(label));
//    }
}
