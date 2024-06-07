public class Aula13ArraysTipos {

  public static void main(String[] args) {
    // Inicialização de Arrays
    // byte, short, int, long, float, double: o valor é 0(zero);
    // char: ' '
    // boolean: o valor é false
    // String: null

    String[] nomes = new String[3];
    nomes[0] = "Keidson";
    nomes[1] = "Karol";
    nomes[2] = "Arthur";
    
    for (int i = 0; i < nomes.length; i++) {
      System.out.println(nomes[i]);
    }
  }
}
