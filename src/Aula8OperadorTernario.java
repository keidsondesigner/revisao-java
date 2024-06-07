public class Aula8OperadorTernario {
  //Usado para simplicar o uso de if e else

  public static void main(String[] args) {
    double salary = 5000.0;
    String msgDoar = "Eu vou doar um dinheiro para o pai";
    String msgNaoDoar = "Eu não vou doar, estou sem dinheiro";
    String resultado;

    // Usando o IF e ELSE
    if (salary > 3000.0) {
      resultado = msgDoar;
    } else {
      resultado = msgNaoDoar;
    }
    System.out.println(resultado);

    // Usando o Operador Ternario
    String resultado2 = salary > 5000.0 ? msgDoar : msgNaoDoar;
    System.out.println(resultado2);
  }
}
