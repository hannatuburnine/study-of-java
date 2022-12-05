import java.util.Scanner;

public class ExercicioSomador {
    public static void main (String[] args){

        Scanner scanner;
        scanner = new Scanner(System.in);

        int n1, n2;

        System.out.println("Olá, digite um numero");
        n1 = scanner.nextInt();
        System.out.println("Digite outro numero");
        n2 = scanner.nextInt();
        System.out.println("O resultado é " + (n1+n2));

    }
}
