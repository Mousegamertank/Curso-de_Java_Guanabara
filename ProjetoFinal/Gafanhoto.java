package ProjetoFinal;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    //CONSTRUCTORS
    public Gafanhoto(String jubileu, int i, String m, String juba){
        super();
    }

    public Gafanhoto(String nome, int idade, String sexo, float experiencia, String login) {
        super(nome, idade, sexo, experiencia);
        this.setLogin(login);
    }

    //SETTERS
    public void setLogin(String login) {
        this.login = login;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    //GETTERS
    public String getLogin() {
        return this.login;
    }

    public int getTotAssistido() {
        return this.totAssistido;
    }

    //METHODS
    public void ViuMaisUm (){
        this.setTotAssistido(this.getTotAssistido() + 1);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                super.toString() + "\n" +
                '}';
    }
}
