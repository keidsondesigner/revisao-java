package heranca;


public class Evento {
  private String titulo;
  private Aluno[] alunos;
  private LocalEvento local;

  public Evento() { }

  public Evento(String titulo, LocalEvento local) {
    this.titulo = titulo;
    this.local = local;
  }

  public Evento(String titulo, Aluno[] alunos, LocalEvento local) {
    this.titulo = titulo;
    this.alunos = alunos;
    this.local = local;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Aluno[] getAlunos() {
    return alunos;
  }

  public void setAlunos(Aluno[] alunos) {
    this.alunos = alunos;
  }

  public LocalEvento getLocal() {
    return local;
  }

  public void setLocal(LocalEvento local) {
    this.local = local;
  }
}
