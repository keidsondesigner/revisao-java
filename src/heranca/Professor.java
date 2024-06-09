package heranca;

public class Professor {
  private String nome;
  private String especialidade;
  private Evento[] eventos;

  public Professor() { }

  public Professor(String nome, String especialidade) {
    this.nome = nome;
    this.especialidade = especialidade;
  }

  public Professor(String nome, String especialidade, Evento[] eventos) {
    this.nome = nome;
    this.especialidade = especialidade;
    this.eventos = eventos;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  public Evento[] getEventos() {
    return eventos;
  }

  public void setEventos(Evento[] eventos) {
    this.eventos = eventos;
  }
}
