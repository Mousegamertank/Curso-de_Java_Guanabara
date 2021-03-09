package aula03b;

public class Main {

    public static void main(String[] args) {
        Pen c1 = new Pen();
        c1.model = "BIC Cristal";
        c1.color = "Blue";
        // c1.tip = 0.5f;
        c1.load = 80;
        c1.capped = true;

        c1.status();
        c1.Cappeded();
        c1.Write();
        c1.status();
        c1.Cappeded();
        c1.status();
    }
}
