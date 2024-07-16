import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double base, altura,raio;
        do{
            System.out.print("1- Calcular área do quadro\n2- Calcular área do círculo\n3- Sair\nOpção: ");
            opcao = Integer.parseInt(scanner.nextLine());
            if(opcao > 3 || opcao < 1){

            }
            if (opcao ==1){
                System.out.println("Informe o valor da base:");
            base = Double.parseDouble(scanner.nextLine());
                System.out.println("informe o valor da altura: ");
                altura = Double.parseDouble(scanner.nextLine());
                System.out.println("A área de seu retângulo é de: "+(base*altura));
            } else if (opcao == 2) {
                System.out.println("Informe o valor do raio do círculo: ");
                raio = Double.parseDouble(scanner.nextLine());
                System.out.println("A área do círculo é de: "+(3.14*raio*raio));
            }
        }while (opcao !=3);
        System.out.println("Obrigado por usar nosso programa.");
    }
}

/* Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do
círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada. */







// RESOLUÇÃO ALURA

/* import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
} */