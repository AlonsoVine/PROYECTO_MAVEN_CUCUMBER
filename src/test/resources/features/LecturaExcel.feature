Feature: Vamos a leer un Excel.

  Background:
    Given Leo la lista de productos del Excel.

  @smoke
  Scenario: Verificamos el elemento número 3.
    When Obtengo el elemento con index 2.
    Then Verifico que el nombre sea "ARNAIZ" y su nivel 22.

  @smoke
  @regression
  Scenario: Verificamos que el último elemento sea macho.
    When Obtengo el último elemento.
    Then Verifico que sea de género "MACHO".


  @regression
  Scenario: Verificamos la longitud del excel.
    When Obtengo el tamaño de la lista.
    Then Verifico que la longitud de la lista sea de 14.


  #@regression
  #Scenario Outline: Verifamos varios elementos de la lista.
  #  When Obtenemos el elemento con indice <index>
  #  Then Verifico que tenga <nombre>, <nivel>
  #  Examples:
  #    | index | nombre      | nivel |
  #    | 0     | "TOLOSA"    | 90    |
  #    | 1     | "COROMINAS" | 74    |