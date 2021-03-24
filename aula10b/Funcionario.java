package aula10b;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    //CONSTRUCTORS
    public Funcionario (){
        super();
    }

    public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo);
        this.setSetor(setor);
        this.setTrabalhando(trabalhando);
    }

    //SETTERS
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    //GETTERS
    public String getSetor() {
        return this.setor;
    }

    public boolean getTrabalhando() {
        return this.trabalhando;
    }

    //METHODS
    public void MudarTrabalho (){
        this.setTrabalhando(!getTrabalhando());
    }

    @Override
    public String Mostra() {
        return "Funcionario{ " + super.Mostra() +
                "\n setor='" + this.getSetor() + '\'' +
                "\n, trabalhando=" + this.getTrabalhando() +
                "\n }";
    }
}
