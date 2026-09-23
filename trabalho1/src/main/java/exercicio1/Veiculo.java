package exercicio1;

public class Veiculo {

    private String modelo;
    private String marca;
    private int ano;
    private int cavalos;

    public Veiculo(String modelo, String marca, int ano, int cavalos){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cavalos = cavalos;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public void ligarMotor(){
        System.out.println("Ligando Motor...");
    }

    public void pararMotor(){
        System.out.println("Motor desligado...");
    }

    public void exibir(){

        System.out.println(" ====================== Detalhes do Veiculo ====================");

        System.out.println("              ___________-------_____");
        System.out.println("\\~~~~~~~~~~/~_--~~~------~~~~~     \\");
        System.out.println(" `---`\\  _-~      |                   \\");
        System.out.println("   _-~  <_         |                     \\[]");
        System.out.println(" / ___     ~~--[\"\"] |      _________-------'_");
        System.out.println("> /~` \\    |-.   `\\~~.~~~~~                _ ~ - _");
        System.out.println(" ~|  ||\\%  |       |    ~  ._                ~ _   ~ ._");
        System.out.println("   `_//|_%  \\      |          ~  .              ~-_   /\\");
        System.out.println("          `--__     |    _-____  /\\               ~-_ \\/.");
        System.out.println("               ~--_ /  ,/ -~-_ \\ \\/          ________---~/");
        System.out.println("                   ~~-/._<   \\ `~~~~~~~~~~~~~     ##--~/");
        System.out.println("                         \\    ) |`------##---~~~~-~  ) )");
        System.out.println("                          ~-_/_/                  ~~ ~~");
        System.out.println();
        System.out.println("Modelo do veiculo: " + modelo);
        System.out.println("Ano de lancamento: " + ano);
        System.out.println("Marca atual do veiculo: " + marca);
        System.out.println("Cavalos: " + cavalos);
    }

}
