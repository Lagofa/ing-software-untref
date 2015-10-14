Feature: Agregar Barco

  Scenario: Se agrega un barco exitosamente
    Given tengo un tablero de 10 x 10
    When se agrega un acorazado en posicion 3 0 de forma HORIZONTAL
    Then se obtiene "Barco agregado"
