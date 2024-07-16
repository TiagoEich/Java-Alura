public class PrincipalProduto {
    public static void main(String[] args) {
        Produto desconto = new Produto();
        desconto.setNome("Celular");
        desconto.setPreco(100);
        System.out.println("Celular: "+desconto.getNome());
        System.out.println("Preço: "+desconto.getPreco());
        desconto.aplicarDesconto(10);
        System.out.println("Preço agora: "+desconto.getPreco());
    }
}
