package exercicio2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Banco banco = new Banco("Joao Antonio", "Itau", 177, 679.0F);
        banco.exibir();

        System.out.print("\nInforme o valor a ser depositado: ");
        float valorAdd = scanner.nextFloat();
        banco.deposito(valorAdd);

        System.out.print("\nInforme o valor a se sacado: ");
        float valorSaque = scanner.nextFloat();
        banco.saque(valorSaque);

        banco.exibir();

    }

}
