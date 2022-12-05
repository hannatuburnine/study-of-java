import java.util.Scanner;

public class Escola {

    public static void main (String[] args){

        System.out.println("ESCOLA CÉU AZUL");

        Scanner scan = new Scanner (System.in);

        float x, y , z, n, resultado;
        String nome;

        System.out.println("Digite o nome do aluno: ");
        nome = scan.next();
        System.out.println("Digite a primeira nota: ");
        x = scan.nextFloat();
        System.out.println("Digite a segunda nota:  ");
        y = scan.nextFloat();
        System.out.println("Digite a terceira nota: ");
        z = scan.nextFloat();
        System.out.println("Digite a quarta nota: ");
        n = scan.nextFloat();

        resultado = (x + y + z + n)/4;

        System.out.println("A média do aluno " + nome + " é " + resultado);
        if (resultado >=7) {
            System.out.println("ALUNO APROVADO");
        }
            else {
            System.out.println("ALUNO REPROVADO");
        }
        }



    }

