public class PrincipalCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Gol";
        carro.ano = 2012;
        carro.cor = "vermelho";
        carro.fichaTecnica();
        System.out.println("A idade do carro é "+carro.idadeCarro()+" anos");
    }
}
