package br.unifacef.lista2ex2;

public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    private Aluno() {

    }

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        this.setNumeroAluno(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);

    }

    //SETTERS
    public final void setNumeroAluno (int numeroAluno){
        String aux = String.valueOf(numeroAluno);
        if (aux.length() == 6) {
            this.numeroAluno = numeroAluno;
        }
        else {
            System.out.println("Valor Inválido");
        }
    }

    public final void setNome (String nome) {
        if ((nome.length() > 30) && (nome.length() < 0)){
            System.out.println("Nome muito extenso: ");
        }
        else {
            this.nome = nome;
        }
    }

    public final void setIdade (int idade){
        if (idade < 0) {
            System.out.println("Valores negativos não são considerados");
        }
        else {
            this.idade = idade;
        }
    }

    public final void setP1 (float p1) {
        if (p1 < 0){
            System.out.println("Valores negativos não podem ser considerados");
        }
        else {
            this.p1 = p1;
        }
    }

    public final void setP2 (float p2) {
        if (p2 < 0){
            System.out.println("Valores negativos não podem ser considerados");
        }
        else {
            this.p2 = p2;
        }
    }

    //GETTERS
    public int getNumeroAluno (){
        return this.numeroAluno;
    }

    public String getNome () {
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public float getP1 (){
        return this.p1;
    }

    public float getP2 (){
        return this.p2;
    }

    // METODOS
    public void NotaFinal () {
        if ((this.p1 > 0) && (p2 > 0)) {
            System.out.println(" A nota final é de: " + (this.p1 + this.p2)/  2);
        }
        else {
            System.out.println("Alguma nota não foi inserida");
        }
    }

    public void DadosAluno () {
        System.out.println(" O aluno: " + this.nome + "\n com o número de aluno: " + this.numeroAluno + "\n com a idade: " + this.idade
        + "\n Tirou como primeira nota: " + this.p1 + "\n Como segunda nota: " + this.p2);
    }
}


