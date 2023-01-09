import java.util.Scanner;

public class AlunosArray {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int resposta;
        String[] nomesTurmaA1 = new String[10];
        int index = 0;

        System.out.println("Bem vindo a Escola Ceu Azul");
        System.out.println("Gostaria de cadastrar um aluno? Digite 1 para SIM e 2 para NÃO");
        resposta = scanner.nextInt();

        if (1 == resposta) {
            do {
                System.out.println("Digite o nome do aluno");
                nomesTurmaA1[index] = scanner.next();
                System.out.println("Gostaria de cadastrar outro aluno? Digite 1 para SIM e 2 para NÃO");
                resposta = scanner.nextInt();
                index = index + 1;
            } while (resposta == 1);
            System.out.println("Até a proxima");

        } else {
            System.out.println("Até a proxima!");

        }
    }


}
