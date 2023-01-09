import java.util.Scanner;

public class SchoolWhile {

    public static void main (String[] args) {

        String[] nomes1 = new String[] {"Luan", "Hanna", "Hayany", "Andressa", "Ape", "Laura","Joao", "Pedro", "Tita", "Nicoli" };
        Scanner scan = new Scanner(System.in);
        int nota1, nota2, nota3, nota4, media;
        int x = 0;

        System.out.println("Olá, bem vindo ao sistema de notas da Escola Sigma");

        while (x<=9) {
            System.out.println("Digite a primeira nota do aluno " + nomes1[x]);
            nota1 = scan.nextInt();
            System.out.println("Digite a segunda nota do aluno " + nomes1[x]);
            nota2 = scan.nextInt();
            System.out.println("Digite a terceira nota do aluno " + nomes1[x]);
            nota3 = scan.nextInt();
            System.out.println("Digite a quarta nota do aluno " + nomes1[x]);
            nota4 = scan.nextInt();

            media = (nota1+nota2+nota3+nota4)/4;

            System.out.println("A media do aluno " + nomes1[x] + " é " + media);

            x = x + 1;
        }
    }
}
