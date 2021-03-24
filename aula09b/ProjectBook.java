package aula09b;

public class ProjectBook {
    public static void main(String[] args){
        Pessoa[] p = new Pessoa[3];
        Book[] l = new Book[4];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Book("Aprendendo Java", "José Silva", 300, p[0]);

        l[0].Details();
//        l..Details();

    }
}
