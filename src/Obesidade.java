import java.util.Scanner;

public class Obesidade {

    public static void main (String[] args) {

        System.out.println("Clinica YouFit");

        Scanner scan = new Scanner (System.in);
        String nome;
        float p, a, resultado;

        System.out.println("Digite o nome do paciente: ");
        nome = scan.next();
        System.out.println("Digite o peso do paciente em kg: ");
        p = scan.nextFloat();
        System.out.println("Digite a altura do paciente em metros: ");
        a = scan.nextFloat();

        resultado = p/(a*a);
        System.out.println("O IMC do paciente " + nome + " é " + resultado);

        if (resultado < 18.5) {
            System.out.println("PACIENTE ABAIXO DO PESO NORMAL");
        }
       else if (resultado >= 18.5 && resultado <= 24.9) {
            System.out.println("PACIENTE COM PESO NORMAL");
       }
        else if (resultado >= 25.0 && resultado <= 29.9) {
            System.out.println("PACIENTE COM EXCESSO DE PESO");
        }
        else if (resultado >= 30.0 && resultado <= 34.9) {
            System.out.println("PACIENTE COM OBESIDADE CLASSE I");
        }
        else if (resultado >= 35.0 && resultado <= 39.9) {
            System.out.println("PACIENTE COM OBESIDADE CLASSE II");
        }
        else if (resultado >= 40.0) {
            System.out.println("PACIENTE COM OBESIDADE CLASSE III");
        }




    }
}
