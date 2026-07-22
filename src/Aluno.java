public class Aluno {
    private String nome;
    private int idade;
    private double media;

    public Aluno(String nome, int idade, double media){
        this.nome = nome;
        this.idade = idade;
        this.media = media;
    }

    @Override
    public String toString(){
        return "-----\nAluno: "+ this.nome+"\n"+"Idade: "+this.idade+"\n"+"Média: "+this.media;
    }
}
