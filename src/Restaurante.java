import java.util.Scanner;

public class Restaurante {

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        int x,y, p1, p2, p3;

        System.out.println("DIGITE O NUMERO DA MESA:");
        x = scanner.nextInt();
        System.out.println("DIGITE O VALOR DO PRATO 1");
        p1 = scanner.nextInt();
        System.out.println("DIGITE O VALOR DO PRATO 2");
        p2 = scanner.nextInt();
        System.out.println("DIGITE O VALOR DO PRATO 3");
        p3 = scanner.nextInt();

        y = (p1+p2+p3);

        System.out.println("Olá, o valor total consumido pela mesa " + x + " é = " + y);




    }
}
