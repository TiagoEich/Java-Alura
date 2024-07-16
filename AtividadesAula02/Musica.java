public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void fichaTecnica(){
        System.out.println("Nome da música: "+titulo);
        System.out.println("Nome do artista: "+artista);
        System.out.println("Ano de lançamento: "+anoLancamento);
    }

    void somaAvaliacoes(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }double media(){
        return avaliacao/numAvaliacoes;
    }
}