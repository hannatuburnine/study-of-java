public class EscolaOO {

    public static void main (String[] args) {

        Diretoria diretoria = new Diretoria();

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Jorge";
        aluno1.nota1 = 4;
        aluno1.nota2 = 7;
        aluno1.nota3 = 9;
        aluno1.nota4 = 7;

        int media = diretoria.calcularMedia(aluno1.nota1, aluno1.nota2, aluno1.nota3, aluno1.nota4);
        System.out.println("A media é " + media);

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Carla";
        aluno2.nota1 = 7;
        aluno2.nota2 = 9;
        aluno2.nota3 = 1;
        aluno2.nota4 = 2;

        int media2 = diretoria.calcularMedia(aluno2.nota1, aluno2.nota2, aluno2.nota3, aluno2.nota4);

        System.out.println("A media é " + media2);



    }
}
