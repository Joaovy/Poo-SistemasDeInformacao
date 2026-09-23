package exercicio5;

public class Pikachu {

    private String nome;
    private int vida;
    private int energia;
    private int nivel;

    public Pikachu(String nome, int vida, int energia, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void receberDano(int dano) {
        vida -= dano;
        System.out.println(" aii");
    }

    public void comer(int quantidade) {
        System.out.println(" hmmm que delicia");
        energia += quantidade;
    }

    public void treinar() {
        System.out.println("to cansando...");
        energia -= 10;
        nivel++;
    }

    public void exibirStatus(){

        // arte em ASCII puro para funcionar em qualquer terminal
        System.out.println("       ,   ,");
        System.out.println("      /(   )\\");
        System.out.println("     //     \\\\");
        System.out.println("    //  _ _  \\\\");
        System.out.println("   //  (o o)  \\\\");
        System.out.println("  //    \\_/    \\\\");
        System.out.println(" //_____________\\\\");
        System.out.println("     |     |");
        System.out.println("     |_____|");
        System.out.println("     /_____\\");

        System.out.println("Nome: "+ nome);
        System.out.println("Vida: "+ vida);
        System.out.println("Energia: "+ energia);
        System.out.println("Nivel: "+ nivel);
        System.out.println("============================================");

    }

}
