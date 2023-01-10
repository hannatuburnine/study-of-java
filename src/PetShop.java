public class PetShop {

    public static void main(String[] args) {

        Cachorro c = new Cachorro();
        Cachorro x = new Cachorro();
        c.nome = "Tickle";
        x.nome = "Bolota";
        c.cor = "Preto";
        x.cor = "Branco";
        c.dono = "Luan";
        x.dono = "Hanna";
        c.idade = 4;
        x.idade = 2;

        int idade1 = c.idade;

        System.out.println(idade1);

        x.latir();
    }
}
