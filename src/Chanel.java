import java.util.Scanner;

public class Chanel {

    public static void main (String[] args) {

        Scanner scan = new Scanner (System.in);
        String escolha, confirmacao;

        System.out.println("Bem vindo à loja virtual da Chanel");
        System.out.println("Temos as seguintes bolsas disponíveis:");
        System.out.println("Bolsa Hayany, Bolsa Luan e Bolsa Hanna");
        System.out.println("Qual bolsa você quer escolher?");
        escolha = scan.next();
        System.out.println("Voce escolheu a bolsa " + escolha);

        int Hayany = 1000;
        int Luan = 1500;
        int Hanna = 2000;
        int pagamento;

        switch (escolha) {
            case "Hayany":
                System.out.println("O valor da Bolsa Hayany é $1000");
                break;
            case "Luan":
                System.out.println("O valor da Bolsa Luan é $1500");
                break;
            case "Hanna":
                System.out.println("O valor da Bolsa Hanna é $2000");
                break;
            default:
                System.out.println("Não disponível.");
        }
        System.out.println("Gostaria de continuar a compra da bolsa " + escolha + " ? Digite SIM ou NĀO");
        confirmacao = scan.next();

        if (confirmacao.equals("SIM")) {
            System.out.println("Faça o pagamento");
            pagamento = scan.nextInt();
        }
        // troco1=pagamento-Hayany;
        }
    }
//}
