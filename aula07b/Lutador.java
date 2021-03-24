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
        this.setCategoria();
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

    private void setCategoria(){
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
        System.out.println("-------------------------------------");
        System.out.println("CHEGOU A HORA DE APRESENTAR O LUTADOR");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " Anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());

    }

    public void Status (){
        System.out.println(getNome());
        System.out.println("é um peso: " + this.getCategoria());
        System.out.println(this.getVitorias() + "vitorias");
        System.out.println(this.getDerrotas() + "Derrotas");
        System.out.println(this.getEmpates() + "empates");
    }

    public void GanharLuta (){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void PerderLuta (){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void EmpatarLuta (){
        this.setEmpates(this.getEmpates() + 1);
    }
}
/***
 *      LUTADOR
 * - nome
 * - nacionalidade
 * - idade
 * - altura
 * - peso
 * - categoria
 * - vitorias
 * - derrotas
 * - empates
 * ------------------
 * + Apresentar()
 * + Status()
 * + GanharLuta()
 * + PerderLuta()
 * + EmpatarLuta()
 */
