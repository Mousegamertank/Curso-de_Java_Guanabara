package aula13b;

public class Aula13 {
    public static void main (String[] args){
        Cachorro c = new Cachorro();

        c.Reagir("Ola");
        c.Reagir("Vai Apanhar");
        c.Reagir(11, 45);
        c.Reagir(21, 00);
        c.Reagir(true);
        c.Reagir(false);
        c.Reagir(2, 12.5f);
        c.Reagir(17, 4.5f);
    }
}
