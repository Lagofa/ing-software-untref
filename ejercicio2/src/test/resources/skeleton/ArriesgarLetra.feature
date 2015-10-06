Feature: arriesgarLetra

Scenario: Arriesgo una letra minuscula al comenzar el juego y acierto
Given la palabra secreta es "auto" 
When arriesgo una "a"
Then el estado de la palabra es "a***" And me quedan 7 vidas 

Scenario: Arriesgo una letra mayuscula al comenzar el juego y acierto
Given la palabra secreta es "auto" 
When arriesgo una "A"
Then el estado de la palabra es "a***" And me quedan 7 vidas 

Scenario: Arriesgo una letra repetida al comenzar el juego y acierto
Given la palabra secreta es "manzana" 
When arriesgo una "A"
Then el estado de la palabra es "*a**a*a" And me quedan 7 vidas 

Scenario: Arriesgo una letra al comenzar el juego y no acierto
Given la palabra secreta es "manzana" 
When arriesgo una "o"
Then el estado de la palabra es "*******" And me quedan 6 vidas 

Scenario: Arriesgo una letra que ya adivine y no pierdo una vida
Given la palabra secreta es "manzana" And el estado de la palabra es "*a**a*a" And tengo 5 vidas
When arriesgo una "a"
Then el estado de la palabra es "*a**a*a" And me quedan 5 vidas 

Scenario: Arriesgo una letra teniendo una sola vida y no acierto
Given la palabra secreta es "manzana" And el estado de la palabra es "*a**a*a" And tengo 1 vidas 
When arriesgo una "k"
Then el resultado del juego es "Perdiste"
