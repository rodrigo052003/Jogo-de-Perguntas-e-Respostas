package negocio;

public abstract class Questao {
    protected String pergunta;
    protected String[] opcoes;
    protected int correta;

    public Questao(String pergunta, String[] opcoes, int correta) {
        this.pergunta = pergunta;
        this.opcoes = opcoes;
        this.correta = correta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public boolean verificarResposta(int resposta) {
        return resposta == correta;
    }
}
