package br.com.alura.Aula04;

public class Titulo implements Comparable<Titulo> {
    String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }
}


//Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface
//Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.

