import java.util.Scanner;

public class ComparacaoInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 , num2;
        System.out.print("Informe um número: ");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe outro número: ");
        num2 = Integer.parseInt(scanner.nextLine());
        if(num1 == num2){
            System.out.println("Os dois números são iguais!");
        } else if (num1 != num2) {
            System.out.println("Os números informados são diferentes!");
            if (num1>num2){
                System.out.println("O primeiro número informado é o maior");
            }else{
                System.out.println("O segundo número informado é o maior");
            }
        }

    }
}


/* Peça ao usuário para inserir dois números inteiros. Compare os números
 e imprima uma mensagem indicando se são iguais, diferentes, o primeiro
  é maior ou o segundo é maior. */