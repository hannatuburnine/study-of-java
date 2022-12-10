import java.util.Scanner;

public class SistemaDeNotas {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int resposta, nota1, nota2, nota3, nota4, media, resposta2;
        String aluno;

//        Faça um programa com os seguinte requisitos
//        4 - Se a resposta for 2 (não), então o programa irá se despedir do usuário.

        System.out.println("Olá, sou o SisNo, o sistema de calculo de medias escolares!");
        System.out.println("Você gostaria de calcular a media de algum aluno?");
        System.out.println("Digite 1 para SIM e 2 para NÃO:");
        resposta = scan.nextInt();

        if (1 == resposta) {
            do {
                System.out.println("Digite o nome do aluno: ");
                aluno = scan.next();
                System.out.println("Digite a primeira nota");
                nota1 = scan.nextInt();
                System.out.println("Digite a segunda nota");
                nota2 = scan.nextInt();
                System.out.println("Digite a terceira nota");
                nota3 = scan.nextInt();
                System.out.println("Digite a quarta nota");
                nota4 = scan.nextInt();

                media = (nota1 + nota2 + nota3 + nota4) / 4;
                System.out.println("A media do aluno " + aluno + " é " + media);

                if (media >= 7) {
                    System.out.println("ALUNO APROVADO");
                } else {
                    System.out.println("ALUNO REPROVADO");
                }

                System.out.println("Gostaria de calcular a média de outro aluno?");
                System.out.println("Digite 1 para SIM e 2 para NÃ0");
                resposta = scan.nextInt();

            } while (resposta == 1);
            System.out.println("Até a próxima!");

        } else {
            System.out.println("Até a próxima!");
        }
    }
}
