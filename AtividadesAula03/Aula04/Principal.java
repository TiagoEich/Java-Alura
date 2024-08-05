package br.com.alura.Aula04;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(5);
        lista.add(20);
        lista.add(15);
        lista.add(55);

        Collections.sort(lista);

        System.out.println("Lista ordenada: "+lista);

    }
}


//Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente.
// Em seguida, imprima a lista ordenada.