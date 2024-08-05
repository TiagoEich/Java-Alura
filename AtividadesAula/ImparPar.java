import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Informe um número positivo: ");
        num = Integer.parseInt(scanner.nextLine());
        if (num%2==0){
            System.out.println("Número par informado!");
        }else{
            System.out.println("Número ímpar informado!");
        }

    }
}

/* Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é
 par ou ímpar e exiba uma mensagem correspondente. */