package br.com.alura.Aula03;

public class Cachorro extends Animal{
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        if(animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
        }else{
            System.out.println("Não é um cachorro");
        }

    }
}
