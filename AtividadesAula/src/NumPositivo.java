import java.util.Scanner;

public class NumPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Informe um número: ");
        num = Integer.parseInt(scanner.nextLine());
        if (num >0) {
            System.out.println("Número positivo informado! ");
        }else if(num == 0){
            System.out.println("Número nulo informado!");
        }else{
            System.out.println("Número negativo informado!");
        }
    }
}


/* Crie um programa que solicite ao usuário digitar um número. Se o número
 for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo". */