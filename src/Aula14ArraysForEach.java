public class Aula14ArraysForEach {

  public static void main(String[] args) {
    // tipo do Array  =  quantidade de posições no Array
    String[] nomes = new String[5]; // Inicializando o Array com new

    // Atribuindo valores ao Array
    nomes[0] = "Keidson";
    nomes[1] = "Karol";
    nomes[2] = "Arthur";
    nomes[3] = "Alice";
    nomes[4] = "Agatha";

    // Foreach
    for (String num : nomes) {
      System.out.println(num);
    }
  }
}
