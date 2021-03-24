package aula12b;

public class Ave extends Animal{
    private String corPena;

    //CONSTRUCTOR
    public Ave (){
        super();
    }

    public Ave(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.setCorPena(corPena);
    }

    //SETTERS
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    //GETTERS
    public String getCorPena() {
        return corPena;
    }

    //METHODS
    @Override
    public void Locomover() {
        System.out.println("Voando");
    }

    @Override
    public void Alimetar() {

    }

    @Override
    public void EmitirSom() {

    }

    @Override
    public String ToString() {
        return "Ave{" + "\n " + super.toString() +
                "corPena='" + getCorPena() + "\n " +
                '}';
    }
}

