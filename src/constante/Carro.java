package constante;

public class Carro {
  private String nome;
  public static final double VELOCIDADE_MAX = 250;
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public static double getVelocidadeMax() {
    return VELOCIDADE_MAX;
  }
}
