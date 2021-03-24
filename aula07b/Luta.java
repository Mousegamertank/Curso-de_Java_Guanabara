package aula07b;

import java.util.Random;

public class Luta  {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    //CONSTRUCTORS
    public Luta() {

    }

    public Luta(int rounds, boolean aprovada, Lutador desafiante, Lutador desafiado) {
        this.setRounds(rounds);
        this.setAprovada(aprovada);
        this.setDesafiante(desafiante);
        this.setDesafiado(desafiado);
    }

    //SETTERS
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


    //GETTERS
    public Lutador getDesafiante() {
        return desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    //METODOS
    public void MarcarLuta (Lutador l1, Lutador l2) {
        System.out.println("Chegou");
        if ((l1.getCategoria() == l2.getCategoria()) && ((l1 != l2))){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("Chegou1");

        } else {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
            System.out.println("Chegou2");

        }

    }

    public void Lutar () {
        if (this.getAprovada()){
            System.out.println("Teste");
            this.getDesafiado().Apresentar();
            this.getDesafiante().Apresentar();
            Random gerador = new Random();
            int vencedor = gerador.nextInt(3);
            System.out.println(vencedor);
            switch (vencedor){
                case 0:
                    this.getDesafiante().setEmpates(getDesafiante().getEmpates() + 1);
                    this.getDesafiado().setEmpates(getDesafiado().getEmpates() + 1);

                    System.out.println("EMPATE");
                    break;
                case 1:
                    this.getDesafiante().setVitorias(getDesafiado().getVitorias() + 1);
                    this.getDesafiado().setDerrotas(getDesafiado().getDerrotas() + 1);
                    System.out.println("O Lutador: " + getDesafiante().getNome() + "Venceu");
                    break;
                case 2:
                    this.getDesafiado().setVitorias(getDesafiado().getVitorias() + 1);
                    this.getDesafiante().setDerrotas(getDesafiante().getDerrotas() + 1);
                    System.out.println("O Lutador: " + getDesafiado().getNome() + "Venceu");

                    break;
                default:
                    System.out.println("Fim da Luta");
            }
        }else {
            System.out.println("Luta não pode acontecer");
        }
    }
}
