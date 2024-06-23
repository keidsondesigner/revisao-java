package heranca2;

public class Pessoa {
  private String nome;
  private String cpf;
  private Endereco endereco;

  public void imprimir() {
    System.out.println(this.nome);
    System.out.println(this.cpf);
    System.out.print(this.endereco.getRua() + " " + this.endereco.getRua());
    System.out.println("\n ----------------");
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public Endereco getEndereco() {
    return endereco;
  }
  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }
}
