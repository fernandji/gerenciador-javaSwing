import java.util.Map;
import java.util.LinkedHashMap;

public class Controller {
    private static Map <String, Aluno> alunosLista = new LinkedHashMap<>();

    public void adicionarAluno(String nome, int idade, double media){

        Aluno novoAluno = new Aluno(nome, idade, media);
        alunosLista.put(nome, novoAluno);
        System.out.println("Adicionado!");
    }

    public void excluirAluno(String nome){
        if(alunosLista.containsKey(nome)){
            alunosLista.remove(nome);
        }
    }

    public void visualizarCadastros(){
        for (Aluno aluno : alunosLista.values()) {
            System.out.println(aluno);
        }
    }
}
