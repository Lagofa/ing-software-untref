Feature: Agregar Barco

  Scenario: Se agrega un barco exitosamente
    Given tengo un tablero de 10 x 10
    When se agrega un acorazado en posicion 3 0 de forma HORIZONTAL
    Then se obtiene "Barco agregado"

  Scenario: Se intenta ubicar un barco en una posición ya ocupada
    Given tengo un tablero de 10 x 10 And se tiene una lancha en la posicion 0 2 HORIZONTALMENTE
    When se agrega un destructor en posicion 0 2 HORIZONTALMENTE
    Then se obtiene "Posicion ocupada"

  Scenario: Se intetnta ubicar un barco en una posición fuera del tablero
    Given tengo un tablero de 10 x 10
    When se agrega un destructor en posicion 0 8 HORIZONTALMENTE
    Then se obtiene "Posicion invalida"
