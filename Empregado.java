public class Empregado{
    private String nome;
    private int idade;

    //camel case
    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade (int idade){
        this.idade = idade;
    }

    public String getIdade(){
        return this.idade;
    }
}