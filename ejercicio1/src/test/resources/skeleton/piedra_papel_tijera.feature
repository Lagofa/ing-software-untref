Feature: piedra_papel_tijera

  Scenario: Piedra vs Tijera
  Given jugador1 juega PIEDRA
  When jugador2 juega TIJERA
  Then gana jugador1
  
  Scenario: Tijera vs Piedra
  Given jugador1 juega TIJERA
  When jugador2 juega PIEDRA
  Then gana jugador2
  
  Scenario: Piedra vs Papel
  Given jugador1 juega PIEDRA
  When jugador2 juega PAPEL
  Then gana jugador2
  
  Scenario: Papel vs Piedra
  Given jugador1 juega PAPEL
  When jugador2 juega PIEDRA
  Then gana jugador1
    
  Scenario: Tijera vs Tijera
  Given jugador1 juega TIJERA
  When jugador2 juega TIJERA
  Then empate
  
  Scenario: Piedra vs Piedra
  Given jugador1 juega PIEDRA
  When jugador2 juega PIEDRA
  Then empate
  
  Scenario: Papel vs Papel
  Given jugador1 juega PAPEL
  When jugador2 juega PAPEL
  Then empate

  Scenario: Papel vs Tijera
  Given jugador1 juega PAPEL
  When jugador2 juega TIJERA
  Then gana jugador2
  
  Scenario: Tijera vs Papel
  Given jugador1 juega TIJERA
  When jugador2 juega PAPEL
  Then gana jugador1
  
  
  
  