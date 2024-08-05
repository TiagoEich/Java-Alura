import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para saber seu fatorial: ");
        int num = Integer.parseInt(scanner.nextLine());
        int fatorial = 1;
        for (int i = 1; i <=num ; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial do número "+num+" é: "+fatorial);
    }
}

//Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.