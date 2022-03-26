package com.choucair.reto.saucedemo.steps;

import com.choucair.reto.saucedemo.pageobjets.SaucedemoCarritoAddPage;
import com.choucair.reto.saucedemo.pageobjets.SaucedemoCheckoutPage;
import com.choucair.reto.saucedemo.pageobjets.SaucedemoLoginPage;
import net.thucydides.core.annotations.Step;



public class RealizarCompraSteps {
    SaucedemoLoginPage saucedemoLoginPage;
    SaucedemoCarritoAddPage saucedemoCarritoAddPage;
    SaucedemoCheckoutPage saucedemoCheckoutPage;

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

    @Step
    public void agregarProducto1() {
//        6. Agrego el primer producto
        saucedemoCarritoAddPage.agregarProducto1AlCarrito();//
    }

    @Step
    public void validarProducto1Carrito() {
//        7. ingreso al carrito
        try {
            Thread.sleep(3000);
            saucedemoCarritoAddPage.ingresarAlCarrito();
        }catch (InterruptedException e){}

//        8. verifico el producto
//        saucedemoCarritoAddPage.vericarProducto1();
    }

    @Step
    public void validarCompra() {
//        9. dar click checkout
        try {
            Thread.sleep(5000);
            saucedemoCheckoutPage.darClickCheckout();
        }catch (InterruptedException e){}

//

    }

    @Step
    public void diligenciarFormulario() {
//        10. llenar formulario
    }
}
