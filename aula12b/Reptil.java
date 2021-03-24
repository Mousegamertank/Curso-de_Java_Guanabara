package aula12b;

public class Reptil extends Animal{
    private String corEscama;

    //CONSTRUCTOR
    public Reptil() {
        super();
    }

    public Reptil(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.setCorEscama(corEscama);
    }

    //SETTERS
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    //GETTERS
    public String getCorEscama() {
        return corEscama;
    }

    //METHODS
    @Override
    public void Locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void Alimetar() {
        System.out.println("Comendo Vegetais ou pessoas ");
    }

    @Override
    public void EmitirSom() {
        System.out.println("Som de Réptil");
    }

    @Override
    public String ToString() {
        return "Reptil{" + "\n " + super.toString() +
                "\n corEscama='" + this.getCorEscama() + '\'' +
                '}';
    }
}
