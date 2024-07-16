package br.com.alura.heranca;

public class Gato extends Animal{
    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Miau Miau");
    }

    public void arranharMoveis(){
        System.out.println("Arranhando móveis");
    }
}
