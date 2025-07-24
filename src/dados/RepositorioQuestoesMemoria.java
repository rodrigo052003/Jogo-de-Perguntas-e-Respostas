package dados;

import negocio.Questao;
import negocio.QuestaoMultipla;

import java.util.ArrayList;
import java.util.List;

public class RepositorioQuestoesMemoria implements IRepositorioQuestoes {
    private List<Questao> lista;

    public RepositorioQuestoesMemoria() {
        lista = new ArrayList<>();
        carregarQuestoes();
    }

    private void carregarQuestoes() {
        lista.add(new QuestaoMultipla("Capital do Brasil?",
                new String[]{"São Paulo", "Brasília", "Rio de Janeiro", "Belo Horizonte"}, 1));

        lista.add(new QuestaoMultipla("2 x 5 = ?",
                new String[]{"8", "10", "12", "15"}, 1));

        lista.add(new QuestaoMultipla("Autor de Dom Casmurro?",
                new String[]{"Machado de Assis", "Drummond", "Clarice", "Alencar"}, 0));
    }

    public List<Questao> getTodas() {
        return lista;
    }
}
