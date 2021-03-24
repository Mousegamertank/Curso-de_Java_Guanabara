package aula12b;

public class Peixe extends Animal{
    private String corEscama;

    //CONSTRUCTOR
    public Peixe (){
        super();
    }

    public Peixe(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.setCorEscama(corEscama);
    }

    //SETTERS
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    //GETTERS
    public String getCorEscama() {
        return this.corEscama;
    }

    //METHODS
    public void SoltarBolhas (){
        System.out.println("Soltando Bolha");
    }

    @Override
    public void Locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void Alimetar() {
        System.out.println("Comendo Substância");
    }

    @Override
    public void EmitirSom() {
        System.out.println("Peixe não faz som");
    }

    @Override
    public String ToString() {
        return "Peixe{" + "\n " + super.toString() +
                "corEscama='" + getCorEscama() + "\n " +
                '}';
    }
}
