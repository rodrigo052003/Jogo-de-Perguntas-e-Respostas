package negocio;

import dados.IRepositorioQuestoes;
import dados.RepositorioQuestoesMemoria;

import java.util.List;

public class QuizFechada implements IQuiz {
    private List<Questao> lista;
    private int atual = 0;
    private int pontos = 0;

    public QuizFechada() {
        IRepositorioQuestoes repositorio = new RepositorioQuestoesMemoria();
        lista = repositorio.getTodas();
    }

    public Questao getProxima() {
        if (atual < lista.size()) {
            return lista.get(atual);
        }
        return null;
    }

    public boolean responder(int resposta) {
        boolean certa = lista.get(atual).verificarResposta(resposta);
        if (certa) pontos += 10;
        atual++;
        return certa;
    }

    public int getPontos() {
        return pontos;
    }

    public boolean temMais() {
        return atual < lista.size();
    }
}
