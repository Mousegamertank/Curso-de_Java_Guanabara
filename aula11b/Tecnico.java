package aula11b;

public class Tecnico extends Aluno{
    protected int registroProfissional;

    //CONSTRUCTORS
    public Tecnico() {
        super();
    }

    public Tecnico(String nome, int idade, String sexo, int matricula, String curso, int registroProfissional) {
        super(nome, idade, sexo, matricula, curso);
        this.setRegistroProfissional(registroProfissional);
    }

    //SETTERS
    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    //GETTERS
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    //METHODS
    @Override
    public String toString() {
        return "Tecnico{" +
                "\nnome='" + this.getNome() + '\'' +
                ",\n idade=" + this.getIdade() +
                ",\n sexo='" + this.getSexo() + '\'' +
                ",\n registroProfissional=" + this.getRegistroProfissional() +
                "\n }";
    }

    public void Praticar(){
        System.out.println("Praticando");
    }

}
