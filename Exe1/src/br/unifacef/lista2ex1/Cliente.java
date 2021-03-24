package br.unifacef.lista2ex1;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    // CONSTRUTORES

    private Cliente(){

    }
    public Cliente (String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    // SETTERS

    public final void setNumeroConta (String numeroConta){
        if ((numeroConta.length() == 8) && (numeroConta.indexOf("-") == 6)) {
            this.numeroConta = numeroConta;
        }
        else {
            System.out.println("Numero da Conta Inválido");
        }
    }

    public final void setNumeroAgencia (String numeroAgencia){
        if ((numeroAgencia.length() == 6) && (numeroAgencia.indexOf("-") == 4)){
            this.numeroAgencia = numeroAgencia;
        }
        else {
            System.out.println("Valor de conta Inválido");
        }
    }

    public final void setNome (String nome){
        if (nome.length() >= -30){
            this.nome = nome;
        }
        else {
            System.out.println("Nome muito extenso para adicionar");
        }
    }
    public final void setSaldo (float saldo) {
        this.saldo = saldo;
    }

    // A PARTIR DAQUI É OS GETTERS

    public String getNumeroConta (){
        return this.numeroConta;
    }

    public String getNumeroAgencia () {
        return this.numeroAgencia;
    }

    public String getNome (){
        return this.nome;
    }

    public float getSaldo (){
        return this.saldo;
    }

    // METÓDOS

    public void RealizarDeposito (float x){
        if (x > 0.0f){
            this.saldo += x;
        }
        else {
            System.out.println("Você está adicionando um valor então tal não pode ser negativo");
        }
    }

    public void RealizarSaque (float x){
        if (x > this.saldo) {
            System.out.println("Não há como retirar um valor maior do que você possue");
        }
        else if (x == this.saldo) {
            this.saldo = 0;
            System.out.println("Saque retirado com sucesso, porém o saldo atual é negativo");
        }
        else {
            this.saldo -= x;
            System.out.println("Saldo retirado com sucesso, valor restante \n " + this.saldo);
        }
    }

    public void Dados_Conta (){
        System.out.println("Numero da Conta: " + getNumeroConta() + "\n Numero Agencia: " +
                getNumeroAgencia() + "\n Nome: " + getNome() + "\n Saldo: " + getSaldo());
    }
}
