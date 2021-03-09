package aula02b;

public class Main {

    public static void main(String[] args) {
        Pen pen1 = new Pen("Bic", "Blue", 0.5f, 60, false);
        Pen pen2 = new Pen("Hostnet", "Black", 0.5f, 60, true);
        Aulas aula1 = new Aulas(21.10f, "Pedro", "Marshal", 12, "English");

        pen2.show();
        pen1.show();
        pen1.Cappe();
        pen1.Uncappe();
        pen1.Scribble();
        pen1.show();
        aula1.show();
    }
}
