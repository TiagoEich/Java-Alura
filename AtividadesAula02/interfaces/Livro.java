package interfaces;

public class Livro implements Calculavel {
    private String autor;

    public double calcularPrecoFinal() {
        return calcularPrecoFinal()* 0.9;
    }
}

/* Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro
 e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.*/
