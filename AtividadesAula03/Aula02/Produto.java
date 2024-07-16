package br.com.alura.Aula02;

import java.util.ArrayList;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+ ", Preco: "+preco+ ", Quantidade: "+quantidade;
    }

    public static void main(String[] args) {
        ArrayList <Produto> listaDeProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Refrigerante",8,3);
        Produto produto2 = new Produto("Celular", 1000, 1);
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        System.out.println("Tamanho da lista: "+listaDeProdutos.size());
        System.out.println("Produto na posição 1: "+listaDeProdutos.get(1).getNome());

    for (Produto produto: listaDeProdutos){
        System.out.println(produto);
    }
    }
}
