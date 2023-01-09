import java.util.Scanner;

public class AlunosArrayREPEAT {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int resposta;
        String[] alunos1A = new String [10];
        int index = 0;

        System.out.println("Olá, bem vindo a escola céu azul!");
        System.out.println("Gostaria de cadastrar um aluno? Digite 1 para SIM e 2 para NÃO");
        resposta = scanner.nextInt();

        if (resposta == 1) {
            do {
                System.out.println("Digite o nome do aluno:");
                alunos1A[index] = scanner.next();
                System.out.println("Gostaria de cadastrar outro aluno? Digite 1 para SIM e 2 para NÃO");
                resposta = scanner.nextInt();
                index = index + 1;
            } while (resposta == 1);
            System.out.println("Até a próxima!");
        } else {
            System.out.println("Até a próxima!");
        }
    }
}
