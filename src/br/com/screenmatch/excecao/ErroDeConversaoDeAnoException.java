package br.com.screenmatch.excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public String getMensagem() {
        return this.mensagem;
    }

    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;


    }
}
