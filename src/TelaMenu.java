import javax.swing.*;
public class TelaMenu extends JFrame {

    public TelaMenu(){
        String [] opcoes = {"Cadastrar", "Visualizar"};

        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma das opções","SISTEMA DE GESTÃO ESCOLAR" , JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        switch (escolha) {
    case 0:
        Cadastro cadastro = new Cadastro();
        break;

    case 1:
        Controller controller = new Controller();
        controller.visualizarCadastros();
        break;

    case -1:
        JOptionPane.showMessageDialog(null, "Janela fechada");
        break;
}
    }
}
