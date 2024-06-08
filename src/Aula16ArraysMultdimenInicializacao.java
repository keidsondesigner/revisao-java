public class Aula16ArraysMultdimenInicializacao {

  public static void main(String[] args) {
    // Arrays Multidimensionais ou Matrizes
    
    int[][] arrayBase = new int[3][];

    arrayBase[0] = new int[2];
    arrayBase[1] = new int[3];
    arrayBase[2] = new int[6];

    for (int[] array : arrayBase) {
      System.out.println("\n-----");
      for (int num : array) {
        System.out.println(num + " ");
      }
    }
  }
}
