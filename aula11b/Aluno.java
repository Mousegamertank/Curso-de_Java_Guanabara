package aula11b;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    //CONSTRUCTOR
    public Aluno (){
        super();
    }

    public Aluno (String nome, int idade, String sexo, int matricula, String curso){
        super(nome, idade, sexo);
        this.setMatricula(matricula);
        this.setCurso(curso);

    }

    //SETTERS
    public void setMatricula (int matricula){
        this.matricula = matricula;
    }

    public void setCurso (String curso){
        this.curso = curso;
    }

    //GETTERS
    public int getMatricula() {
        return this.matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    //METHODS
    @Override
    public String Mostra() {
        return "Aluno{ " +
                "\n " + super.Mostra() +
                "\nmatricula='" + this.getMatricula() + '\'' +
                "\n, curso='" + this.getCurso() + '\'' +
                "\n }";
    }

    public void PagarMensalidade (){
        System.out.println("Pagando Mensalidade de Aluno " + this.getNome());
    }
}
