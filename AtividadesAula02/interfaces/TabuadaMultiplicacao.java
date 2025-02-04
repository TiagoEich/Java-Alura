package interfaces;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada( int numero) {
        System.out.println("Tabuada do número "+numero);
        for (int i = 1; i <11 ; i++) {
            int resultado =numero*i;
            System.out.println(numero+" x "+i+" = "+resultado);
        }
    }
}


/* Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir
 a tabuada de um número. A classe deve receber o número como parâmetro.*/