public class Song {
    public static void main(String[] args) {

        Musica musica= new Musica();
        musica.titulo = "Sidewalks";
        musica.artista = "The Weeknd";
        musica.anoLancamento = 2016;
        musica.fichaTecnica();
        musica.somaAvaliacoes(9);
        musica.somaAvaliacoes(10);
        musica.somaAvaliacoes(3);
        musica.somaAvaliacoes(6);
        System.out.println("a soma das avaliações é: "+musica.avaliacao+" e a média das avaliações é de: "+musica.media());
    }
}
