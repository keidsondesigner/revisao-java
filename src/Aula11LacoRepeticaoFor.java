public class Aula11LacoRepeticaoFor {

  public static void main(String[] args) {
    // Laco Repeticao For
    // É dividido em 3 partes: for(1;2;3){}

    // 1 - inicializa a variável de controle
    // 2 - define o limite da repetição
    // 3 - incrementa ou decrementa a variável de controle

    for (int count = 0; count < 10; count++) {
      System.out.println(count);
    }


    // imprir até o valor 25, e pare (break).

    int valorMax = 50;
    for (int count = 0; count < valorMax; count++) {
      if (count <=  25) {
        break;
      }
      System.out.println(count);
    }
  }
}
