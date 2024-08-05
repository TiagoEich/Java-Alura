package heranca;

public class Teste {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();

        ContaCorrente conta2 = new ContaCorrente();
        conta2.depositar(200);
        conta2.cobrarTarifaMensal();
        conta.consultarSaldo();
        conta2.sacar(150);
        conta2.consultarSaldo();
    }
}
