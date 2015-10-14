Feature: Disparar
 
Scenario: Disparo y toco agua
Given tengo un tablero de 10 x 10 And un acorazado en la posicion 6 7 VERTICALMENTE
When  disparo a la posicion 6 6
Then el resultado de disparar fue "Agua"

