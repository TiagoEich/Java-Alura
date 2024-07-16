package br.com.alura.heranca;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.definirModelo("Gol");
        carro.definirPrecos(30000,35000,38000);
        carro.exibirInfo();
    }
}
