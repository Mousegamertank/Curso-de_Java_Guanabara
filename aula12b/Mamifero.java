package aula12b;

public class Mamifero extends Animal{
    private String corPelo;

    //CONSTRUCTOR
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
    public String getCorPelo (){
        return this.corPelo;
    }

    //METHODS
    @Override
    public void Locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void Alimetar() {
        System.out.println("Mamando");
    }

    @Override
    public void EmitirSom() {
        System.out.println("Som de Mamifero");
    }

    @Override
    public String ToString() {
        return "Mamifero{" + "\n " + super.toString() +
                "\n corPelo='" + this.getCorPelo() + '\'' +
                "\n }";
    }
}
