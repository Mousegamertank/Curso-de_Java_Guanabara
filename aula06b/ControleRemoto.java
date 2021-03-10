package aula06b;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //CONSTRUCTORS
    public ControleRemoto (){
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

    public ControleRemoto (int volume, boolean ligado, boolean tocando){
        setVolume(volume);
        setLigado(ligado);
        setTocando(tocando);
    }


    //SETTERS
    private void setVolume (int vol){
        this.volume = vol;
    }

    private void setLigado (boolean lig){
        this.ligado = lig;
    }

    private void setTocando (boolean toc){
        this.tocando = toc;
    }

    //GETTERS
    private int getVolume (){
        return this.volume;
    }

    private boolean getLigado (){
        return this.ligado;
    }

    private boolean getTocando (){
        return this.tocando;
    }

    //METODOS

    @Override
    public void Ligar() {
        this.setLigado(true);
    }

    @Override
    public void Desligar() {
        this.setLigado(false);
    }

    @Override
    public void AbrirMenu() {
        System.out.println("--------- MENU ----------");
        System.out.println("Está Ligado?" + this.getLigado());
        System.out.println("Está Tocando? " + this.getTocando());
        System.out.println("Volume " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void FechaMenu (){
        System.out.println("Menu Fechado");
    }

    @Override
    public void MaisVolume (){
        if ((this.getLigado()) && (this.getVolume() < 100)){
            this.setVolume(getVolume() + 5);
        }
        else {
            System.out.println("Tv desligada ou volume no maximo");
        }
    }

    @Override
    public void MenosVolume (){
        if ((this.getLigado()) && (this.getVolume() > 0)){
            this.setVolume(getVolume() - 5);
        }
        else {
            System.out.println("TV desligada ou volume no minimo");
        }
    }

    @Override
    public void LigarMudo (){
        if ((this.getLigado()) && (this.getVolume() > 0)){
            setVolume(0);
        }
        else {
            System.out.println("Tv Desligada ou mutada já");
        }
    }

    @Override
    public void DesligarMudo (){
        if ((this.getLigado()) && (this.getVolume() == 0)){
            setVolume(50);
        }
        else {
            System.out.println("Tv Desligada ou desmutada já");
        }
    }

    @Override
    public void Play (){
        if ((this.getLigado()) && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void Pause (){
        if ((this.getLigado()) && (this.getTocando())){
            this.setTocando(false);
        }
    }
}
