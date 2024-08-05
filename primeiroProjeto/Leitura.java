import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite seu filme favorito: ");
        String filme = scanner.nextLine();
        System.out.print("Qual o ano de lançamento:");
        int anoDeLancamento = Integer.parseInt(scanner.nextLine());
        System.out.println("Diga sua avaliação para o filme:");
        double avaliacao = Double.parseDouble(scanner.nextLine());
        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}