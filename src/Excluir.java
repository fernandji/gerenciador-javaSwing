import java.awt.FlowLayout;

import javax.swing.*;

public class Excluir extends JFrame{
    Controller controller = new Controller();
    public Excluir(){
        JPanel excluir = new JPanel();

        excluir.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0 ));


        JLabel texto = new JLabel("Digite o nome do aluno a ser excluído: ");
        JTextField campo = new JTextField(30);
        JButton botaoExcluir = new JButton("Enviar");
        

        botaoExcluir.addActionListener(e -> {
            String nome = campo.getText();
            controller.excluirAluno(nome);
        });

        excluir.add(texto);
        excluir.add(campo);
        excluir.add(botaoExcluir);
        add(excluir);

        setSize(300, 150);
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
