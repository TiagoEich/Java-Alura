package br.com.alura.AtividadesAula04.aula03;

class ErroConsultaGitHubException extends RuntimeException {

    public ErroConsultaGitHubException(String mensagem) {
        super(mensagem);
    }
}