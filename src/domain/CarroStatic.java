package domain;

public class CarroStatic {
  private String nome;
  private String modelo;
  private static double velocidadeMax = 250; // <- atributo static

  public CarroStatic() { }

  public CarroStatic(String nome, String modelo) {
    this.nome = nome;
    this.modelo = modelo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public static double getVelocidadeMax() {
    return velocidadeMax;
  }

  public static void setVelocidadeMax(double velocidadeMax) {
    CarroStatic.velocidadeMax = velocidadeMax;
  }

}
