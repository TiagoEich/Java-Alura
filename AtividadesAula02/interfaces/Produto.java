package br.com.alura.interfaces;

public class Produto implements Vendaval{
    private String nome;
    private double precoUnitario;

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
    precoUnitario -=precoUnitario*(percentualDesconto/100);

    }
}


/* Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade
comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo
a sua própria lógica de cálculo de preço. */
