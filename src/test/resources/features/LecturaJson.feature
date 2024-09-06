Feature: Vamos a leer un JSON.

  Background:
    Given Leo el Json de User.

  @smoke
  @regression
  Scenario: Verificamos el id sea positivo.
    Then Verifico que el id sea positivo.

  @smoke
  @regression
  Scenario: Verificamos que longitud tiene el valor correcto.
    Then Verifico que la longitud sea de 71.7478.

  @regression
  Scenario: Verificamos que longitud de company.bs sea la correcta.
    Then Verifico que la longitud de company.bs sea de 32.