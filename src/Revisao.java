import java.util.Scanner;

public class Revisao {

    public static void main (String[] args) {

        int x, y, soma, subtracao;
        Scanner scan = new Scanner (System.in);
        String mais, menos, decisao;

        System.out.println("Ola, digite um numero:");
        x = scan.nextInt();
        System.out.println("Digite outro numero:");
        y = scan.nextInt();

        if (x > y) {
            System.out.println("O maior numero é " + x);

        } else {
            System.out.println("O maior numero é " + y);
        }

        System.out.println("Digite + para somar os numeros e - para diminuir");
        decisao = scan.next();
        boolean igual = decisao.equals("+");

        if (igual) {
            soma = x + y;
            System.out.println("A soma dos valores é " + soma);

        } else {
            subtracao = x - y;
            System.out.println("A subtracao dos numeros é" + subtracao);

        }
    }
}
