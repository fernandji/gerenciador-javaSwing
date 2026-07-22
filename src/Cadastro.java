import javax.swing.*;
import java.awt.FlowLayout;

public class Cadastro extends JFrame {
    public Cadastro() {

        setTitle("GESTOR DE ALUNOS");
        // principal
        JPanel cadastro = new JPanel();
        cadastro.setLayout(new BoxLayout(cadastro, BoxLayout.Y_AXIS));

        // linha pora nome
        JPanel espacoNome = new JPanel();
        espacoNome.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
        JLabel nomeLabel = new JLabel("Insira o nome do aluno: ");
        JTextField nomeAluno = new JTextField(35);
        espacoNome.add(nomeLabel);
        espacoNome.add(nomeAluno);

        // linha para idade
        JPanel espacoIdade = new JPanel();
        espacoIdade.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        JLabel idadeLabel = new JLabel("Insira a idade do aluno: ");
        JSpinner idadeJSpinner = new JSpinner(new SpinnerNumberModel(
                0,
                0,
                100,
                1));
        espacoIdade.add(idadeLabel);
        espacoIdade.add(idadeJSpinner);

        // linha pora media
        JPanel espacoMedia = new JPanel();
        espacoMedia.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        JLabel mediaLabel = new JLabel("Insira o media do aluno: ");
        JTextField mediaAluno = new JTextField(5);
        espacoMedia.add(mediaLabel);
        espacoMedia.add(mediaAluno);

        JButton botao = new JButton("Enviar");
        botao.addActionListener(e -> {
            String nome = nomeAluno.getText();
            int idade = (Integer) idadeJSpinner.getValue();
            double media = Double.parseDouble(mediaAluno.getText());
            Controller controler = new Controller();
            controler.adicionarAluno(nome, idade, media);
        });

        cadastro.add(espacoNome);
        cadastro.add(espacoIdade);
        cadastro.add(espacoMedia);
        cadastro.add(botao);

        add(cadastro);

        setSize(500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                dispose();
                new TelaMenu();
            }
        });
        setVisible(true);
    }

}