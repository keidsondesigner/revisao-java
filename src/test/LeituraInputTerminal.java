package test;

import java.util.Scanner;

public class LeituraInputTerminal {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite seu nome:" );
    String nome = input.nextLine(); // ler uma string

    System.out.println("Digite sua idade:" );
    int idade = input.nextInt(); // ler um inteiro

    System.out.println("Digite (M) ou (F) para seu genero:" );
    int genero = input.next().charAt(0); // ler um caractere

    System.out.println("-----------------------------------");
    System.out.println("O nome digitado foi: " + nome + " e a idade digitada é: " + idade + " e o genero: " + genero);
  }
}
