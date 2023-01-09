public class incremento4 {

    public static void main (String[] args) {

        int[] numeros = new int[] {10, 4, 6, 8};
        int index = 0;
        int soma = 0;

        while (index <= 3) {
            System.out.println(numeros[index]);
            index = index + 1;
        }
        System.out.println("O resultado é " + soma );
    }
}
