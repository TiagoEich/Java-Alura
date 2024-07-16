package br.com.alura.interfaces;

public class Servico implements Vendaval {

    private String descricao;
    private double precoHora;

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora * (percentualDesconto / 100.0);
    }
}


/* Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade
comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo
a sua própria lógica de cálculo de preço. */
