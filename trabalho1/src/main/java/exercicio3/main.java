package exercicio3;

public class main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Jhack");
        aluno.setMatricula("321BSI");

        aluno.setMatNota(7);
        aluno.setHistNota(2);
        aluno.setPortNota(2);

        aluno.exibirNotas();
        aluno.calcularMedia();

    }

}
