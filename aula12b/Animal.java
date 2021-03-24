package aula12b;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;

    //CONSTRUCTORS
    public Animal (){

    }

    public Animal(float peso, int idade, int membros) {
        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
    }

    //SETTERS
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    //GETTERS
    public float getPeso() {
        return this.peso;
    }

    public int getIdade() {
        return this.idade;
    }

    public int getMembros() {
        return this.membros;
    }

    //METHODS
    public abstract void Locomover();

    public abstract void Alimetar();

    public abstract void EmitirSom();

    public abstract String ToString();
}
