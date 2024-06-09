package domain;

public class Jogador {

  private String nome;
  private String time;
  private int idade;

  public Jogador() { }

  public Jogador(String nome, String time, int idade) {
    this.nome = nome;
    this.time = time;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
}
