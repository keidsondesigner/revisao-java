public class Aula6OperadorLogico {

  public static void main(String[] args) {

    // Operadores Logicos
    // && (AND), || (OR), ! (NOT)

    int age = 35;
    float salary = 3500.0f;

    boolean isLegalSalary = age > 30 && salary >= 4612;

    System.out.println(isLegalSalary);

    double contaCorrente = 200.0;
    double contaPoupanca = 3000.0;
    float valorMoto = 1500.0f;

    boolean possoComprarMoto = contaCorrente > valorMoto || contaPoupanca > valorMoto;
    System.out.println(possoComprarMoto);
  }
}
