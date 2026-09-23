package exercicio4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class main {

    public static void main(String[] args) throws ParseException {

    Scanner scanner = new Scanner(System.in);
    Filme filme = new Filme();

    System.out.println(" ============ Adicione os detalhes do filme que deseja incluir na colecao ============= ");

        System.out.print("Nome do filme: ");
        filme.setNome(scanner.nextLine());

        System.out.print("Genero do filme: ");
        filme.setGenero(scanner.nextLine());

        System.out.print("Sinopse do filme: ");
        filme.setSinopse(scanner.nextLine());

        System.out.print("Duracao: ");
        filme.setDuracao(scanner.nextInt());
        scanner.nextLine(); // consome o Enter que sobra após nextInt

        System.out.print("Data de lancamento (dd/MM/yyyy): ");
        String dataTexto = scanner.nextLine();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(dataTexto);
        filme.setDataLancamento(data);

    System.out.println(" ======================================================================================= ");


    filme.exibirFilme();

    }

}
