package aula09b;

public interface Publish {
    public abstract void open();
    public abstract void close();
    public abstract void flip(int p);
    public abstract void nextPage();
    public abstract void backPage();
}
