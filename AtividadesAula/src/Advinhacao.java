import java.util.Random;
import java.util.Scanner;

public class Advinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAleatorio =new Random().nextInt(100);
        int tentativas = 0;
        int valor = 0;
        System.out.println("Seja bem-vindo ao nosso Jogo de Advinhação!\nVocê tem 5 chances para tentar acertar o número!");
         for (int i = 0; i < 5; i++) {
            System.out.print("Informe um número de 0 a 100: ");
            valor = Integer.parseInt(scanner.nextLine());
            tentativas++;
             if (valor == numAleatorio) {
                 System.out.println("Parabéns, Você achou o número com "+tentativas+" tentativas!");
                 break;
             }else if (tentativas == 5){
                 System.out.println("O número era "+numAleatorio);

             }
            else if (valor > numAleatorio) {
                System.out.println("\nO número é menor que o informado!\n");
            } else {
                System.out.println("\nO número é maior que o informado\n");
            }
        }

    }
}

/* Crie um programa que simula um jogo de adivinhação, que deve gerar um número
aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em
até 5 tentativas. A cada tentativa, o programa deve informar se o número
digitado pelo usuário é maior ou menor do que o número gerado. */




//RESOLUÇÃO ALURA

/*  import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break; // interrompe o loop while
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
             System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }
    }
} */