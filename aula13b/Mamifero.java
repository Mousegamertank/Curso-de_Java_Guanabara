package aula13b;

public class Mamifero extends Animal{
    protected String corPelo;

    //CONSTRUCTORS
    public Mamifero (){
        super();
    }

    public Mamifero(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros);
        this.setCorPelo(corPelo);
    }

    //SETTERS
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //GETTERS
    public String getCorPelo(){
        return this.corPelo;
    }

    //METHODS
    @Override
    public void EmitirSom() {
        System.out.println("Som de Mamifero");
    }
}
