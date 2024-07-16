public class IdadePrincipal {
    public static void main(String[] args) {
        IdadePessoa pessoa= new IdadePessoa();
        pessoa.setIdade(19);
        pessoa.setNome("Tiago");
        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Idade: "+pessoa.getIdade());
        pessoa.verificarIdade();
    }
}
