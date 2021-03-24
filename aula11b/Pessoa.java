package aula11b;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;

    //CONSTRUCTORS
    public Pessoa (){

    }

    public Pessoa(String nome, int idade, String sexo){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    //SETTERS
    public void setNome (String nome){
        this.nome = nome;
    }

    public void setIdade (int idade){
        this.idade = idade;
    }

    public void setSexo (String sexo){
        this.sexo = sexo;
    }

    //GETTERS
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    //METHODS
    public void FazerAniv (){
        this.setIdade(this.getIdade() + 1);
    }


    public String Mostra() {
        return "Pessoa{ " +
                "\n nome='" + this.getNome() + '\'' +
                "\n, idade=" + this.getIdade() +
                "\n, sexo='" + this.getSexo() + '\'' +
                "\n }";
    }
}
