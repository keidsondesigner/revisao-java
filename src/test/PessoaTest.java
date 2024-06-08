package test;

import domain.Pessoa;

public class PessoaTest {

  public static void main(String[] args) {

    Pessoa pessoa = new Pessoa(null, null, 0, ' ');

    pessoa.setNome("Keidson");
    pessoa.setSobrenome("Silva");
    pessoa.setIdade(30);
    pessoa.setSexo('M');

    System.out.println(pessoa.getNome());
  }
}
