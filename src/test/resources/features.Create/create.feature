@test
Feature: Formulario de Registro

  Usuario Administrador del portal DEMO
  Solicita La creación de la cuenta de  nuevos usuarios,
  para la fidelización de los clientes y que estos puedan hacer sus compras online

  Scenario: como usuario nuevo quiero registrarme y poner la informacion para la cuenta
    Given el usuario se encuentra en la opcion Create Account
    When  el usuario completa el formulario
      | usuario   | contrasenia   | contrasenia2  | nombre  | apellido  | telefono   | pais          |  ciudad    | direccion  | estado     | codigoPostal |
      | Seth1234  | Micontrase1.  | Micontrase1.  | Natalia | Rios      | 3243229765 | United States |  New York  | Cra 1 11 1 | Washington | 10001        |
    And el usuario aceptar las politicas de privacidad de la pagina
    Then el sistema deberia realizar el registro

  Scenario: como usuario nuevo quiero registrarme
    Given el usuario se encuentra en Create Account
    When  el usuario llena el formulario
      | usuario   | contrasenia   | contrasenia2  | nombre  | apellido  | telefono   | pais          |  ciudad    | direccion  | estado     | codigoPostal |
      | Seth1234  | Micontrase1.  | Micontrase1.  | Natalia | Rios      | 3243229765 | United States |  New York  | Cra 1 11 1 | Washington | 10001        |
    Then el sistema deberia no realizar el registro

  Scenario: como usuario nuevo quiero registrarme en la pagina
    Given el usuario se encuentra en el Create Account
    When  el usuario llena el formulario con contrasenas que no coindicen
      | usuario   | contrasenia   | contrasenia2  | nombre  | apellido  | telefono   | pais          |  ciudad    | direccion  | estado     | codigoPostal |
      | Seth1234  | Micontrase1.  | Micontrase1,  | Natalia | Rios      | 3243229765 | United States |  New York  | Cra 1 11 1 | Washington | 10001        |
    And el usuario aceptar politicas de privacidad de la pagina
    Then el sistema deberia no realizar registro


