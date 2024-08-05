package br.com.alura.Aula04;

import java.util.ArrayList;
import java.util.Collections;

public class TituloPrincipal {
    public static void main(String[] args) {
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(new Titulo("Título 1"));
        lista.add(new Titulo("Título 2"));
        lista.add(new Titulo("Título 3"));
        lista.add(new Titulo("Título 4"));
        lista.add(new Titulo("Título 5"));

        Collections.sort(lista);

        for(Titulo comparando : lista){
            System.out.println(comparando.nome);
        }
    }
}


//Crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o método
// Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.