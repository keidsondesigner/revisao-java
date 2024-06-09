package test;

import domain.CarroStatic;

public class CarroStaticTest {

  public static void main(String[] args) {
    CarroStatic.velocidadeMax = 300; // < acessando o atributo static

    CarroStatic carro1 = new CarroStatic("BMW", "X6");
    System.out.println(carro1.getNome() + " " + carro1.getVelocidadeMax());

    CarroStatic carro2 = new CarroStatic("Chevrolet", "Onix");
    System.out.println(carro2.getNome() + " " + carro2.getVelocidadeMax());
  }
}
