public class Incremento {

    public static void main(String[] args) {

        String[] hp = new String[] {"Hanna", "Paola", "Ferreira", "Tuburnine"};
        int index = 0;
        String nome = "";

        while (index <= 3) {
            nome = nome + " " + hp[index];
            index = index + 1;
        }
        System.out.println(nome);
    }
}
