public class PrimeiroFor {

    public static void main(String[] args) {

        int[] numeros = new int[] {3, 4, 7, 8, 2};
        int soma = 0;

        for (int i = 0; i <= 4; i++) {
            soma = soma + numeros[i];
        }
        System.out.println("O resultado é " + soma);
    }
}
