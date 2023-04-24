package br.com.alura.screenmatch.excecao;

public class ErroConversaoException extends RuntimeException {

    private String mensagem;
    public ErroConversaoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
