Feature: arriesgarLetra

Scenario: Arriesgo una letra minuscula al comenzar el juego y acierto
Given la palabra secreta es "auto" 
When arriesgo una "a"
Then el estado de la palabra es "a***" And me quedan 7 vidas 

Scenario: Arriesgo una letra mayuscula al comenzar el juego y acierto
Given la palabra secreta es "auto" 
When arriesgo una "A"
Then el estado de la palabra es "a***" And me quedan 7 vidas 