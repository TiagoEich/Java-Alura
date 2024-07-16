package br.com.alura.heranca;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Au Au");
    }public void abanarRabo(){
        System.out.println("Cachorro abanando o rabo");

    }
}
