public class Main{

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.nome = "Kalil";
        aluno1.nota1 = 5;
        aluno1.nota2 = 10;

        System.out.println("> " + aluno1.nome);
        System.out.println("> " + aluno1.mostrarMedia());
    }


}