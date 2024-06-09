package test;

import domain.CarroStatic;

public class CarroStaticTest {

  public static void main(String[] args) {
    CarroStatic.setVelocidadeMax( 300); // < acessando o atributo static

    CarroStatic carro1 = new CarroStatic("BMW", "X6");
    System.out.println(carro1.getNome() + " " + CarroStatic.getVelocidadeMax());

    CarroStatic carro2 = new CarroStatic("Chevrolet", "Onix");
    System.out.println(carro2.getNome() + " " + CarroStatic.getVelocidadeMax());
  }
}
