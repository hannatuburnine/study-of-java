public class incremento3 {

    public static void main (String[] args) {

        String[] nomes = new String[] {"Hanna", "Paola", "Ferreira", "Tuburnine"};
        int index = 0;
        String nomesjuntos = "";

        while (index <=3) {
            nomesjuntos = nomesjuntos + nomes[index];
            index = index + 1;
        }

    }
}
