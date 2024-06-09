package test;

import domain.Jogador;

public class JogadorTest {

  public static void main(String[] args) {
    Jogador jogador1 = new Jogador("Jogador 1", "Time 1", 24);
    Jogador jogador2 = new Jogador("Jogador 1", "Time 1", 28);
    Jogador jogador3 = new Jogador("Jogador 1", "Time 1", 22);
  
  
    Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
  
    for (Jogador jogador : jogadores) {
      System.out.println(jogador.getNome());
    }
  }
}
