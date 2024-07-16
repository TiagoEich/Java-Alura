package br.com.alura.Aula04;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal04 {
    public static void main(String[] args) {
        List<String> lista01= new LinkedList<>();
        lista01.add("Elemento 01");
        lista01.add("Elemento 02");
        lista01.add("Elemento 03");

        List <String> lista02 = new ArrayList<>();
        lista02.add("Elemento A");
        lista02.add("Elemento B");
        lista02.add("Elemento C");

        System.out.println("Elementos da primeira lista: "+lista01);
        System.out.println("Elementos da segunda lista: "+lista02);

    }
}

//Crie uma lista utilizando a interface List e instancie-a tanto
// como ArrayList quanto como LinkedList. Adicione elementos e
// imprima a lista, mostrando que é possível trocar facilmente a implementação.