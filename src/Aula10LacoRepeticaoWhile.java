public class Aula10LacoRepeticaoWhile {

  public static void main(String[] args) {
    // Laco Repeticao While

    // while não executa se a condição for falso
    int count = 0;
    while (count < 10) {
      System.out.println(count++);
    }


    // do while
    // executa pelo menos uma vez, e depois verifica a condição
    int count2 = 0;
    do {
      System.out.println(count2++);
    } while (count2 < 10);
  }
}
