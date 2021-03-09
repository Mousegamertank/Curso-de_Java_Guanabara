package aula02b;

public class Pen {
    String model;
    String color;
    float tip;
    int load;
    boolean capped;

    public Pen(){

    }

    public Pen (String model, String color, float tip, int load, boolean capped){
        this.model = model;
        this.color = color;
        this.tip = tip;
        this.load = load;
        this.capped = capped;
    }

    public void Scribble () {
        if (this.capped  == true){
            System.out.println("Error");
        }
        else {
            System.out.println("Rabisco");
        }
    }

    public void Cappe (){
        if (this.capped == true){
            System.out.println("Already capped");
        }
        else {
            this.capped = false;
            System.out.println("Uncapped");
        }
    }

    public void Uncappe () {
        if (this.capped == true) {
            this.capped = false;
            System.out.println("Uncapped");
        }
        else {
            System.out.println("Already Uncappe");
        }
    }

    public void show(){
        System.out.println(" Model: " + this.model + "\n Color: " + this.color + "\n tip: " + this.tip
        + "\n Load: " + this.load + "\n Capped: " + this.capped);
    }
}
