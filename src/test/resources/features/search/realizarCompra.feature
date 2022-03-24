#Author: equinteroc@choucairtesting.com

Feature: Compra exitosa
  El usuario ingresa, agrega en el carrito y confirma la compra

  Scenario: Compra exitosa con 1 producto
    Given Realizo el login con usuario "standard_user" y clave "secret_sauce"
    When Agrego el primer producto backpack
    And Ingreso al carrito de compras
    And Realizo la validación de la compra con el botón CHECKOUT
    When Dilegencia el formulario de CHECKOUT
    Then Verifico los datos de compra exitoso
