import java.util.Scanner;

public class School {

    public static void main (String[] args) {

        String[] alunos1 = new String[] {"Luan", "Hayany", "Hanna", "Ape"};
        Scanner scan = new Scanner(System.in);
        int nota1, nota2, nota3, nota4, media;

        System.out.println("Olá, bem vindo ao sistema de notas da escola Amanhecer");
        System.out.println("Digite a primeira nota do aluno " + alunos1[0]);
        nota1 = scan.nextInt();
        System.out.println("Digite a segunda nota do aluno " + alunos1[0]);
        nota2 = scan.nextInt();
        System.out.println("Digite a terceira nota do aluno " + alunos1[0]);
        nota3 = scan.nextInt();
        System.out.println("Digite a quarta nota do aluno " + alunos1[0]);
        nota4 = scan.nextInt();

        media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("A media do aluno " + alunos1[0] + " é " + media);

        System.out.println("Agora, digite a primeira nota do aluno " + alunos1[1]);
        nota1 = scan.nextInt();
        System.out.println("Digite a segunda nota do aluno " + alunos1[1]);
        nota2 = scan.nextInt();
        System.out.println("Digite a terceira nota do aluno " + alunos1[1]);
        nota3 = scan.nextInt();
        System.out.println("Digite a quarta nota do aluno " + alunos1[1]);
        nota4 = scan.nextInt();

        media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("A media do aluno " + alunos1[1] + " é " + media);

        System.out.println("Digite a primeira nota do aluno " + alunos1[2]);
        nota1 = scan.nextInt();
        System.out.println("Digite a segunda nota do aluno " + alunos1[2]);
        nota2 = scan.nextInt();
        System.out.println("Digite a terceira nota do aluno " + alunos1[2]);
        nota3 = scan.nextInt();
        System.out.println("Digite a quarta nota do aluno " + alunos1[2]);
        nota4 = scan.nextInt();

        media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("A media do aluno " + alunos1[2] + " é " + media);

        System.out.println("Digite a primeira nota do aluno " + alunos1[3]);
        nota1 = scan.nextInt();
        System.out.println("Digite a segunda nota do aluno " + alunos1[3]);
        nota2 = scan.nextInt();
        System.out.println("Digite a terceira nota do aluno " + alunos1[3]);
        nota3 = scan.nextInt();
        System.out.println("Digite a quarta nota do aluno " + alunos1[3]);
        nota4 = scan.nextInt();

        media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("A media do aluno " + alunos1[3] + " é " + media);


    }
}
