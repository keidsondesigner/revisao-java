public class Aula01TiposPrimitivos {
    public static void main(String[] args) {
        // Os 8 tipos primitivos em Java:
        // int, double, float, long, char, byte, short, boolean

        byte ageByte = 100;
        // Tamanho: 8 bits (1 byte)
        // Valor mínimo: -128
        // Valor máximo: 127
        System.out.println(ageByte);

        char genderChar = 'M';
        // Tamanho: 16 bits (2 bytes)
        // Valor: um único caractere Unicode
        System.out.println(genderChar);

        short ageShort = 32767;
        // Tamanho: 16 bits (2 bytes)
        // Valor mínimo: -32.768
        // Valor máximo: 32.767
        System.out.println(ageShort);

        int age = 2147483647;
        // Tamanho: 32 bits (4 bytes)
        // Valor mínimo: -2^31 (-2.147.483.648)
        // Valor máximo: 2^31 - 1 (2.147.483.647)
        System.out.println(age);

        double salaryDouble = 10.5;
        // Tamanho: 64 bits (8 bytes)
        // Precisão: aproximadamente 15 dígitos decimais
        System.out.println(salaryDouble);

        float salaryFloat = 38.5f;
        // Tamanho: 32 bits (4 bytes)
        // Precisão: aproximadamente 6 a 7 dígitos decimais
        System.out.println(salaryFloat);

        long salaryLong = 100000L;
        // Tamanho: 64 bits (8 bytes)
        // Valor mínimo: -2^63 (-9.223.372.036.854.775.808)
        // Valor máximo: 2^63 - 1 (9.223.372.036.854.775.807)
        System.out.println(salaryLong);

        boolean isMarried = true;
        // Tamanho: depende da JVM (geralmente representado por um byte)
        // Valor: true ou false
        System.out.println(isMarried);
    }
}
