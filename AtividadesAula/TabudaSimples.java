import java.util.Scanner;

public class TabudaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Informe um número para saber a tabuada dele: ");
        num = Integer.parseInt(scanner.nextLine());
        System.out.println("Tabuada do número "+num+":");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(num+"x"+i+"="+(num*i));

        }
    }
}


// Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.



// RESOLUÇÃO ALURA


/* import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
} */