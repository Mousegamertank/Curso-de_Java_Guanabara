package aula09b;

public class Book implements Publish{
    private String title;
    private String author;
    private int totalPages;
    private int actualPage;
    private boolean isopen;
    private Pessoa le;

    //Constructors
    public Book(){
        setOpen(true);
        setActualPage(0);
    }

    public Book (String title, String author, int TotalPages, Pessoa le){
        this.setTitle(title);
        this.setAuthor(author);
        this.setTotalPages(TotalPages);
        this.setLe(le);
    }

    //SETTERS
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public void setActualPage(int actualPage) {
        this.actualPage = actualPage;
    }

    public void setOpen(boolean open) {
        this.isopen = open;
    }

    public void setLe(Pessoa le) {
        this.le = le;
    }

    //GETTERS
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getTotalPages() {
        return this.totalPages;
    }

    public int getActualPage() {
        return this.actualPage;
    }

    public boolean isOpen() {
        return this.isopen;
    }

    public Pessoa getLe() {
        return this.le;
    }

    //METHODS
    public void Details (){
        System.out.println("Book{" +
                "title='" + this.title + '\'' +
                ", author='" + this.author + '\'' +
                ", TotalPages=" + this.totalPages +
                ", ActualPage=" + this.actualPage +
                ", open=" + this.isopen +
                ", le=" + this.le.Show() +
                '}');
    }

    //INTERFACE
    @Override
    public void open(){
        this.setOpen(true);
    }

    @Override
    public void close() {
        this.setOpen(false);
    }

    @Override
    public void flip(int p) {
        if (p > this.totalPages){
            this.setActualPage(p);
        }
    }

    @Override
    public void nextPage() {
        this.setActualPage(this.getActualPage() + 1);
    }

    @Override
    public void backPage() {
        this.setActualPage(this.getActualPage() - 1);
    }

}
