import java.util.Scanner;

public class Notas {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        int a, b, c ,d, media;
        String nome;

        System.out.println("Olá, digite o nome do aluno: ");
        nome = scan.next();
        System.out.println("Digite a primeira nota: ");
        a = scan.nextInt();
        System.out.println("Digite a segunda nota: ");
        b = scan.nextInt();
        System.out.println("Digite a terceira nota: ");
        c = scan.nextInt();
        System.out.println("Digite a quarta nota: ");
        d = scan.nextInt();

        media = (a+b+c+d)/4;

        switch (media) {
            case 10:
            case 9:
                System.out.println("O aluno " + nome + " tirou nota A");
                break;
            case 8:
            case 7:
                System.out.println("O aluno " + nome + " tirou nota B");
                break;
            case 6:
            case 5:
                System.out.println("O aluno " + nome + " tirou nota C");
                break;
            case 4:
            case 3:
                System.out.println("O aluno " + nome + " tirou nota D");
                break;
            case 2:
            case 1:
            case 0:
                System.out.println("O aluno " + nome + " tirou nota F");
                break;
        }
    }
}
