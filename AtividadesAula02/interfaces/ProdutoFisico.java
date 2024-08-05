package interfaces;

public class ProdutoFisico  implements Calculavel {
    public double calcularPrecoFinal() {
        // Implementação com taxas adicionais para produtos físicos
        return calcularPrecoFinal() * 1.05;
    }
}

/* Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro
 e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.*/