package exercicio4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Filme {

    private String nome;
    private String genero;
    private String sinopse;
    private Date dataLancamento;
    private int duracao;

    public Filme() {
    }

    public Filme(int duracao, Date dataLancamento, String sinopse, String genero, String nome) {
        this.duracao = duracao;
        this.dataLancamento = dataLancamento;
        this.sinopse = sinopse;
        this.genero = genero;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void exibirFilme(){
        System.out.println("""
                                 88
                                 ""
                            
                            ,adPPYba, 88 8b,dPPYba,   ,adPPYba, 88,dPYba,,adPYba,  ,adPPYYba,
                            a8"     "" 88 88P'   `"8a a8P_____88 88P'   "88"    "8a ""     `Y8
                            8b         88 88       88 8PP''''''' 88      88      88 ,adPPPPP88
                            "8a,   ,aa 88 88       88 "8b,   ,aa 88      88      88 88,    ,88
                             `"Ybbd8"' 88 88       88  `"Ybbd8"' 88      88      88 `"8bbdP"Y8
                            """);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Nome: "+ nome);
        System.out.println("Data lancamento: "+ formato.format(dataLancamento));
        System.out.println("Duracao: "+ duracao);
        System.out.println("Genero: "+ genero);

    }
}
