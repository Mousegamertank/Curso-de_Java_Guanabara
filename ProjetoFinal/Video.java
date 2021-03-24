package ProjetoFinal;

public class Video implements AcoesVideo {
    private String titulo;
    private int Avaliacao;
    private int Views;
    private int curtidas;
    private boolean reproduzindo;

    //CONSTRUCTORS
    public Video (String video){
        this.setTitulo(video);
        this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }
//
//    public Video(String titulo, int avaliacao, int views, int curtidas, boolean reproduzindo) {
//        this.setTitulo(titulo);
//        this.setAvaliacao(avaliacao);
//        this.setViews(views);
//        this.setCurtidas(curtidas);
//        this.setReproduzindo(reproduzindo);
//    }

    //SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.Avaliacao + avaliacao) / this.getViews());
        this.setAvaliacao(nova);
    }

    public void setViews(int views) {
        Views = views;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //GETTERS
    public String getTitulo() {
        return this.titulo;
    }

    public float getAvaliacao() {
        return this.Avaliacao;
    }

    public int getViews() {
        return this.Views;
    }

    public int getCurtidas() {
        return this.curtidas;
    }

    public boolean getReproduzindo() {
        return this.reproduzindo;
    }

    //METHODS
    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", Avaliacao=" + this.getAvaliacao() +
                ", Views=" + this.getViews() +
                ", curtidas=" + this.getCurtidas() +
                ", reproduzindo=" + this.getReproduzindo() +
                '}';
    }
}
