package aula05b;

public class Main {
    public static void main (String[] args){
        ContaBanco p1= new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("Jubileu");
        p1.abrirConta("cc");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("Cleusa");
        p2.abrirConta("CP");

        p1.Depositar(100.00f);
        p2.Depositar(500.00f);

        p1.Sacar(20.00f);
        p2.Sacar(650.00f);

        p2.FecharConta();


        p1.EstadoAtual();
        p2.EstadoAtual();
    }
}
