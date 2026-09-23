package exercicio1;

public class main {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("Civic", "Honda", 2009, 174);
        veiculo.exibir();
        System.out.println("\n");
        veiculo.ligarMotor();
        veiculo.pararMotor();

    }
}