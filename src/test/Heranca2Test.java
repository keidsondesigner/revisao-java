package test;

import heranca2.Endereco;
import heranca2.Funcionario;
import heranca2.Pessoa;

public class Heranca2Test {
  public static void main(String[] args) {
    Endereco endereco = new Endereco();
    endereco.setCep("9923353535");
    endereco.setRua("Rua 3");

    Pessoa pessoa = new Pessoa();
    pessoa.setCpf("123456789");
    pessoa.setNome("Keidson");
    pessoa.setEndereco(endereco);
    pessoa.imprimir();

    Funcionario funcionario = new Funcionario();
    funcionario.setNome("Karol");
    funcionario.setCpf("453633646");
    funcionario.setEndereco(endereco);
    funcionario.setSalario(1000);
    funcionario.imprimir();
  }
}
