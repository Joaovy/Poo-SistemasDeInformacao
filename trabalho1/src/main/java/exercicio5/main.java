package exercicio5;

public class main {

    public static void main(String[] args) {

        // Criando o Pikachu com seu estado inicial
        Pikachu pikachu = new Pikachu("Pikachu", 100, 50, 1);

        // Exibindo o estado inicial
        System.out.println("=========== STATUS INICIAL ===========");
        pikachu.exibirStatus();

        // Pikachu recebe dano
        System.out.println("\nPikachu recebeu 30 de dano!");
        pikachu.receberDano(30);

        System.out.println("\n=========== APOS RECEBER DANO ===========");
        pikachu.exibirStatus();

        // Pikachu come
        System.out.println("\nPikachu encontrou uma comida!");
        pikachu.comer(20);

        System.out.println("\n=========== APOS COMER ===========");
        pikachu.exibirStatus();

        // Pikachu treina
        System.out.println("\nPikachu decidiu treinar!");
        pikachu.treinar();

        System.out.println("\n=========== APOS TREINAR ===========");
        pikachu.exibirStatus();

        // Mostrando os valores atraves dos getters
        System.out.println("\n=========== GETTERS ===========");
        System.out.println("Nome: " + pikachu.getNome());
        System.out.println("Vida atual: " + pikachu.getVida());
        System.out.println("Energia atual: " + pikachu.getEnergia());
        System.out.println("Nivel atual: " + pikachu.getNivel());

    }

}
