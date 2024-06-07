public class Aula9OperadorSwitch {
  public static void main(String[] args) {
    // Operador Switch 
    // só tipos: char, int, byte, short, String, enum

    char genderChar = 'M';
    switch (genderChar) {
      case 'M':
        System.out.println("Masculino");
        break;
      case 'F':
        System.out.println("Feminino");
        break;
      default:
        System.out.println("Gênero inválido");
        break;
    }

    int day = 3;
    switch (day) {
      case 1:
        System.out.println("Domingo");
        break;
      case 2:
        System.out.println("Segunda");
        break;
      case 3:
        System.out.println("Terça");
        break;
      case 4:
        System.out.println("Quarta");
        break;
      case 5:
        System.out.println("Quinta");
        break;
      case 6:
        System.out.println("Sexta");
        break;
      case 7:
        System.out.println("Sabado");
        break;
      default:
        System.out.println("Dia inválido");
        break;
    }
  }
}
