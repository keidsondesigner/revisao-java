public class Aula15ArraysMultidimensionais {

  public static void main(String[] args) {
    // Arrays Multidimensionais ou Matrizes
    // Linha e Coluna
    // 1, 2, 3, 4, 5 meses
    // 31, 28, 31, 30, 31 dias

    // Definindo o número de dias em cada mês de 2024
    int[] diasNoMes = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Criando uma matriz bidimensional para armazenar os dias e meses
    int[][] calendario2024 = new int[diasNoMes.length][];

    // Preenchendo a matriz com os dias
    for (int mes = 0; mes < diasNoMes.length; mes++) {
        calendario2024[mes] = new int[diasNoMes[mes]];
        for (int dia = 0; dia < diasNoMes[mes]; dia++) {
            calendario2024[mes][dia] = dia + 1;
        }
    }

    // Exibindo a matriz de calendário
    for (int mes = 0; mes < diasNoMes.length; mes++) {
        System.out.println("Mês " + (mes + 1) + ":");
        for (int dia = 0; dia < diasNoMes[mes]; dia++) {
            System.out.print(calendario2024[mes][dia] + " ");
        }
        System.out.println();
    }
  }
}
