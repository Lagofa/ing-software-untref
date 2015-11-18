Feature: Envido

Scenario: el jugador tiene tres cartas de distinto palo
Given el jugador tiene 3 de copa, 2 de espada y 1 de oro
When se calcula el envido
Then el envido es 3

Scenario: el jugador tiene dos cartas del mismo palo donde una es una figura 
Given el jugador tiene 3 de copa, 12 de oro y 3 de oro
When se calcula el envido
Then el envido es 23

Scenario: el jugador tiene dos cartas del mismo palo
Given el jugador tiene  4 de oro, 6 de oro y 3 de copa
When se calcula el envido
Then el envido es 30

Scenario: el jugador tiene tres cartas del mismo palo. 
Given el jugador tiene 4 de oro, 6 de oro y 5 de oro
When se calcula el envido
Then el envido es 31

Scenario: el jugador tiene dos cartas del mismo palo, ambas son figuras. 
Given el jugador tiene 10 de oro, 12 de oro y 5 de espada
When se calcula el envido
Then el envido es 20
