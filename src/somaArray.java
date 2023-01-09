public class somaArray {

    public static void main (String[] args) {

        int[] valores = new int[] {4, 6, 7, 2, 8, 5, 3};
        int index = 2;
        int soma = 0;

        while (index <= 6) {
            soma = soma + valores[index];
            index = index + 2;
        }
        System.out.println("O resultado é " + soma);
    }
}
