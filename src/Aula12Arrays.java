public class Aula12Arrays {

  public static void main(String[] args) {
    // tipo do Array, quantidade de posições no Array
    int[] idades = new int[5]; // Inicializando o Array com new

    // Atribuindo valores ao Array
    idades[0] = 10;
    idades[1] = 20;
    idades[2] = 30;
    idades[3] = 40;
    idades[4] = 50;

    // Imprimindo o Array
    for (int i = 0; i < idades.length; i++) {
      System.out.println(idades[i]);
    }
  }
}
