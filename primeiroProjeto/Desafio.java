import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String nome= "Tiago Backes Eich",tipoConta = "Corrente";
        Double saldo = 2500.00, valor, transferir;

        System.out.println("********************************\nDados iniciais do cliente:\n\nNome:" +
                "            "+nome+"\nTipo conta:      "+tipoConta+"\nSaldo inicial:   R$" +saldo+
                "\n***************************************\n\n");
        do {
            System.out.print("1- Consultar saldos\n2- Receber valor\n3- Transferir valor\n4-" +
                    " Sair\n\nDigite a opção desejada: ");
        opcao = Integer.parseInt(scanner.nextLine());

        if(opcao < 1 || opcao>4){
            System.out.println("Digite uma opção válida!");
        }

        else if (opcao == 1){
            System.out.println("O saldo atual é de: R$"+saldo+"\n\n");

        } else if (opcao == 2) {
            System.out.print("Informe o valor a receber: ");
            valor = Double.parseDouble(scanner.nextLine());
            saldo += valor;

            System.out.println("Saldo atualizado para R$"+saldo+"\n\n");

        }else if (opcao == 3){
            System.out.println("Informe o valor que deseja transferir: ");
            transferir = Double.parseDouble(scanner.nextLine());

            if (transferir < saldo){
                saldo -= transferir;
                System.out.println("Saldo atualizado para R$"+saldo);
            }else{
                System.out.println("Não foi possível finalizar a transferência.\n\n");
            }
        }
        }while(opcao!=4);
    }
}





/* import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair

                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
} */