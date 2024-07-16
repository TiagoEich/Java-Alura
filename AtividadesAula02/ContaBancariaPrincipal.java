public class ContaBancariaPrincipal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(123);
        conta.setSaldo(5000);
        conta.titularDaConta = "Tiago";
        System.out.println("Número da conta: "+ conta.getNumeroConta());
        System.out.println("Saldo: R$"+conta.getSaldo());
        System.out.println("Títular: "+conta.titularDaConta);

        conta.setSaldo(2000);
        System.out.println("Novo saldo: "+conta.getSaldo());
    }
}
