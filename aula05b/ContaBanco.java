package aula05b;

public class ContaBanco {
    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //CONSTRUCTOR
    public ContaBanco (){
        this.saldo = 0.0f;
        this.status = false;
    }

    public ContaBanco (int numConta, String tipo, String dono){
        this.numConta= numConta;
        this.setTipo(tipo);
        this.setDono(dono);
    }

    //METHODS
    public void EstadoAtual (){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }


    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (this.getTipo().equals("cc") || (this.getTipo().equals("CC"))){
            this.setSaldo(50.00f);
        }
        else if ((this.getTipo().equals("cp")) || (this.getTipo().equals("CP"))){
            this.setSaldo(150.00f);
        }
    }

    public void FecharConta(){
        if (this.getSaldo() == 0){
            this.setStatus(false);
            System.out.println("Conta Fechada");
        }
        else {
            if (this.getSaldo() > 0){
                System.out.println("Conta com dinheiro dentro esvazie antes!");
            }
            else {
                System.out.println("Você não pode fechar a conta pois esta em debito de: " + this.getSaldo());
            }
        }
    }

    public void Depositar (float money){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + money);
            System.out.println("Deposito feito com sucesso na conta de: " + this.getDono());
        }
        else {
            System.out.println("Conta desativada");
        }
    }

    public void Sacar (float money){
        if ((this.getSaldo() < money) && (!this.getStatus())){
            System.out.println("Você não pode sacar mais do que você possui!");
        }
        else {
            this.setSaldo(this.getSaldo() - money);
            System.out.println("saque realizado ");
        }
    }

    public void PagarMensal (){
        if (this.getTipo().equals("cc")){
            if (this.getStatus()) {
                this.setSaldo(this.getSaldo() - 12.00f);
            }
        }
        else if (this.getTipo().equals("cp")){
            if (this.getStatus()) {
                this.setSaldo(this.getSaldo() - 20.00f);
            }
        }
        else {
            System.out.println("Tipo de Conta Inválido");
        }
    }

    //SETTERS
    public final void setNumConta (int n){
        this.numConta = n;
    }

    public final void setTipo (String n){
        if ((n.equals("cc") || (n.equals("cp")) || (n.equals("CP")) || (n.equals("CC")))){
            this.tipo = n;
        }
        else {
            System.out.println("Tipo de conta inválido");
        }
    }

    public final void setDono (String n){
        this.dono = n;
    }

    public final void setSaldo (float n){
        this.saldo = n;
    }

    public final void setStatus (boolean n){
        this.status = n;
    }


    //GETTERS
    public int getNumConta (){
        return this.numConta;
    }

    public String getTipo (){
        return this.tipo;
    }

    public String getDono (){
        return this.dono;
    }

    public float getSaldo () {
        return this.saldo;
    }

    public boolean getStatus () {
        return this.status;
    }




}
/***
 *  __________________________
 *  |   CONTABANCO           |
 *  |  + numConta            |
 *  |  # tipo                |
 *  |  - dono                |
 *  |  - saldo               |
 *  |  - status              |
 *  |------------------------|
 *  |   + AbrirConta()       |
 *  |   + FecharConta()      |
 *  |   + Depositar()        |
 *  |   + Sacar()            |
 *  |   + PagarMensalidade() |
 *  |________________________|
 *
 *  GETTERS E SETTERS
 *
 *  CONSTRUCTOR =  STATUS(FALSE), SALDO(0.00)
 *  Conta Corrente ganha 50 reais (inicia)
 *  Conta Poupança ganha 150 reais (inicia)
 *  tipo = cp(conta_Poupança), cc(conta_Corrente)
 *  status = conta aberta(true), conta fechada(false)
 *  fecharConta saldo = 0.0
 *  pagarMensal = cp(20.00), cc(12.00)

 */

