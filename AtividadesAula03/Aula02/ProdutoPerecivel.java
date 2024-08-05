package br.com.alura.Aula02;

public class ProdutoPerecivel extends Produto{
    String dataValidade;


    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
    }

    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Pão", 7.75,3, "21/02/2024");
        System.out.println(produtoPerecivel);
    }
}
