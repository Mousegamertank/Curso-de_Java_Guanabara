package aula04b;

public class Pen {
    public String model;
    public String color;
    private float tip;
    protected int load;
    protected boolean capped;

    // CONSTRUCTORS
    public Pen (){
        this.model = "BIC";
        this.color = "RED";
        this.tip = 0.5f;
        this.load = 80;
        this.capped = true;
    }

    public Pen (String model, String color, float tip, int load, boolean capped){
        this.setModel(model);
        this.color = color;
        this.setTip(tip);
        this.load = load;
        this.capped = capped;
    }

    //GETTER
    public String getModel () {
        return this.model;
    }

    public float getTip (){
        return this.tip;
    }

    //SETTER
    public void setModel (String m) {
        this.model = m;
    }

    public void setTip (float t){
        this.tip = t;
    }

    //METHODS
    public void status () {
        System.out.println("Model: " + this.model);
        System.out.println("One pen: " + this.color);
        System.out.println("Tip: " + this.tip);
        System.out.println("Load: " + this.load);
        System.out.println("Is capped: " + this.capped);
    }

    public void Cappeded (){
        if (this.capped == true){
            System.out.println("Already capped");
        }
        else {
            this.capped = false;
            System.out.println("Uncapped");
        }
    }


    public void Uncapped () {
        if (this.capped == true) {
            this.capped = false;
            System.out.println("Uncapped");
        }
        else {
            System.out.println("Already Uncapped");
        }
    }


}
