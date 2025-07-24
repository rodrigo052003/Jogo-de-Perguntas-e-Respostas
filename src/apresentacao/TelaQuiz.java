package apresentacao;


import negocio.IQuiz;
import negocio.QuizFechada;
import negocio.Questao;

import javax.swing.*;
import java.awt.*;

public class TelaQuiz extends JFrame {
    private IQuiz quiz;
    private JLabel lblPergunta;
    private JButton[] botoes;

    public TelaQuiz() {
        quiz = new QuizFechada();

        setTitle("Quiz Simples");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        lblPergunta = new JLabel("Pergunta", SwingConstants.CENTER);
        lblPergunta.setFont(new Font("Arial", Font.BOLD, 16));
        add(lblPergunta, BorderLayout.NORTH);

        JPanel painelBotoes = new JPanel(new GridLayout(2, 2));
        botoes = new JButton[4];

        for (int i = 0; i < 4; i++) {
            final int resposta = i;
            botoes[i] = new JButton();
            botoes[i].addActionListener(e -> responder(resposta));
            painelBotoes.add(botoes[i]);
        }

        add(painelBotoes, BorderLayout.CENTER);

        mostrarProxima();
        setVisible(true);
    }

    private void mostrarProxima() {
        if (quiz.temMais()) {
            Questao q = quiz.getProxima();
            lblPergunta.setText(q.getPergunta());
            String[] ops = q.getOpcoes();
            for (int i = 0; i < 4; i++) {
                botoes[i].setText(ops[i]);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Fim do jogo! Pontos: " + quiz.getPontos());
            System.exit(0);
        }
    }

    private void responder(int resposta) {
        quiz.responder(resposta);
        mostrarProxima();
    }
}
