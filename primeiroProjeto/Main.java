//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o primeiro Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: "+anoDeLancamento);
        boolean incluidoNoPlano = true;
        Double notaDoFilme = 8.1;
        // Média calculada pelas 3 notas de Jack, Paulo e Suelem
        
        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """+anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        // esse é o casting, quando você quer transformar um valor de por exemplo double, em inteiro.
    }
}