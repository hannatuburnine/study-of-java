import java.util.Scanner;

public class ExercicioLeitor {
    public static void main (String[] args){

        Scanner scanner;
        scanner = new Scanner(System.in);

        String nome;

        System.out.println("Olá, qual o seu nome?");
        nome = scanner.next();
        System.out.println("Olá, " + nome);

    }
}
