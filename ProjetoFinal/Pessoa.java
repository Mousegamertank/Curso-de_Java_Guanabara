package ProjetoFinal;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    //CONSTRUCTOR
    public Pessoa (){

    }

    public Pessoa(String nome, int idade, String sexo, float experiencia) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setExperiencia(experiencia);
    }

    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
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

    public float getExperiencia() {
        return this.experiencia;
    }

    //METHODS
    protected void GanharExp(float n){
        this.setExperiencia(this.getExperiencia() + n);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + this.getNome() + '\'' +
                ", idade=" + this.getIdade() +
                ", sexo='" + this.getSexo() + '\'' +
                ", experiencia=" + this.getExperiencia() +
                '}';
    }
}
