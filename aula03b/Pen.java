package aula03b;

public class Pen {
    public String model;
    public String color;
    private float tip;
    protected int load;
    protected boolean capped;

    //Constructors
    public Pen (){

    }
    public Pen (String model, String color, float tip, int load, boolean capped){

    }

    public void status () {
        System.out.println("Model: " + this.model);
        System.out.println("One pen: " + this.color);
        System.out.println("Tip: " + this.tip);
        System.out.println("Load: " + this.load);
        System.out.println("Is capped: " + this.capped);
    }

    //Methods
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


    protected void Write(){
        if (this.capped == true){
            System.out.println("I can't write");
        }
        else{
            System.out.println("I'm Writing");
        }
    }

}
