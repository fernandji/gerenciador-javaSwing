import javax.swing.*;
public class TelaMenu extends JFrame {

    public TelaMenu(){
        Controller controller = new Controller();
        String [] opcoes = {"Cadastrar", "Visualizar", "Excluir"};

        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma das opções","SISTEMA DE GESTÃO ESCOLAR" , JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        switch (escolha) {
    //CADASTRAR 
    case 0:
        Cadastro cadastro = new Cadastro();
        break;
    //VISUALIZAR 
    case 1:
        controller.visualizarCadastros();
        TelaMenu menu = new TelaMenu();
        break;
    //EXCLUIR
    case 2:
        Excluir excluir = new Excluir();
        break;
    case -1:
        break;
}
    }
}
