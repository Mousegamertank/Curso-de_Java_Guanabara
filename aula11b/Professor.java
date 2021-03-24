package aula11b;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    //CONSTRUCTORS
    public Professor() {
        super();
    }

    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.setEspecialidade(especialidade);
        this.setSalario(salario);

    }

    //SETTERS
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    //GETTERS
    public String getEspecialidade() {
        return this.especialidade;
    }

    public float getSalario() {
        return this.salario;
    }

    //METHODS
    public void ReceberAumento(float aumento){
        this.setSalario(getSalario() + aumento);
    }

    @Override
    public String Mostra() {
        return "Professor{ " + super.Mostra() +
                "\n especialidade='" + this.getEspecialidade() + '\'' +
                "\n, salario=" + this.getSalario() +
                "\n }";
    }
}
