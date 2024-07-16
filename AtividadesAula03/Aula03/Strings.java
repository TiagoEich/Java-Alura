package br.com.alura.Aula03;

import java.util.ArrayList;

public class Strings {
    public static void main(String[] args) {
        ArrayList <String> listaStrings = new ArrayList<>();
        listaStrings.add("Java");
        listaStrings.add("Python");
        listaStrings.add("JavaScript");
        listaStrings.add("C#");
        for(String print : listaStrings){
            System.out.println(listaStrings);
        }
    }
}
