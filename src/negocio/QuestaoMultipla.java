package negocio;

public class QuestaoMultipla extends Questao {
    private String[] opcoes;
    private int respostaCorreta;

    public QuestaoMultipla(String pergunta, String[] opcoes, int respostaCorreta) {
        super(pergunta);
        this.opcoes = opcoes;
        this.respostaCorreta = respostaCorreta;
    }

    @Override
    public String[] getOpcoes() {
        return opcoes;
    }

    @Override
    public boolean verificarResposta(int resposta) {
        return resposta == respostaCorreta;
    }

    public int getRespostaCorreta() {
        return respostaCorreta;
    }
}
