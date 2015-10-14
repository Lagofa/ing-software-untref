Feature: Disparar

  Scenario: Disparo y toco agua
    Given tengo un tablero de 10 x 10 And un acorazado en la posicion 6 7 VERTICALMENTE
    When disparo a la posicion 6 6
    Then el resultado de disparar fue "Agua"

  Scenario: Disparo y toco un barco pero no lo hundo
    Given tengo un tablero de 10 x 10 And un acorazado en la posicion 6 7 VERTICALMENTE
    When disparo a la posicion 7 7
    Then el resultado de disparar fue "Tocado"

  Scenario: Disparo y toco un barco y lo hundo
    Given tengo un tablero de 10 x 10 And un acorazado en la posicion 6 7 VERTICALMENTE
    When disparo a la posicion 6 7
    And disparo a la posicion 7 7
    Then el resultado de disparar fue "Hundido"
