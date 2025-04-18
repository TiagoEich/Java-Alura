package br.com.alura.Aula03;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;

     public Produto(String nome, double preco) {
         this.nome = nome;
         this.preco = preco;
     }

     public String getNome() {
         return nome;
     }

     public double getPreco() {
         return preco;
     }

     public static void main(String[] args) {
         Produto produto1 = new Produto("Ar condicionado", 2000.0);
         Produto produto2 = new Produto("Aquecedor", 800.0);
         Produto produto3 = new Produto("Ventilador", 150.0);

         ArrayList<Produto> listaProdutos = new ArrayList<>();
         listaProdutos.add(produto1);
         listaProdutos.add(produto2);
         listaProdutos.add(produto3);
         double somaPrecos = 0;
         for (Produto produto : listaProdutos) {
             somaPrecos += produto.getPreco();
         }

         double precoMedio = somaPrecos / listaProdutos.size();
         System.out.println("Preço médio dos produtos: " + precoMedio);

     }
 }

//Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize um loop
// para calcular e imprimir o preço médio dos produtos.
