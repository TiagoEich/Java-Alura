package br.com.alura.Aula01;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList <Pessoa> listaDePessoas = new ArrayList <>();
        Pessoa pessoa1 = new Pessoa("Tiago",19);
        Pessoa pessoa2 = new Pessoa("Milena",10);
        Pessoa pessoa3 = new Pessoa("José Remi",58);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira br.com.alura.Aula01.Pessoa " + listaDePessoas.get(0));

        System.out.println("Lista de pessoas");
        for (Pessoa pessoa : listaDePessoas){
            System.out.println(pessoa);
        }

    }
}
