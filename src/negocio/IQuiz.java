package negocio;

public interface IQuiz {
    Questao getProxima();
    boolean responder(int resposta);
    int getPontos();
    boolean temMais();
}
