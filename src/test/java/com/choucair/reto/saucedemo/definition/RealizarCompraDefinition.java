package com.choucair.reto.saucedemo.definition;

import com.choucair.reto.saucedemo.steps.RealizarCompraSteps;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RealizarCompraDefinition {
//    Given Realizo el login con usuario "standard_user" y clave "secret_sauce"
//    When Agrego el primer producto backpack
//    And Ingreso al carrito de compras
//    And Realizo la validación de la compra con el botón CHECKOUT
//    When Dilegencia el formulario de CHECKOUT
//    Then Verifico los datos de compra exitoso

    @Steps
    RealizarCompraSteps realizarCompraSteps;


    @Given("Realizo el login con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public void realizo_login_con_usuario_y_clave(String usuario, String clave) {
        realizarCompraSteps.loginSaucedemo(usuario,clave);
    }

    @When("Agrego el primer producto backpack")
    public void agregoElPrimerProductoBackpack() {
        realizarCompraSteps.agregarProducto1();
    }

    @And("Ingreso al carrito de compras")
    public void ingresoAlCarritoDeCompras(){
        realizarCompraSteps.validarProducto1Carrito();
    }

    @And("Realizo la validación de la compra con el botón CHECKOUT")
    public void realizoLaValidacionDeLaCompraConElBotonCheckout() {
        realizarCompraSteps.validarCompra();
    }

    @When("Dilegencia el formulario de comprador")
    public void diligenciaElFormularioDeComprador() {
        realizarCompraSteps.diligenciarFormulario();
    }

    @Then("Verifico los datos de compra exitoso")
    public void verificoLosDatosDeCompraExitoso() throws Throwable {
        throw new PendingException();
    }

}
