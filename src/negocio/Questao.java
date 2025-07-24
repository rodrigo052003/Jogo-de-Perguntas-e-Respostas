package negocio;

public abstract class Questao {
    private String pergunta;

    public Questao(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public abstract String[] getOpcoes();
    public abstract boolean verificarResposta(int resposta);
}
