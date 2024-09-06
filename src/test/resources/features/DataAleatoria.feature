Feature: Data aleatoria.

  Background: Precondición
    Given Genero un par de numeros int aleatorios positivos

  @smoke
  @regression
  Scenario: Suma positiva
    When Sumo los valores.
    Then Verifico que la suma sea positiva.

  @smoke
  @regression
  Scenario: Producto positiva
    When Multiplico los valores.
    Then Verifico que la multiplicación sea positiva.

  @smoke
  @regression
  Scenario: Raiz cuadrada positiva
    When Calculo la raiz cuadrada de los valores.
    Then Verifico que la raiz cuadrada de ambos sea positiva.