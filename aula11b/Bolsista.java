package aula11b;

public class Bolsista extends Aluno{
    private int bolsa;

    //CONSTRUCTORS
    public Bolsista() {
        super();
    }

    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, int bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    //SETTERS
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    //GETTERS
    public int getBolsa() {
        return this.bolsa;
    }

    //METHODS
    public void RenovarBolsa(){
        System.out.println("Renovando Bolsa de " + this.getNome());
    }

    @Override
    public void PagarMensalidade(){
        System.out.println(this.getNome() + "é bolsista! Pagamento realizado");
    }
}
