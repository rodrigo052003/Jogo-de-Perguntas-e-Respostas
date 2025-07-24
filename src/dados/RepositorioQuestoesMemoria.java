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


        lista.add(new QuestaoMultipla("Segundo a Bíblia, qual o Primeiro homem criado por Deus?",
                new String[]{"Adão", "Peedro", "Tércio", "Barjesus"}, 0));

        lista.add(new QuestaoMultipla("Qual é o maior planeta do sistema solar?",
                new String[]{"Terra", "Marte", "Júpiter", "Saturno"}, 2));

        lista.add(new QuestaoMultipla("Qual é o símbolo químico da água?",
                new String[]{"H2O", "O2", "CO2", "NaCl"}, 0));

        lista.add(new QuestaoMultipla("Quem pintou a Mona Lisa?",
                new String[]{"Van Gogh", "Michelangelo", "Leonardo da Vinci", "Picasso"}, 2));

        lista.add(new QuestaoMultipla("Quantos lados tem um hexágono?",
                new String[]{"5", "6", "7", "8"}, 1));

        lista.add(new QuestaoMultipla("Em que continente está o Egito?",
                new String[]{"Ásia", "Europa", "África", "América"}, 2));

        lista.add(new QuestaoMultipla("Qual é a fórmula da velocidade média?",
                new String[]{"V = d/t", "V = m/a", "V = f/m", "V = t/d"}, 0));
    }

    public List<Questao> getTodas() {
        return lista;
    }
}
