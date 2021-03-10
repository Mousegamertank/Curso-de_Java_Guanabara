package aula07b;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // CONSTRUCTORS
    //Lutador lutador1 = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, Leve, 11, 2, 1)
    //Lutador lutador1 = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, Leve, 14, 2, 3)
    //Lutador lutador1 = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, Medio, 12, 2, 1)
    //Lutador lutador1 = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, Medio, 13, 0, 2)
    //Lutador lutador1 = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, Pesado, 5, 4, 3)
    //Lutador lutador1 = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, Pesado, 12, 2, 4)
    public Lutador (){

    }

    public Lutador (String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates){
        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setVitorias(vitorias);
        setDerrotas(derrotas);
        setEmpates(empates);
    }

    //GETTERS
    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setCategoria(){
        if (this.getPeso() < 52.2f){
            this.categoria = "Inválido";
        }
        else if (this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }
        else if (this.getPeso() <= 83.9){
            this.categoria = "Medio";
        }
        else if (this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    //METODOS
    public void Apresentar (){
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + "anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando: " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());

    }

    public void Status (){
        System.out.println(getNome());
        System.out.println("é um peso: " + getCategoria());
        System.out.println(getVitorias() + "vitorias");
        System.out.println(getDerrotas() + "Derrotas");
        System.out.println(getEmpates() + "empates");
    }

    public void GanharLuta (){
        setVitorias(getVitorias() + 1);
    }

    public void PerderLuta (){
        setDerrotas(getDerrotas() + 1);
    }

    public void EmpatarLuta (){
        setEmpates(getEmpates() + 1);
    }
}
