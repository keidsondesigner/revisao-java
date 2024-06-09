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

  public void imprimir() {
    System.out.println("## Professor ##");
    System.out.println("Professor: " + this.nome);
    if (this.eventos == null) return;
    System.out.println("## Seminários cadastrados ##");
    for (Evento evento : this.eventos) {
      System.out.println(evento.getTitulo());
      System.out.println(evento.getLocal().getEndereco());
      if (evento.getAlunos() == null || evento.getAlunos().length == 0) continue;
      System.out.println("## Alunos ##");
      for (Aluno aluno : evento.getAlunos()) {
        System.out.println("Aluno : " + aluno.getNome() + " idade: " + aluno.getIdade());
      }
    }
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
