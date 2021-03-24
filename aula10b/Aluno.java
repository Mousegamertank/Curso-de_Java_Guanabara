package aula10b;

public class Aluno extends Pessoa{
    private boolean matricula;
    private String curso;

    //CONSTRUCTOR
    public Aluno (){
        super();
    }

    public Aluno (String nome, int idade, String sexo, boolean matricula, String curso){
        super(nome, idade, sexo);
        this.setMatricula(matricula);
        this.setCurso(curso);

    }

    //SETTERS
    public void setMatricula (boolean matricula){
        this.matricula = matricula;
    }

    public void setCurso (String curso){
        this.curso = curso;
    }

    //GETTERS
    public boolean getMatricula() {
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

    public void CancelarMatricula (){
        this.setMatricula(false);
        System.out.println("Matricula cancelada com sucesso");
    }
}
