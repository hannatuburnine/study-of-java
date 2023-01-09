import java.util.Scanner;

public class SchoolAprimorado {

    public static void main (String[] args) {
        // if else, while, do while, switch case

        Scanner scan = new Scanner(System.in);
        int nota1, nota2, nota3, nota4, media;
        String nomeDoAluno;
        boolean resposta;

        System.out.println("Bem vindo ao sistema de notas do Colégio Sigma");
        System.out.println("Você gostaria de calcular a media de um aluno? Responda TRUE ou FALSE:");
        resposta = scan.nextBoolean();

        if (resposta == true) {
            do {
                System.out.println("Digite o nome do aluno");
                nomeDoAluno = scan.next();
                System.out.println("Digite a primeira nota do aluno");
                nota1 = scan.nextInt();
                System.out.println("Digite a segunda nota do aluno");
                nota2 = scan.nextInt();
                System.out.println("Digite a terceira nota do aluno");
                nota3 = scan.nextInt();
                System.out.println("Digite a quarta nota do aluno");
                nota4 = scan.nextInt();

                media = (nota1 + nota2 + nota3 + nota4) / 4;

                System.out.println("A media do aluno " + nomeDoAluno + " é " + media);
                System.out.println("Gostaria de calcula a media de outro aluno? Responda TRUE ou FALSE");
                resposta = scan.nextBoolean();

            } while (resposta == true);
            System.out.println("Ate a proxima");
        } else {
            System.out.println("Até a próxima");
        }

    }
}
