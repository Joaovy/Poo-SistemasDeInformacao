package exercicio3;

public class Aluno {

    private String nome;
    private String matricula;
    private int matNota;
    private int histNota;
    private int portNota;

    public Aluno() {
    }

    public Aluno(String nome, String matricula, int matNota, int histNota, int portNota) {
        this.nome = nome;
        this.matricula = matricula;
        this.matNota = matNota;
        this.histNota = histNota;
        this.portNota = portNota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getMatNota() {
        return matNota;
    }

    public void setMatNota(int matNota) {
        this.matNota = matNota;
    }

    public int getHistNota() {
        return histNota;
    }

    public void setHistNota(int histNota) {
        this.histNota = histNota;
    }

    public int getPortNota() {
        return portNota;
    }

    public void setPortNota(int portNota) {
        this.portNota = portNota;
    }

    public void exibirNotas(){
        System.out.println("==============================");
        System.out.println("Detalhes do aluno: "+ nome);
        System.out.println("Nota de matematica: "+ matNota);
        System.out.println("Nota de Portugues: "+ portNota);
        System.out.println("NOta de historia: "+ histNota);
        System.out.println("=============================");
    }

    public void calcularMedia(){
        // divisao com 3.0f para evitar divisao inteira e manter as casas decimais da media
        float media = (matNota + histNota + portNota) / 3.0f;

        if ( media >= 6){
            System.out.println("Aluno: "+ nome +", foi aprovado com a media de: "+ media);
        } else {
            System.out.println("Aluno: "+ nome +", nao foi aprovado com a media de: "+ media);
        }

    }

}
