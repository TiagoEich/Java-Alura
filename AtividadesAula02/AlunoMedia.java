public class AlunoMedia {
    public static void main(String[] args) {
    Alunoo notas = new Alunoo("Tiago", 9.5,7,6);
    Alunoo notas2 = new Alunoo("Bruno", 5.5, 10,4);
        System.out.println("A média das notas de "+notas.getNome()+" é: "+notas.calcularMedia());
        System.out.println("A média das notas de "+notas2.getNome()+" é: "+notas2.calcularMedia());

    }
}
